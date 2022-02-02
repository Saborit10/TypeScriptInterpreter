package src.types;

import src.symbols.NumberValue;
import src.symbols.Value;

public class NumberType extends PrimitiveType{

	public NumberType() {
		super("number");
	}

	@Override
	public boolean isExtendedType(Type t) {
		return t instanceof NumberType;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return v instanceof NumberValue;
	}

	
	
}
