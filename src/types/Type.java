package src.types;

import src.symbols.Variable;
import src.values.Value;

public abstract class Type {
	protected String typeName;

	public Type(String typeName) {
		this.typeName = typeName;
	}

	public boolean isInstanceOfThisType(Variable v){
		return isExtendedType(v.getType());
	}

	public abstract Value undefinedValue();

	public abstract boolean isInstanceOfThisType(Value v);
	
	public abstract boolean isEqualType(Type v);

	/* Devuelve si t es un tipo descendiente o igual al tipo this */
	public abstract boolean isExtendedType(Type t);

	public String getTypeName() {
		return this.typeName;
	}

	@Override
	public String toString() {
		return getTypeName();
	}

}
