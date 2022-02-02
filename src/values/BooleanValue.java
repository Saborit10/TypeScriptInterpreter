package src.values;

public class BooleanValue extends Value{
	private boolean value;

	public BooleanValue(boolean value){
		this.value = value;
	}

	public boolean getValue(){
		return value;
	}

	@Override
	public String toString() {
		return Boolean.valueOf(value).toString();	
	}
}