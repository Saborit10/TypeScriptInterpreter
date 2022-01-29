import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import interp.Interpreter;

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Interpreter ts = new Interpreter();
		
		ts.process();
				
	}
}