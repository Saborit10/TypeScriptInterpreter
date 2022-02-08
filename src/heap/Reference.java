package src.heap;

import src.symbols.SyntacticError;
import src.types.Type;
import src.values.ObjectValue;
import src.values.Value;

public class Reference extends ObjectValue{
	public static Heap HEAP;
	
	private int address;

	public Reference(){
		this.address = -1;
	}

	public Reference(int address) {
		this.address = address;
	}

	public int getAddress() {
		return address;
	}

	boolean isNull(){
		return this.address == -1;
	}

	@Override
	public Type getType() {
		return HEAP.access(this).getType();
	}

	@Override
	public Value get(String propName) throws SyntacticError {
		return HEAP.access(this).get(propName);
	}

	@Override
	public void set(String propName, Value value) throws SyntacticError {
		// TODO Auto-generated method stub
		
	}

	public boolean isReferenceProperty(String propName) throws SyntacticError {
		Value prop = HEAP.access(this).get(propName);
		
		return prop instanceof Reference;
	}

	@Override
	public Value[] getPropertyValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// return "[@ref_" + address + "]";
		return HEAP.access(this).toString();
	}

	
}
