package src.gen;
// Generated from ./src/grammar/TypeScript.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TypeScriptParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(TypeScriptParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(TypeScriptParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForNormal}
	 * labeled alternative in {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForNormal(TypeScriptParser.ForNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarNormal}
	 * labeled alternative in {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarNormal(TypeScriptParser.ForVarNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForIterator}
	 * labeled alternative in {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIterator(TypeScriptParser.ForIteratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarIterator}
	 * labeled alternative in {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarIterator(TypeScriptParser.ForVarIteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#conditionExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpressionSequence(TypeScriptParser.ConditionExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#lastExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastExpressionSequence(TypeScriptParser.LastExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(TypeScriptParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(TypeScriptParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(TypeScriptParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(TypeScriptParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(TypeScriptParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(TypeScriptParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeritage(TypeScriptParser.ClassHeritageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(TypeScriptParser.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(TypeScriptParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMemberProperty}
	 * labeled alternative in {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberProperty(TypeScriptParser.ClassMemberPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMemberMethod}
	 * labeled alternative in {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberMethod(TypeScriptParser.ClassMemberMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMemberGetterSetter}
	 * labeled alternative in {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberGetterSetter(TypeScriptParser.ClassMemberGetterSetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMemberAbstract}
	 * labeled alternative in {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberAbstract(TypeScriptParser.ClassMemberAbstractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(TypeScriptParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(TypeScriptParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#abstractDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDecl(TypeScriptParser.AbstractDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#indexMemberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexMemberDecl(TypeScriptParser.IndexMemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(TypeScriptParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(TypeScriptParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(TypeScriptParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSignature(TypeScriptParser.CallSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameter(TypeScriptParser.RequiredParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameter(TypeScriptParser.OptionalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#identifierOrReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrReservedWord(TypeScriptParser.IdentifierOrReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(TypeScriptParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(TypeScriptParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#variableDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclList(TypeScriptParser.VariableDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(TypeScriptParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(TypeScriptParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralEmptyAlt}
	 * labeled alternative in {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralEmptyAlt(TypeScriptParser.ArrayLiteralEmptyAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralAlt}
	 * labeled alternative in {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralAlt(TypeScriptParser.ArrayLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjLiteralEmpty}
	 * labeled alternative in {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLiteralEmpty(TypeScriptParser.ObjLiteralEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjLiteral}
	 * labeled alternative in {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLiteral(TypeScriptParser.ObjLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssign(TypeScriptParser.PropertyAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(TypeScriptParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(TypeScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TypeScriptParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parametricType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametricType(TypeScriptParser.ParametricTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(TypeScriptParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(TypeScriptParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(TypeScriptParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(TypeScriptParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(TypeScriptParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TypeScriptParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#extendsConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsConstraint(TypeScriptParser.ExtendsConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(TypeScriptParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(TypeScriptParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TypeScriptParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionExpressionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpressionDecl(TypeScriptParser.FunctionExpressionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBinAnd}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinAnd(TypeScriptParser.ExprBinAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(TypeScriptParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprObjectLiteral}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprObjectLiteral(TypeScriptParser.ExprObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPlusOp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusOp(TypeScriptParser.ExprPlusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(TypeScriptParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDivAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivAsig(TypeScriptParser.ExprDivAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOrAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrAsig(TypeScriptParser.ExprOrAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogicAnd}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicAnd(TypeScriptParser.ExprLogicAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinusAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinusAsig(TypeScriptParser.ExprMinusAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPlusPlusOp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusPlusOp(TypeScriptParser.ExprPlusPlusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquality(TypeScriptParser.ExprEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndAsig(TypeScriptParser.ExprAndAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBinOr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinOr(TypeScriptParser.ExprBinOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinusMinusOp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinusMinusOp(TypeScriptParser.ExprMinusMinusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAsig(TypeScriptParser.ExprAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultAsig(TypeScriptParser.ExprMultAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinusOp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinusOp(TypeScriptParser.ExprMinusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrimitiveLiteral}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrimitiveLiteral(TypeScriptParser.ExprPrimitiveLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDotIdent}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDotIdent(TypeScriptParser.ExprDotIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(TypeScriptParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprObjectIndex}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprObjectIndex(TypeScriptParser.ExprObjectIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogicOr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicOr(TypeScriptParser.ExprLogicOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayLiteral}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayLiteral(TypeScriptParser.ExprArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOpMinusMinus}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOpMinusMinus(TypeScriptParser.ExprOpMinusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComparator}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparator(TypeScriptParser.ExprComparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTernaryOperator}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTernaryOperator(TypeScriptParser.ExprTernaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivPerc}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivPerc(TypeScriptParser.ExprMultDivPercContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSumSubs}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumSubs(TypeScriptParser.ExprSumSubsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall(TypeScriptParser.ExprFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPercentAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPercentAsig(TypeScriptParser.ExprPercentAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPlusAsig}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusAsig(TypeScriptParser.ExprPlusAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBinaryNot}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinaryNot(TypeScriptParser.ExprBinaryNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOpPlusPlus}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOpPlusPlus(TypeScriptParser.ExprOpPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDotFunctionCall}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDotFunctionCall(TypeScriptParser.ExprDotFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNew}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNew(TypeScriptParser.ExprNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprThis}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprThis(TypeScriptParser.ExprThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionObject}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionObject(TypeScriptParser.ExprFunctionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(TypeScriptParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(TypeScriptParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#sourceElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElem(TypeScriptParser.SourceElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#identifierOrKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrKeyword(TypeScriptParser.IdentifierOrKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TypeScriptParser.LiteralContext ctx);
}