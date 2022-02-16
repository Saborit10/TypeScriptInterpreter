package src.values;

import java.util.List;

import src.heap.Reference;
import src.symbols.Mod;
import src.symbols.SyntacticError;
import src.symbols.Variable;
import src.types.ClassInstanceType;
import src.types.Type;

public class ClassInstanceValue extends ObjectValue{
	private Reference self;
	private ClassInstanceType prototype;
	protected Value[] propertyValues;
	private Reference superValue;

	public ClassInstanceValue(){
		this.undefined = true;
	}

	public ClassInstanceValue(ClassInstanceType proto, Reference superValue, Reference self){
		this.undefined = false;
		this.prototype = proto;
		this.superValue = superValue;
		this.self = self;
		this.propertyValues = new Value[proto.getPropertyTypes().length];

		Type[] types = proto.getPropertyTypes();
		for(int i=0; i < types.length; i++)
			propertyValues[i] = types[i].undefinedValue();
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

	private boolean grantAccess(int propertyMods, Reference thisRef){
		boolean thisIsSubclass = false;
		boolean thisIsSameClass = false;
		
		if( thisRef != null ){
			thisIsSubclass = prototype.isExtendedType(thisRef.getType());
			thisIsSameClass = prototype.isEqualType(thisRef.getType());
		}

		if( (propertyMods & Mod.PROTECTED) > 0 && !thisIsSubclass && !thisIsSameClass )
			return false;
		else if( (propertyMods & Mod.PRIVATE)  > 0 && ! thisIsSameClass )
			return false;
		// System.out.println("GRANTED!!");
		return true;
	}

	@Override
	public Value get(Reference thisRef, String propName) throws SyntacticError{
		String[] propertyNames = prototype.getPropertyNames();
		
		// System.out.println("LOOKING IN: " + this + " -> " + Arrays.toString(propertyNames));
		
		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				// System.out.println("FOUND!!!");
				if( grantAccess(prototype.getModifiers()[i], thisRef) )
					return propertyValues[i];
				throw new SyntacticError("La propiedad " + propName + " no es accesible");
			}
		}
		// System.out.println("No se encontro " + propName + " en " + prototype + ". A buscarla en " + prototype.getSuperType() + " -> " + superValue);
		if( prototype.getSuperType() == null )
			throw new SyntacticError("La propiedad " + propName + " no esta definida o no es accesible");
		else
			return superValue.get(thisRef, propName);
	}
	
	@Override
	public void set(Reference thisRef, String propName, Value value) throws SyntacticError {
		String[] propertyNames = prototype.getPropertyNames();

		for(int i=0; i < propertyValues.length; i++){
			if( propertyNames[i].equals(propName) ){
				if( !propertyValues[i].getType().isExtendedType(value.getType()) )
					throw new SyntacticError(value + " no es de tipo " + propertyValues[i].getType());
				if( !grantAccess(prototype.getModifiers()[i], thisRef) )
					throw new SyntacticError("La propiedad " + propName + " no es accesible");
				propertyValues[i] = value;
				return;
			}
		}

		if( prototype.getSuperType() == null )
			throw new SyntacticError("La propiedad " + propName + " no esta definida o no es accesible");
		else
			superValue.set(thisRef, propName, value);
	}

	public FunctionObjectValue getMethod(Reference thisRef, String methName) throws SyntacticError{
		List<Variable> methods = prototype.getMethods();
		
		for(int i=0; i < methods.size(); i++){
			FunctionObjectValue f = (FunctionObjectValue)methods.get(i).getValue();
			if( f.getName().equals(methName) ){
				if( grantAccess(methods.get(i).getModifiers(), thisRef) )
					return f;
				throw new SyntacticError("El metodo " + methName + " no es accesible");
			}
		}
		
		if( prototype.getSuperType() == null )
			throw new SyntacticError("El metodo " + methName + " no esta definida o no es accesible");
		else
			return superValue.getMethod(thisRef, methName);
	}

	@Override
	public boolean isFalsy() {
		return undefined;
	}
}






	// public ClassInstanceValue(ClassInstanceType proto, ArrayList<Value> propVals) throws SyntacticError{
	// 	this.prototype = proto;
	// 	this.undefined = false;

	// 	Type[] types = proto.getPropertyTypes();

	// 	if( propVals.size() != types.length )
	// 		throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");

	// 	for(int i=0; i < types.length; i++){
	// 		if( !types[i].isExtendedType(propVals.get(i).getType()) )
	// 			throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");
			
	// 		propertyValues[i] = propVals.get(i);
	// 	}
	// }

	// public ClassInstanceValue(ClassInstanceType proto, LiteralObjectValue obj) throws SyntacticError{
	// 	this.prototype = proto;
	// 	this.undefined = false;

	// 	Type[] types = proto.getPropertyTypes();

	// 	if( obj.getPropertyNames().length != types.length )
	// 		throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");

	// 	// TODO: Arreglar para que las propiedades puedan estar en cualquier orden

	// 	for(int i=0; i < types.length; i++){
	// 		if( !types[i].isExtendedType(obj.getPropertyValues()[i].getType()) )
	// 			throw new SyntacticError("Los propiedades para el objeto de tipo " + proto.getTypeName() + " son incorrectas");
		
	// 		propertyValues[i] = obj.getPropertyValues()[i];
	// 	}
	// }
