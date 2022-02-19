package src.types;


import src.values.ArrayObjectValue;
import src.values.Value;

public class ArrayObjectType extends ObjectType{
	private static ArrayObjectValue UNDEFINED = new ArrayObjectValue();
	
	private Type innerType;

	public ArrayObjectType(Type innerType){
		this.innerType = innerType;
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
		return v instanceof ArrayObjectType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		return isEqualType(t);
	}

	@Override
	public String getTypeName() {
		return "[@array]";
	}
	
	public Type getInnerType(){
		return innerType;
	}
}
