package src.values;

import java.util.ArrayList;

import src.gen.TypeScriptParser.FunctionBodyContext;
import src.interp.SyntacticChecker;
import src.symbols.SyntacticError;
import src.types.FunctionObjectType;
import src.types.Type;

public class FunctionObjectValue extends ObjectValue{
	private FunctionBodyContext body;
	private Type[] argTypes;
	private String[] argNames;

	public FunctionObjectValue(){
		undefined = true;
	}

	public FunctionObjectValue(ArrayList<Type> argTypes, ArrayList<String> argNames, FunctionBodyContext body) throws SyntacticError{
		undefined = false;
		this.body = body;
	
		SyntacticChecker.noEqualPair(argNames);

		this.argNames = new String[argNames.size()];
		this.argTypes = new Type[argTypes.size()];
		
		for(int i=0; i < argNames.size(); i++){
			this.argNames[i] = argNames.get(i);
			this.argTypes[i] = argTypes.get(i);
		}
	}

	@Override
	public Type getType() {
		return new FunctionObjectType();
	}

	@Override
	public Value get(String propName) throws SyntacticError {
		throw new SyntacticError("El objeto es de tipo function. No contiene propiedades.");
	}

	@Override
	public void set(String propName, Value value) throws SyntacticError {
		throw new SyntacticError("El objeto es de tipo function. No contiene propiedades.");
	}

	@Override
	public Value equals(Value v) throws SyntacticError {
		return new BooleanValue(false);
	}

	@Override
	public Value strictEquals(Value v) throws SyntacticError {
		return new BooleanValue(false);
	}

	@Override
	public Value notEquals(Value v) throws SyntacticError {
		return new BooleanValue(true);
	}

	@Override
	public Value notStrictEquals(Value v) throws SyntacticError {
		return new BooleanValue(true);
	}

	@Override
	public Value[] getPropertyValues() {
		return null;
	}

	@Override
	public boolean isFalsy() {
		return undefined;
	}

}