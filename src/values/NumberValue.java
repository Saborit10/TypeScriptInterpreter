package src.values;

import src.symbols.SyntacticError;
import src.types.StringType;

public class NumberValue extends Value{
	private double value;
	
	private static double EPS = 1e-15;

	public NumberValue(double value){
		this.value = value;
		this.undefined = false;
	}
	
	public NumberValue(){
		this.undefined = true;
	}

	//ELIMINAR
	public double getValue(){
		return value;
	}

	public BooleanValue toBooleanValue(){
		if( undefined )
			return new BooleanValue();
		if( Math.abs(0 - value) < EPS )
			return new BooleanValue(false);
		else
			return new BooleanValue(true);
	}
	
	@Override
	public String toString() {
		if( undefined )
			return "undefined";
		
		int intPart = Double.valueOf(value).intValue();

		if( Math.abs(value - intPart) < EPS )
			return Integer.valueOf(intPart).toString();
		else
			return Double.valueOf(value).toString();		
	}

	@Override
	public boolean isEqualValue(Value v) {
		if( v instanceof NumberValue ){
			NumberValue numberValue = (NumberValue)v;
			return numberValue.getValue() == value;
		}
		return false;
	}

	@Override
	public boolean isNotEqualValue(Value v) {
		if( v instanceof NumberValue ){
			NumberValue numberValue = (NumberValue)v;
			return numberValue.getValue() != value;
		}
		return true;
	}

	@Override
	public Value sum(Value v) throws SyntacticError {
		if( StringType.isOfThisType(v) )
			return v.sum(this);
		
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue(Double.NaN);
			
			return new NumberValue(value + numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador + no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value sub(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue(Double.NaN);
			
			return new NumberValue(value - numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador - no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value prod(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue(Double.NaN);
			
			return new NumberValue(value * numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador * no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value div(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue(Double.NaN);
			
			return new NumberValue(value / numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador / no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value mod(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue(Double.NaN);
			
			long k = Double.valueOf(value / numberValue.value).longValue();

			return new NumberValue(value - k * numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador % no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value less(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new BooleanValue(false);
			
			return new BooleanValue(value < numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador < no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value greater(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new BooleanValue(false);
			
			return new BooleanValue(value > numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador > no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value lessOrEq(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new BooleanValue(false);
			
			return new BooleanValue(value <= numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador <= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value greaterOrEq(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new BooleanValue(false);
			
			return new BooleanValue(value >= numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador >= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		try{
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			return new BooleanValue(this.value == numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a false, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		try{
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			return new BooleanValue(this.value == numberValue.value);
		} catch (Exception e) {
			return new BooleanValue(false);
		}
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		try{
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			return new BooleanValue(this.value != numberValue.value);
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a true, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		try{
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			return new BooleanValue(this.value != numberValue.value);
		} catch (Exception e) {
			return new BooleanValue(true);
		}
	}

	@Override
	public Value binAnd(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue(0);

			int a = Double.valueOf(value).intValue();
			int b = Double.valueOf(numberValue.value).intValue();
			
			return new NumberValue(a & b);
		} catch (Exception e) {
			throw new SyntacticError("El operador & no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value binOr(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined && numberValue.undefined )
				return new NumberValue(0);
			else if( this.undefined )
				return new NumberValue(numberValue.value);
			else if( numberValue.undefined )
				return new NumberValue(value);

			int a = Double.valueOf(value).intValue();
			int b = Double.valueOf(numberValue.value).intValue();
			
			return new NumberValue(a | b);
		} catch (Exception e) {
			throw new SyntacticError("El operador | no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value logicAnd(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined || numberValue.undefined )
				return new NumberValue();
			return new NumberValue(numberValue.value);

		} catch (Exception e) {
			throw new SyntacticError("El operador && no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value logicOr(Value v) throws SyntacticError {
		try {
			NumberValue numberValue = (NumberValue)v;

			if( this.undefined && numberValue.undefined )
				return new NumberValue();
			else if( this.undefined )
				return new NumberValue(numberValue.value);
			else
				return new NumberValue(value);
		} catch (Exception e) {
			throw new SyntacticError("El operador || no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value binNot() throws SyntacticError {
		int v = Double.valueOf(value).intValue();

		if( this.undefined )
			v = 0;
		return new NumberValue(~v);
	}

	@Override
	public Value logicNot() throws SyntacticError {
		boolean v = Double.valueOf(value).intValue() == 0;

		if( this.undefined )
			v = true;
		return new BooleanValue(v);
	}

	@Override
	public Value plus() throws SyntacticError {
		if( undefined )
			return new NumberValue(Double.NaN);
		return new NumberValue(value);
	}

	@Override
	public Value minus() throws SyntacticError {
		if( undefined )
			return new NumberValue(Double.NaN);
		return new NumberValue(-value);
	}

}