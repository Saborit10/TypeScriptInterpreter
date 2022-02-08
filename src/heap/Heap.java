package src.heap;

import java.util.ArrayList;
import java.util.List;

import src.types.ClassInstanceType;
import src.values.ClassInstanceValue;
import src.values.LiteralObjectValue;
import src.values.ObjectValue;
import src.values.Value;

public class Heap {
	private List<ObjectValue> objects;

	public Heap(){
		objects = new ArrayList<ObjectValue>();
	}

	public Reference malloc(ClassInstanceType type){
		int address = objects.size();

		objects.add(new ClassInstanceValue(type));

		return new Reference(address);
	}

	public Reference malloc(List<String> names, List<Value> values){ // Object Literal
		int address = objects.size();

		objects.add(new LiteralObjectValue(names, values));

		return new Reference(address);
	}

	public ObjectValue access(Reference ref){
		return objects.get(ref.getAddress());
	}
}
