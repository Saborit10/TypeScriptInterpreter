package src.interp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.*;
import src.gen.*;
import src.symbols.SyntacticError;

class VerboseListener extends BaseErrorListener {
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
		List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		
		System.err.println("<ERROR>");

		System.err.println("rule stack: "+stack);
		System.err.println("line "+line+":"+charPositionInLine+" at "+ offendingSymbol+": "+msg);
		System.exit(0);
	}
}

/**
 * Interpreter
 */
public class Interpreter {

	public void process() throws IOException{
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// create a lexer that feeds off of input CharStream
		TypeScriptLexer lexer = new TypeScriptLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		TypeScriptParser parser = new TypeScriptParser(tokens);

		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new VerboseListener()); // add ours

		// ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
		
		ParseTree tree = parser.compilationUnit(); // begin parsing at init rule

		TSVisitor v = new TSVisitor();
		v.visit(tree);

		System.out.println(v.getScope());

		if( v.getSyntacticErrors().size() > 0 ){
			System.out.println("Errors:");

			for(SyntacticError e: v.getSyntacticErrors())
				System.out.println(e);
		}
		
	}
}