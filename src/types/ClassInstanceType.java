package src.types;

import java.util.ArrayList;

import src.values.ClassInstanceValue;
import src.values.Value;

public class ClassInstanceType extends ObjectType{
	private static ClassInstanceValue UNDEFINED = new ClassInstanceValue();
	
	private String typeName; 
	private ClassInstanceType superType;
	private ArrayList<Type> templateArgs;
	
	public ClassInstanceType(String typeName) {
		templateArgs = new ArrayList<>();
		propertyTypes = new Type[0];
	}
	
	public ClassInstanceType(String typeName, ClassInstanceType superType){
		templateArgs = new ArrayList<>();
		this.superType = superType;
		propertyTypes = new Type[0];
		propertyNames = new String[0];
	}

	public ClassInstanceType(String typeName, ClassInstanceType superType, ArrayList<Type> propertyTypes, ArrayList<String> propertyNames){
		templateArgs = new ArrayList<>();
		this.superType = superType;
		this.propertyTypes = new Type[propertyTypes.size()];
		this.propertyNames = new String[propertyTypes.size()];

		for(int i=0; i < propertyTypes.size(); i++){
			this.propertyTypes[i] = propertyTypes.get(i);
			this.propertyNames[i] = propertyNames.get(i);
		}
	}

	public ClassInstanceType getSuperType() {
		return this.superType;
	}

	@Override
	public boolean isExtendedType(Type t) {
		if( t instanceof ClassInstanceType ){
			ClassInstanceType cur = (ClassInstanceType)t;

			while( cur != null ){
				if( cur.isEqualType(this) )
					return true;
				cur = cur.getSuperType();
			}
		}
		return false;
	}

	@Override
	public String getTypeName() {
		return typeName;
	}

	@Override
	public boolean isEqualType(Type v) {
		try {
			ClassInstanceType type = (ClassInstanceType)v;
			
			return typeName.equals(type.getTypeName());
		} catch (ClassCastException e) {
			return false;
		}
	}

	@Override
	public Value undefinedValue() {
		return UNDEFINED;
	}

	@Override
	public boolean isInstanceOfThisType(Value v) {
		return isEqualType(v.getType());
	}

	
}
