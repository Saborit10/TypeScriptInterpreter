package src.symbols;

import java.util.HashMap;
import java.util.Map;

import src.types.Type;

public class TypeTable {
	private Map<String, Type> types;

	public TypeTable(){
		types = new HashMap<>();
	}

	public Type getTypeByName(String name) throws SyntacticError{
		if( !types.containsKey(name) )
			throw new SyntacticError("No se reconoce " + name + " como un tipo");
		return types.get(name);
	}

	public void declareType(Type type){
		types.put(type.getTypeName(), type);
	}

	public Map<String, Type> getTypes() {
		return types;
	}

	public void setTypes(Map<String, Type> types) {
		this.types = types;
	}
}
