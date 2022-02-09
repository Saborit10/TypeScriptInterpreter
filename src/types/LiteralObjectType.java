package src.types;

import java.util.ArrayList;

import src.values.LiteralObjectValue;
import src.values.Value;

public class LiteralObjectType extends ObjectType{
	private static LiteralObjectValue UNDEFINED = new LiteralObjectValue();
	
	public LiteralObjectType(){
		this.propertyTypes = new Type[0];
		this.propertyNames = new String[0];
	}
	
	public LiteralObjectType(ArrayList<Type> propertyTypes, ArrayList<String> propertyNames){
		this.propertyTypes = new Type[propertyTypes.size()];
		this.propertyNames = new String[propertyTypes.size()];

		for(int i=0; i < propertyTypes.size(); i++){
			this.propertyTypes[i] = propertyTypes.get(i);
			this.propertyNames[i] = propertyNames.get(i);
		}
	}

	@Override
	public Value undefinedValue() {
		return UNDEFINED;
	}

	@Override
	public boolean isEqualType(Type v) {
		return v instanceof ObjectType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		return t instanceof ObjectType;
	}

	@Override
	public String getTypeName() {
		return "[@object]";
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return false;
	}

}
