package src.types;

public abstract class ObjectType extends Type{
	protected Type[] propertyTypes;
	protected String[] propertyNames;
	
	public Type[] getPropertyTypes() {
		return this.propertyTypes;
	}

	public String[] getPropertyNames() {
		return this.propertyNames;
	}
}
