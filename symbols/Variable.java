
public class Variable extends NamedSymbol{
	private int modifiers;
	private String type;
	private Value value; 

	public Variable(String ident, int modifiers, String type){
		super(ident);
		this.modifiers = modifiers;
		this.type = type;
	}

	public Variable(String ident, int modifiers, Value init){
		this(ident, modifiers);
		this.value = init;
	}

	int getModifiers(){
		return modifiers;
	}

	Value getValue(){
		return value;
	}

	String getType(){
		return type;
	}
}