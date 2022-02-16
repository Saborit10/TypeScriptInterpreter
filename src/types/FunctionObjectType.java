package src.types;

import src.values.FunctionObjectValue;
import src.values.Value;

public class FunctionObjectType extends ObjectType{
	private static FunctionObjectValue UNDEFINED = new FunctionObjectValue();

	public FunctionObjectType(){

	}

	@Override
	public Value undefinedValue() {
		return UNDEFINED;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return isEqualType(v.getType());
	}

	@Override
	public boolean isEqualType(Type v) {
		return v instanceof FunctionObjectType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		return isEqualType(t);
	}

	@Override
	public String getTypeName() {
		return "[@function]";
	}
	
}
