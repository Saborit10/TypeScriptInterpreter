package src.values;

public class StringValue extends Value{
	private String value;

	public StringValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
	public String toString() {
		return value;		
	}

	@Override
	public boolean isEqualValue(Value v) {
		if( v instanceof StringValue ){
			StringValue stringValue = (StringValue)v;
			return stringValue.getValue() == value;
		}
		return false;
	}

}