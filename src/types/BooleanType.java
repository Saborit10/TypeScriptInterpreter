package src.types;

import src.values.BooleanValue;
import src.values.Value;

public class BooleanType extends PrimitiveType{
	private String typeName;

	private static BooleanValue UNDEFINED = new BooleanValue();

	public BooleanType() {
		super();
		typeName = "boolean";
	}
	
	@Override
	public boolean isExtendedType(Type t) {
		return t instanceof BooleanType;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return v instanceof BooleanValue;
	}

	public static boolean isOfThisType(Value v){
		return v instanceof BooleanValue;
	}

	@Override
	public boolean isEqualType(Type v) {
		return v instanceof BooleanType;
	}

	@Override
	public Value undefinedValue() {
		return UNDEFINED;
	}

	@Override
	public String getTypeName() {
		return typeName;
	}
}
