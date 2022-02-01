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
	 * Visit a parse tree produced by {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TypeScriptParser.ForStatementContext ctx);
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
	 * Visit a parse tree produced by {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(TypeScriptParser.MemberDeclContext ctx);
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
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
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
	 * Visit a parse tree produced by {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TypeScriptParser.ExpressionContext ctx);
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