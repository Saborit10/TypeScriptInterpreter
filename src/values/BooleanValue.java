package src.values;

import src.symbols.SyntacticError;
import src.types.StringType;

public class BooleanValue extends Value{
	private boolean value;

	public BooleanValue(boolean value){
		this.value = value;
		this.undefined = false;
	}
	
	public BooleanValue(){
		this.undefined = true;
	}

	/* Devuelve si el valor esta definido y es verdadero */
	public boolean isTrue(){
		return !undefined && value == true;
	}
 
	public NumberValue toNumberValue(){
		if( undefined )
			return new NumberValue();
		else if( value )
			return new NumberValue(1);
		else
			return new NumberValue(0);
	}

	public boolean isUndefinedOrFalse(){
		return undefined || value == false;
	}

	@Override
	public String toString() {
		if( undefined )
			return "undefined";
		return Boolean.valueOf(value).toString();	
	}

	@Override
	public Value sum(Value v) throws SyntacticError {
		if( StringType.isOfThisType(v) )
			return v.sum(this);
		throw new SyntacticError("El operador + no es aplicable a los tipos " + this.getType() + " y " + v.getType());
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
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined || v.undefined )
				return new BooleanValue(false);

			int a = this.value ? 1 : 0;
			int b = booleanValue.value ? 1 : 0;

			return new BooleanValue(a < b);
		} catch (Exception e) {
			throw new SyntacticError("El operador < no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value greater(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined || v.undefined )
				return new BooleanValue(false);

			int a = this.value ? 1 : 0;
			int b = booleanValue.value ? 1 : 0;

			return new BooleanValue(a > b);
		} catch (Exception e) {
			throw new SyntacticError("El operador > no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value lessOrEq(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined || v.undefined )
				return new BooleanValue(false);

			int a = this.value ? 1 : 0;
			int b = booleanValue.value ? 1 : 0;

			return new BooleanValue(a <= b);
		} catch (Exception e) {
			throw new SyntacticError("El operador <= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value greaterOrEq(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined || v.undefined )
				return new BooleanValue(false);

			int a = this.value ? 1 : 0;
			int b = booleanValue.value ? 1 : 0;

			return new BooleanValue(a >= b);
		} catch (Exception e) {
			throw new SyntacticError("El operador >= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			return new BooleanValue(this.value == booleanValue.value);
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a false, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(true);
			else if( this.undefined || v.undefined )
				return new BooleanValue(false);

			return new BooleanValue(this.value == booleanValue.value);
		} catch (Exception e) {
			return new BooleanValue(false);
		}
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			return new BooleanValue(this.value != booleanValue.value);
		} catch (Exception e) {
			throw new SyntacticError("La expresion siempre es igual a true, ya que no hay solapamiento entre los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue(false);
			else if( this.undefined || v.undefined )
				return new BooleanValue(true);

			return new BooleanValue(this.value != booleanValue.value);
		} catch (Exception e) {
			return new BooleanValue(true);
		}
	}

	@Override
	public Value binAnd(Value v) throws SyntacticError {
		throw new SyntacticError("El operador + no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value binOr(Value v) throws SyntacticError {
		throw new SyntacticError("El operador + no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value logicAnd(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined || v.undefined )
				return new BooleanValue();

			return new BooleanValue(this.value && booleanValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador && no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value logicOr(Value v) throws SyntacticError {
		try{
			BooleanValue booleanValue = (BooleanValue)v;

			if( this.undefined && v.undefined )
				return new BooleanValue();
			else if( this.undefined )
				return new BooleanValue(booleanValue.value);
			else if( booleanValue.undefined )
				return new BooleanValue(this.value);

			return new BooleanValue(this.value || booleanValue.value);
		} catch (Exception e) {
			throw new SyntacticError("El operador || no es aplicable a los tipos " + this.getType() + " y " + v.getType());
		}
	}

	@Override
	public Value binNot() throws SyntacticError {
		int v = this.value ? 1 : 0;

		if( this.undefined )
			v = 0;
		
		return new NumberValue(~v);
	}

	@Override
	public Value logicNot() throws SyntacticError {
		boolean v = this.value;

		if( this.undefined )
			v = false;
		
		return new BooleanValue(!v);
	}

	@Override
	public Value plus() throws SyntacticError {
		if( undefined )
			return new NumberValue(Double.NaN);
		int v = value ? 1 : 0;

		return new NumberValue(v);
	}

	@Override
	public Value minus() throws SyntacticError {
		if( undefined )
			return new NumberValue(Double.NaN);
		int v = value ? 1 : 0;

		return new NumberValue(-v);
	}
}