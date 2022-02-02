package src.types;

import java.util.ArrayList;

import src.symbols.ObjectValue;
import src.symbols.Value;

public class ObjectType extends Type{
	private ObjectType superType;
	private ArrayList<Type> templateArgs;
	
	public ObjectType(String typeName) {
		super(typeName);
		templateArgs = new ArrayList<>();
	}
	
	public ObjectType(String typeName, ObjectType superType){
		this(typeName);
		this.superType = superType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		if( t instanceof ObjectType ){
			ObjectType cur = (ObjectType)t;

			while( cur != null ){
				if( cur.getTypeName().equals(typeName) )
					return true;
				cur = cur.getSuperType();
			}
		}
		return false;
	}


	public ObjectType getSuperType() {
		return this.superType;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		if( v instanceof ObjectValue ){
			ObjectValue objectValue = (ObjectValue)v;

			return isExtendedType(objectValue.getType());
		}
		return false;
	}
}
