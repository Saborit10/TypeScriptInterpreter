package src.values;

import java.util.List;

import src.symbols.SyntacticError;
import src.types.ArrayObjectType;
import src.types.Type;

public class ArrayObjectValue extends ObjectValue{
	private int length;
	private Value[] propertyValues;
	private Type type;

	public ArrayObjectValue(){
		undefined = true;
	}

	public ArrayObjectValue(Type type, int length){
		undefined = false;
		this.type = type;
		this.length = length;
		this.propertyValues = new Value[length];

		for(int i=0; i < length; i++)
			propertyValues[i] = type.undefinedValue();
	}

	public ArrayObjectValue(int length){
		undefined = false;
		this.type = null;
		this.length = length;
		this.propertyValues = new Value[length];

		for(int i=0; i < length; i++)
			propertyValues[i] = new BooleanValue();
	}


	public ArrayObjectValue(List<Value> values) throws SyntacticError{
		undefined = false;
		this.type = values.get(0).getType();
		this.length = values.size();
		this.propertyValues = new Value[length];

		for(int i=1; i < this.length; i++){
			if( !values.get(i).getType().isEqualType(type) )
				throw new SyntacticError("El tipo " + values.get(i).getType() + " no coincide con el tipo " + type);
		}

		for(int i=0; i < this.length; i++)
			this.propertyValues[i] = values.get(i);
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
			return this.propertyValues[pos];	
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
			
			if( type == null ){
				type = value.getType();
			}
			else if( !type.isExtendedType(value.getType()) ){
				// System.out.println(type + " " + value.getType());
				throw new SyntacticError(value + " no es de tipo " + type);
			}

			this.propertyValues[pos] = value;
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

	@Override
	public String toString() {
		String ans = "[";
		
		int cantUndef = 0;
		for(int i=0; i < propertyValues.length; i++){
			if( propertyValues[i].isUndefined() )
				cantUndef++;
			else{
				if( cantUndef > 1 )
					ans += "<" + cantUndef + " empty>, ";
				else if( cantUndef == 1 )
					ans += "<empty>, ";
				cantUndef = 0;

				ans += propertyValues[i];

				if( i < propertyValues.length - 1 )
				ans += ", ";
			}
		}
		if( cantUndef > 1 )
					ans += "<" + cantUndef + " empty>";
				else if( cantUndef == 1 )
					ans += "<empty>";
		ans += ']';
		
		return ans;
	}
}
