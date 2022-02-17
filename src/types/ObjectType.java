package src.types;

import src.heap.Reference;
import src.values.ArrayObjectValue;
import src.values.ClassInstanceValue;
import src.values.FunctionObjectValue;
import src.values.LiteralObjectValue;
import src.values.Value;

public class ObjectType extends Type {
	protected Type[] propertyTypes;
	protected String[] propertyNames;

	public Type[] getPropertyTypes() {
		return this.propertyTypes;
	}

	public String[] getPropertyNames() {
		return this.propertyNames;
	}

	@Override
	public Value undefinedValue() {
		return new LiteralObjectType().undefinedValue();
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return v instanceof LiteralObjectValue || 
			v instanceof ArrayObjectValue || 
			v instanceof FunctionObjectValue ||
			v instanceof ClassInstanceValue ||
			v instanceof Reference;
	}

	@Override
	public boolean isEqualType(Type v) {
		return v instanceof LiteralObjectType || 
			v instanceof ArrayObjectType || 
			v instanceof FunctionObjectType ||
			v instanceof ClassInstanceType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		return isEqualType(t);
	}

	@Override
	public String getTypeName() {
		return "[@object]";
	}
}
