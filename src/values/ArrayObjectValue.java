package src.values;

import java.util.ArrayList;

import src.symbols.SyntacticError;
import src.types.ArrayObjectType;
import src.types.Type;

public class ArrayObjectValue extends ObjectValue{
	private int length;
	private Value[] values;
	private Type type;
	private Value[] propertyValues;

	public ArrayObjectValue(){
		undefined = true;
	}

	public ArrayObjectValue(Type type, int length){
		undefined = false;
		this.type = type;
		this.length = length;
		this.values = new Value[length];

		for(int i=0; i < length; i++)
			values[i] = new BooleanValue();
	}

	public ArrayObjectValue(ArrayList<Value> values) throws SyntacticError{
		undefined = false;
		this.type = values.get(0).getType();
		this.length = values.size();

		for(int i=1; i < this.length; i++){
			if( !values.get(i).getType().isEqualType(type) )
				throw new SyntacticError("El tipo " + values.get(i).getType() + " no coincide con el tipo " + type);
		}

		for(int i=0; i < this.length; i++)
			this.values[i] = values.get(i);
	}

	@Override
	public Type getType() {
		return new ArrayObjectType(type);
	}

	@Override
	public Value get(String propName) throws SyntacticError {
		try {
			if( propName.equals("length") )
				return new NumberValue(length);

			int pos = Integer.parseInt(propName);
			if( pos >= length )
				return type.undefinedValue();
			return this.values[pos];	
		} catch (NumberFormatException e) {
			return type.undefinedValue();
		}
	}

	@Override
	public void set(String propName, Value value) throws SyntacticError {
		try {
			int pos = Integer.parseInt(propName);
			if( pos >= length )
				throw new SyntacticError("La propiedad " + propName + " no esta definida en el tipo " + getType());
			this.values[pos] = value;
		} catch (NumberFormatException e) {
			throw new SyntacticError("La propiedad " + propName + " no esta definida en el tipo " + getType());
		}
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		return new BooleanValue(false);
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		return new BooleanValue(false);
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		return new BooleanValue(true);
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		return new BooleanValue(true);
	}

	@Override
	public Value[] getPropertyValues() {
		return this.propertyValues;
	}

}
