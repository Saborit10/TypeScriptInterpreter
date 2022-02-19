package src.interp;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import src.gen.TypeScriptBaseVisitor;
import src.gen.TypeScriptParser;
import src.gen.TypeScriptParser.ArrayElementContext;
import src.gen.TypeScriptParser.ArrayLiteralAltContext;
import src.gen.TypeScriptParser.ArrayLiteralEmptyAltContext;
import src.gen.TypeScriptParser.ArrayTypeContext;
import src.gen.TypeScriptParser.BlockContext;
import src.gen.TypeScriptParser.BreakStatementContext;
import src.gen.TypeScriptParser.CallSignatureContext;
import src.gen.TypeScriptParser.ClassElementContext;
import src.gen.TypeScriptParser.ClassHeritageContext;
import src.gen.TypeScriptParser.ClassMemberMethodContext;
import src.gen.TypeScriptParser.ClassMemberPropertyContext;
import src.gen.TypeScriptParser.ClassStatementContext;
import src.gen.TypeScriptParser.ConditionExpressionSequenceContext;
import src.gen.TypeScriptParser.ContinueStatementContext;
import src.gen.TypeScriptParser.EmptyStatementContext;
import src.gen.TypeScriptParser.ExprAndAsigContext;
import src.gen.TypeScriptParser.ExprAsigContext;
import src.gen.TypeScriptParser.ExprBinAndContext;
import src.gen.TypeScriptParser.ExprBinOrContext;
import src.gen.TypeScriptParser.ExprBinaryNotContext;
import src.gen.TypeScriptParser.ExprComparatorContext;
import src.gen.TypeScriptParser.ExprDivAsigContext;
import src.gen.TypeScriptParser.ExprDotFunctionCallContext;
import src.gen.TypeScriptParser.ExprDotIdentContext;
import src.gen.TypeScriptParser.ExprEqualityContext;
import src.gen.TypeScriptParser.ExprFunctionCallContext;
import src.gen.TypeScriptParser.ExprFunctionObjectContext;
import src.gen.TypeScriptParser.ExprIdentifierContext;
import src.gen.TypeScriptParser.ExprLogicAndContext;
import src.gen.TypeScriptParser.ExprLogicOrContext;
import src.gen.TypeScriptParser.ExprMinusAsigContext;
import src.gen.TypeScriptParser.ExprMinusOpContext;
import src.gen.TypeScriptParser.ExprMultAsigContext;
import src.gen.TypeScriptParser.ExprMultDivPercContext;
import src.gen.TypeScriptParser.ExprNewContext;
import src.gen.TypeScriptParser.ExprNotContext;
import src.gen.TypeScriptParser.ExprObjectIndexContext;
import src.gen.TypeScriptParser.ExprObjectLiteralContext;
import src.gen.TypeScriptParser.ExprOrAsigContext;
import src.gen.TypeScriptParser.ExprParentContext;
import src.gen.TypeScriptParser.ExprPercentAsigContext;
import src.gen.TypeScriptParser.ExprPlusAsigContext;
import src.gen.TypeScriptParser.ExprPlusOpContext;
import src.gen.TypeScriptParser.ExprPrimitiveLiteralContext;
import src.gen.TypeScriptParser.ExprSumSubsContext;
import src.gen.TypeScriptParser.ExprThisContext;
import src.gen.TypeScriptParser.ExpressionContext;
import src.gen.TypeScriptParser.ExpressionSequenceContext;
import src.gen.TypeScriptParser.ExpressionStatementContext;
import src.gen.TypeScriptParser.ForNormalContext;
import src.gen.TypeScriptParser.ForVarIteratorContext;
import src.gen.TypeScriptParser.ForVarNormalContext;
import src.gen.TypeScriptParser.FormalParameterArgContext;
import src.gen.TypeScriptParser.FormalParameterListContext;
import src.gen.TypeScriptParser.FunctionBodyContext;
import src.gen.TypeScriptParser.FunctionCallContext;
import src.gen.TypeScriptParser.FunctionExpressionDeclContext;
import src.gen.TypeScriptParser.FunctionStatementContext;
import src.gen.TypeScriptParser.IfStatementContext;
import src.gen.TypeScriptParser.InitializerContext;
import src.gen.TypeScriptParser.LastExpressionSequenceContext;
import src.gen.TypeScriptParser.LiteralContext;
import src.gen.TypeScriptParser.ObjLiteralContext;
import src.gen.TypeScriptParser.ObjLiteralEmptyContext;
import src.gen.TypeScriptParser.ParameterContext;
import src.gen.TypeScriptParser.ParametricTypeContext;
import src.gen.TypeScriptParser.PrimitiveTypeContext;
import src.gen.TypeScriptParser.PrintStatementContext;
import src.gen.TypeScriptParser.PropertyAssignContext;
import src.gen.TypeScriptParser.PropertyMemberBaseContext;
import src.gen.TypeScriptParser.PropertyNameContext;
import src.gen.TypeScriptParser.ReferenceTypeContext;
import src.gen.TypeScriptParser.ReturnStatementContext;
import src.gen.TypeScriptParser.SimpleTypeContext;
import src.gen.TypeScriptParser.SourceElemContext;
import src.gen.TypeScriptParser.StatementContext;
import src.gen.TypeScriptParser.TypeAnnotationContext;
import src.gen.TypeScriptParser.TypeNameContext;
import src.gen.TypeScriptParser.VariableDeclContext;
import src.gen.TypeScriptParser.VariableDeclListContext;
import src.gen.TypeScriptParser.WhileStatementContext;
import src.heap.Heap;
import src.heap.Reference;
import src.symbols.Goto;
import src.symbols.Mod;
import src.symbols.SymbolTableStack;
import src.symbols.SyntacticError;
import src.symbols.TypeTable;
import src.symbols.Variable;
import src.types.ArrayObjectType;
import src.types.BooleanType;
import src.types.ClassInstanceType;
import src.types.FunctionObjectType;
import src.types.LiteralObjectType;
import src.types.NumberType;
import src.types.ObjectType;
import src.types.StringType;
import src.types.Type;
import src.values.ArrayObjectValue;
import src.values.BooleanValue;
import src.values.FunctionObjectValue;
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
	private Stack<Reference> thisStack;

	public TSVisitor() {
		scope = new SymbolTableStack();
		syntacticErrors = new ArrayList<>();
		typeTable = new TypeTable();
		thisStack = new Stack<>();

		Reference.HEAP = new Heap();
	}

	private Reference thisStackTop() {
		return thisStack.size() == 0 ? null : thisStack.peek();
	}

	private void addError(SyntacticError e) {
		syntacticErrors.add(e);
	}

	private Type getTypeByName(String name) throws SyntacticError {
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
						type);

				if (c.initializer() != null) {
					Value init = (Value) visit(c.initializer());

					var.setValue(init);

					if (var.getType() == null)
						var.setType(init.getType());
				} else {
					// System.out.println(var.getType().undefinedValue());
					var.setValue(var.getType().undefinedValue());
				}

				scope.declareVariable(var);
			}
		} catch (NullPointerException e) {
			// e.printStackTrace();
			return Goto.NORMAL_SIGNAL;
		} catch (SyntacticError e) {
			e.printStackTrace();
			addError(e);
		}
		return Goto.NORMAL_SIGNAL;
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
		if (ctx.simpleType() != null)
			return visit(ctx.simpleType());
		else if (ctx.parametricType() != null)
			return visit(ctx.parametricType());
		else if (ctx.arrayType() != null)
			return visit(ctx.arrayType());
		return null;
	}

	@Override
	public Object visitReferenceType(ReferenceTypeContext ctx) {
		try {
			String typeName = ctx.getText();

			if (typeName.equals("Function"))
				return new FunctionObjectType();
			else if (typeName.equals("String"))
				return new StringType();
			else if (typeName.equals("object"))
				return new ObjectType();

			return getTypeByName(typeName);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		}
	}

	@Override
	public Object visitSimpleType(SimpleTypeContext ctx) {
		if (ctx.primitiveType() != null)
			return visit(ctx.primitiveType());
		else
			return visit(ctx.referenceType());
	}

	@Override
	public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
		String type = ctx.getText();

		if (type.equals("number"))
			return new NumberType();
		else if (type.equals("boolean"))
			return new BooleanType();
		else
			return new StringType();
	}

	@Override
	public Object visitArrayType(ArrayTypeContext ctx) {
		try {
			if (ctx.simpleType() != null)
				return new ArrayObjectType((Type) visit(ctx.simpleType()));

			Type type = (Type) visit(ctx.arrayType());
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

	List<Value> getArguments(FunctionCallContext ctx) {
		ArrayList<Value> ans = new ArrayList<>();

		if (ctx.expressionSequence() != null) {
			List<ExpressionContext> expList = ctx.expressionSequence().expression();

			for (int i = 0; i < expList.size(); i++)
				ans.add((Value) visit(expList.get(i)));
		}
		return ans;
	}

	@Override
	public Object visitExprNew(ExprNewContext ctx) {
		try {
			String constructorName = ctx.functionCall().TK_IDENT().getText();

			if (constructorName.equals("Array")) {
				List<Value> args = getArguments(ctx.functionCall());

				if (args.size() == 0) {
					return Reference.HEAP.mallocArray(0);
				} else if (args.size() == 1 && NumberType.isOfThisType(args.get(0))) {
					NumberValue len = (NumberValue) args.get(0);
					return Reference.HEAP.mallocArray((int) len.getValue());
				} else {
					return Reference.HEAP.mallocArray(args);
				}
			} else {
				ClassInstanceType type = typeTable.getTypeByName(constructorName);
				List<Type> argTypes = new ArrayList<>();
				List<Value> argVals = getArguments(ctx.functionCall());

				for (int i = 0; i < argVals.size(); i++)
					argTypes.add(argVals.get(i).getType());

				FunctionObjectValue constructor = type.getConstructorBySignature(constructorName, argTypes);

				thisStack.push(type.createObject());
				scope.createUnnamedScope();

				for (int i = 0; i < argVals.size(); i++) {
					scope.declareVariable(new Variable(
							constructor.getArgNames()[i],
							0,
							constructor.getArgTypes()[i],
							argVals.get(i)));
				}

				visit(constructor.getBody());

				scope.popScope();
				return thisStack.pop();
			}
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Object visitArrayLiteralAlt(ArrayLiteralAltContext ctx) {
		try {
			List<ArrayElementContext> elems = ctx.arrayElement();
			List<Value> values = new ArrayList<>();

			for (int i = 0; i < elems.size(); i++)
				values.add((Value) visit(elems.get(i)));

			return Reference.HEAP.mallocArray(values);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			// System.out.println("OK");
			// e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object visitArrayElement(ArrayElementContext ctx) {
		if (ctx.expression() != null)
			return visit(ctx.expression());
		else
			return visit(ctx.TK_IDENT());
	}

	@Override
	public Object visitArrayLiteralEmptyAlt(ArrayLiteralEmptyAltContext ctx) {
		return Reference.HEAP.mallocArray(0);
	}

	@Override
	public Object visitExprThis(ExprThisContext ctx) {
		if (thisStack.isEmpty()) {
			addError(new SyntacticError("this no puede ser referenciado. El contexto no es un objeto."));
			return null;
		}
		return thisStack.peek();
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

	/**
	 * Asignacion
	 */

	Value makeAssign(ExpressionContext ctx) throws SyntacticError {
		ExpressionContext expLeft = null;
		Value value = null;
		String property = null;
		Reference ref = null;

		if (ctx instanceof ExprAsigContext) {
			expLeft = ((ExprAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprPlusAsigContext) {
			expLeft = ((ExprPlusAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprPlusAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprMinusAsigContext) {
			expLeft = ((ExprMinusAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprMinusAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprMultAsigContext) {
			expLeft = ((ExprMultAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprMultAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprDivAsigContext) {
			expLeft = ((ExprDivAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprDivAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprPercentAsigContext) {
			expLeft = ((ExprPercentAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprPercentAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprAndAsigContext) {
			expLeft = ((ExprAndAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprAndAsigContext) ctx).expression().get(1));
		} else if (ctx instanceof ExprOrAsigContext) {
			expLeft = ((ExprOrAsigContext) ctx).expression().get(0);
			value = (Value) visit(((ExprOrAsigContext) ctx).expression().get(1));
		}

		if (expLeft instanceof ExprDotIdentContext) {
			ExprDotIdentContext expDotIdent = (ExprDotIdentContext) expLeft;

			ref = (Reference) visit(expDotIdent.expression());
			property = expDotIdent.identifier().getText();
		} else if (expLeft instanceof ExprObjectIndexContext) {
			ExprObjectIndexContext expObjIndex = (ExprObjectIndexContext) expLeft;

			ref = (Reference) visit(expObjIndex.expression());
			Value index = (Value) visit(expObjIndex.expressionSequence());

			if (StringType.isOfThisType(index) || NumberType.isOfThisType(index))
				property = index.toString();
			else
				throw new SyntacticError(index.toString() + " no es de tipo string o number");
		} else if (expLeft instanceof ExprDotFunctionCallContext) {
			throw new SyntacticError("Una llamada a funcion no es lvalue");
		}

		Value oldValue = null;

		if (ref == null)
			oldValue = scope.getValueOf(expLeft.getText());
		else
			oldValue = ref.get(thisStackTop(), property);

		if (ctx instanceof ExprPlusAsigContext) {
			value = oldValue.sum(value);
		} else if (ctx instanceof ExprMinusAsigContext) {
			value = oldValue.sub(value);
		} else if (ctx instanceof ExprMultAsigContext) {
			value = oldValue.prod(value);
		} else if (ctx instanceof ExprDivAsigContext) {
			value = oldValue.div(value);
		} else if (ctx instanceof ExprPercentAsigContext) {
			value = oldValue.mod(value);
		} else if (ctx instanceof ExprAndAsigContext) {
			value = oldValue.binAnd(value);
		} else if (ctx instanceof ExprOrAsigContext) {
			value = oldValue.binOr(value);
		}

		if (ref == null)
			scope.setValueOf(expLeft.getText(), value);
		else
			ref.set(thisStackTop(), property, value);
		return value;
	}

	@Override
	public Object visitExprAsig(ExprAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			// e.printStackTrace();
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprAndAsig(ExprAndAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprDivAsig(ExprDivAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprMinusAsig(ExprMinusAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprMultAsig(ExprMultAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprOrAsig(ExprOrAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprPercentAsig(ExprPercentAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprPlusAsig(ExprPlusAsigContext ctx) {
		try {
			return makeAssign(ctx);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	/**
	 * Inicializador
	 */
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
	 */
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

		for (int i = 0; i < expList.size(); i++)
			value = (Value) visit(expList.get(i));

		// if (value == null)
		// System.out.println("[null returned]");
		// else
		// System.out.println(value);
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
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));

			if (NumberType.isOfThisType(value1)) {
				NumberValue numberValue = (NumberValue) value1;

				if (numberValue.isUndefinedOrZero())
					return value1;
			} else if (BooleanType.isOfThisType(value1)) {
				BooleanValue booleanValue = (BooleanValue) value1;

				if (booleanValue.isUndefinedOrFalse())
					return value1;
			}

			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.logicAnd(value2);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprLogicOr(ExprLogicOrContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));

			if (NumberType.isOfThisType(value1)) {
				NumberValue numberValue = (NumberValue) value1;

				if (!numberValue.isUndefinedOrZero())
					return value1;
			} else if (BooleanType.isOfThisType(value1)) {
				BooleanValue booleanValue = (BooleanValue) value1;

				if (!booleanValue.isUndefinedOrFalse())
					return value1;
			}

			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.logicOr(value2);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprBinAnd(ExprBinAndContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.binAnd(value2);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitExprBinOr(ExprBinOrContext ctx) {
		try {
			Value value1 = (Value) visit(ctx.expression().get(0));
			Value value2 = (Value) visit(ctx.expression().get(1));

			return value1.binOr(value2);
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
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

			return objValue.get(thisStackTop(), ctx.identifier().getText());
		} catch (ClassCastException e) {
			// e.printStackTrace();
			addError(new SyntacticError(
					"La expresion a la izquierda del operador . no es un objeto"));
			return null;
		} catch (NullPointerException e) {
			addError(new SyntacticError(
					"La expresion a la izquierda del operador . no es un objeto"));
			// e.printStackTrace();
			return null;
		} catch (SyntacticError e) {
			// e.printStackTrace();
			addError(e);
			return null;
		}
	}

	@Override
	public Object visitExprDotFunctionCall(ExprDotFunctionCallContext ctx) {
		// System.out.println("OK");
		try {
			Reference ref = (Reference) visit(ctx.expression());

			if (ctx.functionCall().TK_IDENT() != null) {
				Value value = ref.getMethod(thisStackTop(), ctx.functionCall().TK_IDENT().getText());

				if (value instanceof FunctionObjectValue) {
					FunctionObjectValue f = (FunctionObjectValue) value;

					List<Type> argTypes = new ArrayList<>();
					List<Value> argVals = getArguments(ctx.functionCall());

					for (int i = 0; i < argVals.size(); i++)
						argTypes.add(argVals.get(i).getType());

					scope.createUnnamedScope();
					thisStack.add(ref);

					for (int i = 0; i < argVals.size(); i++) {
						scope.declareVariable(new Variable(
								f.getArgNames()[i],
								0,
								f.getArgTypes()[i],
								argVals.get(i)));
					}

					visit(f.getBody());

					Value returnValue = null;
					if (scope.isDeclaredOnTop("[@return]"))
						returnValue = scope.getValueOf("[@return]");
					else
						returnValue = new BooleanType().undefinedValue();

					scope.popScope();
					thisStack.pop();

					return returnValue;
				} else
					throw new SyntacticError(ctx.functionCall().TK_IDENT().getText() + " no es una funcion");

			} else
				throw new SyntacticError(
						ctx.functionCall().getText() + " no se puede llamar desde " + ctx.expression().getText());
		} catch (ClassCastException e) {
			addError(new SyntacticError(
					"La expresion a la izquierda del operador . no es un objeto"));
			return null;
		} catch (NullPointerException e) {
			addError(new SyntacticError(
					"La expresion a la izquierda del operador . no es un objeto"));
			return null;
		} catch (SyntacticError e) {
			// e.printStackTrace();
			addError(e);
			return null;
		}
	}

	@Override
	public Object visitExprFunctionObject(ExprFunctionObjectContext ctx) {
		return visit(ctx.functionExpressionDecl());
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
				return objValue.get(thisStackTop(), index.toString());
			} else if (NumberType.isOfThisType(index))
				return objValue.get(thisStackTop(), index.toString());
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

	/**
	 * Scopes and Blocks
	 */
	@Override
	public Object visitBlock(BlockContext ctx) {
		scope.createUnnamedScope();

		List<StatementContext> statements = ctx.statementList().statement();

		int val = Goto.NORMAL_SIGNAL;
		for (int i = 0; i < statements.size(); i++) {
			val = (Integer) visit(statements.get(i));

			if (val != Goto.NORMAL_SIGNAL)
				break;
		}

		scope.popScope();
		return val;
	}

	@Override
	public Object visitStatement(StatementContext ctx) {
		Object obj = visit(ctx.children.get(0));
		return obj;
	}

	@Override
	public Object visitIfStatement(IfStatementContext ctx) {
		Value conditionValue = (Value) visit(ctx.expressionSequence());
		List<StatementContext> statements = ctx.statement();

		if (!conditionValue.isFalsy())
			return visit(statements.get(0));
		else if (statements.size() > 1)
			return visit(statements.get(1));

		return Goto.NORMAL_SIGNAL;
	}

	/**
	 * Classes
	 * 
	 * @throws SyntacticError
	 */
	private void fillParamTypesAndNames(FormalParameterListContext ctx, List<Type> argTypes,
			List<String> argNames) throws SyntacticError {

		List<FormalParameterArgContext> args = ctx.formalParameterArg();

		for (int i = 0; i < args.size(); i++) {
			if (args.get(i).identifierOrKeyword().TK_IDENT() == null)
				throw new SyntacticError("El nombre del argumento no fue especificado");
			if (args.get(i).typeAnnotation() == null)
				throw new SyntacticError("El tipo del argumento no fue especificado");

			argTypes.add((Type) visit(args.get(i).typeAnnotation()));
			argNames.add(args.get(i).identifierOrKeyword().TK_IDENT().getText());
		}
	}

	@Override
	public Object visitClassStatement(ClassStatementContext ctx) {
		try {
			String typeName = ctx.TK_IDENT().getText();

			Object obj = visit(ctx.classHeritage());
			ClassInstanceType superType = null;

			if (obj != null) {
				if (obj instanceof ClassInstanceType)
					superType = (ClassInstanceType) obj;
				else
					throw new SyntacticError("La clase no hereda de un tipo de referencia");
			}

			List<ClassElementContext> elems = ctx.classBody().classElement();

			List<Type> propertyTypes = new ArrayList<>();
			List<String> propertyNames = new ArrayList<>();
			List<FunctionObjectValue> constructors = new ArrayList<>();
			List<Variable> methods = new ArrayList<>();
			Map<String, Variable> staticValues = new TreeMap<>();
			Map<String, Value> initValues = new TreeMap<>();
			List<Integer> modifiers = new ArrayList<>();

			for (ClassElementContext elem : elems) {
				if (elem.constructorDeclaration() != null) {
					ArrayList<Type> argTypes = new ArrayList<>();
					ArrayList<String> argNames = new ArrayList<>();

					if (elem.constructorDeclaration().formalParameterList() != null)
						fillParamTypesAndNames(elem.constructorDeclaration().formalParameterList(), argTypes, argNames);

					constructors.add(new FunctionObjectValue(
							"contructor",
							argTypes,
							argNames,
							elem.constructorDeclaration().functionBody()));
				} else if (elem.memberDecl() != null) {
					if (elem.memberDecl() instanceof ClassMemberPropertyContext) {
						ClassMemberPropertyContext propCtx = (ClassMemberPropertyContext) elem.memberDecl();

						Type type = null;
						Value init = null;
						String name = (String) visit(propCtx.propertyName());
						int mods = (Integer) visit(propCtx.propertyMemberBase());

						if ((mods & Mod.PROTECTED) == 0 && (mods & Mod.PRIVATE) == 0)
							mods |= Mod.PUBLIC;

						if (propCtx.typeAnnotation() != null)
							type = (Type) visit(propCtx.typeAnnotation());
						if (propCtx.initializer() != null)
							init = (Value) visit(propCtx.initializer());

						if (type == null) {
							if (init != null)
								type = init.getType();
							else
								throw new SyntacticError("No se ha podido inferir el tipo de la propiedad " + name);
						}

						if (type != null && init != null && !type.isExtendedType(init.getType()))
							throw new SyntacticError(
									"El valor " + init + " no puede ser asignado a una variable de tipo " + type);

						if ((mods & Mod.STATIC) > 0) {
							if (init == null)
								staticValues.put(name, new Variable(name, mods, type));
							else
								staticValues.put(name, new Variable(name, mods, type, init));
						} else {
							propertyNames.add(name);
							propertyTypes.add(type);
							modifiers.add(mods);

							if (init != null)
								initValues.put(name, init);
						}
					} else if (elem.memberDecl() instanceof ClassMemberMethodContext) {
						ClassMemberMethodContext membCtx = (ClassMemberMethodContext) elem.memberDecl();

						String name = (String) visit(membCtx.propertyName());
						int mods = (Integer) visit(membCtx.propertyMemberBase());

						if ((mods & Mod.PROTECTED) == 0 && (mods & Mod.PRIVATE) == 0)
							mods |= Mod.PUBLIC;

						List<String> argNames = new ArrayList<>();
						List<Type> argTypes = new ArrayList<>();

						fillParamTypesAndNames(membCtx.callSignature(), argTypes, argNames);

						FunctionObjectValue func = new FunctionObjectValue(
								name,
								argTypes,
								argNames,
								membCtx.functionBody());

						if ((mods & Mod.STATIC) > 0) {
							staticValues.put(name, new Variable(name, mods, func.getType(), func));
						} else {
							methods.add(new Variable(
									func.getName(),
									mods,
									func.getType(),
									func));
						}
					}
				}
			}

			ClassInstanceType newType = new ClassInstanceType(
					typeName,
					superType,
					propertyTypes,
					propertyNames,
					modifiers,
					constructors,
					methods,
					staticValues,
					initValues);

			typeTable.declareType(newType);

			return Goto.NORMAL_SIGNAL;
		} catch (SyntacticError e) {
			addError(e);
			return Goto.NORMAL_SIGNAL;
		} catch (NullPointerException e) {
			// e.printStackTrace();
			return Goto.NORMAL_SIGNAL;
		}
	}

	@Override
	public Object visitClassHeritage(ClassHeritageContext ctx) {
		try {
			if (ctx.classExtendsClause() != null) {
				String typeName = ctx.classExtendsClause().referenceType().TK_IDENT().getText();

				return typeTable.getTypeByName(typeName);
			}
			return null;
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitPropertyMemberBase(PropertyMemberBaseContext ctx) {
		Integer modifiers = 0;

		if (ctx.accessModifier() != null)
			modifiers |= (Integer) visit(ctx.accessModifier());
		if (ctx.TK_STATIC() != null)
			modifiers |= Mod.STATIC;
		if (ctx.TK_ASYNC() != null)
			modifiers |= Mod.ASYNC;
		if (ctx.TK_READ_ONLY() != null)
			modifiers |= Mod.READONLY;

		return modifiers;
	}

	/**
	 * Llamadas a funciones
	 */
	@Override
	public Object visitExprFunctionCall(ExprFunctionCallContext ctx) {
		return visit(ctx.functionCall());
	}

	@Override
	public Object visitFunctionCall(FunctionCallContext ctx) {
		try {
			FunctionObjectValue f = null;

			List<Type> argTypes = new ArrayList<>();
			List<Value> argVals = getArguments(ctx);

			for (int i = 0; i < argVals.size(); i++)
				argTypes.add(argVals.get(i).getType());

			if (ctx.TK_IDENT() != null) {
				String name = ctx.TK_IDENT().getText();

				Value tmp = scope.getValueOf(name);

				if (tmp instanceof FunctionObjectValue)
					f = (FunctionObjectValue) tmp;
				else
					throw new SyntacticError(
							ctx.TK_IDENT().getText() + " no es el nombre de una funcion en el contexto actual");
			} else {
				f = (FunctionObjectValue) visit(ctx.functionExpressionDecl());
			}

			scope.createUnnamedScope();

			for (int i = 0; i < argVals.size(); i++) {
				scope.declareVariable(new Variable(
						f.getArgNames()[i],
						0,
						f.getArgTypes()[i],
						argVals.get(i)));
			}

			visit(f.getBody());

			Value returnValue = null;
			if (scope.isDeclaredOnTop("[@return]"))
				returnValue = scope.getValueOf("[@return]");
			else
				returnValue = new BooleanType().undefinedValue();

			scope.popScope();
			return returnValue;

		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitFunctionExpressionDecl(FunctionExpressionDeclContext ctx) {
		try {
			String name = null;

			if (ctx.TK_IDENT() != null)
				name = ctx.TK_IDENT().getText();

			List<Type> argTypes = new ArrayList<>();
			List<String> argNames = new ArrayList<>();

			if (ctx.formalParameterList() != null)
				fillParamTypesAndNames(ctx.formalParameterList(), argTypes, argNames);

			return new FunctionObjectValue(name, argTypes, argNames, ctx.functionBody());
		} catch (SyntacticError e) {
			addError(e);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Object visitFunctionBody(FunctionBodyContext ctx) {
		List<SourceElemContext> elems = ctx.sourceElem();

		for (int i = 0; i < elems.size(); i++) {
			if ((Integer) visit(elems.get(i).statement()) == Goto.RETURN_SIGNAL)
				break;
		}

		return Goto.NORMAL_SIGNAL;
	}

	@Override
	public Object visitExpressionStatement(ExpressionStatementContext ctx) {
		visit(ctx.expression());
		return Goto.NORMAL_SIGNAL;
	}

	@Override
	public Object visitReturnStatement(ReturnStatementContext ctx) {
		try {
			if (ctx.expressionSequence() != null) {
				Value value = (Value) visit(ctx.expressionSequence());

				scope.declareVariable(new Variable(
						"[@return]",
						0,
						value.getType(),
						value));
			}
		} catch (SyntacticError e) {
			addError(e);
			return null;
		}
		return Goto.RETURN_SIGNAL;
	}

	private void fillParamTypesAndNames(CallSignatureContext ctx, List<Type> argTypes,
			List<String> argNames) throws SyntacticError {

		if (ctx.parameterList() != null) {
			List<ParameterContext> args = ctx.parameterList().parameter();

			for (int i = 0; i < args.size(); i++) {
				String argName = null;

				if (args.get(i).requiredParameter().identifierOrPattern() != null) {
					argName = args.get(i).requiredParameter().identifierOrPattern().getText();
				} else {
					throw new SyntacticError("El nombre del argumento no fue especificado");
				}
				if (args.get(i).requiredParameter().typeAnnotation() == null)
					throw new SyntacticError("El tipo del argumento no fue especificado");

				argTypes.add((Type) visit(args.get(i).requiredParameter().typeAnnotation()));
				argNames.add(argName);
			}
		}
	}

	@Override
	public Object visitFunctionStatement(FunctionStatementContext ctx) {
		try {
			String name = ctx.TK_IDENT().getText();
			List<String> argNames = new ArrayList<>();
			List<Type> argTypes = new ArrayList<>();

			fillParamTypesAndNames(ctx.callSignature(), argTypes, argNames);

			FunctionObjectValue func = new FunctionObjectValue(
					name,
					argTypes,
					argNames,
					ctx.functionBody());

			scope.declareVariable(new Variable(name, 0, func.getType(), func));

			return Goto.NORMAL_SIGNAL;
		} catch (SyntacticError e) {
			addError(e);
			return Goto.NORMAL_SIGNAL;
		}
	}

	@Override
	public Object visitPrintStatement(PrintStatementContext ctx) {
		Value value = (Value) visit(ctx.expression());

		if (value == null)
			System.out.println("[null returned]");
		else
			System.out.println(value);

		return Goto.NORMAL_SIGNAL;
	}

	@Override
	public Object visitWhileStatement(WhileStatementContext ctx) {
		while (true) {
			Value value = (Value) visit(ctx.expressionSequence());

			if (value.isFalsy())
				break;

			int flag = (Integer) visit(ctx.statement());

			if (flag == Goto.BREAK_SIGNAL)
				break;
		}

		return Goto.NORMAL_SIGNAL;
	}

	@Override
	public Object visitContinueStatement(ContinueStatementContext ctx) {
		return Goto.CONTINUE_SIGNAL;
	}

	@Override
	public Object visitBreakStatement(BreakStatementContext ctx) {
		return Goto.BREAK_SIGNAL;
	}

	public TypeTable getTypeTable() {
		return typeTable;
	}

	public void setTypeTable(TypeTable typeTable) {
		this.typeTable = typeTable;
	}

	@Override
	public Object visitForNormal(ForNormalContext ctx) {
		try {
			scope.createUnnamedScope();

			if (ctx.expressionSequence() != null)
				visit(ctx.expressionSequence());

			while (true) {
				if (ctx.conditionExpressionSequence() != null) {
					Value value = (Value) visit(ctx.conditionExpressionSequence());

					// System.out.println("value = " + value);

					if (value.isFalsy())
						break;
				}

				int flag = (Integer) visit(ctx.statement());

				if (flag == Goto.BREAK_SIGNAL)
					break;

				if (ctx.lastExpressionSequence() != null)
					visit(ctx.lastExpressionSequence());
			}

			scope.popScope();

			return Goto.NORMAL_SIGNAL;
		} catch (NullPointerException e){
			return Goto.NORMAL_SIGNAL;
		}
	}

	@Override
	public Object visitConditionExpressionSequence(ConditionExpressionSequenceContext ctx) {
		return visit(ctx.expressionSequence());
	}

	@Override
	public Object visitLastExpressionSequence(LastExpressionSequenceContext ctx) {
		return visit(ctx.expressionSequence());
	}

	@Override
	public Object visitForVarNormal(ForVarNormalContext ctx) {
		try {
			scope.createUnnamedScope();

			int varModifiers = (Integer) visit(ctx.varModifier());

			List<VariableDeclContext> declList = ctx.variableDeclList().variableDecl();

			for (VariableDeclContext c : declList) {
				String identifier = c.TK_IDENT().getText();
				Type type = null;

				if (c.typeAnnotation() != null)
					type = (Type) visit(c.typeAnnotation());

				Variable var = new Variable(
						identifier,
						varModifiers,
						type);

				if (c.initializer() != null) {
					Value init = (Value) visit(c.initializer());

					var.setValue(init);

					if (var.getType() == null)
						var.setType(init.getType());
				} else {
					var.setValue(var.getType().undefinedValue());
				}

				scope.declareVariable(var);
			}

			while (true) {
				if (ctx.conditionExpressionSequence() != null) {
					Value value = (Value) visit(ctx.conditionExpressionSequence());

					if (value.isFalsy())
						break;
				}

				int flag = (Integer) visit(ctx.statement());

				if (flag == Goto.BREAK_SIGNAL)
					break;

				if (ctx.lastExpressionSequence() != null)
					visit(ctx.lastExpressionSequence());
			}

			scope.popScope();

			return Goto.NORMAL_SIGNAL;
		} catch (SyntacticError e) {
			addError(e);
			return Goto.NORMAL_SIGNAL;
		} catch (NullPointerException e){
			return Goto.NORMAL_SIGNAL;
		}
	}

	@Override
	public Object visitExpressionSequence(ExpressionSequenceContext ctx) {
		List<ExpressionContext> expList = ctx.expression();
		Value value = null;

		for (int i = 0; i < expList.size(); i++)
			value = (Value) visit(expList.get(i));

		// System.out.println(ctx.getText() + " " + value);

		return value;
	}

	@Override
	public Object visitEmptyStatement(EmptyStatementContext ctx) {
		return Goto.NORMAL_SIGNAL;
	}

	@Override
	public Object visitForVarIterator(ForVarIteratorContext ctx) {
		try {
			scope.createUnnamedScope();

			int modifiers = (Integer) visit(ctx.varModifier());
			String identifier = ctx.variableDecl().TK_IDENT().getText();
			
			if (ctx.variableDecl().typeAnnotation() != null)
				throw new SyntacticError("No se permiten anotaciones de tipo en el for..in o el for..of");

			Variable var = new Variable(
				identifier,
				modifiers,
				new BooleanType());

			if (ctx.variableDecl().initializer() != null)
				throw new SyntacticError("No se permiten inicializadores en el for..in o el for..of");

			scope.declareVariable(var);

			if( ctx.TK_IN() != null){
				Value value = (Value)visit(ctx.expressionSequence());

				if( value instanceof Reference )
					value = ((Reference)value).dereference();

				if( !(new ObjectType()).isInstanceOfThisType(value) )
					throw new SyntacticError("La expresion " + ctx.expressionSequence().getText() + " no es iterable");

				ObjectValue objectValue = (ObjectValue)value;
				String[] names = objectValue.getPropertyNames();

				scope.setTypeOfLocalVariable(identifier, new StringType());

				for (int i=0; i < names.length; i++) {
					scope.setValueOf(identifier, new StringValue(names[i]));

					int flag = (Integer) visit(ctx.statement());
	
					if (flag == Goto.BREAK_SIGNAL)
						break;
				}
			}
			else{
				Value value = (Value)visit(ctx.expressionSequence());

				if( value instanceof Reference )
					value = ((Reference)value).dereference();

				if( !(new ArrayObjectType(null)).isInstanceOfThisType(value) )
					throw new SyntacticError("La expresion " + ctx.expressionSequence().getText() + " no es iterable");

				ArrayObjectValue arrayValue = (ArrayObjectValue)value;
				Value[] values = arrayValue.getPropertyValues();

				for (int i=0; i < values.length; i++) {
					scope.setTypeOfLocalVariable(identifier, values[i].getType());

					scope.setValueOf(identifier, values[i]);

					int flag = (Integer) visit(ctx.statement());
	
					if (flag == Goto.BREAK_SIGNAL)
						break;
				}
			}
			scope.popScope();

			return Goto.NORMAL_SIGNAL;
		} catch (NullPointerException e){
			return Goto.NORMAL_SIGNAL;
		} catch (SyntacticError e){
			addError(e);
			return Goto.NORMAL_SIGNAL;
		}
	}
}