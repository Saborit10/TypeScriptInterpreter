package src.symbols;

import java.util.HashMap;
import java.util.Map;

import src.types.ClassInstanceType;

public class TypeTable {
	private Map<String, ClassInstanceType> types;

	public TypeTable(){
		types = new HashMap<>();
	}

	public ClassInstanceType getTypeByName(String name) throws SyntacticError{
		if( !types.containsKey(name) )
			throw new SyntacticError("No se reconoce " + name + " como un tipo");
		return types.get(name);
	}

	public void declareType(ClassInstanceType type){
		types.put(type.getTypeName(), type);
	}

	public Map<String,ClassInstanceType> getTypes() {
		return types;
	}

	public void setTypes(Map<String, ClassInstanceType> types) {
		this.types = types;
	}
}
