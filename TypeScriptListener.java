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
	 * Enter a parse tree produced by {@link TypeScriptParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(TypeScriptParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(TypeScriptParser.ArithmeticExprContext ctx);
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