package src.values;

import src.symbols.SyntacticError;
import src.types.Type;

public abstract class ObjectValue extends Value{
	protected Value[] properties;

	public abstract Type getType();

	public Value[] getProperties() {
		return this.properties;
	}

	public abstract Value get(String propName) throws SyntacticError;
	
	public abstract void set(String propName, Value value) throws SyntacticError;

	@Override
	public Value binAnd(Value v) throws SyntacticError {
		throw new SyntacticError("El operador & no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value binNot() throws SyntacticError {
		throw new SyntacticError("El operador ~ no es aplicable al tipo " + this.getType());
	}

	@Override
	public Value binOr(Value v) throws SyntacticError {
		throw new SyntacticError("El operador | no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value div(Value v) throws SyntacticError {
		throw new SyntacticError("El operador / no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value greater(Value v) throws SyntacticError {
		throw new SyntacticError("El operador > no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value greaterOrEq(Value v) throws SyntacticError {
		throw new SyntacticError("El operador >= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value less(Value v) throws SyntacticError {
		throw new SyntacticError("El operador < no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value lessOrEq(Value v) throws SyntacticError {
		throw new SyntacticError("El operador <= no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value logicAnd(Value v) throws SyntacticError {
		throw new SyntacticError("El operador && no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value logicNot() throws SyntacticError {
		throw new SyntacticError("El operador ! no es aplicable al tipo " + this.getType());
	}

	@Override
	public Value logicOr(Value v) throws SyntacticError {
		throw new SyntacticError("El operador || no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value mod(Value v) throws SyntacticError {
		throw new SyntacticError("El operador % no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value prod(Value v) throws SyntacticError {
		throw new SyntacticError("El operador % no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value sub(Value v) throws SyntacticError {
		throw new SyntacticError("El operador - no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value sum(Value v) throws SyntacticError {
		throw new SyntacticError("El operador + no es aplicable a los tipos " + this.getType() + " y " + v.getType());
	}

	@Override
	public Value plus() throws SyntacticError {
		throw new SyntacticError("El operador + no es aplicable al tipo " + this.getType());
	}

	@Override
	public Value minus() throws SyntacticError {
		throw new SyntacticError("El operador - no es aplicable al tipo " + this.getType());
	}
	
}