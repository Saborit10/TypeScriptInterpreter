package src.symbols;

import java.util.ArrayList;

import src.types.Type;
import src.values.Value;

public class Variable extends NamedSymbol{
	private int modifiers;
	private Type type;
	private Value value;

	public Variable(String ident, int modifiers, Type type){
		super(ident);
		this.modifiers = modifiers;
		this.type = type;
	}

	public Variable(String ident, int modifiers, Type type, Value init){
		this(ident, modifiers, type);
		this.value = init;
	}

	public int getModifiers(){
		return modifiers;
	}

	public Value getValue(){
		return value;
	}

	public Type getType(){
		return type;
	}

	public void setValue(Value v){
		value = v;
	}

	@Override
	public String toString() {
		ArrayList<String> mods = new ArrayList<>();
		
		if( (modifiers & Mod.CONST) > 0 ) mods.add("CONST"); 
		if( (modifiers & Mod.LET) > 0 ) mods.add("LET"); 
		if( (modifiers & Mod.VAR) > 0 ) mods.add("VAR");
		if( (modifiers & Mod.PUBLIC) > 0 ) mods.add("PUBLIC");
		if( (modifiers & Mod.PRIVATE) > 0 ) mods.add("PRIVATE");
		if( (modifiers & Mod.PROTECTED) > 0 ) mods.add("PROTECTED");
		if( (modifiers & Mod.READONLY) > 0 ) mods.add("READONLY");
		if( (modifiers & Mod.ABSTRACT) > 0 ) mods.add("ABSTRACT");
		if( (modifiers & Mod.ASYNC) > 0 ) mods.add("ASYNC");
		if( (modifiers & Mod.STATIC) > 0 ) mods.add("STATIC");
		
		return mods + " " + identifier;
	}
}