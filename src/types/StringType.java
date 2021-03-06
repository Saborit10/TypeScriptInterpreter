package src.types;

import src.values.StringValue;
import src.values.Value;

public class StringType extends PrimitiveType{
	protected String typeName;

	private static StringValue UNDEFINED = new StringValue();

	public StringType() {
		typeName = "string";
	}

	@Override
	public boolean isExtendedType(Type t) {
		return t instanceof StringType;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return v instanceof StringValue;
	}
	
	public static boolean isOfThisType(Value v){
		return v instanceof StringValue;
	}

	@Override
	public boolean isEqualType(Type v) {
		return v instanceof StringType;
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
