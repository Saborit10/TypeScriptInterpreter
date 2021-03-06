package src.types;

import java.util.List;
import java.util.Map;

import src.heap.Reference;
import src.symbols.SyntacticError;
import src.symbols.Variable;
import src.values.ClassInstanceValue;
import src.values.FunctionObjectValue;
import src.values.Value;

public class ClassInstanceType extends ObjectType{
	private static ClassInstanceValue UNDEFINED = new ClassInstanceValue();
	
	private String typeName; 
	private ClassInstanceType superType;
	private List<FunctionObjectValue> constructors;
	private List<Variable> methods;
	private Map<String, Variable> staticValues;
	private Map<String, Value> initValues;
	private int[] modifiers;
	
	public ClassInstanceType(String typeName, ClassInstanceType superType, List<Type> propertyTypes,
		List<String> propertyNames, List<Integer> modifiers, List<FunctionObjectValue> constructors,
		List<Variable> methods, Map<String, Variable> staticValues, Map<String, Value> initValues){
		
		this.superType = superType;
		this.typeName = typeName;
		this.propertyTypes = new Type[propertyTypes.size()];
		this.propertyNames = new String[propertyTypes.size()];
		this.modifiers = new int[propertyTypes.size()];
		this.constructors = constructors;
		this.methods = methods;
		this.staticValues = staticValues;
		this.initValues = initValues;

		for(int i=0; i < propertyTypes.size(); i++){
			this.propertyTypes[i] = propertyTypes.get(i);
			this.propertyNames[i] = propertyNames.get(i);
			this.modifiers[i] = modifiers.get(i);
		}
	}

	public List<Variable> getMethods() {
		return methods;
	}

	public void setMethods(List<Variable> methods) {
		this.methods = methods;
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

	private boolean isCompatibleSignature(FunctionObjectValue f, List<Type> argTypes){
		Type[] funcArgTypes = f.getArgTypes();

		if( argTypes.size() != funcArgTypes.length )
			return false;

		for(int i=0; i < funcArgTypes.length; i++)
			if( !funcArgTypes[i].isExtendedType(argTypes.get(i)) )
				return false;
		return true;
	}

	public FunctionObjectValue getMethodBySignature(String name, List<Type> argTypes) throws SyntacticError{
		for(int i=0; i < methods.size(); i++){
			FunctionObjectValue f = (FunctionObjectValue)methods.get(i).getValue();
			if( f.getName().equals(name) && isCompatibleSignature(f, argTypes) )
				return f;
		}

		if( superType != null )
			throw new SyntacticError("El metodo " + name + " no pertenece a la clase " + typeName + " ni a sus superclases");
		else
			return superType.getMethodBySignature(name, argTypes);
	}
	
	public FunctionObjectValue getConstructorBySignature(String name, List<Type> argTypes) throws SyntacticError{
		for(int i=0; i < constructors.size(); i++){
			if( isCompatibleSignature(constructors.get(i), argTypes) )
				return constructors.get(i);
		}

		throw new SyntacticError("No se reconoce el constructor invocado, de la clase " + typeName);
	}

	public Reference createObject() throws SyntacticError{
		Reference obj = Reference.HEAP.mallocClassInstance(this);

		for(String propName: initValues.keySet())
			obj.set(obj, propName, initValues.get(propName));

		return obj;
	}
	
	public Value getStaticValue(String name) throws SyntacticError{
		// TODO chequear si es privado
		if( staticValues.containsKey(name) )
			return staticValues.get(name).getValue();
		else
			throw new SyntacticError("No existe el valor estatico " + name + " en la clase " + typeName);
	}

	public int[] getModifiers() {
		return modifiers;
	}

	public void setModifiers(int[] modifiers) {
		this.modifiers = modifiers;
	}

	public String toDescriptionString(){
		String ans = "=====================\n";

		ans += "[" + typeName + "]";
		
		if( superType != null )
			ans += " -> " + superType;
		ans += "\n";

		ans += "\nConstructors:\n";
		for(int i=0; i < constructors.size(); i++){
			ans += typeName + "(";
			
			for(int j=0; j < constructors.get(i).getArgTypes().length; j++){
				ans += constructors.get(i).getArgTypes()[j];
				
				if( j < constructors.get(i).getArgTypes().length-1 )
					ans += ", ";
			}
			ans += ")\n";
		}

		ans += "\nMethods:\n";

		for(int i=0; i < methods.size(); i++)
			ans += methods.get(i) + "\n";
			
		ans += "\nProperties:\n";

		for(int i=0; i < propertyTypes.length; i++)
			ans += propertyNames[i] + ": " + propertyTypes[i] + "\n";
		
		ans += staticValues + "\n";
		
		
		ans += "=====================\n";
		
		return ans;
	}
}
