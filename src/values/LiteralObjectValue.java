package src.values;

import java.util.ArrayList;

import src.symbols.SyntacticError;
import src.types.LiteralObjectType;
import src.types.ObjectType;

public class LiteralObjectValue extends ObjectValue{
	private String[] propertyNames;

	public LiteralObjectValue(){
		undefined = true;
	}

	public String[] getPropertyNames() {
		return this.propertyNames;
	}

	public LiteralObjectValue(ArrayList<String> propNames, ArrayList<Value> propVals){
		undefined = false;
		properties = new Value[propNames.size()];
		propertyNames = new String[propNames.size()];

		// Los largos de los arraylists deben ser iguales
		// TODO: Chequear que las propiedades no tengan nombres iguales

		for(int i=0; i < propNames.size(); i++){
			propertyNames[i] = propNames.get(i);
			properties[i] = propVals.get(i);
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
		return new BooleanValue(false);
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		return new BooleanValue(false);
	}

	public String toString() {
		if( undefined )
			return "null";

		String ans = "{";
		if( properties.length > 0 )
			ans += propertyNames[0] + ": " + properties[0];

		for(int i=1; i < properties.length; i++)
			ans += ", " + propertyNames[i] + ": " + properties[i];

		return ans + "}";
	}

	@Override
	public Value get(String propName) throws SyntacticError {
		for(int i=0; i < properties.length; i++){
			if( propertyNames[i].equals(propName) )
				return properties[i];
		}
		throw new SyntacticError("La propiedad " + propName + " no esta definida en el objeto");
	}
}
