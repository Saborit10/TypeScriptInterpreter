package src.symbols;

public class NamedSymbol extends Entry{
    private String identifier;

    NamedSymbol(String ident){
        this.identifier = ident;
    }

    public String getIdentifier(){
        return identifier;
    }
}