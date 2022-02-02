package src.values;

public class NumberValue extends Value{
	private double value;

	public NumberValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

	@Override
	public String toString() {
		return Double.valueOf(value).toString();		
	}

}