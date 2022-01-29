import java.util.HashMap;

// 1 - El nombre ya existe
// 2 - El tipo declarado no es el del valor
// 3 - El const no tiene valor


public class SymbolTable{
    private static final int INITIAL_CAPACITY = 5;

    private HashMap<String, Entry> symbols;

    public SymbolTable(){
        symbols = new HashMap<>(INITIAL_CAPACITY);    
    }

    void addNamedSymbol(NamedSymbol e) throws SyntacticError{
        if( symbols.containsKey(e.getIdentifier()) )
            throw SyntacticError("El identificador ya esta reservado");

        if( e instanceof Variable )
            addVariable((Variable)e);

        
    }

    void addVariable(Variable e) throws SyntacticError{
        int mod = e.getModifiers();

        /* Si es una constante, debe tener un valor inicial */
        if( ((mod & Mod.CONST) > 0) && e.getValue() == null )
            throw SyntacticError("Constante " + e.getIdentifier() + " no inicializada");

        /* Comprobacion de que el tipo sea igual al del valor */
        if( e.getValue() != null ){
            if( e.getValue() instanceof NumberValue && e.getType() != "number" )
                throw SyntacticError("El tipo de la variable no coincide con el del valor");
            else if( e.getValue() instanceof BooleanValue && e.getType() != "boolean" )
                throw SyntacticError("El tipo de la variable no coincide con el del valor");
            else if( e.getValue() instanceof StringValue && e.getType() != "string" )
                throw SyntacticError("El tipo de la variable no coincide con el del valor");
            else{
                assert( e.getValue() instanceof ObjectValue ); // QUITAR DESPUES
                
                ObjectValue obj = (ObjectValue)e.getValue();

                if( obj.getClassIdentifier() != null && obj.getClassIdentifier() != e.getType() )
                    throw SyntacticError("El tipo de la variable no coincide con el del valor");
            }
        }

        
    }
}