package src.gen;
// Generated from ./src/grammar/TypeScript.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERIC_LITERAL=1, WS=2, TK_PUBLIC=3, TK_PRIVATE=4, TK_PROTECTED=5, TK_VAR=6, 
		TK_LET=7, TK_CONST=8, TK_READ_ONLY=9, TK_STRING=10, TK_ANY=11, TK_BOOLEAN=12, 
		TK_NUMBER=13, TK_EXTENDS=14, TK_IF=15, TK_ELSE=16, TK_FUNCTION=17, TK_TYPE=18, 
		TK_REQUIRE=19, TK_EXPORT=20, TK_RETURN=21, TK_CONTINUE=22, TK_BREAK=23, 
		TK_FOR=24, TK_IN=25, TK_OF=26, TK_DO=27, TK_WHILE=28, TK_CLASS=29, TK_IMPLEMENTS=30, 
		TK_ABSTRACT=31, TK_CONSTRUCTOR=32, TK_ASYNC=33, TK_STATIC=34, TK_GET=35, 
		TK_SET=36, TK_NEW=37, TK_SWITCH=38, TK_CASE=39, TK_DEFAULT=40, TK_THIS=41, 
		NULL_LITERAL=42, BOOLEAN_LITERAL=43, DECIMAL_INTEGER_LITERAL=44, DECIMAL_LITERAL=45, 
		EXPONENT_PART=46, HEX_INTEGER_LITERAL=47, OCTAL_INTEGER_LITERAL=48, OCTAL_INTEGER_LITERAL2=49, 
		BINARY_INTEGER_LITERAL=50, STRING_LITERAL=51, TK_PLUS=52, TK_MINUS=53, 
		TK_STAR=54, TK_SLASH=55, TK_PERCENT=56, TK_NOT=57, TK_BINNOT=58, TK_PLUSPLUS=59, 
		TK_MINUSMINUS=60, TK_PLUS_ASIGN=61, TK_MINUS_ASIGN=62, TK_STAR_ASIGN=63, 
		TK_SLASH_ASIGN=64, TK_AND_ASIGN=65, TK_OR_ASIGN=66, TK_PERCENT_ASIGN=67, 
		TK_EQ=68, TK_EQEQ=69, TK_NOTEQ=70, TK_IDENTEQ=71, TK_IDENTNOTEQ=72, TK_BIN_AND=73, 
		TK_BIN_OR=74, TK_LOGIC_AND=75, TK_LOGIC_OR=76, TK_LESS=77, TK_GREAT=78, 
		TK_LESSEQ=79, TK_GREATEQ=80, TK_POINT=81, TK_COMMA=82, TK_QMARK=83, TK_COLON=84, 
		TK_SEMICOLON=85, TK_LPARENT=86, TK_RPARENT=87, TK_LBRACKET=88, TK_RBRACKET=89, 
		TK_DCUOTE=90, TK_SCUOTE=91, TK_LCURLY=92, TK_RCURLY=93, TK_IDENT=94, DOUBLE_STRING_CHARACTER=95, 
		SINGLE_STRING_CHARACTER=96, ESCAPE_SEQUENCE=97, CHARACTER_ESCAPE_SEQUENCE=98, 
		HEX_ESCAPE_SEQUENCE=99, UNICODE_ESCAPE_SEQUENCE=100, EXTENDED_UNICODE_ESCAPE_SEQUENCE=101, 
		SINGLE_ESCAPE_CHARACTER=102, NON_ESCAPE_CHARACTER=103, LINE_CONTINUATION=104, 
		HEX_DIGIT=105, TK_MULTILINE_COMMENT=106, TK_SINGLELINE_COMMENT=107;
	public static final int
		RULE_compilationUnit = 0, RULE_statementList = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_forStatement = 4, RULE_whileStatement = 5, RULE_doStatement = 6, 
		RULE_switchStatement = 7, RULE_caseBlock = 8, RULE_caseClause = 9, RULE_defaultClause = 10, 
		RULE_classStatement = 11, RULE_classHeritage = 12, RULE_classExtendsClause = 13, 
		RULE_implementsClause = 14, RULE_classBody = 15, RULE_classElement = 16, 
		RULE_memberDecl = 17, RULE_getter = 18, RULE_setter = 19, RULE_abstractDecl = 20, 
		RULE_indexMemberDecl = 21, RULE_propertyMemberBase = 22, RULE_constructorDeclaration = 23, 
		RULE_functionStatement = 24, RULE_continueStatement = 25, RULE_breakStatement = 26, 
		RULE_returnStatement = 27, RULE_callSignature = 28, RULE_parameterList = 29, 
		RULE_parameter = 30, RULE_requiredParameter = 31, RULE_optionalParameter = 32, 
		RULE_identifierOrPattern = 33, RULE_identifierOrReservedWord = 34, RULE_emptyStatement = 35, 
		RULE_ifStatement = 36, RULE_expressionSequence = 37, RULE_expressionStatement = 38, 
		RULE_variableStatement = 39, RULE_variableDeclList = 40, RULE_variableDecl = 41, 
		RULE_initializer = 42, RULE_arrayLiteral = 43, RULE_arrayElement = 44, 
		RULE_objectLiteral = 45, RULE_propertyAssign = 46, RULE_propertyName = 47, 
		RULE_typeAnnotation = 48, RULE_primitiveType = 49, RULE_typeName = 50, 
		RULE_parametricType = 51, RULE_simpleType = 52, RULE_referenceType = 53, 
		RULE_arrayType = 54, RULE_typeParameters = 55, RULE_typeParameterList = 56, 
		RULE_typeParameter = 57, RULE_extendsConstraint = 58, RULE_accessModifier = 59, 
		RULE_varModifier = 60, RULE_identifier = 61, RULE_functionCall = 62, RULE_functionExpressionDecl = 63, 
		RULE_assignmentOperator = 64, RULE_expression = 65, RULE_formalParameterList = 66, 
		RULE_functionBody = 67, RULE_sourceElem = 68, RULE_formalParameterArg = 69, 
		RULE_identifierOrKeyword = 70, RULE_literal = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "statementList", "block", "statement", "forStatement", 
			"whileStatement", "doStatement", "switchStatement", "caseBlock", "caseClause", 
			"defaultClause", "classStatement", "classHeritage", "classExtendsClause", 
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
			"functionExpressionDecl", "assignmentOperator", "expression", "formalParameterList", 
			"functionBody", "sourceElem", "formalParameterArg", "identifierOrKeyword", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'public'", "'private'", "'protected'", "'var'", "'let'", 
			"'const'", "'readonly'", "'string'", "'any'", "'boolean'", "'number'", 
			"'extends'", "'if'", "'else'", "'function'", "'type'", "'require'", "'export'", 
			"'return'", "'continue'", "'break'", "'for'", "'in'", "'of'", "'do'", 
			"'while'", "'class'", "'implements'", "'abstract'", "'constructor'", 
			"'async'", "'static'", "'get'", "'set'", "'new'", "'switch'", "'case'", 
			"'default'", "'this'", "'null'", null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", 
			"'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'='", 
			"'=='", "'!='", "'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", "'<'", 
			"'>'", "'<='", "'>='", "'.'", "','", "'?'", "':'", "';'", "'('", "')'", 
			"'['", "']'", "'\"'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", "TK_PROTECTED", 
			"TK_VAR", "TK_LET", "TK_CONST", "TK_READ_ONLY", "TK_STRING", "TK_ANY", 
			"TK_BOOLEAN", "TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", "TK_FUNCTION", 
			"TK_TYPE", "TK_REQUIRE", "TK_EXPORT", "TK_RETURN", "TK_CONTINUE", "TK_BREAK", 
			"TK_FOR", "TK_IN", "TK_OF", "TK_DO", "TK_WHILE", "TK_CLASS", "TK_IMPLEMENTS", 
			"TK_ABSTRACT", "TK_CONSTRUCTOR", "TK_ASYNC", "TK_STATIC", "TK_GET", "TK_SET", 
			"TK_NEW", "TK_SWITCH", "TK_CASE", "TK_DEFAULT", "TK_THIS", "NULL_LITERAL", 
			"BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", "DECIMAL_LITERAL", "EXPONENT_PART", 
			"HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL2", 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			statementList();
			setState(145);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				statement();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (TK_SEMICOLON - 85)) | (1L << (TK_LPARENT - 85)) | (1L << (TK_LBRACKET - 85)) | (1L << (TK_LCURLY - 85)) | (1L << (TK_IDENT - 85)))) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(TK_LCURLY);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (TK_SEMICOLON - 85)) | (1L << (TK_LPARENT - 85)) | (1L << (TK_LBRACKET - 85)) | (1L << (TK_LCURLY - 85)) | (1L << (TK_IDENT - 85)))) != 0)) {
				{
				setState(153);
				statementList();
				}
			}

			setState(156);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				doStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				classStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				breakStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				returnStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(169);
				functionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
				expressionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(171);
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

	public static class ForStatementContext extends ParserRuleContext {
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
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclListContext variableDeclList() {
			return getRuleContext(VariableDeclListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_IN() { return getToken(TypeScriptParser.TK_IN, 0); }
		public TerminalNode TK_OF() { return getToken(TypeScriptParser.TK_OF, 0); }
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forStatement);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(TK_FOR);
				setState(175);
				match(TK_LPARENT);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
					{
					setState(176);
					expressionSequence();
					}
				}

				setState(179);
				match(TK_SEMICOLON);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
					{
					setState(180);
					expressionSequence();
					}
				}

				setState(183);
				match(TK_SEMICOLON);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
					{
					setState(184);
					expressionSequence();
					}
				}

				setState(187);
				match(TK_RPARENT);
				setState(188);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(TK_FOR);
				setState(190);
				match(TK_LPARENT);
				setState(191);
				varModifier();
				setState(192);
				variableDeclList();
				setState(193);
				match(TK_SEMICOLON);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
					{
					setState(194);
					expressionSequence();
					}
				}

				setState(197);
				match(TK_SEMICOLON);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
					{
					setState(198);
					expressionSequence();
					}
				}

				setState(201);
				match(TK_RPARENT);
				setState(202);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TK_FOR);
				setState(205);
				match(TK_LPARENT);
				setState(206);
				expression(0);
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				expressionSequence();
				setState(209);
				match(TK_RPARENT);
				setState(210);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(TK_FOR);
				setState(213);
				match(TK_LPARENT);
				setState(214);
				varModifier();
				setState(215);
				variableDecl();
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				expressionSequence();
				setState(218);
				match(TK_RPARENT);
				setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(TK_WHILE);
			setState(224);
			match(TK_LPARENT);
			setState(225);
			expressionSequence();
			setState(226);
			match(TK_RPARENT);
			setState(227);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(TK_DO);
			setState(230);
			statement();
			setState(231);
			match(TK_WHILE);
			setState(232);
			match(TK_LPARENT);
			setState(233);
			expressionSequence();
			setState(234);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(TK_SWITCH);
			setState(237);
			match(TK_LPARENT);
			setState(238);
			expressionSequence();
			setState(239);
			match(TK_RPARENT);
			setState(240);
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
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(TK_LCURLY);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_CASE) {
				{
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243);
					caseClause();
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_CASE );
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFAULT) {
				{
				setState(250);
				defaultClause();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_CASE) {
					{
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(251);
						caseClause();
						}
						}
						setState(254); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TK_CASE );
					}
				}

				}
			}

			setState(260);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TK_CASE);
			setState(263);
			expressionSequence();
			setState(264);
			match(TK_COLON);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (TK_SEMICOLON - 85)) | (1L << (TK_LPARENT - 85)) | (1L << (TK_LBRACKET - 85)) | (1L << (TK_LCURLY - 85)) | (1L << (TK_IDENT - 85)))) != 0)) {
				{
				setState(265);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(TK_DEFAULT);
			setState(269);
			match(TK_COLON);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (TK_SEMICOLON - 85)) | (1L << (TK_LPARENT - 85)) | (1L << (TK_LBRACKET - 85)) | (1L << (TK_LCURLY - 85)) | (1L << (TK_IDENT - 85)))) != 0)) {
				{
				setState(270);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ABSTRACT) {
				{
				setState(273);
				match(TK_ABSTRACT);
				}
			}

			setState(276);
			match(TK_CLASS);
			setState(277);
			match(TK_IDENT);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(278);
				typeParameters();
				}
			}

			setState(281);
			classHeritage();
			setState(282);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitClassHeritage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(284);
				classExtendsClause();
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IMPLEMENTS) {
				{
				setState(287);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitClassExtendsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendsClauseContext classExtendsClause() throws RecognitionException {
		ClassExtendsClauseContext _localctx = new ClassExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(TK_EXTENDS);
			setState(291);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(TK_IMPLEMENTS);
			setState(294);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(TK_LCURLY);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_READ_ONLY) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_CONSTRUCTOR) | (1L << TK_ASYNC) | (1L << TK_STATIC) | (1L << TK_GET) | (1L << TK_SET) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (TK_SEMICOLON - 85)) | (1L << (TK_LPARENT - 85)) | (1L << (TK_LBRACKET - 85)) | (1L << (TK_LCURLY - 85)) | (1L << (TK_IDENT - 85)))) != 0)) {
				{
				{
				setState(297);
				classElement();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classElement);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				memberDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				indexMemberDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
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
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public AbstractDeclContext abstractDecl() {
			return getRuleContext(AbstractDeclContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDecl);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				propertyMemberBase();
				setState(312);
				propertyName();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_QMARK) {
					{
					setState(313);
					match(TK_QMARK);
					}
				}

				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(316);
					typeAnnotation();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_EQ) {
					{
					setState(319);
					initializer();
					}
				}

				setState(322);
				match(TK_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				propertyMemberBase();
				setState(325);
				propertyName();
				setState(326);
				callSignature();
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LCURLY:
					{
					{
					setState(327);
					match(TK_LCURLY);
					setState(328);
					functionBody();
					setState(329);
					match(TK_RCURLY);
					}
					}
					break;
				case TK_SEMICOLON:
					{
					setState(331);
					match(TK_SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				propertyMemberBase();
				setState(337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_GET:
					{
					setState(335);
					getter();
					}
					break;
				case TK_SET:
					{
					setState(336);
					setter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(TK_GET);
			setState(343);
			propertyName();
			setState(344);
			match(TK_LPARENT);
			setState(345);
			match(TK_RPARENT);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(346);
				typeAnnotation();
				}
			}

			setState(349);
			match(TK_LCURLY);
			setState(350);
			functionBody();
			setState(351);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(TK_SET);
			setState(354);
			propertyName();
			setState(355);
			match(TK_LPARENT);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(356);
				match(TK_IDENT);
				}
				break;
			case TK_LBRACKET:
				{
				setState(357);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				{
				setState(358);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(361);
				typeAnnotation();
				}
			}

			setState(364);
			match(TK_RPARENT);
			setState(365);
			match(TK_LCURLY);
			setState(366);
			functionBody();
			setState(367);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitAbstractDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclContext abstractDecl() throws RecognitionException {
		AbstractDeclContext _localctx = new AbstractDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstractDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(TK_ABSTRACT);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(370);
				match(TK_IDENT);
				setState(371);
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
				setState(372);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitIndexMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexMemberDeclContext indexMemberDecl() throws RecognitionException {
		IndexMemberDeclContext _localctx = new IndexMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_indexMemberDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(TK_LBRACKET);
			setState(376);
			match(TK_IDENT);
			setState(377);
			match(TK_COLON);
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==TK_STRING || _la==TK_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(379);
			match(TK_RBRACKET);
			setState(380);
			typeAnnotation();
			setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitPropertyMemberBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyMemberBaseContext propertyMemberBase() throws RecognitionException {
		PropertyMemberBaseContext _localctx = new PropertyMemberBaseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_propertyMemberBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ASYNC) {
				{
				setState(383);
				match(TK_ASYNC);
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(386);
				accessModifier();
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_STATIC) {
				{
				setState(389);
				match(TK_STATIC);
				}
			}

			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(392);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(395);
				accessModifier();
				}
			}

			setState(398);
			match(TK_CONSTRUCTOR);
			setState(399);
			match(TK_LPARENT);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(400);
				formalParameterList();
				}
			}

			setState(403);
			match(TK_RPARENT);
			setState(404);
			match(TK_LCURLY);
			setState(405);
			functionBody();
			setState(406);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(TK_FUNCTION);
			setState(409);
			match(TK_IDENT);
			setState(410);
			callSignature();
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LCURLY:
				{
				{
				setState(411);
				match(TK_LCURLY);
				setState(412);
				functionBody();
				setState(413);
				match(TK_RCURLY);
				}
				}
				break;
			case TK_SEMICOLON:
				{
				setState(415);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(TK_CONTINUE);
			setState(419);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(TK_BREAK);
			setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(TK_RETURN);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
				{
				setState(425);
				expressionSequence();
				}
			}

			setState(428);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitCallSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSignatureContext callSignature() throws RecognitionException {
		CallSignatureContext _localctx = new CallSignatureContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(430);
				typeParameters();
				}
			}

			setState(433);
			match(TK_LPARENT);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (TK_LBRACKET - 88)) | (1L << (TK_LCURLY - 88)) | (1L << (TK_IDENT - 88)))) != 0)) {
				{
				setState(434);
				parameterList();
				}
			}

			setState(437);
			match(TK_RPARENT);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(438);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			parameter();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(442);
				match(TK_COMMA);
				setState(443);
				parameter();
				}
				}
				setState(448);
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
		public OptionalParameterContext optionalParameter() {
			return getRuleContext(OptionalParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameter);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				requiredParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				optionalParameter();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitRequiredParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(453);
				accessModifier();
				}
			}

			setState(456);
			identifierOrPattern();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(457);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitOptionalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParameterContext optionalParameter() throws RecognitionException {
		OptionalParameterContext _localctx = new OptionalParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_optionalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(460);
				accessModifier();
				}
			}

			setState(463);
			identifierOrPattern();
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_QMARK:
				{
				setState(464);
				match(TK_QMARK);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(465);
					typeAnnotation();
					}
				}

				}
				break;
			case TK_EQ:
			case TK_COLON:
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(468);
					typeAnnotation();
					}
				}

				setState(471);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitIdentifierOrPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrPatternContext identifierOrPattern() throws RecognitionException {
		IdentifierOrPatternContext _localctx = new IdentifierOrPatternContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifierOrPattern);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				identifierOrReservedWord();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitIdentifierOrReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrReservedWordContext identifierOrReservedWord() throws RecognitionException {
		IdentifierOrReservedWordContext _localctx = new IdentifierOrReservedWordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_identifierOrReservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(TK_IF);
			setState(484);
			match(TK_LPARENT);
			setState(485);
			expressionSequence();
			setState(486);
			match(TK_RPARENT);
			setState(487);
			statement();
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(488);
				match(TK_ELSE);
				setState(489);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			expression(0);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(493);
				match(TK_COMMA);
				setState(494);
				expression(0);
				}
				}
				setState(499);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			expression(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(503);
				accessModifier();
				}
			}

			setState(506);
			varModifier();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(507);
				match(TK_READ_ONLY);
				}
			}

			setState(510);
			variableDeclList();
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(511);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitVariableDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclListContext variableDeclList() throws RecognitionException {
		VariableDeclListContext _localctx = new VariableDeclListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			variableDecl();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(515);
				match(TK_COMMA);
				setState(516);
				variableDecl();
				}
				}
				setState(521);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(TK_IDENT);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(523);
				typeAnnotation();
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(526);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(TK_EQ);
			setState(530);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitArrayLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralEmptyAltContext extends ArrayLiteralContext {
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public ArrayLiteralEmptyAltContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitArrayLiteralEmptyAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayLiteral);
		int _la;
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new ArrayLiteralEmptyAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(TK_LBRACKET);
				setState(533);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(TK_LBRACKET);
				setState(535);
				arrayElement();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(536);
					match(TK_COMMA);
					setState(537);
					arrayElement();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayElement);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitObjLiteralEmpty(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitObjLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_objectLiteral);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new ObjLiteralEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(TK_LCURLY);
				setState(552);
				match(TK_RCURLY);
				}
				break;
			case 2:
				_localctx = new ObjLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(TK_LCURLY);
				setState(554);
				propertyAssign();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(555);
					match(TK_COMMA);
					setState(556);
					propertyAssign();
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(562);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitPropertyAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignContext propertyAssign() throws RecognitionException {
		PropertyAssignContext _localctx = new PropertyAssignContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_propertyAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			propertyName();
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==TK_EQ || _la==TK_COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(568);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_propertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(TK_COLON);
			setState(573);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeName);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				parametricType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				simpleType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitParametricType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametricTypeContext parametricType() throws RecognitionException {
		ParametricTypeContext _localctx = new ParametricTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parametricType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			simpleType();
			setState(583);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_simpleType);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_STRING:
			case TK_BOOLEAN:
			case TK_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				primitiveType();
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		return arrayType(0);
	}

	private ArrayTypeContext arrayType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, _parentState);
		ArrayTypeContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(592);
			simpleType();
			setState(593);
			match(TK_LBRACKET);
			setState(594);
			match(TK_RBRACKET);
			}
			_ctx.stop = _input.LT(-1);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(596);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(597);
					match(TK_LBRACKET);
					setState(598);
					match(TK_RBRACKET);
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(TK_LESS);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << TK_BOOLEAN) | (1L << TK_NUMBER))) != 0) || _la==TK_IDENT) {
				{
				setState(605);
				typeParameterList();
				}
			}

			setState(608);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			typeParameter();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(611);
				match(TK_COMMA);
				setState(612);
				typeParameter();
				}
				}
				setState(617);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			typeName();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(619);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExtendsConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsConstraintContext extendsConstraint() throws RecognitionException {
		ExtendsConstraintContext _localctx = new ExtendsConstraintContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_extendsConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(TK_EXTENDS);
			setState(623);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionCall);
		int _la;
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(TK_IDENT);
				setState(632);
				match(TK_LPARENT);
				setState(633);
				expressionSequence();
				setState(634);
				match(TK_RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(TK_IDENT);
				setState(637);
				match(TK_LPARENT);
				setState(638);
				match(TK_RPARENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				match(TK_LPARENT);
				setState(640);
				functionExpressionDecl();
				setState(641);
				match(TK_RPARENT);
				setState(642);
				match(TK_LPARENT);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
					{
					setState(643);
					expressionSequence();
					}
				}

				setState(646);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitFunctionExpressionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionDeclContext functionExpressionDecl() throws RecognitionException {
		FunctionExpressionDeclContext _localctx = new FunctionExpressionDeclContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionExpressionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(TK_FUNCTION);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IDENT) {
				{
				setState(651);
				match(TK_IDENT);
				}
			}

			setState(654);
			match(TK_LPARENT);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(655);
				formalParameterList();
				}
			}

			setState(658);
			match(TK_RPARENT);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(659);
				typeAnnotation();
				}
			}

			setState(662);
			match(TK_LCURLY);
			setState(663);
			functionBody();
			setState(664);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TK_PLUS_ASIGN - 61)) | (1L << (TK_MINUS_ASIGN - 61)) | (1L << (TK_STAR_ASIGN - 61)) | (1L << (TK_SLASH_ASIGN - 61)) | (1L << (TK_AND_ASIGN - 61)) | (1L << (TK_OR_ASIGN - 61)) | (1L << (TK_PERCENT_ASIGN - 61)) | (1L << (TK_EQ - 61)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprBinAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdentifierContext extends ExpressionContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public ExprIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprObjectLiteralContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ExprObjectLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusOpContext extends ExpressionContext {
		public TerminalNode TK_PLUS() { return getToken(TypeScriptParser.TK_PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPlusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprPlusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExpressionContext {
		public TerminalNode TK_NOT() { return getToken(TypeScriptParser.TK_NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprDivAsig(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprOrAsig(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprLogicAnd(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprMinusAsig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusPlusOpContext extends ExpressionContext {
		public TerminalNode TK_PLUSPLUS() { return getToken(TypeScriptParser.TK_PLUSPLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPlusPlusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprPlusPlusOp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprEquality(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprAndAsig(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprBinOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusMinusOpContext extends ExpressionContext {
		public TerminalNode TK_MINUSMINUS() { return getToken(TypeScriptParser.TK_MINUSMINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprMinusMinusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprMinusMinusOp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprAsig(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprMultAsig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusOpContext extends ExpressionContext {
		public TerminalNode TK_MINUS() { return getToken(TypeScriptParser.TK_MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprMinusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPrimitiveLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprPrimitiveLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprPrimitiveLiteral(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprDotIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentContext extends ExpressionContext {
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public ExprParentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprParent(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprObjectIndex(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprLogicOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFuncionObjectContext extends ExpressionContext {
		public FunctionExpressionDeclContext functionExpressionDecl() {
			return getRuleContext(FunctionExpressionDeclContext.class,0);
		}
		public ExprFuncionObjectContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprFuncionObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayLiteralContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExprArrayLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpMinusMinusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_MINUSMINUS() { return getToken(TypeScriptParser.TK_MINUSMINUS, 0); }
		public ExprOpMinusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprOpMinusMinus(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprComparator(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprTernaryOperator(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprMultDivPerc(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprSumSubs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprPercentAsig(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprPlusAsig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBinaryNotContext extends ExpressionContext {
		public TerminalNode TK_BINNOT() { return getToken(TypeScriptParser.TK_BINNOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprBinaryNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprBinaryNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpPlusPlusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PLUSPLUS() { return getToken(TypeScriptParser.TK_PLUSPLUS, 0); }
		public ExprOpPlusPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprOpPlusPlus(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprDotFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNewContext extends ExpressionContext {
		public TerminalNode TK_NEW() { return getToken(TypeScriptParser.TK_NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprNewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprThisContext extends ExpressionContext {
		public TerminalNode TK_THIS() { return getToken(TypeScriptParser.TK_THIS, 0); }
		public ExprThisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitExprThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFuncionObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(669);
				functionExpressionDecl();
				}
				break;
			case 2:
				{
				_localctx = new ExprPlusPlusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(670);
				match(TK_PLUSPLUS);
				setState(671);
				expression(33);
				}
				break;
			case 3:
				{
				_localctx = new ExprMinusMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(672);
				match(TK_MINUSMINUS);
				setState(673);
				expression(32);
				}
				break;
			case 4:
				{
				_localctx = new ExprPlusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(674);
				match(TK_PLUS);
				setState(675);
				expression(29);
				}
				break;
			case 5:
				{
				_localctx = new ExprMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(676);
				match(TK_MINUS);
				setState(677);
				expression(28);
				}
				break;
			case 6:
				{
				_localctx = new ExprBinaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(678);
				match(TK_BINNOT);
				setState(679);
				expression(27);
				}
				break;
			case 7:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(680);
				match(TK_NOT);
				setState(681);
				expression(26);
				}
				break;
			case 8:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				functionCall();
				}
				break;
			case 9:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(683);
				match(TK_LPARENT);
				setState(684);
				expressionSequence();
				setState(685);
				match(TK_RPARENT);
				}
				break;
			case 10:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(687);
				match(TK_NEW);
				setState(688);
				functionCall();
				}
				break;
			case 11:
				{
				_localctx = new ExprArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(689);
				arrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new ExprObjectLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(690);
				objectLiteral();
				}
				break;
			case 13:
				{
				_localctx = new ExprPrimitiveLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(691);
				literal();
				}
				break;
			case 14:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(692);
				match(TK_IDENT);
				}
				break;
			case 15:
				{
				_localctx = new ExprThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(693);
				match(TK_THIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(765);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivPercContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(697);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_SLASH) | (1L << TK_PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(698);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new ExprSumSubsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(700);
						_la = _input.LA(1);
						if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(701);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new ExprComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(703);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (TK_LESS - 77)) | (1L << (TK_GREAT - 77)) | (1L << (TK_LESSEQ - 77)) | (1L << (TK_GREATEQ - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(704);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(706);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TK_EQEQ - 69)) | (1L << (TK_NOTEQ - 69)) | (1L << (TK_IDENTEQ - 69)) | (1L << (TK_IDENTNOTEQ - 69)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(707);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new ExprBinAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(709);
						match(TK_BIN_AND);
						setState(710);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new ExprBinOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(712);
						match(TK_BIN_OR);
						setState(713);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new ExprLogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(715);
						match(TK_LOGIC_AND);
						setState(716);
						expression(20);
						}
						break;
					case 8:
						{
						_localctx = new ExprLogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(718);
						match(TK_LOGIC_OR);
						setState(719);
						expression(19);
						}
						break;
					case 9:
						{
						_localctx = new ExprTernaryOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(721);
						match(TK_QMARK);
						setState(722);
						expression(0);
						setState(723);
						match(TK_COLON);
						setState(724);
						expression(18);
						}
						break;
					case 10:
						{
						_localctx = new ExprAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(727);
						match(TK_EQ);
						setState(728);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new ExprPlusAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(730);
						match(TK_PLUS_ASIGN);
						setState(731);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ExprMinusAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(733);
						match(TK_MINUS_ASIGN);
						setState(734);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new ExprMultAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(736);
						match(TK_STAR_ASIGN);
						setState(737);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new ExprDivAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(739);
						match(TK_SLASH_ASIGN);
						setState(740);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new ExprPercentAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(741);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(742);
						match(TK_PERCENT_ASIGN);
						setState(743);
						expression(10);
						}
						break;
					case 16:
						{
						_localctx = new ExprAndAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(745);
						match(TK_AND_ASIGN);
						setState(746);
						expression(9);
						}
						break;
					case 17:
						{
						_localctx = new ExprOrAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(748);
						match(TK_OR_ASIGN);
						setState(749);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new ExprObjectIndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(751);
						match(TK_LBRACKET);
						setState(752);
						expressionSequence();
						setState(753);
						match(TK_RBRACKET);
						}
						break;
					case 19:
						{
						_localctx = new ExprDotIdentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(755);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(756);
						match(TK_POINT);
						setState(757);
						identifier();
						}
						break;
					case 20:
						{
						_localctx = new ExprDotFunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(758);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(759);
						match(TK_POINT);
						setState(760);
						functionCall();
						}
						break;
					case 21:
						{
						_localctx = new ExprOpPlusPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(761);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(762);
						match(TK_PLUSPLUS);
						}
						break;
					case 22:
						{
						_localctx = new ExprOpMinusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(764);
						match(TK_MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			formalParameterArg();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(771);
				match(TK_COMMA);
				setState(772);
				formalParameterArg();
				}
				}
				setState(777);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_EXPORT) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (TK_SEMICOLON - 85)) | (1L << (TK_LPARENT - 85)) | (1L << (TK_LBRACKET - 85)) | (1L << (TK_LCURLY - 85)) | (1L << (TK_IDENT - 85)))) != 0)) {
				{
				{
				setState(778);
				sourceElem();
				}
				}
				setState(783);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitSourceElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElemContext sourceElem() throws RecognitionException {
		SourceElemContext _localctx = new SourceElemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sourceElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXPORT) {
				{
				setState(784);
				match(TK_EXPORT);
				}
			}

			setState(787);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(789);
				accessModifier();
				}
			}

			setState(792);
			identifierOrKeyword();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_QMARK) {
				{
				setState(793);
				match(TK_QMARK);
				}
			}

			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(796);
				typeAnnotation();
				}
			}

			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(799);
				match(TK_EQ);
				setState(800);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitIdentifierOrKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrKeywordContext identifierOrKeyword() throws RecognitionException {
		IdentifierOrKeywordContext _localctx = new IdentifierOrKeywordContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifierOrKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptVisitor ) return ((TypeScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
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
		case 54:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 65:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u032a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\3\6\3\u0097\n\3\r\3\16\3\u0098\3\4\3\4\5\4\u009d\n\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00af"+
		"\n\5\3\6\3\6\3\6\5\6\u00b4\n\6\3\6\3\6\5\6\u00b8\n\6\3\6\3\6\5\6\u00bc"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c6\n\6\3\6\3\6\5\6\u00ca\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00e0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\6\n\u00f7\n\n\r\n\16\n\u00f8"+
		"\5\n\u00fb\n\n\3\n\3\n\6\n\u00ff\n\n\r\n\16\n\u0100\5\n\u0103\n\n\5\n"+
		"\u0105\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u010d\n\13\3\f\3\f\3\f\5\f"+
		"\u0112\n\f\3\r\5\r\u0115\n\r\3\r\3\r\3\r\5\r\u011a\n\r\3\r\3\r\3\r\3\16"+
		"\5\16\u0120\n\16\3\16\5\16\u0123\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\7\21\u012d\n\21\f\21\16\21\u0130\13\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\5\22\u0138\n\22\3\23\3\23\3\23\5\23\u013d\n\23\3\23\5\23\u0140"+
		"\n\23\3\23\5\23\u0143\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u014f\n\23\3\23\3\23\3\23\5\23\u0154\n\23\3\23\5\23\u0157\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u015e\n\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u016a\n\25\3\25\5\25\u016d\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0178\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u0183\n\30\3\30\5\30\u0186\n\30\3"+
		"\30\5\30\u0189\n\30\3\30\5\30\u018c\n\30\3\31\5\31\u018f\n\31\3\31\3\31"+
		"\3\31\5\31\u0194\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u01a3\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u01ad\n\35\3\35\3\35\3\36\5\36\u01b2\n\36\3\36\3\36\5\36\u01b6\n"+
		"\36\3\36\3\36\5\36\u01ba\n\36\3\37\3\37\3\37\7\37\u01bf\n\37\f\37\16\37"+
		"\u01c2\13\37\3 \3 \5 \u01c6\n \3!\5!\u01c9\n!\3!\3!\5!\u01cd\n!\3\"\5"+
		"\"\u01d0\n\"\3\"\3\"\3\"\5\"\u01d5\n\"\3\"\5\"\u01d8\n\"\3\"\5\"\u01db"+
		"\n\"\3#\3#\3#\5#\u01e0\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u01ed\n"+
		"&\3\'\3\'\3\'\7\'\u01f2\n\'\f\'\16\'\u01f5\13\'\3(\3(\3(\3)\5)\u01fb\n"+
		")\3)\3)\5)\u01ff\n)\3)\3)\5)\u0203\n)\3*\3*\3*\7*\u0208\n*\f*\16*\u020b"+
		"\13*\3+\3+\5+\u020f\n+\3+\5+\u0212\n+\3,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u021d"+
		"\n-\f-\16-\u0220\13-\3-\3-\5-\u0224\n-\3.\3.\5.\u0228\n.\3/\3/\3/\3/\3"+
		"/\3/\7/\u0230\n/\f/\16/\u0233\13/\3/\3/\5/\u0237\n/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\5\64\u0247\n\64\3\65"+
		"\3\65\3\65\3\66\3\66\5\66\u024e\n\66\3\67\3\67\38\38\38\38\38\38\38\3"+
		"8\78\u025a\n8\f8\168\u025d\138\39\39\59\u0261\n9\39\39\3:\3:\3:\7:\u0268"+
		"\n:\f:\16:\u026b\13:\3;\3;\5;\u026f\n;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0287\n@\3@\3@\5@\u028b\n@\3A\3"+
		"A\5A\u028f\nA\3A\3A\5A\u0293\nA\3A\3A\5A\u0297\nA\3A\3A\3A\3A\3B\3B\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\5C\u02b9\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\7C\u0300\nC\fC\16C\u0303\13C\3D\3D\3D\7D\u0308\nD"+
		"\fD\16D\u030b\13D\3E\7E\u030e\nE\fE\16E\u0311\13E\3F\5F\u0314\nF\3F\3"+
		"F\3G\5G\u0319\nG\3G\3G\5G\u031d\nG\3G\5G\u0320\nG\3G\3G\5G\u0324\nG\3"+
		"H\3H\3I\3I\3I\2\4n\u0084J\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\2\20\3\2\33\34\4\2\f\f\17\17\4\2"+
		"FFVV\5\2\3\3\65\65``\4\2\f\f\16\17\3\2\5\7\3\2\b\n\3\2?F\3\28:\3\2\66"+
		"\67\3\2OR\3\2GJ\4\2\24\25``\5\2\3\3,-\65\65\2\u036e\2\u0092\3\2\2\2\4"+
		"\u0096\3\2\2\2\6\u009a\3\2\2\2\b\u00ae\3\2\2\2\n\u00df\3\2\2\2\f\u00e1"+
		"\3\2\2\2\16\u00e7\3\2\2\2\20\u00ee\3\2\2\2\22\u00f4\3\2\2\2\24\u0108\3"+
		"\2\2\2\26\u010e\3\2\2\2\30\u0114\3\2\2\2\32\u011f\3\2\2\2\34\u0124\3\2"+
		"\2\2\36\u0127\3\2\2\2 \u012a\3\2\2\2\"\u0137\3\2\2\2$\u0156\3\2\2\2&\u0158"+
		"\3\2\2\2(\u0163\3\2\2\2*\u0173\3\2\2\2,\u0179\3\2\2\2.\u0182\3\2\2\2\60"+
		"\u018e\3\2\2\2\62\u019a\3\2\2\2\64\u01a4\3\2\2\2\66\u01a7\3\2\2\28\u01aa"+
		"\3\2\2\2:\u01b1\3\2\2\2<\u01bb\3\2\2\2>\u01c5\3\2\2\2@\u01c8\3\2\2\2B"+
		"\u01cf\3\2\2\2D\u01df\3\2\2\2F\u01e1\3\2\2\2H\u01e3\3\2\2\2J\u01e5\3\2"+
		"\2\2L\u01ee\3\2\2\2N\u01f6\3\2\2\2P\u01fa\3\2\2\2R\u0204\3\2\2\2T\u020c"+
		"\3\2\2\2V\u0213\3\2\2\2X\u0223\3\2\2\2Z\u0227\3\2\2\2\\\u0236\3\2\2\2"+
		"^\u0238\3\2\2\2`\u023c\3\2\2\2b\u023e\3\2\2\2d\u0241\3\2\2\2f\u0246\3"+
		"\2\2\2h\u0248\3\2\2\2j\u024d\3\2\2\2l\u024f\3\2\2\2n\u0251\3\2\2\2p\u025e"+
		"\3\2\2\2r\u0264\3\2\2\2t\u026c\3\2\2\2v\u0270\3\2\2\2x\u0273\3\2\2\2z"+
		"\u0275\3\2\2\2|\u0277\3\2\2\2~\u028a\3\2\2\2\u0080\u028c\3\2\2\2\u0082"+
		"\u029c\3\2\2\2\u0084\u02b8\3\2\2\2\u0086\u0304\3\2\2\2\u0088\u030f\3\2"+
		"\2\2\u008a\u0313\3\2\2\2\u008c\u0318\3\2\2\2\u008e\u0325\3\2\2\2\u0090"+
		"\u0327\3\2\2\2\u0092\u0093\5\4\3\2\u0093\u0094\7\2\2\3\u0094\3\3\2\2\2"+
		"\u0095\u0097\5\b\5\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\5\3\2\2\2\u009a\u009c\7^\2\2\u009b"+
		"\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\7_\2\2\u009f\7\3\2\2\2\u00a0\u00af\5\6\4\2\u00a1\u00af"+
		"\5P)\2\u00a2\u00af\5J&\2\u00a3\u00af\5\n\6\2\u00a4\u00af\5\f\7\2\u00a5"+
		"\u00af\5\16\b\2\u00a6\u00af\5\20\t\2\u00a7\u00af\5\30\r\2\u00a8\u00af"+
		"\5\64\33\2\u00a9\u00af\5\66\34\2\u00aa\u00af\58\35\2\u00ab\u00af\5\62"+
		"\32\2\u00ac\u00af\5N(\2\u00ad\u00af\5H%\2\u00ae\u00a0\3\2\2\2\u00ae\u00a1"+
		"\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae"+
		"\u00a5\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2"+
		"\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\t\3\2\2\2\u00b0\u00b1\7\32\2"+
		"\2\u00b1\u00b3\7X\2\2\u00b2\u00b4\5L\'\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7W\2\2\u00b6\u00b8\5L\'\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7W"+
		"\2\2\u00ba\u00bc\5L\'\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7Y\2\2\u00be\u00e0\5\b\5\2\u00bf\u00c0\7\32"+
		"\2\2\u00c0\u00c1\7X\2\2\u00c1\u00c2\5z>\2\u00c2\u00c3\5R*\2\u00c3\u00c5"+
		"\7W\2\2\u00c4\u00c6\5L\'\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\7W\2\2\u00c8\u00ca\5L\'\2\u00c9\u00c8\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7Y\2\2\u00cc\u00cd"+
		"\5\b\5\2\u00cd\u00e0\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\7X\2\2\u00d0"+
		"\u00d1\5\u0084C\2\u00d1\u00d2\t\2\2\2\u00d2\u00d3\5L\'\2\u00d3\u00d4\7"+
		"Y\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00e0\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7"+
		"\u00d8\7X\2\2\u00d8\u00d9\5z>\2\u00d9\u00da\5T+\2\u00da\u00db\t\2\2\2"+
		"\u00db\u00dc\5L\'\2\u00dc\u00dd\7Y\2\2\u00dd\u00de\5\b\5\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00b0\3\2\2\2\u00df\u00bf\3\2\2\2\u00df\u00ce\3\2\2\2\u00df"+
		"\u00d6\3\2\2\2\u00e0\13\3\2\2\2\u00e1\u00e2\7\36\2\2\u00e2\u00e3\7X\2"+
		"\2\u00e3\u00e4\5L\'\2\u00e4\u00e5\7Y\2\2\u00e5\u00e6\5\b\5\2\u00e6\r\3"+
		"\2\2\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\5\b\5\2\u00e9\u00ea\7\36\2\2\u00ea"+
		"\u00eb\7X\2\2\u00eb\u00ec\5L\'\2\u00ec\u00ed\7Y\2\2\u00ed\17\3\2\2\2\u00ee"+
		"\u00ef\7(\2\2\u00ef\u00f0\7X\2\2\u00f0\u00f1\5L\'\2\u00f1\u00f2\7Y\2\2"+
		"\u00f2\u00f3\5\22\n\2\u00f3\21\3\2\2\2\u00f4\u00fa\7^\2\2\u00f5\u00f7"+
		"\5\24\13\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u0104\3\2\2\2\u00fc\u0102\5\26\f\2\u00fd\u00ff\5\24\13"+
		"\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\7_\2\2\u0107\23\3\2\2\2\u0108\u0109\7)\2\2\u0109\u010a"+
		"\5L\'\2\u010a\u010c\7V\2\2\u010b\u010d\5\4\3\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\25\3\2\2\2\u010e\u010f\7*\2\2\u010f\u0111\7V\2\2"+
		"\u0110\u0112\5\4\3\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\27"+
		"\3\2\2\2\u0113\u0115\7!\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\7\37\2\2\u0117\u0119\7`\2\2\u0118\u011a\5p"+
		"9\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\5\32\16\2\u011c\u011d\5 \21\2\u011d\31\3\2\2\2\u011e\u0120\5\34"+
		"\17\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u0123\5\36\20\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\33\3\2"+
		"\2\2\u0124\u0125\7\20\2\2\u0125\u0126\5l\67\2\u0126\35\3\2\2\2\u0127\u0128"+
		"\7 \2\2\u0128\u0129\5l\67\2\u0129\37\3\2\2\2\u012a\u012e\7^\2\2\u012b"+
		"\u012d\5\"\22\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\7_\2\2\u0132!\3\2\2\2\u0133\u0138\5\60\31\2\u0134\u0138\5$\23\2"+
		"\u0135\u0138\5,\27\2\u0136\u0138\5\b\5\2\u0137\u0133\3\2\2\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138#\3\2\2\2\u0139"+
		"\u013a\5.\30\2\u013a\u013c\5`\61\2\u013b\u013d\7U\2\2\u013c\u013b\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\5b\62\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5V"+
		",\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7W\2\2\u0145\u0157\3\2\2\2\u0146\u0147\5.\30\2\u0147\u0148\5`\61"+
		"\2\u0148\u014e\5:\36\2\u0149\u014a\7^\2\2\u014a\u014b\5\u0088E\2\u014b"+
		"\u014c\7_\2\2\u014c\u014f\3\2\2\2\u014d\u014f\7W\2\2\u014e\u0149\3\2\2"+
		"\2\u014e\u014d\3\2\2\2\u014f\u0157\3\2\2\2\u0150\u0153\5.\30\2\u0151\u0154"+
		"\5&\24\2\u0152\u0154\5(\25\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0157\5*\26\2\u0156\u0139\3\2\2\2\u0156\u0146\3\2"+
		"\2\2\u0156\u0150\3\2\2\2\u0156\u0155\3\2\2\2\u0157%\3\2\2\2\u0158\u0159"+
		"\7%\2\2\u0159\u015a\5`\61\2\u015a\u015b\7X\2\2\u015b\u015d\7Y\2\2\u015c"+
		"\u015e\5b\62\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\7^\2\2\u0160\u0161\5\u0088E\2\u0161\u0162\7_\2\2\u0162"+
		"\'\3\2\2\2\u0163\u0164\7&\2\2\u0164\u0165\5`\61\2\u0165\u0169\7X\2\2\u0166"+
		"\u016a\7`\2\2\u0167\u016a\5X-\2\u0168\u016a\5\\/\2\u0169\u0166\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d"+
		"\5b\62\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\7Y\2\2\u016f\u0170\7^\2\2\u0170\u0171\5\u0088E\2\u0171\u0172\7"+
		"_\2\2\u0172)\3\2\2\2\u0173\u0177\7!\2\2\u0174\u0175\7`\2\2\u0175\u0178"+
		"\5:\36\2\u0176\u0178\5P)\2\u0177\u0174\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"+\3\2\2\2\u0179\u017a\7Z\2\2\u017a\u017b\7`\2\2\u017b\u017c\7V\2\2\u017c"+
		"\u017d\t\3\2\2\u017d\u017e\7[\2\2\u017e\u017f\5b\62\2\u017f\u0180\7W\2"+
		"\2\u0180-\3\2\2\2\u0181\u0183\7#\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3"+
		"\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\5x=\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189\7$\2\2\u0188\u0187\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\7\13\2\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c/\3\2\2\2\u018d\u018f\5x=\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\""+
		"\2\2\u0191\u0193\7X\2\2\u0192\u0194\5\u0086D\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7Y\2\2\u0196\u0197\7^\2"+
		"\2\u0197\u0198\5\u0088E\2\u0198\u0199\7_\2\2\u0199\61\3\2\2\2\u019a\u019b"+
		"\7\23\2\2\u019b\u019c\7`\2\2\u019c\u01a2\5:\36\2\u019d\u019e\7^\2\2\u019e"+
		"\u019f\5\u0088E\2\u019f\u01a0\7_\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\7"+
		"W\2\2\u01a2\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\63\3\2\2\2\u01a4\u01a5"+
		"\7\30\2\2\u01a5\u01a6\7W\2\2\u01a6\65\3\2\2\2\u01a7\u01a8\7\31\2\2\u01a8"+
		"\u01a9\7W\2\2\u01a9\67\3\2\2\2\u01aa\u01ac\7\27\2\2\u01ab\u01ad\5L\'\2"+
		"\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\7W\2\2\u01af9\3\2\2\2\u01b0\u01b2\5p9\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\7X\2\2\u01b4\u01b6\5<\37\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\7Y"+
		"\2\2\u01b8\u01ba\5b\62\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		";\3\2\2\2\u01bb\u01c0\5> \2\u01bc\u01bd\7T\2\2\u01bd\u01bf\5> \2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1=\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\5@!\2\u01c4\u01c6"+
		"\5B\"\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6?\3\2\2\2\u01c7\u01c9"+
		"\5x=\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cc\5D#\2\u01cb\u01cd\5b\62\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2"+
		"\2\u01cdA\3\2\2\2\u01ce\u01d0\5x=\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01da\5D#\2\u01d2\u01d4\7U\2\2\u01d3"+
		"\u01d5\5b\62\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01db\3\2"+
		"\2\2\u01d6\u01d8\5b\62\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01db\5V,\2\u01da\u01d2\3\2\2\2\u01da\u01d7\3\2\2"+
		"\2\u01dbC\3\2\2\2\u01dc\u01e0\5F$\2\u01dd\u01e0\5X-\2\u01de\u01e0\5\\"+
		"/\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"E\3\2\2\2\u01e1\u01e2\7`\2\2\u01e2G\3\2\2\2\u01e3\u01e4\7W\2\2\u01e4I"+
		"\3\2\2\2\u01e5\u01e6\7\21\2\2\u01e6\u01e7\7X\2\2\u01e7\u01e8\5L\'\2\u01e8"+
		"\u01e9\7Y\2\2\u01e9\u01ec\5\b\5\2\u01ea\u01eb\7\22\2\2\u01eb\u01ed\5\b"+
		"\5\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edK\3\2\2\2\u01ee\u01f3"+
		"\5\u0084C\2\u01ef\u01f0\7T\2\2\u01f0\u01f2\5\u0084C\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"M\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\5\u0084C\2\u01f7\u01f8\7W\2"+
		"\2\u01f8O\3\2\2\2\u01f9\u01fb\5x=\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\5z>\2\u01fd\u01ff\7\13\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\5R"+
		"*\2\u0201\u0203\7W\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203Q"+
		"\3\2\2\2\u0204\u0209\5T+\2\u0205\u0206\7T\2\2\u0206\u0208\5T+\2\u0207"+
		"\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020aS\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7`\2\2\u020d\u020f"+
		"\5b\62\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210"+
		"\u0212\5V,\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212U\3\2\2\2\u0213"+
		"\u0214\7F\2\2\u0214\u0215\5\u0084C\2\u0215W\3\2\2\2\u0216\u0217\7Z\2\2"+
		"\u0217\u0224\7[\2\2\u0218\u0219\7Z\2\2\u0219\u021e\5Z.\2\u021a\u021b\7"+
		"T\2\2\u021b\u021d\5Z.\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u0222\7[\2\2\u0222\u0224\3\2\2\2\u0223\u0216\3\2\2\2\u0223"+
		"\u0218\3\2\2\2\u0224Y\3\2\2\2\u0225\u0228\5\u0084C\2\u0226\u0228\7`\2"+
		"\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228[\3\2\2\2\u0229\u022a"+
		"\7^\2\2\u022a\u0237\7_\2\2\u022b\u022c\7^\2\2\u022c\u0231\5^\60\2\u022d"+
		"\u022e\7T\2\2\u022e\u0230\5^\60\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2"+
		"\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0234\u0235\7_\2\2\u0235\u0237\3\2\2\2\u0236\u0229\3\2"+
		"\2\2\u0236\u022b\3\2\2\2\u0237]\3\2\2\2\u0238\u0239\5`\61\2\u0239\u023a"+
		"\t\4\2\2\u023a\u023b\5\u0084C\2\u023b_\3\2\2\2\u023c\u023d\t\5\2\2\u023d"+
		"a\3\2\2\2\u023e\u023f\7V\2\2\u023f\u0240\5f\64\2\u0240c\3\2\2\2\u0241"+
		"\u0242\t\6\2\2\u0242e\3\2\2\2\u0243\u0247\5h\65\2\u0244\u0247\5j\66\2"+
		"\u0245\u0247\5n8\2\u0246\u0243\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0245"+
		"\3\2\2\2\u0247g\3\2\2\2\u0248\u0249\5j\66\2\u0249\u024a\5p9\2\u024ai\3"+
		"\2\2\2\u024b\u024e\5d\63\2\u024c\u024e\5l\67\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024c\3\2\2\2\u024ek\3\2\2\2\u024f\u0250\7`\2\2\u0250m\3\2\2\2\u0251"+
		"\u0252\b8\1\2\u0252\u0253\5j\66\2\u0253\u0254\7Z\2\2\u0254\u0255\7[\2"+
		"\2\u0255\u025b\3\2\2\2\u0256\u0257\f\4\2\2\u0257\u0258\7Z\2\2\u0258\u025a"+
		"\7[\2\2\u0259\u0256\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025co\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0260\7O\2\2\u025f"+
		"\u0261\5r:\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\u0263\7P\2\2\u0263q\3\2\2\2\u0264\u0269\5t;\2\u0265\u0266\7T"+
		"\2\2\u0266\u0268\5t;\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026as\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026e\5f\64\2\u026d\u026f\5v<\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2"+
		"\2\u026fu\3\2\2\2\u0270\u0271\7\20\2\2\u0271\u0272\5f\64\2\u0272w\3\2"+
		"\2\2\u0273\u0274\t\7\2\2\u0274y\3\2\2\2\u0275\u0276\t\b\2\2\u0276{\3\2"+
		"\2\2\u0277\u0278\7`\2\2\u0278}\3\2\2\2\u0279\u027a\7`\2\2\u027a\u027b"+
		"\7X\2\2\u027b\u027c\5L\'\2\u027c\u027d\7Y\2\2\u027d\u028b\3\2\2\2\u027e"+
		"\u027f\7`\2\2\u027f\u0280\7X\2\2\u0280\u028b\7Y\2\2\u0281\u0282\7X\2\2"+
		"\u0282\u0283\5\u0080A\2\u0283\u0284\7Y\2\2\u0284\u0286\7X\2\2\u0285\u0287"+
		"\5L\'\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u0289\7Y\2\2\u0289\u028b\3\2\2\2\u028a\u0279\3\2\2\2\u028a\u027e\3\2"+
		"\2\2\u028a\u0281\3\2\2\2\u028b\177\3\2\2\2\u028c\u028e\7\23\2\2\u028d"+
		"\u028f\7`\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u0292\7X\2\2\u0291\u0293\5\u0086D\2\u0292\u0291\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\7Y\2\2\u0295\u0297\5b\62"+
		"\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299"+
		"\7^\2\2\u0299\u029a\5\u0088E\2\u029a\u029b\7_\2\2\u029b\u0081\3\2\2\2"+
		"\u029c\u029d\t\t\2\2\u029d\u0083\3\2\2\2\u029e\u029f\bC\1\2\u029f\u02b9"+
		"\5\u0080A\2\u02a0\u02a1\7=\2\2\u02a1\u02b9\5\u0084C#\u02a2\u02a3\7>\2"+
		"\2\u02a3\u02b9\5\u0084C\"\u02a4\u02a5\7\66\2\2\u02a5\u02b9\5\u0084C\37"+
		"\u02a6\u02a7\7\67\2\2\u02a7\u02b9\5\u0084C\36\u02a8\u02a9\7<\2\2\u02a9"+
		"\u02b9\5\u0084C\35\u02aa\u02ab\7;\2\2\u02ab\u02b9\5\u0084C\34\u02ac\u02b9"+
		"\5~@\2\u02ad\u02ae\7X\2\2\u02ae\u02af\5L\'\2\u02af\u02b0\7Y\2\2\u02b0"+
		"\u02b9\3\2\2\2\u02b1\u02b2\7\'\2\2\u02b2\u02b9\5~@\2\u02b3\u02b9\5X-\2"+
		"\u02b4\u02b9\5\\/\2\u02b5\u02b9\5\u0090I\2\u02b6\u02b9\7`\2\2\u02b7\u02b9"+
		"\7+\2\2\u02b8\u029e\3\2\2\2\u02b8\u02a0\3\2\2\2\u02b8\u02a2\3\2\2\2\u02b8"+
		"\u02a4\3\2\2\2\u02b8\u02a6\3\2\2\2\u02b8\u02a8\3\2\2\2\u02b8\u02aa\3\2"+
		"\2\2\u02b8\u02ac\3\2\2\2\u02b8\u02ad\3\2\2\2\u02b8\u02b1\3\2\2\2\u02b8"+
		"\u02b3\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b8\u02b5\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b8\u02b7\3\2\2\2\u02b9\u0301\3\2\2\2\u02ba\u02bb\f\33\2\2\u02bb"+
		"\u02bc\t\n\2\2\u02bc\u0300\5\u0084C\34\u02bd\u02be\f\32\2\2\u02be\u02bf"+
		"\t\13\2\2\u02bf\u0300\5\u0084C\33\u02c0\u02c1\f\31\2\2\u02c1\u02c2\t\f"+
		"\2\2\u02c2\u0300\5\u0084C\32\u02c3\u02c4\f\30\2\2\u02c4\u02c5\t\r\2\2"+
		"\u02c5\u0300\5\u0084C\31\u02c6\u02c7\f\27\2\2\u02c7\u02c8\7K\2\2\u02c8"+
		"\u0300\5\u0084C\30\u02c9\u02ca\f\26\2\2\u02ca\u02cb\7L\2\2\u02cb\u0300"+
		"\5\u0084C\27\u02cc\u02cd\f\25\2\2\u02cd\u02ce\7M\2\2\u02ce\u0300\5\u0084"+
		"C\26\u02cf\u02d0\f\24\2\2\u02d0\u02d1\7N\2\2\u02d1\u0300\5\u0084C\25\u02d2"+
		"\u02d3\f\23\2\2\u02d3\u02d4\7U\2\2\u02d4\u02d5\5\u0084C\2\u02d5\u02d6"+
		"\7V\2\2\u02d6\u02d7\5\u0084C\24\u02d7\u0300\3\2\2\2\u02d8\u02d9\f\20\2"+
		"\2\u02d9\u02da\7F\2\2\u02da\u0300\5\u0084C\21\u02db\u02dc\f\17\2\2\u02dc"+
		"\u02dd\7?\2\2\u02dd\u0300\5\u0084C\20\u02de\u02df\f\16\2\2\u02df\u02e0"+
		"\7@\2\2\u02e0\u0300\5\u0084C\17\u02e1\u02e2\f\r\2\2\u02e2\u02e3\7A\2\2"+
		"\u02e3\u0300\5\u0084C\16\u02e4\u02e5\f\f\2\2\u02e5\u02e6\7B\2\2\u02e6"+
		"\u0300\5\u0084C\r\u02e7\u02e8\f\13\2\2\u02e8\u02e9\7E\2\2\u02e9\u0300"+
		"\5\u0084C\f\u02ea\u02eb\f\n\2\2\u02eb\u02ec\7C\2\2\u02ec\u0300\5\u0084"+
		"C\13\u02ed\u02ee\f\t\2\2\u02ee\u02ef\7D\2\2\u02ef\u0300\5\u0084C\n\u02f0"+
		"\u02f1\f&\2\2\u02f1\u02f2\7Z\2\2\u02f2\u02f3\5L\'\2\u02f3\u02f4\7[\2\2"+
		"\u02f4\u0300\3\2\2\2\u02f5\u02f6\f%\2\2\u02f6\u02f7\7S\2\2\u02f7\u0300"+
		"\5|?\2\u02f8\u02f9\f$\2\2\u02f9\u02fa\7S\2\2\u02fa\u0300\5~@\2\u02fb\u02fc"+
		"\f!\2\2\u02fc\u0300\7=\2\2\u02fd\u02fe\f \2\2\u02fe\u0300\7>\2\2\u02ff"+
		"\u02ba\3\2\2\2\u02ff\u02bd\3\2\2\2\u02ff\u02c0\3\2\2\2\u02ff\u02c3\3\2"+
		"\2\2\u02ff\u02c6\3\2\2\2\u02ff\u02c9\3\2\2\2\u02ff\u02cc\3\2\2\2\u02ff"+
		"\u02cf\3\2\2\2\u02ff\u02d2\3\2\2\2\u02ff\u02d8\3\2\2\2\u02ff\u02db\3\2"+
		"\2\2\u02ff\u02de\3\2\2\2\u02ff\u02e1\3\2\2\2\u02ff\u02e4\3\2\2\2\u02ff"+
		"\u02e7\3\2\2\2\u02ff\u02ea\3\2\2\2\u02ff\u02ed\3\2\2\2\u02ff\u02f0\3\2"+
		"\2\2\u02ff\u02f5\3\2\2\2\u02ff\u02f8\3\2\2\2\u02ff\u02fb\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302\u0085\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0309\5\u008cG\2\u0305"+
		"\u0306\7T\2\2\u0306\u0308\5\u008cG\2\u0307\u0305\3\2\2\2\u0308\u030b\3"+
		"\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0087\3\2\2\2\u030b"+
		"\u0309\3\2\2\2\u030c\u030e\5\u008aF\2\u030d\u030c\3\2\2\2\u030e\u0311"+
		"\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0089\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0312\u0314\7\26\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3"+
		"\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\5\b\5\2\u0316\u008b\3\2\2\2\u0317"+
		"\u0319\5x=\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2"+
		"\2\u031a\u031c\5\u008eH\2\u031b\u031d\7U\2\2\u031c\u031b\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0320\5b\62\2\u031f\u031e\3\2"+
		"\2\2\u031f\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u0322\7F\2\2\u0322"+
		"\u0324\5\u0084C\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u008d"+
		"\3\2\2\2\u0325\u0326\t\16\2\2\u0326\u008f\3\2\2\2\u0327\u0328\t\17\2\2"+
		"\u0328\u0091\3\2\2\2X\u0098\u009c\u00ae\u00b3\u00b7\u00bb\u00c5\u00c9"+
		"\u00df\u00f8\u00fa\u0100\u0102\u0104\u010c\u0111\u0114\u0119\u011f\u0122"+
		"\u012e\u0137\u013c\u013f\u0142\u014e\u0153\u0156\u015d\u0169\u016c\u0177"+
		"\u0182\u0185\u0188\u018b\u018e\u0193\u01a2\u01ac\u01b1\u01b5\u01b9\u01c0"+
		"\u01c5\u01c8\u01cc\u01cf\u01d4\u01d7\u01da\u01df\u01ec\u01f3\u01fa\u01fe"+
		"\u0202\u0209\u020e\u0211\u021e\u0223\u0227\u0231\u0236\u0246\u024d\u025b"+
		"\u0260\u0269\u026e\u0286\u028a\u028e\u0292\u0296\u02b8\u02ff\u0301\u0309"+
		"\u030f\u0313\u0318\u031c\u031f\u0323";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}