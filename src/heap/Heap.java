package src.heap;

import java.util.ArrayList;
import java.util.List;

import src.symbols.SyntacticError;
import src.types.ClassInstanceType;
import src.types.Type;
import src.values.ArrayObjectValue;
import src.values.ClassInstanceValue;
import src.values.LiteralObjectValue;
import src.values.ObjectValue;
import src.values.Value;

public class Heap {
	private List<ObjectValue> objects;

	public Heap(){
		objects = new ArrayList<ObjectValue>();
	}

	public Reference mallocClassInstance(ClassInstanceType type){
		Reference superValue = null;

		if( type.getSuperType() != null ){
			superValue = mallocClassInstance(type.getSuperType());
		}
		objects.add(new ClassInstanceValue(type, superValue));
		
		return new Reference(objects.size() - 1);
	}

	public Reference mallocLiteralObject(List<String> names, List<Value> values){ // Object Literal
		int address = objects.size();

		objects.add(new LiteralObjectValue(names, values));

		return new Reference(address);
	}

	public Reference mallocArray(Type type, int length){
		int address = objects.size();
		objects.add(new ArrayObjectValue(type, length));

		return new Reference(address);
	}

	public Reference mallocArray(int length){
		int address = objects.size();
		objects.add(new ArrayObjectValue(length));

		return new Reference(address);
	}

	public Object mallocArray(List<Value> values) throws SyntacticError {
		int address = objects.size();
		objects.add(new ArrayObjectValue(values));

		return new Reference(address);
	}

	public ObjectValue access(Reference ref){
		return objects.get(ref.getAddress());
	}

	@Override
	public String toString() {
		return objects.toString();
	}

	
}
