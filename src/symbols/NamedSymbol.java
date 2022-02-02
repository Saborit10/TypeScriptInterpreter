package src.symbols;

public class NamedSymbol extends Entry{
    protected String identifier;

    NamedSymbol(String ident){
        this.identifier = ident;
    }

    public String getIdentifier(){
        return identifier;
    }
}