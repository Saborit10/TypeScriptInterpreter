package src.heap;

import src.symbols.SyntacticError;
import src.types.Type;
import src.values.BooleanValue;
import src.values.ClassInstanceValue;
import src.values.FunctionObjectValue;
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
	public Value get(Reference thisRef, String propName) throws SyntacticError {
		return HEAP.access(this).get(thisRef, propName);
	}

	@Override
	public void set(Reference thisRef, String propName, Value value) throws SyntacticError {
		// System.out.println(HEAP.access(this).getType());
		HEAP.access(this).set(thisRef, propName, value);
	}

	@Override
	public Value[] getPropertyValues() {
		return HEAP.access(this).getPropertyValues();
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		try {
			Reference ref = (Reference)v;

			return new BooleanValue(address == ref.address);
		} catch (Exception e) {
			return new BooleanValue(false);
		}
		
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
		return HEAP.access(this).toString();
	}

	@Override
	public boolean isFalsy() {
		return HEAP.access(this).isFalsy();
	}

	boolean isEqualReference(Reference ref){
		return address == ref.address;
	}
	
	public FunctionObjectValue getMethod(Reference thisRef, String methName) throws SyntacticError{
		ClassInstanceValue instancia = (ClassInstanceValue)HEAP.access(this);
		return instancia.getMethod(thisRef, methName);
	}

	@Override
	public String[] getPropertyNames() {
		return HEAP.access(this).getPropertyNames();
	}

	public Value dereference() {
		return HEAP.access(this);
	}	
}
