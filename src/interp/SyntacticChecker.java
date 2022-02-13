package src.interp;

import java.util.Arrays;
import java.util.List;

import src.symbols.SyntacticError;

public class SyntacticChecker {
	
	public static void noEqualPair(List<String> names) throws SyntacticError{
		String[] ord = new String[names.size()];

		for(int i=0; i < names.size(); i++)
			ord[i] = names.get(i);
		
		Arrays.sort(ord);

		for(int i=1; i < ord.length; i++)
			if( ord[i].equals(ord[i-1]) )
				throw new SyntacticError("El nombre " + ord[i] + " se repite en la lista");
	}
}
