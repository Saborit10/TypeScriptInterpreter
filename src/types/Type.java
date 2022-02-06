package src.types;

import src.symbols.Variable;
import src.values.Value;

public abstract class Type {

	public boolean isInstanceOfThisType(Variable v){
		return isExtendedType(v.getType());
	}

	public abstract Value undefinedValue();

	public abstract boolean isInstanceOfThisType(Value v);
	
	public abstract boolean isEqualType(Type v);

	/* Devuelve si t es un tipo descendiente o igual al tipo this */
	public abstract boolean isExtendedType(Type t);

	public abstract String getTypeName();

	@Override
	public String toString() {
		return getTypeName();
	}

}
