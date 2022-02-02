package src.values;

public class BooleanValue extends Value{
	private boolean value;

	BooleanValue(boolean value){
		this.value = value;
	}

	boolean getValue(){
		return value;
	}
}