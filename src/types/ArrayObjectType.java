package src.types;


import src.values.ArrayObjectValue;
import src.values.Value;

public class ArrayObjectType extends ObjectType{
	private static ArrayObjectValue UNDEFINED = new ArrayObjectValue();
	
	private Type innerType;

	// public ArrayObjectType(){
		
	// }

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
		// TODO Tener en cuenta el inner type para comparar arreglos
		return v instanceof ArrayObjectType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		return false;
	}

	@Override
	public String getTypeName() {
		return "[@array]";
	}
	
	public Type getInnerType(){
		return innerType;
	}

	// public void setMainType(Type t){
	// 	// TODO
	// }

}
