package src.symbols;

public class SyntacticError extends Exception{
	private String reason;

	public SyntacticError(String reason){
		super();
		this.reason = reason;
	}

	public String toString(){
		return reason;
	} 
}