package src.values;

import src.symbols.SyntacticError;

public class StringValue extends Value{
	private String value;

	public StringValue(String value){
		this.value = value;
		this.undefined = false;
	}

	public StringValue(){
		this.undefined = true;
	}

	public String getValue(){
		return value;
	}

	@Override
	public String toString() {
		if( undefined )
			return "undefined";
		return value;		
	}

	@Override
	public Value sum(Value v) throws SyntacticError {
		if( this.undefined && v.undefined )
			return new NumberValue(Double.NaN);
		
		return new StringValue(this.toString() + v.toString());
	}

	@Override
	public Value sub(Value v) throws SyntacticError {
		throw new SyntacticError("El operador - no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value prod(Value v) throws SyntacticError {
		throw new SyntacticError("El operador * no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value div(Value v) throws SyntacticError {
		throw new SyntacticError("El operador / no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value mod(Value v) throws SyntacticError {
		throw new SyntacticError("El operador % no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value less(Value v) throws SyntacticError {
		throw new SyntacticError("El operador < no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value greater(Value v) throws SyntacticError {
		throw new SyntacticError("El operador > no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value lessOrEq(Value v) throws SyntacticError {
		throw new SyntacticError("El operador <= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value greaterOrEq(Value v) throws SyntacticError {
		throw new SyntacticError("El operador >= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		try{
			StringValue stringValue = (StringValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			return new BooleanValue(this.value.equals(stringValue.value));
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a false, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		try{
			StringValue stringValue = (StringValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			return new BooleanValue(this.value.equals(stringValue.value));
		} catch (Exception e) {
			return new BooleanValue(false);
		}
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		try{
			StringValue stringValue = (StringValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			return new BooleanValue(!this.value.equals(stringValue.value));
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a true, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		try{
			StringValue stringValue = (StringValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			return new BooleanValue(!this.value.equals(stringValue.value));
		} catch (Exception e) {
			return new BooleanValue(true);
		}
	}

	@Override
	public Value binAnd(Value v) throws SyntacticError {
		throw new SyntacticError("El operador & no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value binOr(Value v) throws SyntacticError {
		throw new SyntacticError("El operador | no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value logicAnd(Value v) throws SyntacticError {
		throw new SyntacticError("El operador && no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value logicOr(Value v) throws SyntacticError {
		throw new SyntacticError("El operador || no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value binNot() throws SyntacticError {
		throw new SyntacticError("El operador ~ no es aplicable al tipo " + this.getType());
	}

	@Override
	public Value logicNot() throws SyntacticError {
		throw new SyntacticError("El operador ! no es aplicable al tipo " + this.getType());
	}

	@Override
	public Value plus() throws SyntacticError {
		return new NumberValue(Double.NaN);
	}

	@Override
	public Value minus() throws SyntacticError {
		return new NumberValue(Double.NaN);
	}

}