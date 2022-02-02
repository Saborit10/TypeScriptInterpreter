package src.types;

import src.values.StringValue;
import src.values.Value;

public class StringType extends PrimitiveType{

	public StringType() {
		super("string");
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
}
