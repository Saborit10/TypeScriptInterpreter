package src.values;

import src.types.ObjectType;

public class ObjectValue extends Value{
	private ObjectType type;
	
	//

	public ObjectType getType(){
		return type;
	}

	@Override
	public boolean isEqualValue(Value v) {
		if( v instanceof ObjectValue ){
			ObjectValue objectValue = (ObjectValue)v;
			return objectValue.getType().isEqualType(type) ; // Comprobar que los valores son iguales
		}
		return false;
	}
}