package src.interp;

import java.util.ArrayList;
import java.util.List;

import src.gen.TypeScriptBaseVisitor;
import src.gen.TypeScriptParser;
import src.gen.TypeScriptParser.ExprBinaryNotContext;
import src.gen.TypeScriptParser.ExprComparatorContext;
import src.gen.TypeScriptParser.ExprDotIdentContext;
import src.gen.TypeScriptParser.ExprEqualityContext;
import src.gen.TypeScriptParser.ExprIdentifierContext;
import src.gen.TypeScriptParser.ExprMinusOpContext;
import src.gen.TypeScriptParser.ExprMultDivPercContext;
import src.gen.TypeScriptParser.ExprNotContext;
import src.gen.TypeScriptParser.ExprObjectIndexContext;
import src.gen.TypeScriptParser.ExprObjectLiteralContext;
import src.gen.TypeScriptParser.ExprParentContext;
import src.gen.TypeScriptParser.ExprPlusOpContext;
import src.gen.TypeScriptParser.ExprPrimitiveLiteralContext;
import src.gen.TypeScriptParser.ExprSumSubsContext;
import src.gen.TypeScriptParser.ExpressionContext;
import src.gen.TypeScriptParser.InitializerContext;
import src.gen.TypeScriptParser.LiteralContext;
import src.gen.TypeScriptParser.ObjLiteralContext;
import src.gen.TypeScriptParser.ObjLiteralEmptyContext;
import src.gen.TypeScriptParser.PropertyAssignContext;
import src.gen.TypeScriptParser.PropertyNameContext;
import src.gen.TypeScriptParser.VariableDeclContext;
import src.symbols.Mod;
import src.symbols.SymbolTableStack;
import src.symbols.SyntacticError;
import src.symbols.Variable;
import src.types.BooleanType;
import src.types.NumberType;
import src.types.StringType;
import src.types.Type;
import src.values.BooleanValue;
import src.values.LiteralObjectValue;
import src.values.NumberValue;
import src.values.ObjectValue;
import src.values.StringValue;
import src.values.Value;

/**
 * TSVisitor
 */
public class TSVisitor extends TypeScriptBaseVisitor<Object>{
	private SymbolTableStack scope;
	private ArrayList<SyntacticError> syntacticErrors;
	
	public TSVisitor() {
		scope = new SymbolTableStack();
		syntacticErrors = new ArrayList<>();
	}

	private void addOperatorError(Value value1, Value value2){
		SyntacticError error = new SyntacticError(
			"Operador no aplicable a los tipos " +
			value1.getType().getTypeName() +
			" y " +
			value2.getType().getTypeName()
		);
		syntacticErrors.add(error);
	}
	
	private void addOperatorError(Value value){
		SyntacticError error = new SyntacticError(
			"Operador no aplicable al tipo " + value.getType().getTypeName()
		);
		syntacticErrors.add(error);
	}

	@Override
	public Object visitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
		int accessModifiers = 0;
		
		if( ctx.accessModifier() != null )
			accessModifiers = (Integer)visit(ctx.accessModifier());
		
		int varModifiers = (Integer)visit(ctx.varModifier());
		int readonlyModifiers = ctx.TK_READ_ONLY() != null ? Mod.READONLY : 0;
		
		List<VariableDeclContext> declList = ctx.variableDeclList().variableDecl();

		for(VariableDeclContext c: declList){
			String identifier = c.TK_IDENT().getText();
			Type type = null;

			if( c.typeAnnotation() != null )
				type = (Type)visit(c.typeAnnotation());

			Variable var = new Variable(
				identifier,
				accessModifiers | varModifiers | readonlyModifiers,
				type
			);

			if( c.initializer() != null ){
				Value init = (Value)visit(c.initializer());
				var.setValue(init);

				if( var.getType() == null )
					var.setType(init.getType());
			}
			else
				var.setValue(var.getType().undefinedValue());
			
			try{
				scope.declareVariable(var);
			} catch (SyntacticError e) {
				syntacticErrors.add(e);
			}
		}
		return null;
	}

	@Override
	public Object visitVarModifier(TypeScriptParser.VarModifierContext ctx) {
		if( ctx.TK_CONST() != null )
			return Mod.CONST;
		else if( ctx.TK_LET() != null )
			return Mod.LET;
		else if( ctx.TK_VAR() != null )
			return Mod.VAR;
		return null;
	}

	@Override
	public Object visitAccessModifier(TypeScriptParser.AccessModifierContext ctx) {
		if( ctx.TK_PUBLIC() != null )
			return Mod.PUBLIC;
		else if( ctx.TK_PRIVATE() != null )
			return Mod.PRIVATE;
		else if( ctx.TK_PROTECTED() != null )
			return Mod.PROTECTED;
		
		return null;
	}
	
	@Override
	public Object visitLiteral(LiteralContext ctx) {
		try {
			if( ctx.BOOLEAN_LITERAL() != null ){
				return new BooleanValue(Boolean.parseBoolean(ctx.getText()));
			}
			else if( ctx.STRING_LITERAL() != null ){
				String stringLiteral = ctx.STRING_LITERAL().getText();
				StringBuilder value = new StringBuilder(); 

				for(int i=1; i < stringLiteral.length()-1; i++)
					value.append(stringLiteral.charAt(i));
				return new StringValue(value.toString());
			}
			else if( ctx.NULL_LITERAL() != null )
				return new NumberValue(0);
			else{
				String literal = ctx.NUMERIC_LITERAL().getText();
				
				if( literal.startsWith("0x") || literal.startsWith("0X") )
					return new NumberValue(Integer.parseInt(literal.substring(2), 16));
				else if( literal.startsWith("0o") || literal.startsWith("0O") )
					return new NumberValue(Integer.parseInt(literal.substring(2), 8));
				else if( literal.startsWith("0b") || literal.startsWith("0B") )
					return new NumberValue(Integer.parseInt(literal.substring(2), 2));
				else if( literal.startsWith("0") && !literal.startsWith("0") )
					return new NumberValue(Integer.parseInt(literal.substring(1), 8));
				else{
					double value = Double.parseDouble(literal);
					return new NumberValue(value);
				}
			}
		
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprMinusOp(ExprMinusOpContext ctx) {
		try {
			Value value = (Value)visit(ctx.expression());
		
			return value.minus();	
		} catch (SyntacticError e) {
			return null;
		}
	}

	@Override
	public Object visitExprPlusOp(ExprPlusOpContext ctx) {
		try {
			Value value = (Value)visit(ctx.expression());
		
			return value.plus();	
		} catch (SyntacticError e) {
			return null;
		}
	}

	@Override
	public Object visitExprBinaryNot(ExprBinaryNotContext ctx) {
		try {
			Value value = (Value)visit(ctx.expression());
		
			return value.binNot();
		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitExprNot(ExprNotContext ctx) {
		try {
			Value value = (Value)visit(ctx.expression());
		
			return value.logicNot();
		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitInitializer(InitializerContext ctx) {
		Value value = (Value)visit(ctx.expression());
		return value;
	}

/**
 *	Expression	 
 **/	
	@Override
	public Object visitExprMultDivPerc(ExprMultDivPercContext ctx) {
		try{
			Value value1 = (Value)visit(ctx.expression().get(0));
			Value value2 = (Value)visit(ctx.expression().get(1));

			if( ctx.TK_PERCENT() != null )
				return value1.mod(value2);	
			else if( ctx.TK_STAR() != null )
				return value1.prod(value2);
			else
				return value1.div(value2);
			
		} catch(SyntacticError e){
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitExprPrimitiveLiteral(ExprPrimitiveLiteralContext ctx) {
		try {
			Value value = (Value)visit(ctx.literal());
			return value;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Object visitExprIdentifier(ExprIdentifierContext ctx) {
		try {
			return scope.getValueOf(ctx.getText());

		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitExprEquality(ExprEqualityContext ctx) {
		try {
			Value value1 = (Value)visit(ctx.expression().get(0));
			Value value2 = (Value)visit(ctx.expression().get(1));

			if( ctx.TK_EQEQ() != null )
				return value1.equals(value2);
			else if( ctx.TK_IDENTEQ() != null )
				return value1.strictEquals(value2);
			else if( ctx.TK_NOTEQ() != null ){
				return value1.notEquals(value2);
			}
			else if( ctx.TK_IDENTNOTEQ() != null )
				return value1.notStrictEquals(value2);
			return null;
		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		} catch(NullPointerException e){
			return null;
		}
	}

	@Override
	public Object visitExprComparator(ExprComparatorContext ctx) {
		try {
			Value value1 = (Value)visit(ctx.expression().get(0));
			Value value2 = (Value)visit(ctx.expression().get(1));

			if( ctx.TK_GREAT() != null )
				return value1.greater(value2);
			else if( ctx.TK_GREATEQ() != null )
				return value1.greaterOrEq(value2);
			else if( ctx.TK_LESS() != null )
				return value1.less(value2);
			else
				return value1.lessOrEq(value2);
		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitExprSumSubs(ExprSumSubsContext ctx) {
		try{
			Value value1 = (Value)visit(ctx.expression().get(0));
			Value value2 = (Value)visit(ctx.expression().get(1));

			if( ctx.TK_PLUS() != null )
				return value1.sum(value2);
			else
				return value1.sub(value2);
		} catch(SyntacticError e){
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitExprParent(ExprParentContext ctx) {
		Value value = (Value)visit(ctx.expression());
		System.out.println(value);
		return value;
	}

	@Override
	public Object visitExprObjectLiteral(ExprObjectLiteralContext ctx) {
		Value value = (Value)visit(ctx.objectLiteral());
		return value;
	}

	@Override
	public Object visitObjLiteral(ObjLiteralContext ctx) {
		List<PropertyAssignContext> propList = ctx.propertyAssign();

		ArrayList<Value> values = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();

		for(int i=0; i < propList.size(); i++){
			if( propList.get(i).propertyName() != null ){
				names.add((String)visit(propList.get(i).propertyName()));
				values.add((Value)visit(propList.get(i).expression(0)));
			}
			else{
				// TODO
			}
		}
		return new LiteralObjectValue(names, values);
	}

	@Override
	public Object visitPropertyName(PropertyNameContext ctx) {
		if( ctx.STRING_LITERAL() != null ){
			StringBuilder ans = new StringBuilder();

			for(int i=1; i < ctx.getText().length()-1; i++)
				ans.append(ctx.getText().charAt(i));
			return ans;
		}
		else
			return ctx.getText();
	}

	@Override
	public Object visitObjLiteralEmpty(ObjLiteralEmptyContext ctx) {
		return new LiteralObjectValue();
	}
	
/**
 *  Property Access 
**/
	@Override
	public Object visitExprDotIdent(ExprDotIdentContext ctx) {
		try {
			ObjectValue objValue = (ObjectValue)visit(ctx.expression());

			return objValue.get(ctx.identifier().getText());
		} catch (ClassCastException e) {
			syntacticErrors.add(new SyntacticError(
				"La expresion a la izquierda del operador . no es un objeto"
			));
			return null;
		} catch (NullPointerException e) {
			syntacticErrors.add(new SyntacticError(
				"La expresion a la izquierda del operador . no es un objeto"
			));
			return null;
		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		}
	}

	@Override
	public Object visitExprObjectIndex(ExprObjectIndexContext ctx) {
		try {
			ObjectValue objValue = (ObjectValue)visit(ctx.expression());
			List<ExpressionContext> expList = ctx.expressionSequence().expression();
			
			Value index = null;
			for(int i=0; i < expList.size(); i++)
				index = (Value)visit(expList.get(i));
			
			if( StringType.isOfThisType(index) ){
				return objValue.get(index.toString());
			}
			else if( NumberType.isOfThisType(index) )
				return objValue.get(index.toString());
			else{
				throw new SyntacticError(
					"El indice " + expList.get(expList.size()-1).getText() + " no es valido"
				);
			}
		} catch (ClassCastException e) {
			syntacticErrors.add(new SyntacticError(
				"La expresion a la izquierda del operador [] no es un objeto"
			));
			return null;
		} catch (NullPointerException e) {
			return null;
		} catch (SyntacticError e) {
			syntacticErrors.add(e);
			return null;
		}
	}

	// Getters-Setters

	public SymbolTableStack getScope() {
		return this.scope;
	}

	public void setScope(SymbolTableStack scope) {
		this.scope = scope;
	}

	public ArrayList<SyntacticError> getSyntacticErrors() {
		return this.syntacticErrors;
	}

	public void setSyntacticErrors(ArrayList<SyntacticError> syntacticErrors) {
		this.syntacticErrors = syntacticErrors;
	}

}