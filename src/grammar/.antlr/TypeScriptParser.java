// Generated from /home/luis/Public/CC/src/grammar/TypeScript.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMERIC_LITERAL=5, WS=6, TK_PUBLIC=7, 
		TK_PRIVATE=8, TK_PROTECTED=9, TK_VAR=10, TK_LET=11, TK_CONST=12, TK_READ_ONLY=13, 
		TK_STRING=14, TK_ANY=15, TK_BOOLEAN=16, TK_NUMBER=17, TK_EXTENDS=18, TK_IF=19, 
		TK_ELSE=20, TK_FUNCTION=21, TK_TYPE=22, TK_REQUIRE=23, TK_EXPORT=24, TK_RETURN=25, 
		TK_CONTINUE=26, TK_BREAK=27, TK_FOR=28, TK_IN=29, TK_OF=30, TK_DO=31, 
		TK_WHILE=32, TK_CLASS=33, TK_IMPLEMENTS=34, TK_ABSTRACT=35, TK_CONSTRUCTOR=36, 
		TK_ASYNC=37, TK_STATIC=38, TK_GET=39, TK_SET=40, TK_NEW=41, TK_SWITCH=42, 
		TK_CASE=43, TK_DEFAULT=44, TK_THIS=45, NULL_LITERAL=46, BOOLEAN_LITERAL=47, 
		DECIMAL_INTEGER_LITERAL=48, DECIMAL_LITERAL=49, EXPONENT_PART=50, HEX_INTEGER_LITERAL=51, 
		OCTAL_INTEGER_LITERAL=52, OCTAL_INTEGER_LITERAL2=53, BINARY_INTEGER_LITERAL=54, 
		STRING_LITERAL=55, TK_PLUS=56, TK_MINUS=57, TK_STAR=58, TK_SLASH=59, TK_PERCENT=60, 
		TK_NOT=61, TK_BINNOT=62, TK_PLUSPLUS=63, TK_MINUSMINUS=64, TK_PLUS_ASIGN=65, 
		TK_MINUS_ASIGN=66, TK_STAR_ASIGN=67, TK_SLASH_ASIGN=68, TK_AND_ASIGN=69, 
		TK_OR_ASIGN=70, TK_PERCENT_ASIGN=71, TK_EQ=72, TK_EQEQ=73, TK_NOTEQ=74, 
		TK_IDENTEQ=75, TK_IDENTNOTEQ=76, TK_BIN_AND=77, TK_BIN_OR=78, TK_LOGIC_AND=79, 
		TK_LOGIC_OR=80, TK_LESS=81, TK_GREAT=82, TK_LESSEQ=83, TK_GREATEQ=84, 
		TK_POINT=85, TK_COMMA=86, TK_QMARK=87, TK_COLON=88, TK_SEMICOLON=89, TK_LPARENT=90, 
		TK_RPARENT=91, TK_LBRACKET=92, TK_RBRACKET=93, TK_DCUOTE=94, TK_SCUOTE=95, 
		TK_LCURLY=96, TK_RCURLY=97, TK_IDENT=98, DOUBLE_STRING_CHARACTER=99, SINGLE_STRING_CHARACTER=100, 
		ESCAPE_SEQUENCE=101, CHARACTER_ESCAPE_SEQUENCE=102, HEX_ESCAPE_SEQUENCE=103, 
		UNICODE_ESCAPE_SEQUENCE=104, EXTENDED_UNICODE_ESCAPE_SEQUENCE=105, SINGLE_ESCAPE_CHARACTER=106, 
		NON_ESCAPE_CHARACTER=107, LINE_CONTINUATION=108, HEX_DIGIT=109, TK_MULTILINE_COMMENT=110, 
		TK_SINGLELINE_COMMENT=111;
	public static final int
		RULE_compilationUnit = 0, RULE_statementList = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_printStatement = 4, RULE_forStatement = 5, RULE_conditionExpressionSequence = 6, 
		RULE_lastExpressionSequence = 7, RULE_whileStatement = 8, RULE_doStatement = 9, 
		RULE_switchStatement = 10, RULE_caseBlock = 11, RULE_afterCaseClauseList = 12, 
		RULE_caseClause = 13, RULE_defaultClause = 14, RULE_classStatement = 15, 
		RULE_classHeritage = 16, RULE_classExtendsClause = 17, RULE_implementsClause = 18, 
		RULE_classBody = 19, RULE_classElement = 20, RULE_memberDecl = 21, RULE_getter = 22, 
		RULE_setter = 23, RULE_abstractDecl = 24, RULE_indexMemberDecl = 25, RULE_propertyMemberBase = 26, 
		RULE_constructorDeclaration = 27, RULE_functionStatement = 28, RULE_continueStatement = 29, 
		RULE_breakStatement = 30, RULE_returnStatement = 31, RULE_callSignature = 32, 
		RULE_parameterList = 33, RULE_parameter = 34, RULE_requiredParameter = 35, 
		RULE_optionalParameter = 36, RULE_identifierOrPattern = 37, RULE_identifierOrReservedWord = 38, 
		RULE_emptyStatement = 39, RULE_ifStatement = 40, RULE_expressionSequence = 41, 
		RULE_expressionStatement = 42, RULE_variableStatement = 43, RULE_variableDeclList = 44, 
		RULE_variableDecl = 45, RULE_initializer = 46, RULE_arrayLiteral = 47, 
		RULE_arrayElement = 48, RULE_objectLiteral = 49, RULE_propertyAssign = 50, 
		RULE_propertyName = 51, RULE_typeAnnotation = 52, RULE_primitiveType = 53, 
		RULE_typeName = 54, RULE_parametricType = 55, RULE_simpleType = 56, RULE_referenceType = 57, 
		RULE_arrayType = 58, RULE_typeParameters = 59, RULE_typeParameterList = 60, 
		RULE_typeParameter = 61, RULE_extendsConstraint = 62, RULE_accessModifier = 63, 
		RULE_varModifier = 64, RULE_identifier = 65, RULE_functionCall = 66, RULE_functionExpressionDecl = 67, 
		RULE_assignmentOperator = 68, RULE_expression = 69, RULE_mathFunctionName = 70, 
		RULE_formalParameterList = 71, RULE_functionBody = 72, RULE_sourceElem = 73, 
		RULE_formalParameterArg = 74, RULE_identifierOrKeyword = 75, RULE_literal = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "statementList", "block", "statement", "printStatement", 
			"forStatement", "conditionExpressionSequence", "lastExpressionSequence", 
			"whileStatement", "doStatement", "switchStatement", "caseBlock", "afterCaseClauseList", 
			"caseClause", "defaultClause", "classStatement", "classHeritage", "classExtendsClause", 
			"implementsClause", "classBody", "classElement", "memberDecl", "getter", 
			"setter", "abstractDecl", "indexMemberDecl", "propertyMemberBase", "constructorDeclaration", 
			"functionStatement", "continueStatement", "breakStatement", "returnStatement", 
			"callSignature", "parameterList", "parameter", "requiredParameter", "optionalParameter", 
			"identifierOrPattern", "identifierOrReservedWord", "emptyStatement", 
			"ifStatement", "expressionSequence", "expressionStatement", "variableStatement", 
			"variableDeclList", "variableDecl", "initializer", "arrayLiteral", "arrayElement", 
			"objectLiteral", "propertyAssign", "propertyName", "typeAnnotation", 
			"primitiveType", "typeName", "parametricType", "simpleType", "referenceType", 
			"arrayType", "typeParameters", "typeParameterList", "typeParameter", 
			"extendsConstraint", "accessModifier", "varModifier", "identifier", "functionCall", 
			"functionExpressionDecl", "assignmentOperator", "expression", "mathFunctionName", 
			"formalParameterList", "functionBody", "sourceElem", "formalParameterArg", 
			"identifierOrKeyword", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console.log'", "'Math.sin'", "'Math.tan'", "'Math.exp'", null, 
			null, "'public'", "'private'", "'protected'", "'var'", "'let'", "'const'", 
			"'readonly'", "'string'", "'any'", "'boolean'", "'number'", "'extends'", 
			"'if'", "'else'", "'function'", "'type'", "'require'", "'export'", "'return'", 
			"'continue'", "'break'", "'for'", "'in'", "'of'", "'do'", "'while'", 
			"'class'", "'implements'", "'abstract'", "'constructor'", "'async'", 
			"'static'", "'get'", "'set'", "'new'", "'switch'", "'case'", "'default'", 
			"'this'", "'null'", null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", "'<'", "'>'", "'<='", 
			"'>='", "'.'", "','", "'?'", "':'", "';'", "'('", "')'", "'['", "']'", 
			"'\"'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", 
			"TK_PROTECTED", "TK_VAR", "TK_LET", "TK_CONST", "TK_READ_ONLY", "TK_STRING", 
			"TK_ANY", "TK_BOOLEAN", "TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", 
			"TK_FUNCTION", "TK_TYPE", "TK_REQUIRE", "TK_EXPORT", "TK_RETURN", "TK_CONTINUE", 
			"TK_BREAK", "TK_FOR", "TK_IN", "TK_OF", "TK_DO", "TK_WHILE", "TK_CLASS", 
			"TK_IMPLEMENTS", "TK_ABSTRACT", "TK_CONSTRUCTOR", "TK_ASYNC", "TK_STATIC", 
			"TK_GET", "TK_SET", "TK_NEW", "TK_SWITCH", "TK_CASE", "TK_DEFAULT", "TK_THIS", 
			"NULL_LITERAL", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", "DECIMAL_LITERAL", 
			"EXPONENT_PART", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL2", 
			"BINARY_INTEGER_LITERAL", "STRING_LITERAL", "TK_PLUS", "TK_MINUS", "TK_STAR", 
			"TK_SLASH", "TK_PERCENT", "TK_NOT", "TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", 
			"TK_PLUS_ASIGN", "TK_MINUS_ASIGN", "TK_STAR_ASIGN", "TK_SLASH_ASIGN", 
			"TK_AND_ASIGN", "TK_OR_ASIGN", "TK_PERCENT_ASIGN", "TK_EQ", "TK_EQEQ", 
			"TK_NOTEQ", "TK_IDENTEQ", "TK_IDENTNOTEQ", "TK_BIN_AND", "TK_BIN_OR", 
			"TK_LOGIC_AND", "TK_LOGIC_OR", "TK_LESS", "TK_GREAT", "TK_LESSEQ", "TK_GREATEQ", 
			"TK_POINT", "TK_COMMA", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", "TK_LPARENT", 
			"TK_RPARENT", "TK_LBRACKET", "TK_RBRACKET", "TK_DCUOTE", "TK_SCUOTE", 
			"TK_LCURLY", "TK_RCURLY", "TK_IDENT", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
			"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
			"UNICODE_ESCAPE_SEQUENCE", "EXTENDED_UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", 
			"NON_ESCAPE_CHARACTER", "LINE_CONTINUATION", "HEX_DIGIT", "TK_MULTILINE_COMMENT", 
			"TK_SINGLELINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TypeScriptParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			statementList();
			setState(155);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_SEMICOLON - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(TK_LCURLY);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_SEMICOLON - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
				{
				setState(163);
				statementList();
				}
			}

			setState(166);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ClassStatementContext classStatement() {
			return getRuleContext(ClassStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				printStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				variableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				doStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				switchStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				classStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				continueStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				breakStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				returnStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				functionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				expressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				emptyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__0);
			setState(186);
			match(TK_LPARENT);
			setState(187);
			expression(0);
			setState(188);
			match(TK_RPARENT);
			setState(189);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForVarIteratorContext extends ForStatementContext {
		public TerminalNode TK_FOR() { return getToken(TypeScriptParser.TK_FOR, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TK_IN() { return getToken(TypeScriptParser.TK_IN, 0); }
		public TerminalNode TK_OF() { return getToken(TypeScriptParser.TK_OF, 0); }
		public ForVarIteratorContext(ForStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarNormalContext extends ForStatementContext {
		public TerminalNode TK_FOR() { return getToken(TypeScriptParser.TK_FOR, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclListContext variableDeclList() {
			return getRuleContext(VariableDeclListContext.class,0);
		}
		public List<TerminalNode> TK_SEMICOLON() { return getTokens(TypeScriptParser.TK_SEMICOLON); }
		public TerminalNode TK_SEMICOLON(int i) {
			return getToken(TypeScriptParser.TK_SEMICOLON, i);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionExpressionSequenceContext conditionExpressionSequence() {
			return getRuleContext(ConditionExpressionSequenceContext.class,0);
		}
		public LastExpressionSequenceContext lastExpressionSequence() {
			return getRuleContext(LastExpressionSequenceContext.class,0);
		}
		public ForVarNormalContext(ForStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForIteratorContext extends ForStatementContext {
		public TerminalNode TK_FOR() { return getToken(TypeScriptParser.TK_FOR, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TK_IN() { return getToken(TypeScriptParser.TK_IN, 0); }
		public TerminalNode TK_OF() { return getToken(TypeScriptParser.TK_OF, 0); }
		public ForIteratorContext(ForStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForNormalContext extends ForStatementContext {
		public TerminalNode TK_FOR() { return getToken(TypeScriptParser.TK_FOR, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public List<TerminalNode> TK_SEMICOLON() { return getTokens(TypeScriptParser.TK_SEMICOLON); }
		public TerminalNode TK_SEMICOLON(int i) {
			return getToken(TypeScriptParser.TK_SEMICOLON, i);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ConditionExpressionSequenceContext conditionExpressionSequence() {
			return getRuleContext(ConditionExpressionSequenceContext.class,0);
		}
		public LastExpressionSequenceContext lastExpressionSequence() {
			return getRuleContext(LastExpressionSequenceContext.class,0);
		}
		public ForNormalContext(ForStatementContext ctx) { copyFrom(ctx); }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ForNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(TK_FOR);
				setState(192);
				match(TK_LPARENT);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
					{
					setState(193);
					expressionSequence();
					}
				}

				setState(196);
				match(TK_SEMICOLON);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
					{
					setState(197);
					conditionExpressionSequence();
					}
				}

				setState(200);
				match(TK_SEMICOLON);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
					{
					setState(201);
					lastExpressionSequence();
					}
				}

				setState(204);
				match(TK_RPARENT);
				setState(205);
				statement();
				}
				break;
			case 2:
				_localctx = new ForVarNormalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(TK_FOR);
				setState(207);
				match(TK_LPARENT);
				setState(208);
				varModifier();
				setState(209);
				variableDeclList();
				setState(210);
				match(TK_SEMICOLON);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
					{
					setState(211);
					conditionExpressionSequence();
					}
				}

				setState(214);
				match(TK_SEMICOLON);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
					{
					setState(215);
					lastExpressionSequence();
					}
				}

				setState(218);
				match(TK_RPARENT);
				setState(219);
				statement();
				}
				break;
			case 3:
				_localctx = new ForIteratorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(TK_FOR);
				setState(222);
				match(TK_LPARENT);
				setState(223);
				expression(0);
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				expressionSequence();
				setState(226);
				match(TK_RPARENT);
				setState(227);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarIteratorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(TK_FOR);
				setState(230);
				match(TK_LPARENT);
				setState(231);
				varModifier();
				setState(232);
				variableDecl();
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				expressionSequence();
				setState(235);
				match(TK_RPARENT);
				setState(236);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionExpressionSequenceContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ConditionExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpressionSequence; }
	}

	public final ConditionExpressionSequenceContext conditionExpressionSequence() throws RecognitionException {
		ConditionExpressionSequenceContext _localctx = new ConditionExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			expressionSequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastExpressionSequenceContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public LastExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastExpressionSequence; }
	}

	public final LastExpressionSequenceContext lastExpressionSequence() throws RecognitionException {
		LastExpressionSequenceContext _localctx = new LastExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lastExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			expressionSequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode TK_WHILE() { return getToken(TypeScriptParser.TK_WHILE, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(TK_WHILE);
			setState(245);
			match(TK_LPARENT);
			setState(246);
			expressionSequence();
			setState(247);
			match(TK_RPARENT);
			setState(248);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode TK_DO() { return getToken(TypeScriptParser.TK_DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TK_WHILE() { return getToken(TypeScriptParser.TK_WHILE, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TK_DO);
			setState(251);
			statement();
			setState(252);
			match(TK_WHILE);
			setState(253);
			match(TK_LPARENT);
			setState(254);
			expressionSequence();
			setState(255);
			match(TK_RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode TK_SWITCH() { return getToken(TypeScriptParser.TK_SWITCH, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(TK_SWITCH);
			setState(258);
			match(TK_LPARENT);
			setState(259);
			expressionSequence();
			setState(260);
			match(TK_RPARENT);
			setState(261);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public AfterCaseClauseListContext afterCaseClauseList() {
			return getRuleContext(AfterCaseClauseListContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(TK_LCURLY);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_CASE) {
				{
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264);
					caseClause();
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_CASE );
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFAULT) {
				{
				setState(271);
				defaultClause();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_CASE) {
					{
					setState(272);
					afterCaseClauseList();
					}
				}

				}
			}

			setState(277);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AfterCaseClauseListContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public AfterCaseClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterCaseClauseList; }
	}

	public final AfterCaseClauseListContext afterCaseClauseList() throws RecognitionException {
		AfterCaseClauseListContext _localctx = new AfterCaseClauseListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_afterCaseClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				caseClause();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_CASE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode TK_CASE() { return getToken(TypeScriptParser.TK_CASE, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(TK_CASE);
			setState(285);
			expressionSequence();
			setState(286);
			match(TK_COLON);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_SEMICOLON - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
				{
				setState(287);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode TK_DEFAULT() { return getToken(TypeScriptParser.TK_DEFAULT, 0); }
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(TK_DEFAULT);
			setState(291);
			match(TK_COLON);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_SEMICOLON - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
				{
				setState(292);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassStatementContext extends ParserRuleContext {
		public TerminalNode TK_CLASS() { return getToken(TypeScriptParser.TK_CLASS, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode TK_ABSTRACT() { return getToken(TypeScriptParser.TK_ABSTRACT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ABSTRACT) {
				{
				setState(295);
				match(TK_ABSTRACT);
				}
			}

			setState(298);
			match(TK_CLASS);
			setState(299);
			match(TK_IDENT);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(300);
				typeParameters();
				}
			}

			setState(303);
			classHeritage();
			setState(304);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeritageContext extends ParserRuleContext {
		public ClassExtendsClauseContext classExtendsClause() {
			return getRuleContext(ClassExtendsClauseContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeritage; }
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(306);
				classExtendsClause();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IMPLEMENTS) {
				{
				setState(309);
				implementsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassExtendsClauseContext extends ParserRuleContext {
		public TerminalNode TK_EXTENDS() { return getToken(TypeScriptParser.TK_EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ClassExtendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtendsClause; }
	}

	public final ClassExtendsClauseContext classExtendsClause() throws RecognitionException {
		ClassExtendsClauseContext _localctx = new ClassExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TK_EXTENDS);
			setState(313);
			referenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode TK_IMPLEMENTS() { return getToken(TypeScriptParser.TK_IMPLEMENTS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(TK_IMPLEMENTS);
			setState(316);
			referenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(TK_LCURLY);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_READ_ONLY) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_CONSTRUCTOR) | (1L << TK_ASYNC) | (1L << TK_STATIC) | (1L << TK_GET) | (1L << TK_SET) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_SEMICOLON - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
				{
				{
				setState(319);
				classElement();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public IndexMemberDeclContext indexMemberDecl() {
			return getRuleContext(IndexMemberDeclContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classElement);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				memberDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				indexMemberDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
	 
		public MemberDeclContext() { }
		public void copyFrom(MemberDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassMemberAbstractContext extends MemberDeclContext {
		public AbstractDeclContext abstractDecl() {
			return getRuleContext(AbstractDeclContext.class,0);
		}
		public ClassMemberAbstractContext(MemberDeclContext ctx) { copyFrom(ctx); }
	}
	public static class ClassMemberGetterSetterContext extends MemberDeclContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public ClassMemberGetterSetterContext(MemberDeclContext ctx) { copyFrom(ctx); }
	}
	public static class ClassMemberMethodContext extends MemberDeclContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public ClassMemberMethodContext(MemberDeclContext ctx) { copyFrom(ctx); }
	}
	public static class ClassMemberPropertyContext extends MemberDeclContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public TerminalNode TK_QMARK() { return getToken(TypeScriptParser.TK_QMARK, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ClassMemberPropertyContext(MemberDeclContext ctx) { copyFrom(ctx); }
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_memberDecl);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ClassMemberPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				propertyMemberBase();
				setState(334);
				propertyName();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_QMARK) {
					{
					setState(335);
					match(TK_QMARK);
					}
				}

				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(338);
					typeAnnotation();
					}
				}

				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_EQ) {
					{
					setState(341);
					initializer();
					}
				}

				setState(344);
				match(TK_SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ClassMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				propertyMemberBase();
				setState(347);
				propertyName();
				setState(348);
				callSignature();
				setState(354);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LCURLY:
					{
					{
					setState(349);
					match(TK_LCURLY);
					setState(350);
					functionBody();
					setState(351);
					match(TK_RCURLY);
					}
					}
					break;
				case TK_SEMICOLON:
					{
					setState(353);
					match(TK_SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new ClassMemberGetterSetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				propertyMemberBase();
				setState(359);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_GET:
					{
					setState(357);
					getter();
					}
					break;
				case TK_SET:
					{
					setState(358);
					setter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new ClassMemberAbstractContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				abstractDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode TK_GET() { return getToken(TypeScriptParser.TK_GET, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(TK_GET);
			setState(365);
			propertyName();
			setState(366);
			match(TK_LPARENT);
			setState(367);
			match(TK_RPARENT);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(368);
				typeAnnotation();
				}
			}

			setState(371);
			match(TK_LCURLY);
			setState(372);
			functionBody();
			setState(373);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode TK_SET() { return getToken(TypeScriptParser.TK_SET, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(TK_SET);
			setState(376);
			propertyName();
			setState(377);
			match(TK_LPARENT);
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(378);
				match(TK_IDENT);
				}
				break;
			case TK_LBRACKET:
				{
				setState(379);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				{
				setState(380);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(383);
				typeAnnotation();
				}
			}

			setState(386);
			match(TK_RPARENT);
			setState(387);
			match(TK_LCURLY);
			setState(388);
			functionBody();
			setState(389);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclContext extends ParserRuleContext {
		public TerminalNode TK_ABSTRACT() { return getToken(TypeScriptParser.TK_ABSTRACT, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public AbstractDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDecl; }
	}

	public final AbstractDeclContext abstractDecl() throws RecognitionException {
		AbstractDeclContext _localctx = new AbstractDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_abstractDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(TK_ABSTRACT);
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(392);
				match(TK_IDENT);
				setState(393);
				callSignature();
				}
				break;
			case TK_PUBLIC:
			case TK_PRIVATE:
			case TK_PROTECTED:
			case TK_VAR:
			case TK_LET:
			case TK_CONST:
				{
				setState(394);
				variableStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexMemberDeclContext extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public TerminalNode TK_NUMBER() { return getToken(TypeScriptParser.TK_NUMBER, 0); }
		public TerminalNode TK_STRING() { return getToken(TypeScriptParser.TK_STRING, 0); }
		public IndexMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexMemberDecl; }
	}

	public final IndexMemberDeclContext indexMemberDecl() throws RecognitionException {
		IndexMemberDeclContext _localctx = new IndexMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_indexMemberDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(TK_LBRACKET);
			setState(398);
			match(TK_IDENT);
			setState(399);
			match(TK_COLON);
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==TK_STRING || _la==TK_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(401);
			match(TK_RBRACKET);
			setState(402);
			typeAnnotation();
			setState(403);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyMemberBaseContext extends ParserRuleContext {
		public TerminalNode TK_ASYNC() { return getToken(TypeScriptParser.TK_ASYNC, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode TK_STATIC() { return getToken(TypeScriptParser.TK_STATIC, 0); }
		public TerminalNode TK_READ_ONLY() { return getToken(TypeScriptParser.TK_READ_ONLY, 0); }
		public PropertyMemberBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMemberBase; }
	}

	public final PropertyMemberBaseContext propertyMemberBase() throws RecognitionException {
		PropertyMemberBaseContext _localctx = new PropertyMemberBaseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertyMemberBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ASYNC) {
				{
				setState(405);
				match(TK_ASYNC);
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(408);
				accessModifier();
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_STATIC) {
				{
				setState(411);
				match(TK_STATIC);
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(414);
				match(TK_READ_ONLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode TK_CONSTRUCTOR() { return getToken(TypeScriptParser.TK_CONSTRUCTOR, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(417);
				accessModifier();
				}
			}

			setState(420);
			match(TK_CONSTRUCTOR);
			setState(421);
			match(TK_LPARENT);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(422);
				formalParameterList();
				}
			}

			setState(425);
			match(TK_RPARENT);
			setState(426);
			match(TK_LCURLY);
			setState(427);
			functionBody();
			setState(428);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStatementContext extends ParserRuleContext {
		public TerminalNode TK_FUNCTION() { return getToken(TypeScriptParser.TK_FUNCTION, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(TK_FUNCTION);
			setState(431);
			match(TK_IDENT);
			setState(432);
			callSignature();
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LCURLY:
				{
				{
				setState(433);
				match(TK_LCURLY);
				setState(434);
				functionBody();
				setState(435);
				match(TK_RCURLY);
				}
				}
				break;
			case TK_SEMICOLON:
				{
				setState(437);
				match(TK_SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode TK_CONTINUE() { return getToken(TypeScriptParser.TK_CONTINUE, 0); }
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(TK_CONTINUE);
			setState(441);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode TK_BREAK() { return getToken(TypeScriptParser.TK_BREAK, 0); }
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(TK_BREAK);
			setState(444);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode TK_RETURN() { return getToken(TypeScriptParser.TK_RETURN, 0); }
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(TK_RETURN);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
				{
				setState(447);
				expressionSequence();
				}
			}

			setState(450);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallSignatureContext extends ParserRuleContext {
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CallSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSignature; }
	}

	public final CallSignatureContext callSignature() throws RecognitionException {
		CallSignatureContext _localctx = new CallSignatureContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(452);
				typeParameters();
				}
			}

			setState(455);
			match(TK_LPARENT);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (TK_LBRACKET - 92)) | (1L << (TK_LCURLY - 92)) | (1L << (TK_IDENT - 92)))) != 0)) {
				{
				setState(456);
				parameterList();
				}
			}

			setState(459);
			match(TK_RPARENT);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(460);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			parameter();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(464);
				match(TK_COMMA);
				setState(465);
				parameter();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public RequiredParameterContext requiredParameter() {
			return getRuleContext(RequiredParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			requiredParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RequiredParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameter; }
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(473);
				accessModifier();
				}
			}

			setState(476);
			identifierOrPattern();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(477);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public TerminalNode TK_QMARK() { return getToken(TypeScriptParser.TK_QMARK, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OptionalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParameter; }
	}

	public final OptionalParameterContext optionalParameter() throws RecognitionException {
		OptionalParameterContext _localctx = new OptionalParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(480);
				accessModifier();
				}
			}

			setState(483);
			identifierOrPattern();
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_QMARK:
				{
				setState(484);
				match(TK_QMARK);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(485);
					typeAnnotation();
					}
				}

				}
				break;
			case TK_EQ:
			case TK_COLON:
				{
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(488);
					typeAnnotation();
					}
				}

				setState(491);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrPatternContext extends ParserRuleContext {
		public IdentifierOrReservedWordContext identifierOrReservedWord() {
			return getRuleContext(IdentifierOrReservedWordContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public IdentifierOrPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrPattern; }
	}

	public final IdentifierOrPatternContext identifierOrPattern() throws RecognitionException {
		IdentifierOrPatternContext _localctx = new IdentifierOrPatternContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifierOrPattern);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				identifierOrReservedWord();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrReservedWordContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public IdentifierOrReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrReservedWord; }
	}

	public final IdentifierOrReservedWordContext identifierOrReservedWord() throws RecognitionException {
		IdentifierOrReservedWordContext _localctx = new IdentifierOrReservedWordContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifierOrReservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(TK_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(TypeScriptParser.TK_IF, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode TK_ELSE() { return getToken(TypeScriptParser.TK_ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(TK_IF);
			setState(504);
			match(TK_LPARENT);
			setState(505);
			expressionSequence();
			setState(506);
			match(TK_RPARENT);
			setState(507);
			statement();
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(508);
				match(TK_ELSE);
				setState(509);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			expression(0);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(513);
				match(TK_COMMA);
				setState(514);
				expression(0);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			expression(0);
			setState(521);
			match(TK_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclListContext variableDeclList() {
			return getRuleContext(VariableDeclListContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode TK_READ_ONLY() { return getToken(TypeScriptParser.TK_READ_ONLY, 0); }
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(523);
				accessModifier();
				}
			}

			setState(526);
			varModifier();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(527);
				match(TK_READ_ONLY);
				}
			}

			setState(530);
			variableDeclList();
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(531);
				match(TK_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclListContext extends ParserRuleContext {
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public VariableDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclList; }
	}

	public final VariableDeclListContext variableDeclList() throws RecognitionException {
		VariableDeclListContext _localctx = new VariableDeclListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			variableDecl();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(535);
				match(TK_COMMA);
				setState(536);
				variableDecl();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(TK_IDENT);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(543);
				typeAnnotation();
				}
			}

			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(546);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(TK_EQ);
			setState(550);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLiteralAltContext extends ArrayLiteralContext {
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public ArrayLiteralAltContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLiteralEmptyAltContext extends ArrayLiteralContext {
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public ArrayLiteralEmptyAltContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayLiteral);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new ArrayLiteralEmptyAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(TK_LBRACKET);
				setState(553);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(TK_LBRACKET);
				setState(555);
				arrayElement();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(556);
					match(TK_COMMA);
					setState(557);
					arrayElement();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(TK_RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrayElement);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(TK_IDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	 
		public ObjectLiteralContext() { }
		public void copyFrom(ObjectLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjLiteralEmptyContext extends ObjectLiteralContext {
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public ObjLiteralEmptyContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ObjLiteralContext extends ObjectLiteralContext {
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public List<PropertyAssignContext> propertyAssign() {
			return getRuleContexts(PropertyAssignContext.class);
		}
		public PropertyAssignContext propertyAssign(int i) {
			return getRuleContext(PropertyAssignContext.class,i);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public ObjLiteralContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_objectLiteral);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new ObjLiteralEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(TK_LCURLY);
				setState(572);
				match(TK_RCURLY);
				}
				break;
			case 2:
				_localctx = new ObjLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(TK_LCURLY);
				setState(574);
				propertyAssign();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(575);
					match(TK_COMMA);
					setState(576);
					propertyAssign();
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(582);
				match(TK_RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public PropertyAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssign; }
	}

	public final PropertyAssignContext propertyAssign() throws RecognitionException {
		PropertyAssignContext _localctx = new PropertyAssignContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertyAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			propertyName();
			setState(587);
			_la = _input.LA(1);
			if ( !(_la==TK_EQ || _la==TK_COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(588);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TypeScriptParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TypeScriptParser.NUMERIC_LITERAL, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL || _la==TK_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(TK_COLON);
			setState(593);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode TK_STRING() { return getToken(TypeScriptParser.TK_STRING, 0); }
		public TerminalNode TK_BOOLEAN() { return getToken(TypeScriptParser.TK_BOOLEAN, 0); }
		public TerminalNode TK_NUMBER() { return getToken(TypeScriptParser.TK_NUMBER, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << TK_BOOLEAN) | (1L << TK_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ParametricTypeContext parametricType() {
			return getRuleContext(ParametricTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeName);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				parametricType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				simpleType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				arrayType(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametricTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParametricTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametricType; }
	}

	public final ParametricTypeContext parametricType() throws RecognitionException {
		ParametricTypeContext _localctx = new ParametricTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parametricType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			simpleType();
			setState(603);
			typeParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_simpleType);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_STRING:
			case TK_BOOLEAN:
			case TK_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				primitiveType();
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(TK_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		return arrayType(0);
	}

	private ArrayTypeContext arrayType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, _parentState);
		ArrayTypeContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(612);
			simpleType();
			setState(613);
			match(TK_LBRACKET);
			setState(614);
			match(TK_RBRACKET);
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(616);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(617);
					match(TK_LBRACKET);
					setState(618);
					match(TK_RBRACKET);
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode TK_LESS() { return getToken(TypeScriptParser.TK_LESS, 0); }
		public TerminalNode TK_GREAT() { return getToken(TypeScriptParser.TK_GREAT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(TK_LESS);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << TK_BOOLEAN) | (1L << TK_NUMBER))) != 0) || _la==TK_IDENT) {
				{
				setState(625);
				typeParameterList();
				}
			}

			setState(628);
			match(TK_GREAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			typeParameter();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(631);
				match(TK_COMMA);
				setState(632);
				typeParameter();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExtendsConstraintContext extendsConstraint() {
			return getRuleContext(ExtendsConstraintContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			typeName();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(639);
				extendsConstraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsConstraintContext extends ParserRuleContext {
		public TerminalNode TK_EXTENDS() { return getToken(TypeScriptParser.TK_EXTENDS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExtendsConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsConstraint; }
	}

	public final ExtendsConstraintContext extendsConstraint() throws RecognitionException {
		ExtendsConstraintContext _localctx = new ExtendsConstraintContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_extendsConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(TK_EXTENDS);
			setState(643);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode TK_PUBLIC() { return getToken(TypeScriptParser.TK_PUBLIC, 0); }
		public TerminalNode TK_PRIVATE() { return getToken(TypeScriptParser.TK_PRIVATE, 0); }
		public TerminalNode TK_PROTECTED() { return getToken(TypeScriptParser.TK_PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode TK_VAR() { return getToken(TypeScriptParser.TK_VAR, 0); }
		public TerminalNode TK_LET() { return getToken(TypeScriptParser.TK_LET, 0); }
		public TerminalNode TK_CONST() { return getToken(TypeScriptParser.TK_CONST, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(TK_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public List<TerminalNode> TK_LPARENT() { return getTokens(TypeScriptParser.TK_LPARENT); }
		public TerminalNode TK_LPARENT(int i) {
			return getToken(TypeScriptParser.TK_LPARENT, i);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<TerminalNode> TK_RPARENT() { return getTokens(TypeScriptParser.TK_RPARENT); }
		public TerminalNode TK_RPARENT(int i) {
			return getToken(TypeScriptParser.TK_RPARENT, i);
		}
		public FunctionExpressionDeclContext functionExpressionDecl() {
			return getRuleContext(FunctionExpressionDeclContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionCall);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(TK_IDENT);
				setState(652);
				match(TK_LPARENT);
				setState(653);
				expressionSequence();
				setState(654);
				match(TK_RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(TK_IDENT);
				setState(657);
				match(TK_LPARENT);
				setState(658);
				match(TK_RPARENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(TK_LPARENT);
				setState(660);
				functionExpressionDecl();
				setState(661);
				match(TK_RPARENT);
				setState(662);
				match(TK_LPARENT);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
					{
					setState(663);
					expressionSequence();
					}
				}

				setState(666);
				match(TK_RPARENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExpressionDeclContext extends ParserRuleContext {
		public TerminalNode TK_FUNCTION() { return getToken(TypeScriptParser.TK_FUNCTION, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public FunctionExpressionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpressionDecl; }
	}

	public final FunctionExpressionDeclContext functionExpressionDecl() throws RecognitionException {
		FunctionExpressionDeclContext _localctx = new FunctionExpressionDeclContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionExpressionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(TK_FUNCTION);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IDENT) {
				{
				setState(671);
				match(TK_IDENT);
				}
			}

			setState(674);
			match(TK_LPARENT);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(675);
				formalParameterList();
				}
			}

			setState(678);
			match(TK_RPARENT);
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(679);
				typeAnnotation();
				}
			}

			setState(682);
			match(TK_LCURLY);
			setState(683);
			functionBody();
			setState(684);
			match(TK_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public TerminalNode TK_PLUS_ASIGN() { return getToken(TypeScriptParser.TK_PLUS_ASIGN, 0); }
		public TerminalNode TK_MINUS_ASIGN() { return getToken(TypeScriptParser.TK_MINUS_ASIGN, 0); }
		public TerminalNode TK_STAR_ASIGN() { return getToken(TypeScriptParser.TK_STAR_ASIGN, 0); }
		public TerminalNode TK_SLASH_ASIGN() { return getToken(TypeScriptParser.TK_SLASH_ASIGN, 0); }
		public TerminalNode TK_PERCENT_ASIGN() { return getToken(TypeScriptParser.TK_PERCENT_ASIGN, 0); }
		public TerminalNode TK_AND_ASIGN() { return getToken(TypeScriptParser.TK_AND_ASIGN, 0); }
		public TerminalNode TK_OR_ASIGN() { return getToken(TypeScriptParser.TK_OR_ASIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TK_PLUS_ASIGN - 65)) | (1L << (TK_MINUS_ASIGN - 65)) | (1L << (TK_STAR_ASIGN - 65)) | (1L << (TK_SLASH_ASIGN - 65)) | (1L << (TK_AND_ASIGN - 65)) | (1L << (TK_OR_ASIGN - 65)) | (1L << (TK_PERCENT_ASIGN - 65)) | (1L << (TK_EQ - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBinAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_BIN_AND() { return getToken(TypeScriptParser.TK_BIN_AND, 0); }
		public ExprBinAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIdentifierContext extends ExpressionContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public ExprIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprObjectLiteralContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ExprObjectLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPlusOpContext extends ExpressionContext {
		public TerminalNode TK_PLUS() { return getToken(TypeScriptParser.TK_PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPlusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNotContext extends ExpressionContext {
		public TerminalNode TK_NOT() { return getToken(TypeScriptParser.TK_NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNotContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMathFuncContext extends ExpressionContext {
		public MathFunctionNameContext mathFunctionName() {
			return getRuleContext(MathFunctionNameContext.class,0);
		}
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public ExprMathFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDivAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_SLASH_ASIGN() { return getToken(TypeScriptParser.TK_SLASH_ASIGN, 0); }
		public ExprDivAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOrAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_OR_ASIGN() { return getToken(TypeScriptParser.TK_OR_ASIGN, 0); }
		public ExprOrAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogicAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_LOGIC_AND() { return getToken(TypeScriptParser.TK_LOGIC_AND, 0); }
		public ExprLogicAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMinusAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_MINUS_ASIGN() { return getToken(TypeScriptParser.TK_MINUS_ASIGN, 0); }
		public ExprMinusAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPlusPlusOpContext extends ExpressionContext {
		public TerminalNode TK_PLUSPLUS() { return getToken(TypeScriptParser.TK_PLUSPLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPlusPlusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprEqualityContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_EQEQ() { return getToken(TypeScriptParser.TK_EQEQ, 0); }
		public TerminalNode TK_NOTEQ() { return getToken(TypeScriptParser.TK_NOTEQ, 0); }
		public TerminalNode TK_IDENTEQ() { return getToken(TypeScriptParser.TK_IDENTEQ, 0); }
		public TerminalNode TK_IDENTNOTEQ() { return getToken(TypeScriptParser.TK_IDENTNOTEQ, 0); }
		public ExprEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAndAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_AND_ASIGN() { return getToken(TypeScriptParser.TK_AND_ASIGN, 0); }
		public ExprAndAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBinOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_BIN_OR() { return getToken(TypeScriptParser.TK_BIN_OR, 0); }
		public ExprBinOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMinusMinusOpContext extends ExpressionContext {
		public TerminalNode TK_MINUSMINUS() { return getToken(TypeScriptParser.TK_MINUSMINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprMinusMinusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public ExprAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMultAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_STAR_ASIGN() { return getToken(TypeScriptParser.TK_STAR_ASIGN, 0); }
		public ExprMultAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMinusOpContext extends ExpressionContext {
		public TerminalNode TK_MINUS() { return getToken(TypeScriptParser.TK_MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprMinusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrimitiveLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprPrimitiveLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDotIdentContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_POINT() { return getToken(TypeScriptParser.TK_POINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprDotIdentContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParentContext extends ExpressionContext {
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public ExprParentContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprObjectIndexContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public ExprObjectIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogicOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_LOGIC_OR() { return getToken(TypeScriptParser.TK_LOGIC_OR, 0); }
		public ExprLogicOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprArrayLiteralContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExprArrayLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOpMinusMinusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_MINUSMINUS() { return getToken(TypeScriptParser.TK_MINUSMINUS, 0); }
		public ExprOpMinusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprComparatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_LESS() { return getToken(TypeScriptParser.TK_LESS, 0); }
		public TerminalNode TK_GREAT() { return getToken(TypeScriptParser.TK_GREAT, 0); }
		public TerminalNode TK_LESSEQ() { return getToken(TypeScriptParser.TK_LESSEQ, 0); }
		public TerminalNode TK_GREATEQ() { return getToken(TypeScriptParser.TK_GREATEQ, 0); }
		public ExprComparatorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTernaryOperatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_QMARK() { return getToken(TypeScriptParser.TK_QMARK, 0); }
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public ExprTernaryOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMultDivPercContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_STAR() { return getToken(TypeScriptParser.TK_STAR, 0); }
		public TerminalNode TK_SLASH() { return getToken(TypeScriptParser.TK_SLASH, 0); }
		public TerminalNode TK_PERCENT() { return getToken(TypeScriptParser.TK_PERCENT, 0); }
		public ExprMultDivPercContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSumSubsContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_PLUS() { return getToken(TypeScriptParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(TypeScriptParser.TK_MINUS, 0); }
		public ExprSumSubsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFunctionCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPercentAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_PERCENT_ASIGN() { return getToken(TypeScriptParser.TK_PERCENT_ASIGN, 0); }
		public ExprPercentAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPlusAsigContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_PLUS_ASIGN() { return getToken(TypeScriptParser.TK_PLUS_ASIGN, 0); }
		public ExprPlusAsigContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBinaryNotContext extends ExpressionContext {
		public TerminalNode TK_BINNOT() { return getToken(TypeScriptParser.TK_BINNOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprBinaryNotContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOpPlusPlusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PLUSPLUS() { return getToken(TypeScriptParser.TK_PLUSPLUS, 0); }
		public ExprOpPlusPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDotFunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_POINT() { return getToken(TypeScriptParser.TK_POINT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprDotFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNewContext extends ExpressionContext {
		public TerminalNode TK_NEW() { return getToken(TypeScriptParser.TK_NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprNewContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprThisContext extends ExpressionContext {
		public TerminalNode TK_THIS() { return getToken(TypeScriptParser.TK_THIS, 0); }
		public ExprThisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFunctionObjectContext extends ExpressionContext {
		public FunctionExpressionDeclContext functionExpressionDecl() {
			return getRuleContext(FunctionExpressionDeclContext.class,0);
		}
		public ExprFunctionObjectContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				_localctx = new ExprMathFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(689);
				mathFunctionName();
				setState(690);
				match(TK_LPARENT);
				setState(691);
				expression(0);
				setState(692);
				match(TK_RPARENT);
				}
				break;
			case 2:
				{
				_localctx = new ExprFunctionObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(694);
				functionExpressionDecl();
				}
				break;
			case 3:
				{
				_localctx = new ExprPlusPlusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695);
				match(TK_PLUSPLUS);
				setState(696);
				expression(33);
				}
				break;
			case 4:
				{
				_localctx = new ExprMinusMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(697);
				match(TK_MINUSMINUS);
				setState(698);
				expression(32);
				}
				break;
			case 5:
				{
				_localctx = new ExprPlusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699);
				match(TK_PLUS);
				setState(700);
				expression(29);
				}
				break;
			case 6:
				{
				_localctx = new ExprMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(701);
				match(TK_MINUS);
				setState(702);
				expression(28);
				}
				break;
			case 7:
				{
				_localctx = new ExprBinaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(703);
				match(TK_BINNOT);
				setState(704);
				expression(27);
				}
				break;
			case 8:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(705);
				match(TK_NOT);
				setState(706);
				expression(26);
				}
				break;
			case 9:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(707);
				functionCall();
				}
				break;
			case 10:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(708);
				match(TK_LPARENT);
				setState(709);
				expressionSequence();
				setState(710);
				match(TK_RPARENT);
				}
				break;
			case 11:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(712);
				match(TK_NEW);
				setState(713);
				functionCall();
				}
				break;
			case 12:
				{
				_localctx = new ExprArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(714);
				arrayLiteral();
				}
				break;
			case 13:
				{
				_localctx = new ExprObjectLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(715);
				objectLiteral();
				}
				break;
			case 14:
				{
				_localctx = new ExprPrimitiveLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(716);
				literal();
				}
				break;
			case 15:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(717);
				match(TK_IDENT);
				}
				break;
			case 16:
				{
				_localctx = new ExprThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(718);
				match(TK_THIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(790);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivPercContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(721);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(722);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_SLASH) | (1L << TK_PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(723);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new ExprSumSubsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(724);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(725);
						_la = _input.LA(1);
						if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(726);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new ExprComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(727);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(728);
						_la = _input.LA(1);
						if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (TK_LESS - 81)) | (1L << (TK_GREAT - 81)) | (1L << (TK_LESSEQ - 81)) | (1L << (TK_GREATEQ - 81)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(729);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(730);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(731);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (TK_EQEQ - 73)) | (1L << (TK_NOTEQ - 73)) | (1L << (TK_IDENTEQ - 73)) | (1L << (TK_IDENTNOTEQ - 73)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(732);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new ExprBinAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(733);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(734);
						match(TK_BIN_AND);
						setState(735);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new ExprBinOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(736);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(737);
						match(TK_BIN_OR);
						setState(738);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new ExprLogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(740);
						match(TK_LOGIC_AND);
						setState(741);
						expression(20);
						}
						break;
					case 8:
						{
						_localctx = new ExprLogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(743);
						match(TK_LOGIC_OR);
						setState(744);
						expression(19);
						}
						break;
					case 9:
						{
						_localctx = new ExprTernaryOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(746);
						match(TK_QMARK);
						setState(747);
						expression(0);
						setState(748);
						match(TK_COLON);
						setState(749);
						expression(18);
						}
						break;
					case 10:
						{
						_localctx = new ExprAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(752);
						match(TK_EQ);
						setState(753);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new ExprPlusAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(755);
						match(TK_PLUS_ASIGN);
						setState(756);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ExprMinusAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(758);
						match(TK_MINUS_ASIGN);
						setState(759);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new ExprMultAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(761);
						match(TK_STAR_ASIGN);
						setState(762);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new ExprDivAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(764);
						match(TK_SLASH_ASIGN);
						setState(765);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new ExprPercentAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(767);
						match(TK_PERCENT_ASIGN);
						setState(768);
						expression(10);
						}
						break;
					case 16:
						{
						_localctx = new ExprAndAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(770);
						match(TK_AND_ASIGN);
						setState(771);
						expression(9);
						}
						break;
					case 17:
						{
						_localctx = new ExprOrAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(773);
						match(TK_OR_ASIGN);
						setState(774);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new ExprObjectIndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(776);
						match(TK_LBRACKET);
						setState(777);
						expressionSequence();
						setState(778);
						match(TK_RBRACKET);
						}
						break;
					case 19:
						{
						_localctx = new ExprDotIdentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(780);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(781);
						match(TK_POINT);
						setState(782);
						identifier();
						}
						break;
					case 20:
						{
						_localctx = new ExprDotFunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(783);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(784);
						match(TK_POINT);
						setState(785);
						functionCall();
						}
						break;
					case 21:
						{
						_localctx = new ExprOpPlusPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(786);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(787);
						match(TK_PLUSPLUS);
						}
						break;
					case 22:
						{
						_localctx = new ExprOpMinusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(789);
						match(TK_MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MathFunctionNameContext extends ParserRuleContext {
		public MathFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunctionName; }
	}

	public final MathFunctionNameContext mathFunctionName() throws RecognitionException {
		MathFunctionNameContext _localctx = new MathFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_mathFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			formalParameterArg();
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(798);
				match(TK_COMMA);
				setState(799);
				formalParameterArg();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<SourceElemContext> sourceElem() {
			return getRuleContexts(SourceElemContext.class);
		}
		public SourceElemContext sourceElem(int i) {
			return getRuleContext(SourceElemContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_EXPORT) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_MINUSMINUS - 64)) | (1L << (TK_SEMICOLON - 64)) | (1L << (TK_LPARENT - 64)) | (1L << (TK_LBRACKET - 64)) | (1L << (TK_LCURLY - 64)) | (1L << (TK_IDENT - 64)))) != 0)) {
				{
				{
				setState(805);
				sourceElem();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TK_EXPORT() { return getToken(TypeScriptParser.TK_EXPORT, 0); }
		public SourceElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElem; }
	}

	public final SourceElemContext sourceElem() throws RecognitionException {
		SourceElemContext _localctx = new SourceElemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sourceElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXPORT) {
				{
				setState(811);
				match(TK_EXPORT);
				}
			}

			setState(814);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterArgContext extends ParserRuleContext {
		public IdentifierOrKeywordContext identifierOrKeyword() {
			return getRuleContext(IdentifierOrKeywordContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode TK_QMARK() { return getToken(TypeScriptParser.TK_QMARK, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(816);
				accessModifier();
				}
			}

			setState(819);
			identifierOrKeyword();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_QMARK) {
				{
				setState(820);
				match(TK_QMARK);
				}
			}

			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(823);
				typeAnnotation();
				}
			}

			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(826);
				match(TK_EQ);
				setState(827);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrKeywordContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public TerminalNode TK_TYPE() { return getToken(TypeScriptParser.TK_TYPE, 0); }
		public TerminalNode TK_REQUIRE() { return getToken(TypeScriptParser.TK_REQUIRE, 0); }
		public IdentifierOrKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrKeyword; }
	}

	public final IdentifierOrKeywordContext identifierOrKeyword() throws RecognitionException {
		IdentifierOrKeywordContext _localctx = new IdentifierOrKeywordContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifierOrKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(_la==TK_TYPE || _la==TK_REQUIRE || _la==TK_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(TypeScriptParser.NULL_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TypeScriptParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TypeScriptParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TypeScriptParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 58:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 69:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arrayType_sempred(ArrayTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 36);
		case 19:
			return precpred(_ctx, 35);
		case 20:
			return precpred(_ctx, 34);
		case 21:
			return precpred(_ctx, 31);
		case 22:
			return precpred(_ctx, 30);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u0345\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\3\6\3\u00a1\n\3\r\3\16"+
		"\3\u00a2\3\4\3\4\5\4\u00a7\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ba\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\7\u00c5\n\7\3\7\3\7\5\7\u00c9\n\7\3\7\3\7\5\7\u00cd\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d7\n\7\3\7\3\7\5\7\u00db\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00f1\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\6\r\u010c\n\r"+
		"\r\r\16\r\u010d\5\r\u0110\n\r\3\r\3\r\5\r\u0114\n\r\5\r\u0116\n\r\3\r"+
		"\3\r\3\16\6\16\u011b\n\16\r\16\16\16\u011c\3\17\3\17\3\17\3\17\5\17\u0123"+
		"\n\17\3\20\3\20\3\20\5\20\u0128\n\20\3\21\5\21\u012b\n\21\3\21\3\21\3"+
		"\21\5\21\u0130\n\21\3\21\3\21\3\21\3\22\5\22\u0136\n\22\3\22\5\22\u0139"+
		"\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u0143\n\25\f\25\16"+
		"\25\u0146\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u014e\n\26\3\27\3\27"+
		"\3\27\5\27\u0153\n\27\3\27\5\27\u0156\n\27\3\27\5\27\u0159\n\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0165\n\27\3\27\3\27"+
		"\3\27\5\27\u016a\n\27\3\27\5\27\u016d\n\27\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u0174\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0180\n\31\3\31\5\31\u0183\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\5\32\u018e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\5\34\u0199\n\34\3\34\5\34\u019c\n\34\3\34\5\34\u019f\n\34\3\34\5\34\u01a2"+
		"\n\34\3\35\5\35\u01a5\n\35\3\35\3\35\3\35\5\35\u01aa\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b9\n\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u01c3\n!\3!\3!\3\"\5\"\u01c8\n\"\3\""+
		"\3\"\5\"\u01cc\n\"\3\"\3\"\5\"\u01d0\n\"\3#\3#\3#\7#\u01d5\n#\f#\16#\u01d8"+
		"\13#\3$\3$\3%\5%\u01dd\n%\3%\3%\5%\u01e1\n%\3&\5&\u01e4\n&\3&\3&\3&\5"+
		"&\u01e9\n&\3&\5&\u01ec\n&\3&\5&\u01ef\n&\3\'\3\'\3\'\5\'\u01f4\n\'\3("+
		"\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u0201\n*\3+\3+\3+\7+\u0206\n+\f+\16"+
		"+\u0209\13+\3,\3,\3,\3-\5-\u020f\n-\3-\3-\5-\u0213\n-\3-\3-\5-\u0217\n"+
		"-\3.\3.\3.\7.\u021c\n.\f.\16.\u021f\13.\3/\3/\5/\u0223\n/\3/\5/\u0226"+
		"\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0231\n\61\f\61"+
		"\16\61\u0234\13\61\3\61\3\61\5\61\u0238\n\61\3\62\3\62\5\62\u023c\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0244\n\63\f\63\16\63\u0247\13\63"+
		"\3\63\3\63\5\63\u024b\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\38\38\38\58\u025b\n8\39\39\39\3:\3:\5:\u0262\n:\3;\3;\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\7<\u026e\n<\f<\16<\u0271\13<\3=\3=\5=\u0275\n=\3="+
		"\3=\3>\3>\3>\7>\u027c\n>\f>\16>\u027f\13>\3?\3?\5?\u0283\n?\3@\3@\3@\3"+
		"A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u029b\nD\3"+
		"D\3D\5D\u029f\nD\3E\3E\5E\u02a3\nE\3E\3E\5E\u02a7\nE\3E\3E\5E\u02ab\n"+
		"E\3E\3E\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u02d2\nG\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0319\nG\f"+
		"G\16G\u031c\13G\3H\3H\3I\3I\3I\7I\u0323\nI\fI\16I\u0326\13I\3J\7J\u0329"+
		"\nJ\fJ\16J\u032c\13J\3K\5K\u032f\nK\3K\3K\3L\5L\u0334\nL\3L\3L\5L\u0338"+
		"\nL\3L\5L\u033b\nL\3L\3L\5L\u033f\nL\3M\3M\3N\3N\3N\2\4v\u008cO\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\2\21\3\2\37 \4\2\20\20\23\23\4\2"+
		"JJZZ\5\2\7\799dd\4\2\20\20\22\23\3\2\t\13\3\2\f\16\3\2CJ\3\2<>\3\2:;\3"+
		"\2SV\3\2KN\3\2\4\6\4\2\30\31dd\5\2\7\7\60\6199\2\u0385\2\u009c\3\2\2\2"+
		"\4\u00a0\3\2\2\2\6\u00a4\3\2\2\2\b\u00b9\3\2\2\2\n\u00bb\3\2\2\2\f\u00f0"+
		"\3\2\2\2\16\u00f2\3\2\2\2\20\u00f4\3\2\2\2\22\u00f6\3\2\2\2\24\u00fc\3"+
		"\2\2\2\26\u0103\3\2\2\2\30\u0109\3\2\2\2\32\u011a\3\2\2\2\34\u011e\3\2"+
		"\2\2\36\u0124\3\2\2\2 \u012a\3\2\2\2\"\u0135\3\2\2\2$\u013a\3\2\2\2&\u013d"+
		"\3\2\2\2(\u0140\3\2\2\2*\u014d\3\2\2\2,\u016c\3\2\2\2.\u016e\3\2\2\2\60"+
		"\u0179\3\2\2\2\62\u0189\3\2\2\2\64\u018f\3\2\2\2\66\u0198\3\2\2\28\u01a4"+
		"\3\2\2\2:\u01b0\3\2\2\2<\u01ba\3\2\2\2>\u01bd\3\2\2\2@\u01c0\3\2\2\2B"+
		"\u01c7\3\2\2\2D\u01d1\3\2\2\2F\u01d9\3\2\2\2H\u01dc\3\2\2\2J\u01e3\3\2"+
		"\2\2L\u01f3\3\2\2\2N\u01f5\3\2\2\2P\u01f7\3\2\2\2R\u01f9\3\2\2\2T\u0202"+
		"\3\2\2\2V\u020a\3\2\2\2X\u020e\3\2\2\2Z\u0218\3\2\2\2\\\u0220\3\2\2\2"+
		"^\u0227\3\2\2\2`\u0237\3\2\2\2b\u023b\3\2\2\2d\u024a\3\2\2\2f\u024c\3"+
		"\2\2\2h\u0250\3\2\2\2j\u0252\3\2\2\2l\u0255\3\2\2\2n\u025a\3\2\2\2p\u025c"+
		"\3\2\2\2r\u0261\3\2\2\2t\u0263\3\2\2\2v\u0265\3\2\2\2x\u0272\3\2\2\2z"+
		"\u0278\3\2\2\2|\u0280\3\2\2\2~\u0284\3\2\2\2\u0080\u0287\3\2\2\2\u0082"+
		"\u0289\3\2\2\2\u0084\u028b\3\2\2\2\u0086\u029e\3\2\2\2\u0088\u02a0\3\2"+
		"\2\2\u008a\u02b0\3\2\2\2\u008c\u02d1\3\2\2\2\u008e\u031d\3\2\2\2\u0090"+
		"\u031f\3\2\2\2\u0092\u032a\3\2\2\2\u0094\u032e\3\2\2\2\u0096\u0333\3\2"+
		"\2\2\u0098\u0340\3\2\2\2\u009a\u0342\3\2\2\2\u009c\u009d\5\4\3\2\u009d"+
		"\u009e\7\2\2\3\u009e\3\3\2\2\2\u009f\u00a1\5\b\5\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\5\3"+
		"\2\2\2\u00a4\u00a6\7b\2\2\u00a5\u00a7\5\4\3\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9\7\3\2\2\2"+
		"\u00aa\u00ba\5\n\6\2\u00ab\u00ba\5\6\4\2\u00ac\u00ba\5X-\2\u00ad\u00ba"+
		"\5R*\2\u00ae\u00ba\5\f\7\2\u00af\u00ba\5\22\n\2\u00b0\u00ba\5\24\13\2"+
		"\u00b1\u00ba\5\26\f\2\u00b2\u00ba\5 \21\2\u00b3\u00ba\5<\37\2\u00b4\u00ba"+
		"\5> \2\u00b5\u00ba\5@!\2\u00b6\u00ba\5:\36\2\u00b7\u00ba\5V,\2\u00b8\u00ba"+
		"\5P)\2\u00b9\u00aa\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9"+
		"\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b0\3\2"+
		"\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00ba\t\3\2\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd"+
		"\7\\\2\2\u00bd\u00be\5\u008cG\2\u00be\u00bf\7]\2\2\u00bf\u00c0\7[\2\2"+
		"\u00c0\13\3\2\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00c4\7\\\2\2\u00c3\u00c5"+
		"\5T+\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\7[\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7[\2\2\u00cb\u00cd\5\20\t\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7]"+
		"\2\2\u00cf\u00f1\5\b\5\2\u00d0\u00d1\7\36\2\2\u00d1\u00d2\7\\\2\2\u00d2"+
		"\u00d3\5\u0082B\2\u00d3\u00d4\5Z.\2\u00d4\u00d6\7[\2\2\u00d5\u00d7\5\16"+
		"\b\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\7[\2\2\u00d9\u00db\5\20\t\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7]\2\2\u00dd\u00de\5\b\5\2\u00de"+
		"\u00f1\3\2\2\2\u00df\u00e0\7\36\2\2\u00e0\u00e1\7\\\2\2\u00e1\u00e2\5"+
		"\u008cG\2\u00e2\u00e3\t\2\2\2\u00e3\u00e4\5T+\2\u00e4\u00e5\7]\2\2\u00e5"+
		"\u00e6\5\b\5\2\u00e6\u00f1\3\2\2\2\u00e7\u00e8\7\36\2\2\u00e8\u00e9\7"+
		"\\\2\2\u00e9\u00ea\5\u0082B\2\u00ea\u00eb\5\\/\2\u00eb\u00ec\t\2\2\2\u00ec"+
		"\u00ed\5T+\2\u00ed\u00ee\7]\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f1\3\2\2"+
		"\2\u00f0\u00c1\3\2\2\2\u00f0\u00d0\3\2\2\2\u00f0\u00df\3\2\2\2\u00f0\u00e7"+
		"\3\2\2\2\u00f1\r\3\2\2\2\u00f2\u00f3\5T+\2\u00f3\17\3\2\2\2\u00f4\u00f5"+
		"\5T+\2\u00f5\21\3\2\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7\\\2\2\u00f8"+
		"\u00f9\5T+\2\u00f9\u00fa\7]\2\2\u00fa\u00fb\5\b\5\2\u00fb\23\3\2\2\2\u00fc"+
		"\u00fd\7!\2\2\u00fd\u00fe\5\b\5\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7\\"+
		"\2\2\u0100\u0101\5T+\2\u0101\u0102\7]\2\2\u0102\25\3\2\2\2\u0103\u0104"+
		"\7,\2\2\u0104\u0105\7\\\2\2\u0105\u0106\5T+\2\u0106\u0107\7]\2\2\u0107"+
		"\u0108\5\30\r\2\u0108\27\3\2\2\2\u0109\u010f\7b\2\2\u010a\u010c\5\34\17"+
		"\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0115\3\2\2\2\u0111\u0113\5\36\20\2\u0112\u0114\5\32\16\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0111\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7c\2\2\u0118\31\3\2\2\2"+
		"\u0119\u011b\5\34\17\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\33\3\2\2\2\u011e\u011f\7-\2\2\u011f"+
		"\u0120\5T+\2\u0120\u0122\7Z\2\2\u0121\u0123\5\4\3\2\u0122\u0121\3\2\2"+
		"\2\u0122\u0123\3\2\2\2\u0123\35\3\2\2\2\u0124\u0125\7.\2\2\u0125\u0127"+
		"\7Z\2\2\u0126\u0128\5\4\3\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\37\3\2\2\2\u0129\u012b\7%\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012f\7d\2\2\u012e\u0130"+
		"\5x=\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\5\"\22\2\u0132\u0133\5(\25\2\u0133!\3\2\2\2\u0134\u0136\5$\23\2"+
		"\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139"+
		"\5&\24\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139#\3\2\2\2\u013a"+
		"\u013b\7\24\2\2\u013b\u013c\5t;\2\u013c%\3\2\2\2\u013d\u013e\7$\2\2\u013e"+
		"\u013f\5t;\2\u013f\'\3\2\2\2\u0140\u0144\7b\2\2\u0141\u0143\5*\26\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7c\2\2\u0148"+
		")\3\2\2\2\u0149\u014e\58\35\2\u014a\u014e\5,\27\2\u014b\u014e\5\64\33"+
		"\2\u014c\u014e\5\b\5\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014e+\3\2\2\2\u014f\u0150\5\66\34\2\u0150"+
		"\u0152\5h\65\2\u0151\u0153\7Y\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5j\66\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5^\60\2\u0158\u0157\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7[\2\2\u015b"+
		"\u016d\3\2\2\2\u015c\u015d\5\66\34\2\u015d\u015e\5h\65\2\u015e\u0164\5"+
		"B\"\2\u015f\u0160\7b\2\2\u0160\u0161\5\u0092J\2\u0161\u0162\7c\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0165\7[\2\2\u0164\u015f\3\2\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\u016d\3\2\2\2\u0166\u0169\5\66\34\2\u0167\u016a\5.\30\2\u0168"+
		"\u016a\5\60\31\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3"+
		"\2\2\2\u016b\u016d\5\62\32\2\u016c\u014f\3\2\2\2\u016c\u015c\3\2\2\2\u016c"+
		"\u0166\3\2\2\2\u016c\u016b\3\2\2\2\u016d-\3\2\2\2\u016e\u016f\7)\2\2\u016f"+
		"\u0170\5h\65\2\u0170\u0171\7\\\2\2\u0171\u0173\7]\2\2\u0172\u0174\5j\66"+
		"\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176"+
		"\7b\2\2\u0176\u0177\5\u0092J\2\u0177\u0178\7c\2\2\u0178/\3\2\2\2\u0179"+
		"\u017a\7*\2\2\u017a\u017b\5h\65\2\u017b\u017f\7\\\2\2\u017c\u0180\7d\2"+
		"\2\u017d\u0180\5`\61\2\u017e\u0180\5d\63\2\u017f\u017c\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5j\66\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7]"+
		"\2\2\u0185\u0186\7b\2\2\u0186\u0187\5\u0092J\2\u0187\u0188\7c\2\2\u0188"+
		"\61\3\2\2\2\u0189\u018d\7%\2\2\u018a\u018b\7d\2\2\u018b\u018e\5B\"\2\u018c"+
		"\u018e\5X-\2\u018d\u018a\3\2\2\2\u018d\u018c\3\2\2\2\u018e\63\3\2\2\2"+
		"\u018f\u0190\7^\2\2\u0190\u0191\7d\2\2\u0191\u0192\7Z\2\2\u0192\u0193"+
		"\t\3\2\2\u0193\u0194\7_\2\2\u0194\u0195\5j\66\2\u0195\u0196\7[\2\2\u0196"+
		"\65\3\2\2\2\u0197\u0199\7\'\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019b\3\2\2\2\u019a\u019c\5\u0080A\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\7(\2\2\u019e\u019d\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\7\17\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\67\3\2\2\2\u01a3\u01a5\5\u0080"+
		"A\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\7&\2\2\u01a7\u01a9\7\\\2\2\u01a8\u01aa\5\u0090I\2\u01a9\u01a8\3"+
		"\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7]\2\2\u01ac"+
		"\u01ad\7b\2\2\u01ad\u01ae\5\u0092J\2\u01ae\u01af\7c\2\2\u01af9\3\2\2\2"+
		"\u01b0\u01b1\7\27\2\2\u01b1\u01b2\7d\2\2\u01b2\u01b8\5B\"\2\u01b3\u01b4"+
		"\7b\2\2\u01b4\u01b5\5\u0092J\2\u01b5\u01b6\7c\2\2\u01b6\u01b9\3\2\2\2"+
		"\u01b7\u01b9\7[\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9;\3\2"+
		"\2\2\u01ba\u01bb\7\34\2\2\u01bb\u01bc\7[\2\2\u01bc=\3\2\2\2\u01bd\u01be"+
		"\7\35\2\2\u01be\u01bf\7[\2\2\u01bf?\3\2\2\2\u01c0\u01c2\7\33\2\2\u01c1"+
		"\u01c3\5T+\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c5\7[\2\2\u01c5A\3\2\2\2\u01c6\u01c8\5x=\2\u01c7\u01c6\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7\\\2\2\u01ca"+
		"\u01cc\5D#\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2"+
		"\2\u01cd\u01cf\7]\2\2\u01ce\u01d0\5j\66\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0C\3\2\2\2\u01d1\u01d6\5F$\2\u01d2\u01d3\7X\2\2\u01d3\u01d5"+
		"\5F$\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7E\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\5H%\2\u01da"+
		"G\3\2\2\2\u01db\u01dd\5\u0080A\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de\u01e0\5L\'\2\u01df\u01e1\5j\66\2\u01e0\u01df"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1I\3\2\2\2\u01e2\u01e4\5\u0080A\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01ee\5L"+
		"\'\2\u01e6\u01e8\7Y\2\2\u01e7\u01e9\5j\66\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ef\3\2\2\2\u01ea\u01ec\5j\66\2\u01eb\u01ea\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\5^\60\2\u01ee"+
		"\u01e6\3\2\2\2\u01ee\u01eb\3\2\2\2\u01efK\3\2\2\2\u01f0\u01f4\5N(\2\u01f1"+
		"\u01f4\5`\61\2\u01f2\u01f4\5d\63\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f2\3\2\2\2\u01f4M\3\2\2\2\u01f5\u01f6\7d\2\2\u01f6O\3\2"+
		"\2\2\u01f7\u01f8\7[\2\2\u01f8Q\3\2\2\2\u01f9\u01fa\7\25\2\2\u01fa\u01fb"+
		"\7\\\2\2\u01fb\u01fc\5T+\2\u01fc\u01fd\7]\2\2\u01fd\u0200\5\b\5\2\u01fe"+
		"\u01ff\7\26\2\2\u01ff\u0201\5\b\5\2\u0200\u01fe\3\2\2\2\u0200\u0201\3"+
		"\2\2\2\u0201S\3\2\2\2\u0202\u0207\5\u008cG\2\u0203\u0204\7X\2\2\u0204"+
		"\u0206\5\u008cG\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208U\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020b\5\u008cG\2\u020b\u020c\7[\2\2\u020cW\3\2\2\2\u020d\u020f\5\u0080"+
		"A\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\5\u0082B\2\u0211\u0213\7\17\2\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\5Z.\2\u0215\u0217\7[\2\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217Y\3\2\2\2\u0218\u021d\5\\/\2\u0219"+
		"\u021a\7X\2\2\u021a\u021c\5\\/\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2"+
		"\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e[\3\2\2\2\u021f\u021d"+
		"\3\2\2\2\u0220\u0222\7d\2\2\u0221\u0223\5j\66\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0226\5^\60\2\u0225\u0224\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226]\3\2\2\2\u0227\u0228\7J\2\2\u0228\u0229"+
		"\5\u008cG\2\u0229_\3\2\2\2\u022a\u022b\7^\2\2\u022b\u0238\7_\2\2\u022c"+
		"\u022d\7^\2\2\u022d\u0232\5b\62\2\u022e\u022f\7X\2\2\u022f\u0231\5b\62"+
		"\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7_\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u022a\3\2\2\2\u0237\u022c\3\2\2\2\u0238a\3\2\2\2"+
		"\u0239\u023c\5\u008cG\2\u023a\u023c\7d\2\2\u023b\u0239\3\2\2\2\u023b\u023a"+
		"\3\2\2\2\u023cc\3\2\2\2\u023d\u023e\7b\2\2\u023e\u024b\7c\2\2\u023f\u0240"+
		"\7b\2\2\u0240\u0245\5f\64\2\u0241\u0242\7X\2\2\u0242\u0244\5f\64\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7c\2\2\u0249"+
		"\u024b\3\2\2\2\u024a\u023d\3\2\2\2\u024a\u023f\3\2\2\2\u024be\3\2\2\2"+
		"\u024c\u024d\5h\65\2\u024d\u024e\t\4\2\2\u024e\u024f\5\u008cG\2\u024f"+
		"g\3\2\2\2\u0250\u0251\t\5\2\2\u0251i\3\2\2\2\u0252\u0253\7Z\2\2\u0253"+
		"\u0254\5n8\2\u0254k\3\2\2\2\u0255\u0256\t\6\2\2\u0256m\3\2\2\2\u0257\u025b"+
		"\5p9\2\u0258\u025b\5r:\2\u0259\u025b\5v<\2\u025a\u0257\3\2\2\2\u025a\u0258"+
		"\3\2\2\2\u025a\u0259\3\2\2\2\u025bo\3\2\2\2\u025c\u025d\5r:\2\u025d\u025e"+
		"\5x=\2\u025eq\3\2\2\2\u025f\u0262\5l\67\2\u0260\u0262\5t;\2\u0261\u025f"+
		"\3\2\2\2\u0261\u0260\3\2\2\2\u0262s\3\2\2\2\u0263\u0264\7d\2\2\u0264u"+
		"\3\2\2\2\u0265\u0266\b<\1\2\u0266\u0267\5r:\2\u0267\u0268\7^\2\2\u0268"+
		"\u0269\7_\2\2\u0269\u026f\3\2\2\2\u026a\u026b\f\4\2\2\u026b\u026c\7^\2"+
		"\2\u026c\u026e\7_\2\2\u026d\u026a\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270w\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0274\7S\2\2\u0273\u0275\5z>\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2"+
		"\2\u0275\u0276\3\2\2\2\u0276\u0277\7T\2\2\u0277y\3\2\2\2\u0278\u027d\5"+
		"|?\2\u0279\u027a\7X\2\2\u027a\u027c\5|?\2\u027b\u0279\3\2\2\2\u027c\u027f"+
		"\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e{\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u0280\u0282\5n8\2\u0281\u0283\5~@\2\u0282\u0281\3\2\2\2"+
		"\u0282\u0283\3\2\2\2\u0283}\3\2\2\2\u0284\u0285\7\24\2\2\u0285\u0286\5"+
		"n8\2\u0286\177\3\2\2\2\u0287\u0288\t\7\2\2\u0288\u0081\3\2\2\2\u0289\u028a"+
		"\t\b\2\2\u028a\u0083\3\2\2\2\u028b\u028c\7d\2\2\u028c\u0085\3\2\2\2\u028d"+
		"\u028e\7d\2\2\u028e\u028f\7\\\2\2\u028f\u0290\5T+\2\u0290\u0291\7]\2\2"+
		"\u0291\u029f\3\2\2\2\u0292\u0293\7d\2\2\u0293\u0294\7\\\2\2\u0294\u029f"+
		"\7]\2\2\u0295\u0296\7\\\2\2\u0296\u0297\5\u0088E\2\u0297\u0298\7]\2\2"+
		"\u0298\u029a\7\\\2\2\u0299\u029b\5T+\2\u029a\u0299\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7]\2\2\u029d\u029f\3\2\2\2\u029e"+
		"\u028d\3\2\2\2\u029e\u0292\3\2\2\2\u029e\u0295\3\2\2\2\u029f\u0087\3\2"+
		"\2\2\u02a0\u02a2\7\27\2\2\u02a1\u02a3\7d\2\2\u02a2\u02a1\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\7\\\2\2\u02a5\u02a7\5\u0090"+
		"I\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02aa\7]\2\2\u02a9\u02ab\5j\66\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7b\2\2\u02ad\u02ae\5\u0092J\2\u02ae"+
		"\u02af\7c\2\2\u02af\u0089\3\2\2\2\u02b0\u02b1\t\t\2\2\u02b1\u008b\3\2"+
		"\2\2\u02b2\u02b3\bG\1\2\u02b3\u02b4\5\u008eH\2\u02b4\u02b5\7\\\2\2\u02b5"+
		"\u02b6\5\u008cG\2\u02b6\u02b7\7]\2\2\u02b7\u02d2\3\2\2\2\u02b8\u02d2\5"+
		"\u0088E\2\u02b9\u02ba\7A\2\2\u02ba\u02d2\5\u008cG#\u02bb\u02bc\7B\2\2"+
		"\u02bc\u02d2\5\u008cG\"\u02bd\u02be\7:\2\2\u02be\u02d2\5\u008cG\37\u02bf"+
		"\u02c0\7;\2\2\u02c0\u02d2\5\u008cG\36\u02c1\u02c2\7@\2\2\u02c2\u02d2\5"+
		"\u008cG\35\u02c3\u02c4\7?\2\2\u02c4\u02d2\5\u008cG\34\u02c5\u02d2\5\u0086"+
		"D\2\u02c6\u02c7\7\\\2\2\u02c7\u02c8\5T+\2\u02c8\u02c9\7]\2\2\u02c9\u02d2"+
		"\3\2\2\2\u02ca\u02cb\7+\2\2\u02cb\u02d2\5\u0086D\2\u02cc\u02d2\5`\61\2"+
		"\u02cd\u02d2\5d\63\2\u02ce\u02d2\5\u009aN\2\u02cf\u02d2\7d\2\2\u02d0\u02d2"+
		"\7/\2\2\u02d1\u02b2\3\2\2\2\u02d1\u02b8\3\2\2\2\u02d1\u02b9\3\2\2\2\u02d1"+
		"\u02bb\3\2\2\2\u02d1\u02bd\3\2\2\2\u02d1\u02bf\3\2\2\2\u02d1\u02c1\3\2"+
		"\2\2\u02d1\u02c3\3\2\2\2\u02d1\u02c5\3\2\2\2\u02d1\u02c6\3\2\2\2\u02d1"+
		"\u02ca\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02ce\3\2"+
		"\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u031a\3\2\2\2\u02d3"+
		"\u02d4\f\33\2\2\u02d4\u02d5\t\n\2\2\u02d5\u0319\5\u008cG\34\u02d6\u02d7"+
		"\f\32\2\2\u02d7\u02d8\t\13\2\2\u02d8\u0319\5\u008cG\33\u02d9\u02da\f\31"+
		"\2\2\u02da\u02db\t\f\2\2\u02db\u0319\5\u008cG\32\u02dc\u02dd\f\30\2\2"+
		"\u02dd\u02de\t\r\2\2\u02de\u0319\5\u008cG\31\u02df\u02e0\f\27\2\2\u02e0"+
		"\u02e1\7O\2\2\u02e1\u0319\5\u008cG\30\u02e2\u02e3\f\26\2\2\u02e3\u02e4"+
		"\7P\2\2\u02e4\u0319\5\u008cG\27\u02e5\u02e6\f\25\2\2\u02e6\u02e7\7Q\2"+
		"\2\u02e7\u0319\5\u008cG\26\u02e8\u02e9\f\24\2\2\u02e9\u02ea\7R\2\2\u02ea"+
		"\u0319\5\u008cG\25\u02eb\u02ec\f\23\2\2\u02ec\u02ed\7Y\2\2\u02ed\u02ee"+
		"\5\u008cG\2\u02ee\u02ef\7Z\2\2\u02ef\u02f0\5\u008cG\24\u02f0\u0319\3\2"+
		"\2\2\u02f1\u02f2\f\20\2\2\u02f2\u02f3\7J\2\2\u02f3\u0319\5\u008cG\21\u02f4"+
		"\u02f5\f\17\2\2\u02f5\u02f6\7C\2\2\u02f6\u0319\5\u008cG\20\u02f7\u02f8"+
		"\f\16\2\2\u02f8\u02f9\7D\2\2\u02f9\u0319\5\u008cG\17\u02fa\u02fb\f\r\2"+
		"\2\u02fb\u02fc\7E\2\2\u02fc\u0319\5\u008cG\16\u02fd\u02fe\f\f\2\2\u02fe"+
		"\u02ff\7F\2\2\u02ff\u0319\5\u008cG\r\u0300\u0301\f\13\2\2\u0301\u0302"+
		"\7I\2\2\u0302\u0319\5\u008cG\f\u0303\u0304\f\n\2\2\u0304\u0305\7G\2\2"+
		"\u0305\u0319\5\u008cG\13\u0306\u0307\f\t\2\2\u0307\u0308\7H\2\2\u0308"+
		"\u0319\5\u008cG\n\u0309\u030a\f&\2\2\u030a\u030b\7^\2\2\u030b\u030c\5"+
		"T+\2\u030c\u030d\7_\2\2\u030d\u0319\3\2\2\2\u030e\u030f\f%\2\2\u030f\u0310"+
		"\7W\2\2\u0310\u0319\5\u0084C\2\u0311\u0312\f$\2\2\u0312\u0313\7W\2\2\u0313"+
		"\u0319\5\u0086D\2\u0314\u0315\f!\2\2\u0315\u0319\7A\2\2\u0316\u0317\f"+
		" \2\2\u0317\u0319\7B\2\2\u0318\u02d3\3\2\2\2\u0318\u02d6\3\2\2\2\u0318"+
		"\u02d9\3\2\2\2\u0318\u02dc\3\2\2\2\u0318\u02df\3\2\2\2\u0318\u02e2\3\2"+
		"\2\2\u0318\u02e5\3\2\2\2\u0318\u02e8\3\2\2\2\u0318\u02eb\3\2\2\2\u0318"+
		"\u02f1\3\2\2\2\u0318\u02f4\3\2\2\2\u0318\u02f7\3\2\2\2\u0318\u02fa\3\2"+
		"\2\2\u0318\u02fd\3\2\2\2\u0318\u0300\3\2\2\2\u0318\u0303\3\2\2\2\u0318"+
		"\u0306\3\2\2\2\u0318\u0309\3\2\2\2\u0318\u030e\3\2\2\2\u0318\u0311\3\2"+
		"\2\2\u0318\u0314\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u008d\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031d\u031e\t\16\2\2\u031e\u008f\3\2\2\2\u031f\u0324\5\u0096L\2\u0320"+
		"\u0321\7X\2\2\u0321\u0323\5\u0096L\2\u0322\u0320\3\2\2\2\u0323\u0326\3"+
		"\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0091\3\2\2\2\u0326"+
		"\u0324\3\2\2\2\u0327\u0329\5\u0094K\2\u0328\u0327\3\2\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0093\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u032f\7\32\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3"+
		"\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\5\b\5\2\u0331\u0095\3\2\2\2\u0332"+
		"\u0334\5\u0080A\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335"+
		"\3\2\2\2\u0335\u0337\5\u0098M\2\u0336\u0338\7Y\2\2\u0337\u0336\3\2\2\2"+
		"\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u033b\5j\66\2\u033a\u0339"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033d\7J\2\2\u033d"+
		"\u033f\5\u008cG\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0097"+
		"\3\2\2\2\u0340\u0341\t\17\2\2\u0341\u0099\3\2\2\2\u0342\u0343\t\20\2\2"+
		"\u0343\u009b\3\2\2\2W\u00a2\u00a6\u00b9\u00c4\u00c8\u00cc\u00d6\u00da"+
		"\u00f0\u010d\u010f\u0113\u0115\u011c\u0122\u0127\u012a\u012f\u0135\u0138"+
		"\u0144\u014d\u0152\u0155\u0158\u0164\u0169\u016c\u0173\u017f\u0182\u018d"+
		"\u0198\u019b\u019e\u01a1\u01a4\u01a9\u01b8\u01c2\u01c7\u01cb\u01cf\u01d6"+
		"\u01dc\u01e0\u01e3\u01e8\u01eb\u01ee\u01f3\u0200\u0207\u020e\u0212\u0216"+
		"\u021d\u0222\u0225\u0232\u0237\u023b\u0245\u024a\u025a\u0261\u026f\u0274"+
		"\u027d\u0282\u029a\u029e\u02a2\u02a6\u02aa\u02d1\u0318\u031a\u0324\u032a"+
		"\u032e\u0333\u0337\u033a\u033e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}