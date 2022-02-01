package src.verbose; 

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import src.gen.*;

class VerboseListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        
        System.err.println("rule stack: "+stack);
        System.err.println("line "+line+":"+charPositionInLine+" at "+

        offendingSymbol+": "+msg);
    }
}

public class Verbose {
    public static void main(String[] args) throws Exception {
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


        ParseTree tree = parser.compilationUnit(); // begin parsing at init rule

        // System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}