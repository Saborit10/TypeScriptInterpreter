package src.values;

public class StringValue extends Value{
	private String value;

	StringValue(String value){
		this.value = value;
	}

	String getValue(){
		return value;
	}
}