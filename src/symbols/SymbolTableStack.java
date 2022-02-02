package src.symbols;

import java.util.ArrayList;

public class SymbolTableStack {
	ArrayList<SymbolTable> stack;


	public SymbolTableStack() {
		stack = new ArrayList<>();
		stack.add(new SymbolTable());
	}

	private SymbolTable top(){
		return stack.get(stack.size() - 1);
	}

	public void createUnnamedScope(){
		SymbolTable p = top();
		stack.add(new SymbolTable(p));
	}

	public void declareVariable(Variable e) throws SyntacticError{
		top().declareVariable(e);
	}

	


	@Override
	public String toString() {
		String ans = "";
		for(int i=0; i < stack.size(); i++)
			ans += stack.get(i).toString();
		return ans;
	}

}