package src.values;

import src.types.BooleanType;
import src.types.NumberType;
import src.types.StringType;
import src.types.Type;

public class Value{
	
	public Type getType(){
		if( this instanceof BooleanValue )
			return new BooleanType();
		else if( this instanceof NumberValue )
			return new NumberType();
		else if( this instanceof StringValue )
			return new StringType();
		else
			return ((ObjectValue)this).getType();
	}
}