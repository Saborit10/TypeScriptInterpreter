package src.types;

import src.symbols.StringValue;
import src.symbols.Value;

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
	
}
