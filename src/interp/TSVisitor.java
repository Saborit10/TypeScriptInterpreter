package src.interp;

import java.util.ArrayList;
import java.util.List;

import src.gen.TypeScriptBaseVisitor;
import src.gen.TypeScriptParser;
import src.gen.TypeScriptParser.ArrayElementContext;
import src.gen.TypeScriptParser.ArrayLiteralAltContext;
import src.gen.TypeScriptParser.ArrayLiteralEmptyAltContext;
import src.gen.TypeScriptParser.ArrayTypeContext;
import src.gen.TypeScriptParser.ExprAsigContext;
import src.gen.TypeScriptParser.ExprBinAndContext;
import src.gen.TypeScriptParser.ExprBinOrContext;
import src.gen.TypeScriptParser.ExprBinaryNotContext;
import src.gen.TypeScriptParser.ExprComparatorContext;
import src.gen.TypeScriptParser.ExprDotIdentContext;
import src.gen.TypeScriptParser.ExprEqualityContext;
import src.gen.TypeScriptParser.ExprIdentifierContext;
import src.gen.TypeScriptParser.ExprLogicAndContext;
import src.gen.TypeScriptParser.ExprLogicOrContext;
import src.gen.TypeScriptParser.ExprMinusOpContext;
import src.gen.TypeScriptParser.ExprMultDivPercContext;
import src.gen.TypeScriptParser.ExprNewContext;
import src.gen.TypeScriptParser.ExprNotContext;
import src.gen.TypeScriptParser.ExprObjectIndexContext;
import src.gen.TypeScriptParser.ExprObjectLiteralContext;
import src.gen.TypeScriptParser.ExprParentContext;
import src.gen.TypeScriptParser.ExprPlusOpContext;
import src.gen.TypeScriptParser.ExprPrimitiveLiteralContext;
import src.gen.TypeScriptParser.ExprSumSubsContext;
import src.gen.TypeScriptParser.ExprThisContext;
import src.gen.TypeScriptParser.ExpressionContext;
import src.gen.TypeScriptParser.FunctionCallContext;
import src.gen.TypeScriptParser.IdentifierContext;
import src.gen.TypeScriptParser.InitializerContext;
import src.gen.TypeScriptParser.LiteralContext;
import src.gen.TypeScriptParser.ObjLiteralContext;
import src.gen.TypeScriptParser.ObjLiteralEmptyContext;
import src.gen.TypeScriptParser.ParametricTypeContext;
import src.gen.TypeScriptParser.PrimitiveTypeContext;
import src.gen.TypeScriptParser.PropertyAssignContext;
import src.gen.TypeScriptParser.PropertyNameContext;
import src.gen.TypeScriptParser.ReferenceTypeContext;
import src.gen.TypeScriptParser.SimpleTypeContext;
import src.gen.TypeScriptParser.TypeAnnotationContext;
import src.gen.TypeScriptParser.TypeNameContext;
import src.gen.TypeScriptParser.VariableDeclContext;
import src.heap.Heap;
import src.heap.Reference;
import src.symbols.Mod;
import src.symbols.SymbolTableStack;
import src.symbols.SyntacticError;
import src.symbols.TypeTable;
import src.symbols.Variable;
import src.types.ArrayObjectType;
import src.types.BooleanType;
import src.types.NumberType;
import src.types.StringType;
import src.types.Type;
import src.values.ArrayObjectValue;
import src.values.BooleanValue;
import src.values.LiteralObjectValue;
import src.values.NumberValue;
import src.values.ObjectValue;
import src.values.StringValue;
import src.values.Value;

/**
 * TSVisitor
 */
public class TSVisitor extends TypeScriptBaseVisitor<Object> {
	private SymbolTableStack scope;
	private ArrayList<SyntacticError> syntacticErrors;
	private TypeTable typeTable;
	private Value thisObject;

	public TSVisitor() {
		scope = new SymbolTableStack();
		syntacticErrors = new ArrayList<>();
		typeTable = new TypeTable();

		Reference.HEAP = new Heap();
	}

	private void addError(SyntacticError e) {
		syntacticErrors.add(e);
	}

	private Type getTypeByName(String name) throws SyntacticError{
		return typeTable.getTypeByName(name);
	}

	@Override
	public Object visitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
		try {
			int accessModifiers = 0;

			if (ctx.accessModifier() != null)
				accessModifiers = (Integer) visit(ctx.accessModifier());

			int varModifiers = (Integer) visit(ctx.varModifier());
			int readonlyModifiers = ctx.TK_READ_ONLY() != null ? Mod.READONLY : 0;

			List<VariableDeclContext> declList = ctx.variableDeclList().variableDecl();

			for (VariableDeclContext c : declList) {
				String identifier = c.TK_IDENT().getText();
				Type type = null;

				if (c.typeAnnotation() != null)
					type = (Type) visit(c.typeAnnotation());

				Variable var = new Variable(
					identifier,
					accessModifiers | varModifiers | readonlyModifiers,
					type
				);

				if (c.initializer() != null) {
					Value init = (Value) visit(c.initializer());
					var.setValue(init);

					if (var.getType() == null)
						var.setType(init.getType());
				}
				else{
					var.setValue(var.getType().undefinedValue());
				}

				scope.declareVariable(var);
			}
		} catch (NullPointerException e) {
			// e.printStackTrace();
			return null;
		} catch (SyntacticError e) {
			addError(e);
		}
		return null;
	}

	@Override
	public Object visitVarModifier(TypeScriptParser.VarModifierContext ctx) {
		if (ctx.TK_CONST() != null)
			return Mod.CONST;
		else if (ctx.TK_LET() != null)
			return Mod.LET;
		else if (ctx.TK_VAR() != null)
			return Mod.VAR;
		return null;
	}

	@Override
	public Object visitAccessModifier(TypeScriptParser.AccessModifierContext ctx) {
		if (ctx.TK_PUBLIC() != null)
			return Mod.PUBLIC;
		else if (ctx.TK_PRIVATE() != null)
			return Mod.PRIVATE;
		else if (ctx.TK_PROTECTED() != null)
			return Mod.PROTECTED;

		return null;
	}

	@Override
	public Object visitLiteral(LiteralContext ctx) {
		try {
			if (ctx.BOOLEAN_LITERAL() != null) {
				return new BooleanValue(Boolean.parseBoolean(ctx.getText()));
			} else if (ctx.STRING_LITERAL() != null) {
				String stringLiteral = ctx.STRING_LITERAL().getText();
				StringBuilder value = new StringBuilder();

				for (int i = 1; i < stringLiteral.length() - 1; i++)
					value.append(stringLiteral.charAt(i));
				return new StringValue(value.toString());
			} else if (ctx.NULL_LITERAL() != null)
				return new NumberValue(0);
			else {
				String literal = ctx.NUMERIC_LITERAL().getText();

				if (literal.startsWith("0x") || literal.startsWith("0X"))
					return new NumberValue(Integer.parseInt(literal.substring(2), 16));
				else if (literal.startsWith("0o") || literal.startsWith("0O"))
					return new NumberValue(Integer.parseInt(literal.substring(2), 8));
				else if (literal.startsWith("0b") || literal.startsWith("0B"))
					return new NumberValue(Integer.parseInt(literal.substring(2), 2));
				else if (literal.startsWith("0") && !literal.startsWith("0"))
					return new NumberValue(Integer.parseInt(literal.substring(1), 8));
				else {
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
			Value value = (Value) visit(ctx.expression());

			return value.minus();
		} catch (SyntacticError e) {
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitTypeAnnotation(TypeAnnotationContext ctx) {
		return visit(ctx.typeName());
	}

	@Override
	public Object visitTypeName(TypeNameContext ctx) {
		if( ctx.simpleType() != null )
			return visit(ctx.simpleType());
		else if( ctx.parametricType() != null )
			return visit(ctx.parametricType());
		else if( ctx.arrayType() != null )
			return visit(ctx.arrayType());
		return null;
	}

	@Override
	public Object visitArrayType(ArrayTypeContext ctx) {
		try {
			if( ctx.simpleType() != null )
				return new ArrayObjectType((Type)visit(ctx.simpleType()));
			
			Type type = (Type)visit(ctx.arrayType());
			return new ArrayObjectType(type);
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitParametricType(ParametricTypeContext ctx) {
		// TODO Add parametric behavior
		return visit(ctx.simpleType());
	}

	List<Value> getArguments(FunctionCallContext ctx){
		ArrayList<Value> ans = new ArrayList<>();

		if( ctx.expressionSequence() != null ){
			List<ExpressionContext> expList = ctx.expressionSequence().expression();

			for(int i=0; i < expList.size(); i++)
				ans.add((Value)visit(expList.get(i)));
		}
		return ans;
	}

	@Override
	public Object visitExprNew(ExprNewContext ctx) {
		try {
			String constructorName = ctx.functionCall().TK_IDENT().getText();

			if( constructorName.equals("Array") ){
				List<Value> args = getArguments(ctx.functionCall());
				
				if( args.size() == 0 ){
					return Reference.HEAP.mallocArray(0);
				}
				else if( args.size() == 1 && NumberType.isOfThisType(args.get(0)) ){
					NumberValue len = (NumberValue)args.get(0);
					return Reference.HEAP.mallocArray((int)len.getValue());
				}
				else{
					return Reference.HEAP.mallocArray(args);
				}
			}
			else{
				// TODO Llamar al constructor
				return null;
			}
		} catch (SyntacticError e) {
			addError(e);
			return null;
		}
	}

	@Override
	public Object visitArrayLiteralAlt(ArrayLiteralAltContext ctx) {
		try {
			List<ArrayElementContext> elems = ctx.arrayElement();
			List<Value> values = new ArrayList<>();

			for(int i=0; i < elems.size(); i++)
				values.add((Value)visit(elems.get(i)));

			return Reference.HEAP.mallocArray(values);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch(NullPointerException e){
			// System.out.println("OK");
			// e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object visitArrayElement(ArrayElementContext ctx) {
		if( ctx.expression() != null )
			return visit(ctx.expression());
		else
			return visit(ctx.TK_IDENT());
	}

	@Override
	public Object visitArrayLiteralEmptyAlt(ArrayLiteralEmptyAltContext ctx) {
		return Reference.HEAP.mallocArray(0);
	}

	@Override
	public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
		String type = ctx.getText();

		if( type.equals("number") )
			return new NumberType();
		else if( type.equals("boolean") )
			return new BooleanType();
		else
			return new StringType();
	}

	@Override
	public Object visitExprThis(ExprThisContext ctx) {
		if( thisObject != null ){
			return thisObject;
		}
		addError(new SyntacticError("this no puede ser referenciado. El contexto no es un objeto."));
		return null;
	}

	@Override
	public Object visitReferenceType(ReferenceTypeContext ctx) {
		try {
			return getTypeByName(ctx.getText());
		} catch (SyntacticError e) {
			addError(e);
			return null;
		}
	}

	@Override
	public Object visitSimpleType(SimpleTypeContext ctx) {
		if( ctx.primitiveType() != null )
			return visit(ctx.primitiveType());
		else
			return visit(ctx.referenceType());
	}

	@Override
	public Object visitExprPlusOp(ExprPlusOpContext ctx) {
		try {
			Value value = (Value) visit(ctx.expression());

			return value.plus();
		} catch (SyntacticError e) {
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprBinaryNot(ExprBinaryNotContext ctx) {
		try {
			Value value = (Value) visit(ctx.expression());

			return value.binNot();
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprNot(ExprNotContext ctx) {
		try {
			Value value = (Value) visit(ctx.expression());

			return value.logicNot();
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprAsig(ExprAsigContext ctx) {
		try {
			ExpressionContext expLeft = ctx.expression().get(0);

			if( expLeft instanceof ExprDotIdentContext ){
				ExprDotIdentContext expDotIdent = (ExprDotIdentContext)expLeft;

				Reference ref = (Reference)visit(expDotIdent.expression());
				String property = expDotIdent.identifier().getText();
				Value value = (Value)visit(ctx.expression().get(1));
				
				// System.out.println(ref + " -> " + property + " = " + value);

				ref.set(property, value);
				return value;
			}
			else if( expLeft instanceof ExprObjectIndexContext ){
				ExprObjectIndexContext expObjIndex = (ExprObjectIndexContext)expLeft;

				Reference ref = (Reference)visit(expObjIndex.expression());
				Value index = (Value)visit(expObjIndex.expressionSequence());
				Value value = (Value)visit(ctx.expression().get(1));

				if( StringType.isOfThisType(index) || NumberType.isOfThisType(index) ){
					String property = index.toString();

					ref.set(property, value);
					return value;
				}
				else
					throw new SyntacticError(index.toString() + " no es de tipo string o number");
			}
			else{
				//TODO Hacer lo de function call
			}
			return null;
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e){
			return null;
		}
	}

	@Override
	public Object visitInitializer(InitializerContext ctx) {
		try {
			Value value = (Value) visit(ctx.expression());
			return value;
		} catch (NullPointerException e) {
			return null;
		}
	}

	/**
	 * Expression
	 **/
	@Override
	public Object visitExprMultDivPerc(ExprMultDivPercContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			if (ctx.TK_PERCENT() != null)
				return value1.mod(value2);
			else if (ctx.TK_STAR() != null)
				return value1.prod(value2);
			else
				return value1.div(value2);

		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprPrimitiveLiteral(ExprPrimitiveLiteralContext ctx) {
		try {
			Value value = (Value) visit(ctx.literal());
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
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprEquality(ExprEqualityContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			if (ctx.TK_EQEQ() != null)
				return value1.equals(value2);
			else if (ctx.TK_IDENTEQ() != null)
				return value1.strictEquals(value2);
			else if (ctx.TK_NOTEQ() != null) {
				return value1.notEquals(value2);
			} else if (ctx.TK_IDENTNOTEQ() != null)
				return value1.notStrictEquals(value2);
			return null;
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprComparator(ExprComparatorContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			if (ctx.TK_GREAT() != null)
				return value1.greater(value2);
			else if (ctx.TK_GREATEQ() != null)
				return value1.greaterOrEq(value2);
			else if (ctx.TK_LESS() != null)
				return value1.less(value2);
			else
				return value1.lessOrEq(value2);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprSumSubs(ExprSumSubsContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			if (ctx.TK_PLUS() != null)
				return value1.sum(value2);
			else
				return value1.sub(value2);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprParent(ExprParentContext ctx) {
		List<ExpressionContext> expList = ctx.expressionSequence().expression();
		Value value = null;
		
		for(int i=0; i < expList.size(); i++)
			value = (Value)visit(expList.get(i));
		System.out.println(value);
		// System.out.println(value instanceof ArrayObjectValue);
		// System.out.println(Reference.HEAP);
		return value;
	}

	@Override
	public Object visitExprObjectLiteral(ExprObjectLiteralContext ctx) {
		Value value = (Value) visit(ctx.objectLiteral());
		return value;
	}

	@Override
	public Object visitObjLiteral(ObjLiteralContext ctx) {
		try {
			List<PropertyAssignContext> propList = ctx.propertyAssign();

			ArrayList<Value> values = new ArrayList<>();
			ArrayList<String> names = new ArrayList<>();

			for (int i = 0; i < propList.size(); i++) {
				names.add((String) visit(propList.get(i).propertyName()));
				values.add((Value) visit(propList.get(i).expression()));
			}
			return Reference.HEAP.mallocLiteralObject(names, values);
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprLogicAnd(ExprLogicAndContext ctx) {
		try{
			Value value1 = (Value) visit(ctx.expression().get(0));
			
			if( NumberType.isOfThisType(value1) ){
				NumberValue numberValue = (NumberValue)value1;
				
				if( numberValue.isUndefinedOrZero() )
					return value1;
			}
			else if( BooleanType.isOfThisType(value1) ){
				BooleanValue booleanValue = (BooleanValue)value1;
				
				if( booleanValue.isUndefinedOrFalse() )
					return value1;
			}
			
			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.logicAnd(value2);
		} catch(SyntacticError e){
			addError(e);
			return null;
		} catch(NullPointerException e){
			return null;
		}
	}

	@Override
	public Object visitExprLogicOr(ExprLogicOrContext ctx) {
		try{
			Value value1 = (Value) visit(ctx.expression().get(0));
			
			if( NumberType.isOfThisType(value1) ){
				NumberValue numberValue = (NumberValue)value1;
				
				if( !numberValue.isUndefinedOrZero() )
					return value1;
			}
			else if( BooleanType.isOfThisType(value1) ){
				BooleanValue booleanValue = (BooleanValue)value1;
				
				if( !booleanValue.isUndefinedOrFalse() )
					return value1;
			}
			
			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.logicOr(value2);
		} catch(SyntacticError e){
			addError(e);
			return null;
		} catch(NullPointerException e){
			return null;
		}
	}

	@Override
	public Object visitExprBinAnd(ExprBinAndContext ctx) {
		try{
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.binAnd(value2);
		} catch(SyntacticError e){
			addError(e);
			return null;
		} catch(NullPointerException e){
			return null;
		}
	}

	@Override
	public Object visitExprBinOr(ExprBinOrContext ctx) {
		try{
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.binOr(value2);
		} catch(SyntacticError e){
			addError(e);
			return null;
		} catch(NullPointerException e){
			return null;
		}
	}

	@Override
	public Object visitPropertyName(PropertyNameContext ctx) {
		if (ctx.STRING_LITERAL() != null) {
			StringBuilder ans = new StringBuilder();

			for (int i = 1; i < ctx.getText().length() - 1; i++)
				ans.append(ctx.getText().charAt(i));
			return ans;
		} else
			return ctx.getText();
	}

	@Override
	public Object visitObjLiteralEmpty(ObjLiteralEmptyContext ctx) {
		return Reference.HEAP.mallocLiteralObject(new ArrayList<String>(), new ArrayList<Value>());
	}

	/**
	 * Property Access
	 **/

	@Override
	public Object visitExprDotIdent(ExprDotIdentContext ctx) {
		try {
			ObjectValue objValue = (ObjectValue) visit(ctx.expression());

			// System.out.println(objValue instanceof Reference);
			// System.out.println(ctx.expression().getText() + " -> " + objValue);

			return objValue.get(ctx.identifier().getText());
		} catch (ClassCastException e) {
			syntacticErrors.add(new SyntacticError(
					"La expresion a la izquierda del operador . no es un objeto"));
			return null;
		} catch (NullPointerException e) {
			syntacticErrors.add(new SyntacticError(
					"La expresion a la izquierda del operador . no es un objeto"));
			return null;
		} catch (SyntacticError e) {
			addError(e);
			return null;
		}
	}

	@Override
	public Object visitExprObjectIndex(ExprObjectIndexContext ctx) {
		try {
			ObjectValue objValue = (ObjectValue) visit(ctx.expression());
			List<ExpressionContext> expList = ctx.expressionSequence().expression();

			Value index = null;
			for (int i = 0; i < expList.size(); i++)
				index = (Value) visit(expList.get(i));

			if (StringType.isOfThisType(index)) {
				return objValue.get(index.toString());
			} else if (NumberType.isOfThisType(index))
				return objValue.get(index.toString());
			else {
				throw new SyntacticError(
						"El indice " + expList.get(expList.size() - 1).getText() + " no es valido");
			}
		} catch (ClassCastException e) {
			syntacticErrors.add(new SyntacticError(
					"La expresion a la izquierda del operador [] no es un objeto"));
			return null;
		} catch (NullPointerException e) {
			return null;
		} catch (SyntacticError e) {
			addError(e);
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