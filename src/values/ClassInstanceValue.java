package src.values;

import java.util.ArrayList;

import src.heap.Reference;
import src.symbols.Mod;
import src.symbols.SyntacticError;
import src.types.ClassInstanceType;
import src.types.Type;

public class ClassInstanceValue extends ObjectValue{
	private ClassInstanceType prototype;
	protected Value[] propertyValues;
	private Reference superValue;

	public ClassInstanceValue(){
		this.undefined = true;
	}

	public ClassInstanceValue(ClassInstanceType proto, Reference superValue){
		this.undefined = false;
		this.prototype = proto;
		this.superValue = superValue;

		Type[] types = proto.getPropertyTypes();
		for(int i=0; i < types.length; i++)
			propertyValues[i] = types[i].undefinedValue();
	}

	public ClassInstanceValue(ClassInstanceType proto, ArrayList<Value> propVals) throws SyntacticError{
		this.prototype = proto;
		this.undefined = false;

		Type[] types = proto.getPropertyTypes();

		if( propVals.size() != types.length )
			throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");

		for(int i=0; i < types.length; i++){
			if( !types[i].isExtendedType(propVals.get(i).getType()) )
				throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");
			
			propertyValues[i] = propVals.get(i);
		}
	}

	public ClassInstanceValue(ClassInstanceType proto, LiteralObjectValue obj) throws SyntacticError{
		this.prototype = proto;
		this.undefined = false;

		Type[] types = proto.getPropertyTypes();

		if( obj.getPropertyNames().length != types.length )
			throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");

		// TODO: Arreglar para que las propiedades puedan estar en cualquier orden

		for(int i=0; i < types.length; i++){
			if( !types[i].isExtendedType(obj.getPropertyValues()[i].getType()) )
				throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");
		
			propertyValues[i] = obj.getPropertyValues()[i];
		}
	}

	public Value[] getPropertyValues() {
		return this.propertyValues;
	}

	@Override
	public Type getType(){
		return prototype;
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		try{
			ClassInstanceValue instanceValue = (ClassInstanceValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			if( !prototype.isEqualType(instanceValue.prototype) )
				throw new SyntacticError("La expresion siempre es igual a false, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
			
			for(int i=0; i < propertyValues.length; i++){
				BooleanValue compareProp = (BooleanValue)propertyValues[i].equals(instanceValue.propertyValues[i]);

				if( !compareProp.isTrue() )
					return new BooleanValue(false);
			}

			return new BooleanValue(true);
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a false, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		try{
			ClassInstanceValue instanceValue = (ClassInstanceValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			if( !prototype.isEqualType(instanceValue.prototype) )
				return new BooleanValue(false);
			
			for(int i=0; i < propertyValues.length; i++){
				BooleanValue compareProp = (BooleanValue)propertyValues[i].equals(instanceValue.propertyValues[i]);

				if( !compareProp.isTrue() )
					return new BooleanValue(false);
			}

			return new BooleanValue(true);
		} catch (Exception e) {
			return new BooleanValue(false);
		}
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		try{
			ClassInstanceValue instanceValue = (ClassInstanceValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			if( !prototype.isEqualType(instanceValue.prototype) )
				throw new SyntacticError("La expresion siempre es igual a true, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
			
			for(int i=0; i < propertyValues.length; i++){
				BooleanValue compareProp = (BooleanValue)propertyValues[i].equals(instanceValue.propertyValues[i]);

				if( !compareProp.isTrue() )
					return new BooleanValue(true);
			}
			return new BooleanValue(false);
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a true, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		try{
			ClassInstanceValue instanceValue = (ClassInstanceValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			if( !prototype.isEqualType(instanceValue.prototype) )
				return new BooleanValue(true);
			
			for(int i=0; i < propertyValues.length; i++){
				BooleanValue compareProp = (BooleanValue)propertyValues[i].equals(instanceValue.propertyValues[i]);

				if( !compareProp.isTrue() )
					return new BooleanValue(true);
			}
			return new BooleanValue(false);
		} catch (Exception e) {
			return new BooleanValue(true);
		}
	}

	@Override
	public String toString() {
		if( undefined )
			return "null";

		String[] names = prototype.getPropertyNames();

		String ans = "{";
		if( propertyValues.length > 0 )
			ans += names[0] + ": " + propertyValues[0];

		for(int i=1; i < propertyValues.length; i++)
			ans += ", " + names[i] + ": " + propertyValues[i];

		return ans + "}";
	}

	/* Acceso a propiedades publicas de la clase */
	@Override
	public Value get(String propName) throws SyntacticError{
		String[] propertyNames = prototype.getPropertyNames();
		int[] propertyMods = prototype.getModifiers();

		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				if( (propertyMods[i] & Mod.PUBLIC) > 0 )
					return propertyValues[i];
				throw new SyntacticError("La propiedad " + propName + " no es publica");
			}
		}

		if( prototype.getSuperType() == null )
			throw new SyntacticError("La propiedad " + propName + " no esta definida en el tipo " + getType());
		else
			return superValue.getFromSuperClass(propName);
	}
	
	/* Acceso a propiedades de la misma clase */
	public Value getFromThisClass(String propName) throws SyntacticError{
		String[] propertyNames = prototype.getPropertyNames();

		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				return propertyValues[i];
			}
		}

		if( prototype.getSuperType() == null )
			throw new SyntacticError("La propiedad " + propName + " no esta definida en el tipo " + getType());
		else
			return superValue.getFromSuperClass(propName);
	}

	/* Acceso a propiedades de la superclase */
	public Value getFromSuperClass(String propName) throws SyntacticError{
		String[] propertyNames = prototype.getPropertyNames();
		int[] propertyMods = prototype.getModifiers();

		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				if( (propertyMods[i] & Mod.PUBLIC) > 0 || (propertyMods[i] & Mod.PROTECTED) > 0)
					return propertyValues[i];
				throw new SyntacticError("La propiedad " + propName + " no es publica");
			}
		}

		if( prototype.getSuperType() == null )
			throw new SyntacticError("La propiedad " + propName + " no esta definida en el tipo " + getType());
		else
			return superValue.getFromSuperClass(propName);
	}

	@Override
	public void set(String propName, Value value) throws SyntacticError {
		String[] propertyNames = prototype.getPropertyNames();

		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				if( !propertyValues[i].getType().isExtendedType(value.getType()) )
					throw new SyntacticError(value + " no es de tipo " + propertyValues[i].getType());

				propertyValues[i] = value;
				return;
			}
		}
		throw new SyntacticError("La propiedad " + propName + " no esta definida en el tipo " + getType());
	}

	@Override
	public boolean isFalsy() {
		return undefined;
	}
}
