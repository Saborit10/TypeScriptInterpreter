package src.symbols;

import java.util.ArrayList;

import src.values.Value;

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

	public Value getValueOf(String name) throws SyntacticError{
		return top().getValueOf(name);	
	}	
	
	public void setValueOf(String name, Value value) throws SyntacticError{
		top().setValueOf(name, value);	
	}

	@Override
	public String toString() {
		String ans = "";
		for(int i=0; i < stack.size(); i++)
			ans += stack.get(i).toString();
		return ans;
	}

	// public void setValueOf(ArrayList<String> path, Value value) throws SyntacticError {
	// 	top().setValueOf(path, value);
	// }

	public void popScope() {
		stack.remove(stack.size()-1);
	}
}
