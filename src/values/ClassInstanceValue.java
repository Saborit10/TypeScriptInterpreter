package src.values;

import src.symbols.SyntacticError;
import src.types.ObjectType;
import src.types.Type;

public class ClassInstanceValue extends ObjectValue{
	private ObjectType prototype;
	private Value[] properties;
	
	ClassInstanceValue(ObjectType proto){
		this.prototype = proto;

		// Type[] types = proto.getPropertiesTypes();
		// for(int i=0; i < types.length; i++)
		// 	properties[i] = types[i].getDefaultValue();
	}

	@Override
	public boolean isEqualValue(Value v) {
		if( v instanceof ObjectValue ){
			ObjectValue objectValue = (ObjectValue)v;
			return objectValue.getType().isEqualType(prototype) ; // [&&] Comprobar que los valores son iguales
		}
		return false;
	}

	@Override
	public boolean isNotEqualValue(Value v) {
		if( v instanceof ObjectValue ){
			ObjectValue objectValue = (ObjectValue)v;
			return !objectValue.getType().isEqualType(prototype) ; // [or]Comprobar que los valores son diferentes
		}
		return true;
	}

	@Override
	public ObjectType getType(){
		return prototype;
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		if( undefined )
			return "null";

		// Type[] typeNames = prototype.getPropertiesTypes();

		// String ans = "{";
		// if( properties.length > 0 )
		// 	ans += typeNames[0].getTypeName()
		// for(int i=0; i < properties.length; i++){
		// 	ans += 
		// }

		
		// return ans + "}";
		return "{ARREGLAR}";
	}

	@Override
	public Value plus() throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value minus() throws SyntacticError {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
