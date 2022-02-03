package src.values;


public class NumberValue extends Value{
	private double value;
	private static double EPS = 1e-15;

	public NumberValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

	public BooleanValue toBooleanValue(){
		if( Math.abs(0 - value) < EPS )
			return new BooleanValue(false);
		else
			return new BooleanValue(true);
	}

	@Override
	public String toString() {
		int intPart = Double.valueOf(value).intValue();

		if( Math.abs(value - intPart) < EPS )
			return Integer.valueOf(intPart).toString();
		else
			return Double.valueOf(value).toString();		
	}

}