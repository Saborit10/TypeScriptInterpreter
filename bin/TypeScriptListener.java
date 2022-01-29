// Generated from TypeScript.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScriptParser}.
 */
public interface TypeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(TypeScriptParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(TypeScriptParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(TypeScriptParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(TypeScriptParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TypeScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TypeScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(TypeScriptParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(TypeScriptParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(TypeScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(TypeScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(TypeScriptParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(TypeScriptParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(TypeScriptParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(TypeScriptParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(TypeScriptParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(TypeScriptParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(TypeScriptParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(TypeScriptParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(TypeScriptParser.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(TypeScriptParser.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(TypeScriptParser.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(TypeScriptParser.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(TypeScriptParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(TypeScriptParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(TypeScriptParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(TypeScriptParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(TypeScriptParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(TypeScriptParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(TypeScriptParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(TypeScriptParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#abstractDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDecl(TypeScriptParser.AbstractDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#abstractDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDecl(TypeScriptParser.AbstractDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#indexMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterIndexMemberDecl(TypeScriptParser.IndexMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#indexMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitIndexMemberDecl(TypeScriptParser.IndexMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(TypeScriptParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(TypeScriptParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(TypeScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(TypeScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(TypeScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(TypeScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void enterCallSignature(TypeScriptParser.CallSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void exitCallSignature(TypeScriptParser.CallSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameter(TypeScriptParser.RequiredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameter(TypeScriptParser.RequiredParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameter(TypeScriptParser.OptionalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameter(TypeScriptParser.OptionalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrReservedWord(TypeScriptParser.IdentifierOrReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrReservedWord(TypeScriptParser.IdentifierOrReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(TypeScriptParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(TypeScriptParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(TypeScriptParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(TypeScriptParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclList(TypeScriptParser.VariableDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclList(TypeScriptParser.VariableDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(TypeScriptParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(TypeScriptParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(TypeScriptParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(TypeScriptParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyAssign}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssign(TypeScriptParser.PropertyAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyAssign}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssign(TypeScriptParser.PropertyAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(TypeScriptParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(TypeScriptParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(TypeScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(TypeScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TypeScriptParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TypeScriptParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void enterParametricType(TypeScriptParser.ParametricTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void exitParametricType(TypeScriptParser.ParametricTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(TypeScriptParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(TypeScriptParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(TypeScriptParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(TypeScriptParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TypeScriptParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TypeScriptParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(TypeScriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(TypeScriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(TypeScriptParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(TypeScriptParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TypeScriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TypeScriptParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#extendsConstraint}.
	 * @param ctx the parse tree
	 */
	void enterExtendsConstraint(TypeScriptParser.ExtendsConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#extendsConstraint}.
	 * @param ctx the parse tree
	 */
	void exitExtendsConstraint(TypeScriptParser.ExtendsConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(TypeScriptParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(TypeScriptParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(TypeScriptParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(TypeScriptParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TypeScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TypeScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionExpressionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpressionDecl(TypeScriptParser.FunctionExpressionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionExpressionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpressionDecl(TypeScriptParser.FunctionExpressionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TypeScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TypeScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(TypeScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(TypeScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(TypeScriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(TypeScriptParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#sourceElem}.
	 * @param ctx the parse tree
	 */
	void enterSourceElem(TypeScriptParser.SourceElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#sourceElem}.
	 * @param ctx the parse tree
	 */
	void exitSourceElem(TypeScriptParser.SourceElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrKeyword}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrKeyword(TypeScriptParser.IdentifierOrKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrKeyword}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrKeyword(TypeScriptParser.IdentifierOrKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TypeScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TypeScriptParser.LiteralContext ctx);
}