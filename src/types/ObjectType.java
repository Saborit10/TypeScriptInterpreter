package src.types;

import java.util.ArrayList;

import src.values.ObjectValue;
import src.values.Value;

public class ObjectType extends Type{
	private ObjectType superType;
	private ArrayList<Type> templateArgs;
	private Type[] propertiesTypes;

	public ObjectType(String typeName) {
		super(typeName);
		templateArgs = new ArrayList<>();
		propertiesTypes = new Type[0];
	}
	
	public ObjectType(String typeName, ObjectType superType){
		super(typeName);
		templateArgs = new ArrayList<>();
		this.superType = superType;
		propertiesTypes = new Type[0];
	}

	public ObjectType(String typeName, ObjectType superType, ArrayList<Type> propertiesTypes){
		super(typeName);
		templateArgs = new ArrayList<>();
		this.superType = superType;
		this.propertiesTypes = new Type[propertiesTypes.size()];

		for(int i=0; i < propertiesTypes.size(); i++)
			this.propertiesTypes[i] = propertiesTypes.get(i);
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

	public Type[] getPropertiesTypes() {
		return this.propertiesTypes;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		if( v instanceof ObjectValue ){
			ObjectValue objectValue = (ObjectValue)v;

			return isExtendedType(objectValue.getType());
		}
		return false;
	}

	@Override
	public boolean isEqualType(Type v) {
		return true; // ARREGLAR ESTO PARA COMPROBRA EL NOMBRE DEL TIPO O SI NO TIENE, QUE LAS PROPIEDADES SEAN LAS MISMAS
	}

	@Override
	public Value undefinedValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
