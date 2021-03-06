package src.types;

import src.values.NumberValue;
import src.values.Value;

public class NumberType extends PrimitiveType{
	protected String typeName;

	private static NumberValue UNDEFINED = new NumberValue();

	public NumberType() {
		typeName = "number";
	}

	@Override
	public boolean isExtendedType(Type t) {
		return t instanceof NumberType;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return v instanceof NumberValue;
	}

	public static boolean isOfThisType(Value v){
		return v instanceof NumberValue;
	}

	@Override
	public boolean isEqualType(Type v) {
		return v instanceof NumberType;
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
