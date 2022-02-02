package src.types;

import src.symbols.BooleanValue;
import src.symbols.Value;

public class BooleanType extends PrimitiveType{

	public BooleanType() {
		super("boolean");
	}
	
	@Override
	public boolean isExtendedType(Type t) {
		return t instanceof BooleanType;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return v instanceof BooleanValue;
	}

}
