package src.symbols;

import java.util.HashMap;
import java.util.List;

import src.values.Value;

// 1 - El nombre ya existe
// 2 - El tipo declarado no es el del valor
// 3 - El const no tiene valor


public class SymbolTable{
	private static final int INITIAL_CAPACITY = 5;

	private HashMap<String, Entry> symbols;
	private SymbolTable parent;

	public SymbolTable(){
		symbols = new HashMap<>(INITIAL_CAPACITY);    
	}

	public SymbolTable(SymbolTable parent){
		this();
		this.parent = parent;
	}

	public void declareVariable(Variable e) throws SyntacticError{
		/* Comprobar si el identficador ya esta reservado */
		if( symbols.containsKey(e.getIdentifier()) )
			throw new SyntacticError("El identificador ya esta reservado");

		int mod = e.getModifiers();

		/* Si es una constante, debe tener un valor inicial */
		if( ((mod & Mod.CONST) > 0) && e.getValue() == null )
			throw new SyntacticError("Constante " + e.getIdentifier() + " no inicializada");

		/* Comprobar que si la variable no tiene tipo, debe tener un valor inicial para deducirlo */
		if( e.getType() == null && e.getValue() == null )
				throw new SyntacticError("No se ha especificado un tipo para la variable " + e.getIdentifier());

		/* Comprobacion de que el tipo sea igual al del valor */
		if( e.getValue() != null && e.getType() != null ){
			if( e.getValue().getType().getTypeName() == "[@object]" && e.getType().getTypeName() == "[@object]" )
				; // Si son objetos literales.
			else if( !e.getType().isInstanceOfThisType(e.getValue()) ){
				throw new SyntacticError("El tipo " + e.getType() + " de la variable " + e.getIdentifier() + " no coincide con el del valor, que es " + e.getValue().getType());
			}
		}
		symbols.put(e.getIdentifier(), e);		
	}

	public Value getValueOf(String name) throws SyntacticError{
		if( !symbols.containsKey(name) ){
			if( parent == null )
				throw new SyntacticError("El nombre " + name + " no se ha definido");
			return parent.getValueOf(name);
		}
			
		Entry e = symbols.get(name); 
		if( !(e instanceof Variable) ){
			// System.out.println("ENTRY: " + e);
			throw new SyntacticError(name + " no es una vairable");
		}
		
		Variable variable = (Variable)e;
		return variable.getValue();
	}

	public void setValueOf(String name, Value value) throws SyntacticError{
		if( !symbols.containsKey(name) ){
			if( parent == null )
				throw new SyntacticError("El nombre " + name + " no se ha definido");
			parent.setValueOf(name, value);
			return;
		}
			
		// System.out.println("symbols: " + symbols);

		Entry e = symbols.get(name);
		if( !(e instanceof Variable) ){
			throw new SyntacticError(name + " no es una vairable");
		}
		
		Variable variable = (Variable)e;

		if( (variable.getModifiers() & Mod.CONST) > 0 )
			throw new SyntacticError("La variable " + name + " es constante, no puede ser modificada");
		
		variable.setValue(value);
	}

	@Override
	public String toString() {
		String ans = "================\n";

		for(String entryName: symbols.keySet())
			ans += symbols.get(entryName).toString() + "\n";

		ans += "================\n";
		return ans;
	}

	public boolean isDeclaredOnTop(String name) {
		return symbols.containsKey(name);
	}

}