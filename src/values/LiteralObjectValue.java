package src.values;

import java.util.List;

import src.heap.Reference;
import src.symbols.SyntacticError;
import src.types.LiteralObjectType;
import src.types.ObjectType;

public class LiteralObjectValue extends ObjectValue{
	private String[] propertyNames;
	private Value[] propertyValues;

	public LiteralObjectValue(){
		undefined = true;
	}

	public String[] getPropertyNames() {
		return this.propertyNames;
	}

	public LiteralObjectValue(List<String> propNames, List<Value> propVals){
		undefined = false;
		propertyValues = new Value[propNames.size()];
		propertyNames = new String[propNames.size()];

		// Los largos de los arraylists deben ser iguales
		// TODO: Chequear que las propiedades no tengan nombres iguales

		for(int i=0; i < propNames.size(); i++){
			propertyNames[i] = propNames.get(i);
			propertyValues[i] = propVals.get(i);
		}
	}
	
	@Override
	public ObjectType getType() {
		return new LiteralObjectType();
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

	public String toString() {
		if( undefined )
			return "null";

		String ans = "{";
		if( propertyValues.length > 0 )
			ans += propertyNames[0] + ": " + propertyValues[0];

		for(int i=1; i < propertyValues.length; i++)
			ans += ", " + propertyNames[i] + ": " + propertyValues[i];

		return ans + "}";
	}

	@Override
	public Value get(Reference thisRef, String propName) throws SyntacticError {
		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) )
				return propertyValues[i];
		}
		throw new SyntacticError("La propiedad " + propName + " no esta definida en el objeto");
	}

	@Override
	public void set(Reference thisRef, String propName, Value value) throws SyntacticError {
		
		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				// System.out.println(propertyValues[i].getType() + " " + value.getType());
				if( !propertyValues[i].getType().isExtendedType(value.getType()) )
					throw new SyntacticError(value + " no es de tipo " + propertyValues[i].getType());
				
				propertyValues[i] = value;
				return;
			}
		}
		throw new SyntacticError("La propiedad " + propName + " no esta definida en el objeto");
	}

	@Override
	public Value[] getPropertyValues() {
		return this.propertyValues;
	}

	@Override
	public boolean isFalsy() {
		return undefined;
	}
}
