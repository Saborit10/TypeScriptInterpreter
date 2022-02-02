package src.symbols;

import java.util.HashMap;

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

	void declareVariable(Variable e) throws SyntacticError{
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
			if( e.getType().isInstanceOfThisType(e.getValue()) )
				throw new SyntacticError("El tipo de la variable " + e.getIdentifier() + " no coincide con el del valor");
		}

		symbols.put(e.getIdentifier(), e);		
	}


	@Override
	public String toString() {
		String ans = "================\n";

		for(String entryName: symbols.keySet())
			ans += symbols.get(entryName).toString() + "\n";

		ans += "================\n";
		return ans;
	}

}