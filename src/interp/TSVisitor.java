package src.interp;

import java.util.ArrayList;
import java.util.List;

import src.gen.TypeScriptBaseVisitor;
import src.gen.TypeScriptParser;
import src.gen.TypeScriptParser.VariableDeclContext;
import src.symbols.Mod;
import src.symbols.SymbolTableStack;
import src.symbols.SyntacticError;
import src.symbols.Value;
import src.symbols.Variable;

/**
 * TSVisitor
 */
public class TSVisitor extends TypeScriptBaseVisitor<Object>{
	private SymbolTableStack scope;
	private ArrayList<SyntacticError> syntacticErrors;
	
	public TSVisitor() {
		scope = new SymbolTableStack();
		syntacticErrors = new ArrayList<>();
	}



	@Override
	public Object visitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
		int accessModifiers = 0;
		
		if( ctx.accessModifier() != null )
			accessModifiers = (Integer)visit(ctx.accessModifier());
		
		int varModifiers = (Integer)visit(ctx.varModifier());
		int readonlyModifiers = ctx.TK_READ_ONLY() != null ? Mod.READONLY : 0;
		
		// System.out.println(accessModifiers);
		// System.out.println(varModifiers);
		// System.out.println(readonlyModifiers);
		System.out.println(accessModifiers | varModifiers | readonlyModifiers);

		List<VariableDeclContext> declList = ctx.variableDeclList().variableDecl();

		for(VariableDeclContext c: declList){
			String identifier = c.TK_IDENT().getText();

			Variable var = new Variable(
				identifier,
				accessModifiers | varModifiers | readonlyModifiers,
				(Type)visit(c.typeAnnotation())
			);

			if( c.initializer() != null )
				var.setValue((Value)visit(c.initializer()));
			}
			try{
				scope.declareVariable(var);
			} catch (SyntacticError e) {
				syntacticErrors.add(e);
			}
		}		

		return visitChildren(ctx);
	}

	@Override public Object visitVarModifier(TypeScriptParser.VarModifierContext ctx) {
		if( ctx.TK_CONST() != null )
			return Mod.CONST;
		else if( ctx.TK_LET() != null )
			return Mod.LET;
		else if( ctx.TK_VAR() != null )
			return Mod.VAR;
		return null;
	}

	@Override
	public Object visitAccessModifier(TypeScriptParser.AccessModifierContext ctx) {
		if( ctx.TK_PUBLIC() != null )
			return Mod.PUBLIC;
		else if( ctx.TK_PRIVATE() != null )
			return Mod.PRIVATE;
		else if( ctx.TK_PROTECTED() != null )
			return Mod.PROTECTED;
		
		return null;
	}


	// Getters-Setters

	public SymbolTableStack getScope() {
		return this.scope;
	}

	public void setScope(SymbolTableStack scope) {
		this.scope = scope;
	}

	public ArrayList<SyntacticError> getSyntacticErrors() {
		return this.syntacticErrors;
	}

	public void setSyntacticErrors(ArrayList<SyntacticError> syntacticErrors) {
		this.syntacticErrors = syntacticErrors;
	}


}