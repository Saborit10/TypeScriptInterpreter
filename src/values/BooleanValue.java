package src.values;

public class BooleanValue extends Value{
	private boolean value;

	public BooleanValue(boolean value){
		this.value = value;
	}

	public boolean getValue(){
		return value;
	}

	public NumberValue toNumberValue(){
		if( value )
			return new NumberValue(1);
		else
			return new NumberValue(0);
	}

	@Override
	public String toString() {
		return Boolean.valueOf(value).toString();	
	}
}