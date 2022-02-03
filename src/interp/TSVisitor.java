package src.interp;

import java.util.ArrayList;
import java.util.List;

import src.gen.TypeScriptBaseVisitor;
import src.gen.TypeScriptParser;
import src.gen.TypeScriptParser.ExprMultDivPercContext;
import src.gen.TypeScriptParser.ExprParentContext;
import src.gen.TypeScriptParser.ExprPrimitiveLiteralContext;
import src.gen.TypeScriptParser.ExprSumSubsContext;
import src.gen.TypeScriptParser.LiteralContext;
import src.gen.TypeScriptParser.VariableDeclContext;
import src.symbols.Mod;
import src.symbols.SymbolTableStack;
import src.symbols.SyntacticError;
import src.symbols.Variable;
import src.types.NumberType;
import src.types.StringType;
import src.types.Type;
import src.values.BooleanValue;
import src.values.NumberValue;
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
				System.out.println("Si hay init");   ////////////////BORRAR Y ARREGLAR
				var.setValue((Value)visit(c.initializer()));
			}
			
			try{
				scope.declareVariable(var);
			} catch (SyntacticError e) {
				syntacticErrors.add(e);
			}
		}
		return visitChildren(ctx);
	}

	@Override public Object visitVarModifier(TypeScriptParser.VarModifierContext ctx) {
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
				else if( literal.startsWith("0") )
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
	public Object visitExprMultDivPerc(ExprMultDivPercContext ctx) {
		try{
			Value value1 = (Value)visit(ctx.expression().get(0));
			Value value2 = (Value)visit(ctx.expression().get(1));

			if( !NumberType.isOfThisType(value1) || 
				!NumberType.isOfThisType(value2) ){
					SyntacticError error = new SyntacticError(
						"Operador no aplicable a los tipos " +
						value1.getType().getTypeName() +
						" y " +
						value2.getType().getTypeName()
					);
					syntacticErrors.add(error);
					return null;
			}
			
			double a = ((NumberValue)value1).getValue();
			double b = ((NumberValue)value2).getValue();

			if( ctx.TK_PERCENT() != null ){
				long k = Double.valueOf(a / b).longValue();

				return new NumberValue(a - k * b);
			}
			else if( ctx.TK_STAR() != null ){
				return new NumberValue(a * b);
			}
			else
				return new NumberValue(a / b);
			
		} catch(NullPointerException e){
			// e.printStackTrace();
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
	public Object visitExprSumSubs(ExprSumSubsContext ctx) {
		try{
			Value value1 = (Value)visit(ctx.expression().get(0));
			Value value2 = (Value)visit(ctx.expression().get(1));

			if( NumberType.isOfThisType(value1) && NumberType.isOfThisType(value2) ){
				double a = ((NumberValue)value1).getValue();
				double b = ((NumberValue)value2).getValue();
				
				if( ctx.TK_PLUS() != null )
					return new NumberValue(a + b);
				else
					return new NumberValue(a - b);
			}
			else if( ctx.TK_PLUS() != null && 
				(StringType.isOfThisType(value1) || StringType.isOfThisType(value2)) ){
					return new StringValue(value1.toString() + value2.toString());
			}
			else{
				SyntacticError error = new SyntacticError(
					"Operador no aplicable a los tipos " +
					value1.getType().getTypeName() +
					" y " +
					value2.getType().getTypeName()
				);
				syntacticErrors.add(error);
				return null;
			}
		} catch(NullPointerException e){
			// e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object visitExprParent(ExprParentContext ctx) {
		Value value = (Value)visit(ctx.expression());
		System.out.println(value);
		return value;
	}

	public SymbolTableStack getScope() {
		return this.scope;
	}

	// Getters-Setters

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