package src.values;

import src.symbols.SyntacticError;
import src.types.BooleanType;
import src.types.NumberType;
import src.types.StringType;
import src.types.Type;

public abstract class Value{
	protected boolean undefined;

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

	boolean isUndefined(){
		return undefined;
	}

	public abstract Value sum(Value v) throws SyntacticError;
	public abstract Value sub(Value v) throws SyntacticError;
	public abstract Value prod(Value v) throws SyntacticError;
	public abstract Value div(Value v) throws SyntacticError;
	public abstract Value mod(Value v) throws SyntacticError;
	public abstract Value less(Value v) throws SyntacticError;
	public abstract Value greater(Value v) throws SyntacticError;
	public abstract Value lessOrEq(Value v) throws SyntacticError;
	public abstract Value greaterOrEq(Value v) throws SyntacticError;
	public abstract Value equals(Value v) throws SyntacticError;
	public abstract Value strictEquals(Value v) throws SyntacticError;
	public abstract Value notEquals(Value v) throws SyntacticError;
	public abstract Value notStrictEquals(Value v) throws SyntacticError;
	public abstract Value binAnd(Value v) throws SyntacticError;
	public abstract Value binOr(Value v) throws SyntacticError;
	public abstract Value logicAnd(Value v) throws SyntacticError;
	public abstract Value logicOr(Value v) throws SyntacticError;
	public abstract Value binNot() throws SyntacticError;
	public abstract Value logicNot() throws SyntacticError;
	public abstract Value plus() throws SyntacticError;
	public abstract Value minus() throws SyntacticError;
	
}