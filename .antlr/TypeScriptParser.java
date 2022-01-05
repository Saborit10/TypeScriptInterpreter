// Generated from /home/luis/Public/CC/TypeScript.g4 by ANTLR 4.8
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
		NUMERIC_LITERAL=1, WS=2, TK_PUBLIC=3, TK_PRIVATE=4, TK_PROTECTED=5, TK_VAR=6, 
		TK_LET=7, TK_CONST=8, TK_READ_ONLY=9, TK_STRING=10, TK_ANY=11, TK_BOOLEAN=12, 
		TK_NUMBER=13, TK_EXTENDS=14, TK_IF=15, TK_ELSE=16, TK_FUNCTION=17, TK_TYPE=18, 
		TK_REQUIRE=19, TK_EXPORT=20, TK_RETURN=21, TK_CONTINUE=22, TK_BREAK=23, 
		TK_FOR=24, TK_IN=25, TK_OF=26, TK_DO=27, TK_WHILE=28, TK_CLASS=29, TK_IMPLEMENTS=30, 
		TK_ABSTRACT=31, TK_CONSTRUCTOR=32, TK_ASYNC=33, TK_STATIC=34, TK_GET=35, 
		TK_SET=36, TK_NEW=37, NULL_LITERAL=38, BOOLEAN_LITERAL=39, DECIMAL_INTEGER_LITERAL=40, 
		DECIMAL_LITERAL=41, EXPONENT_PART=42, HEX_INTEGER_LITERAL=43, OCTAL_INTEGER_LITERAL=44, 
		OCTAL_INTEGER_LITERAL2=45, BINARY_INTEGER_LITERAL=46, STRING_LITERAL=47, 
		TK_PLUS=48, TK_MINUS=49, TK_STAR=50, TK_SLASH=51, TK_PERCENT=52, TK_NOT=53, 
		TK_BINNOT=54, TK_PLUSPLUS=55, TK_MINUSMINUS=56, TK_PLUS_ASIGN=57, TK_MINUS_ASIGN=58, 
		TK_STAR_ASIGN=59, TK_SLASH_ASIGN=60, TK_AND_ASIGN=61, TK_OR_ASIGN=62, 
		TK_PERCENT_ASIGN=63, TK_EQ=64, TK_EQEQ=65, TK_NOTEQ=66, TK_IDENTEQ=67, 
		TK_IDENTNOTEQ=68, TK_BIN_AND=69, TK_BIN_OR=70, TK_LOGIC_AND=71, TK_LOGIC_OR=72, 
		TK_LESS=73, TK_GREAT=74, TK_LESSEQ=75, TK_GREATEQ=76, TK_POINT=77, TK_COMMA=78, 
		TK_QMARK=79, TK_COLON=80, TK_SEMICOLON=81, TK_LPARENT=82, TK_RPARENT=83, 
		TK_LBRACKET=84, TK_RBRACKET=85, TK_DCUOTE=86, TK_SCUOTE=87, TK_LCURLY=88, 
		TK_RCURLY=89, TK_IDENT=90, DOUBLE_STRING_CHARACTER=91, SINGLE_STRING_CHARACTER=92, 
		ESCAPE_SEQUENCE=93, CHARACTER_ESCAPE_SEQUENCE=94, HEX_ESCAPE_SEQUENCE=95, 
		UNICODE_ESCAPE_SEQUENCE=96, EXTENDED_UNICODE_ESCAPE_SEQUENCE=97, SINGLE_ESCAPE_CHARACTER=98, 
		NON_ESCAPE_CHARACTER=99, LINE_CONTINUATION=100, HEX_DIGIT=101, TK_MULTILINE_COMMENT=102, 
		TK_SINGLELINE_COMMENT=103;
	public static final int
		RULE_compilationUnit = 0, RULE_statementList = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_forStatement = 4, RULE_whileStatement = 5, RULE_doStatement = 6, 
		RULE_classStatement = 7, RULE_classHeritage = 8, RULE_classExtendsClause = 9, 
		RULE_implementsClause = 10, RULE_classBody = 11, RULE_classElement = 12, 
		RULE_memberDecl = 13, RULE_getter = 14, RULE_setter = 15, RULE_abstractDecl = 16, 
		RULE_indexMemberDecl = 17, RULE_propertyMemberBase = 18, RULE_constructorDeclaration = 19, 
		RULE_functionStatement = 20, RULE_continueStatement = 21, RULE_breakStatement = 22, 
		RULE_returnStatement = 23, RULE_callSignature = 24, RULE_parameterList = 25, 
		RULE_parameter = 26, RULE_requiredParameter = 27, RULE_optionalParameter = 28, 
		RULE_identifierOrPattern = 29, RULE_identifierOrReservedWord = 30, RULE_emptyStatement = 31, 
		RULE_ifStatement = 32, RULE_expressionSequence = 33, RULE_expressionStatement = 34, 
		RULE_variableStatement = 35, RULE_variableDeclList = 36, RULE_variableDecl = 37, 
		RULE_initializer = 38, RULE_arrayLiteral = 39, RULE_arrayElement = 40, 
		RULE_objectLiteral = 41, RULE_propertyAssign = 42, RULE_propertyName = 43, 
		RULE_typeAnnotation = 44, RULE_primitiveType = 45, RULE_typeName = 46, 
		RULE_parametricType = 47, RULE_simpleType = 48, RULE_referenceType = 49, 
		RULE_arrayType = 50, RULE_typeParameters = 51, RULE_typeParameterList = 52, 
		RULE_typeParameter = 53, RULE_extendsConstraint = 54, RULE_accessModifier = 55, 
		RULE_varModifier = 56, RULE_assignment = 57, RULE_identifier = 58, RULE_attribute = 59, 
		RULE_functionCall = 60, RULE_functionExpressionDecl = 61, RULE_expression = 62, 
		RULE_formalParameterList = 63, RULE_functionBody = 64, RULE_sourceElem = 65, 
		RULE_formalParameterArg = 66, RULE_identifierOrKeyword = 67, RULE_literal = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "statementList", "block", "statement", "forStatement", 
			"whileStatement", "doStatement", "classStatement", "classHeritage", "classExtendsClause", 
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
			"extendsConstraint", "accessModifier", "varModifier", "assignment", "identifier", 
			"attribute", "functionCall", "functionExpressionDecl", "expression", 
			"formalParameterList", "functionBody", "sourceElem", "formalParameterArg", 
			"identifierOrKeyword", "literal"
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
			"'async'", "'static'", "'get'", "'set'", "'new'", "'null'", null, null, 
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'~'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'%='", "'='", "'=='", "'!='", "'==='", "'!=='", "'&'", 
			"'|'", "'&&'", "'||'", "'<'", "'>'", "'<='", "'>='", "'.'", "','", "'?'", 
			"':'", "';'", "'('", "')'", "'['", "']'", "'\"'", "'''", "'{'", "'}'"
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
			"TK_NEW", "NULL_LITERAL", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", 
			"DECIMAL_LITERAL", "EXPONENT_PART", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", 
			"OCTAL_INTEGER_LITERAL2", "BINARY_INTEGER_LITERAL", "STRING_LITERAL", 
			"TK_PLUS", "TK_MINUS", "TK_STAR", "TK_SLASH", "TK_PERCENT", "TK_NOT", 
			"TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", "TK_PLUS_ASIGN", "TK_MINUS_ASIGN", 
			"TK_STAR_ASIGN", "TK_SLASH_ASIGN", "TK_AND_ASIGN", "TK_OR_ASIGN", "TK_PERCENT_ASIGN", 
			"TK_EQ", "TK_EQEQ", "TK_NOTEQ", "TK_IDENTEQ", "TK_IDENTNOTEQ", "TK_BIN_AND", 
			"TK_BIN_OR", "TK_LOGIC_AND", "TK_LOGIC_OR", "TK_LESS", "TK_GREAT", "TK_LESSEQ", 
			"TK_GREATEQ", "TK_POINT", "TK_COMMA", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", 
			"TK_LPARENT", "TK_RPARENT", "TK_LBRACKET", "TK_RBRACKET", "TK_DCUOTE", 
			"TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", "TK_IDENT", "DOUBLE_STRING_CHARACTER", 
			"SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", 
			"HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", "EXTENDED_UNICODE_ESCAPE_SEQUENCE", 
			"SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", "LINE_CONTINUATION", 
			"HEX_DIGIT", "TK_MULTILINE_COMMENT", "TK_SINGLELINE_COMMENT"
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
			setState(138);
			statementList();
			setState(139);
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
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				statement();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (TK_SEMICOLON - 81)) | (1L << (TK_LPARENT - 81)) | (1L << (TK_LBRACKET - 81)) | (1L << (TK_LCURLY - 81)) | (1L << (TK_IDENT - 81)))) != 0) );
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
			setState(146);
			match(TK_LCURLY);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (TK_SEMICOLON - 81)) | (1L << (TK_LPARENT - 81)) | (1L << (TK_LBRACKET - 81)) | (1L << (TK_LCURLY - 81)) | (1L << (TK_IDENT - 81)))) != 0)) {
				{
				setState(147);
				statementList();
				}
			}

			setState(150);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				doStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				classStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(161);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(162);
				functionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(163);
				expressionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(164);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forStatement);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(TK_FOR);
				setState(168);
				match(TK_LPARENT);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
					{
					setState(169);
					expressionSequence();
					}
				}

				setState(172);
				match(TK_SEMICOLON);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
					{
					setState(173);
					expressionSequence();
					}
				}

				setState(176);
				match(TK_SEMICOLON);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
					{
					setState(177);
					expressionSequence();
					}
				}

				setState(180);
				match(TK_RPARENT);
				setState(181);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(TK_FOR);
				setState(183);
				match(TK_LPARENT);
				setState(184);
				varModifier();
				setState(185);
				variableDeclList();
				setState(186);
				match(TK_SEMICOLON);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
					{
					setState(187);
					expressionSequence();
					}
				}

				setState(190);
				match(TK_SEMICOLON);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
					{
					setState(191);
					expressionSequence();
					}
				}

				setState(194);
				match(TK_RPARENT);
				setState(195);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(TK_FOR);
				setState(198);
				match(TK_LPARENT);
				setState(199);
				expression(0);
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				expressionSequence();
				setState(202);
				match(TK_RPARENT);
				setState(203);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(TK_FOR);
				setState(206);
				match(TK_LPARENT);
				setState(207);
				varModifier();
				setState(208);
				variableDecl();
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				expressionSequence();
				setState(211);
				match(TK_RPARENT);
				setState(212);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(TK_WHILE);
			setState(217);
			match(TK_LPARENT);
			setState(218);
			expressionSequence();
			setState(219);
			match(TK_RPARENT);
			setState(220);
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
		enterRule(_localctx, 12, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(TK_DO);
			setState(223);
			statement();
			setState(224);
			match(TK_WHILE);
			setState(225);
			match(TK_LPARENT);
			setState(226);
			expressionSequence();
			setState(227);
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
		enterRule(_localctx, 14, RULE_classStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ABSTRACT) {
				{
				setState(229);
				match(TK_ABSTRACT);
				}
			}

			setState(232);
			match(TK_CLASS);
			setState(233);
			match(TK_IDENT);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(234);
				typeParameters();
				}
			}

			setState(237);
			classHeritage();
			setState(238);
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
		enterRule(_localctx, 16, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(240);
				classExtendsClause();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IMPLEMENTS) {
				{
				setState(243);
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
		enterRule(_localctx, 18, RULE_classExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TK_EXTENDS);
			setState(247);
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
		enterRule(_localctx, 20, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(TK_IMPLEMENTS);
			setState(250);
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
		enterRule(_localctx, 22, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(TK_LCURLY);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_READ_ONLY) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_CONSTRUCTOR) | (1L << TK_ASYNC) | (1L << TK_STATIC) | (1L << TK_GET) | (1L << TK_SET) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (TK_SEMICOLON - 81)) | (1L << (TK_LPARENT - 81)) | (1L << (TK_LBRACKET - 81)) | (1L << (TK_LCURLY - 81)) | (1L << (TK_IDENT - 81)))) != 0)) {
				{
				{
				setState(253);
				classElement();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
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
		enterRule(_localctx, 24, RULE_classElement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				memberDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				indexMemberDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
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
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_memberDecl);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				propertyMemberBase();
				setState(268);
				propertyName();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_QMARK) {
					{
					setState(269);
					match(TK_QMARK);
					}
				}

				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(272);
					typeAnnotation();
					}
				}

				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_EQ) {
					{
					setState(275);
					initializer();
					}
				}

				setState(278);
				match(TK_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				propertyMemberBase();
				setState(281);
				propertyName();
				setState(282);
				callSignature();
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LCURLY:
					{
					{
					setState(283);
					match(TK_LCURLY);
					setState(284);
					functionBody();
					setState(285);
					match(TK_RCURLY);
					}
					}
					break;
				case TK_SEMICOLON:
					{
					setState(287);
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
				setState(290);
				propertyMemberBase();
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_GET:
					{
					setState(291);
					getter();
					}
					break;
				case TK_SET:
					{
					setState(292);
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
				setState(295);
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
		enterRule(_localctx, 28, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(TK_GET);
			setState(299);
			propertyName();
			setState(300);
			match(TK_LPARENT);
			setState(301);
			match(TK_RPARENT);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(302);
				typeAnnotation();
				}
			}

			setState(305);
			match(TK_LCURLY);
			setState(306);
			functionBody();
			setState(307);
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
		enterRule(_localctx, 30, RULE_setter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(TK_SET);
			setState(310);
			propertyName();
			setState(311);
			match(TK_LPARENT);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(312);
				match(TK_IDENT);
				}
				break;
			case TK_LBRACKET:
				{
				setState(313);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				{
				setState(314);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(317);
				typeAnnotation();
				}
			}

			setState(320);
			match(TK_RPARENT);
			setState(321);
			match(TK_LCURLY);
			setState(322);
			functionBody();
			setState(323);
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
		enterRule(_localctx, 32, RULE_abstractDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(TK_ABSTRACT);
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(326);
				match(TK_IDENT);
				setState(327);
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
				setState(328);
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
		enterRule(_localctx, 34, RULE_indexMemberDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(TK_LBRACKET);
			setState(332);
			match(TK_IDENT);
			setState(333);
			match(TK_COLON);
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==TK_STRING || _la==TK_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(335);
			match(TK_RBRACKET);
			setState(336);
			typeAnnotation();
			setState(337);
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
		enterRule(_localctx, 36, RULE_propertyMemberBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ASYNC) {
				{
				setState(339);
				match(TK_ASYNC);
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(342);
				accessModifier();
				}
			}

			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_STATIC) {
				{
				setState(345);
				match(TK_STATIC);
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(348);
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
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(351);
				accessModifier();
				}
			}

			setState(354);
			match(TK_CONSTRUCTOR);
			setState(355);
			match(TK_LPARENT);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(356);
				formalParameterList();
				}
			}

			setState(359);
			match(TK_RPARENT);
			setState(360);
			match(TK_LCURLY);
			setState(361);
			functionBody();
			setState(362);
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
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(TK_FUNCTION);
			setState(365);
			match(TK_IDENT);
			setState(366);
			callSignature();
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LCURLY:
				{
				setState(367);
				match(TK_LCURLY);
				setState(368);
				functionBody();
				setState(369);
				match(TK_RCURLY);
				}
				break;
			case TK_SEMICOLON:
				{
				setState(371);
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
		enterRule(_localctx, 42, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(TK_CONTINUE);
			setState(375);
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
		enterRule(_localctx, 44, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(TK_BREAK);
			setState(378);
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
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(TK_RETURN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
				{
				setState(381);
				expressionSequence();
				}
			}

			setState(384);
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
		enterRule(_localctx, 48, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(386);
				typeParameters();
				}
			}

			setState(389);
			match(TK_LPARENT);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (TK_LBRACKET - 84)) | (1L << (TK_LCURLY - 84)) | (1L << (TK_IDENT - 84)))) != 0)) {
				{
				setState(390);
				parameterList();
				}
			}

			setState(393);
			match(TK_RPARENT);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(394);
				typeAnnotation();
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
		enterRule(_localctx, 50, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			parameter();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(398);
				match(TK_COMMA);
				setState(399);
				parameter();
				}
				}
				setState(404);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				requiredParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(409);
				accessModifier();
				}
			}

			setState(412);
			identifierOrPattern();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(413);
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
		enterRule(_localctx, 56, RULE_optionalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(416);
				accessModifier();
				}
			}

			setState(419);
			identifierOrPattern();
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_QMARK:
				{
				setState(420);
				match(TK_QMARK);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(421);
					typeAnnotation();
					}
				}

				}
				break;
			case TK_EQ:
			case TK_COLON:
				{
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(424);
					typeAnnotation();
					}
				}

				setState(427);
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
	}

	public final IdentifierOrPatternContext identifierOrPattern() throws RecognitionException {
		IdentifierOrPatternContext _localctx = new IdentifierOrPatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifierOrPattern);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				identifierOrReservedWord();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
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
		enterRule(_localctx, 60, RULE_identifierOrReservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 62, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(TK_IF);
			setState(440);
			match(TK_LPARENT);
			setState(441);
			expressionSequence();
			setState(442);
			match(TK_RPARENT);
			setState(443);
			statement();
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(444);
				match(TK_ELSE);
				setState(445);
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
		enterRule(_localctx, 66, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			expression(0);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(449);
				match(TK_COMMA);
				setState(450);
				expression(0);
				}
				}
				setState(455);
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
		enterRule(_localctx, 68, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			expression(0);
			setState(457);
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
		enterRule(_localctx, 70, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(459);
				accessModifier();
				}
			}

			setState(462);
			varModifier();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(463);
				match(TK_READ_ONLY);
				}
			}

			setState(466);
			variableDeclList();
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(467);
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
		enterRule(_localctx, 72, RULE_variableDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			variableDecl();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(471);
				match(TK_COMMA);
				setState(472);
				variableDecl();
				}
				}
				setState(477);
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
		enterRule(_localctx, 74, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TK_IDENT);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(479);
				typeAnnotation();
				}
			}

			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(482);
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
		enterRule(_localctx, 76, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(TK_EQ);
			setState(486);
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
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayLiteral);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(TK_LBRACKET);
				setState(489);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(TK_LBRACKET);
				setState(491);
				arrayElement();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(492);
					match(TK_COMMA);
					setState(493);
					arrayElement();
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
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
		enterRule(_localctx, 80, RULE_arrayElement);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
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
		public TerminalNode TK_LCURLY() { return getToken(TypeScriptParser.TK_LCURLY, 0); }
		public TerminalNode TK_RCURLY() { return getToken(TypeScriptParser.TK_RCURLY, 0); }
		public List<PropertyAssignContext> propertyAssign() {
			return getRuleContexts(PropertyAssignContext.class);
		}
		public PropertyAssignContext propertyAssign(int i) {
			return getRuleContext(PropertyAssignContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(TypeScriptParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(TypeScriptParser.TK_COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectLiteral);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(TK_LCURLY);
				setState(508);
				match(TK_RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(TK_LCURLY);
				setState(510);
				propertyAssign();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(511);
					match(TK_COMMA);
					setState(512);
					propertyAssign();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(518);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public PropertyAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssign; }
	}

	public final PropertyAssignContext propertyAssign() throws RecognitionException {
		PropertyAssignContext _localctx = new PropertyAssignContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertyAssign);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				propertyName();
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==TK_EQ || _la==TK_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				expression(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(TK_LBRACKET);
				setState(527);
				expression(0);
				setState(528);
				match(TK_RBRACKET);
				setState(529);
				match(TK_COLON);
				setState(530);
				expression(0);
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
		enterRule(_localctx, 86, RULE_propertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		enterRule(_localctx, 88, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(TK_COLON);
			setState(537);
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
		public TerminalNode TK_ANY() { return getToken(TypeScriptParser.TK_ANY, 0); }
		public TerminalNode TK_BOOLEAN() { return getToken(TypeScriptParser.TK_BOOLEAN, 0); }
		public TerminalNode TK_NUMBER() { return getToken(TypeScriptParser.TK_NUMBER, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << TK_ANY) | (1L << TK_BOOLEAN) | (1L << TK_NUMBER))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_typeName);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				parametricType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				simpleType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
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
		enterRule(_localctx, 94, RULE_parametricType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			simpleType();
			setState(547);
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
		enterRule(_localctx, 96, RULE_simpleType);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_STRING:
			case TK_ANY:
			case TK_BOOLEAN:
			case TK_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				primitiveType();
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
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
		enterRule(_localctx, 98, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(556);
			simpleType();
			setState(557);
			match(TK_LBRACKET);
			setState(558);
			match(TK_RBRACKET);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(560);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(561);
					match(TK_LBRACKET);
					setState(562);
					match(TK_RBRACKET);
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 102, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(TK_LESS);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << TK_ANY) | (1L << TK_BOOLEAN) | (1L << TK_NUMBER))) != 0) || _la==TK_IDENT) {
				{
				setState(569);
				typeParameterList();
				}
			}

			setState(572);
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
		enterRule(_localctx, 104, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			typeParameter();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(575);
				match(TK_COMMA);
				setState(576);
				typeParameter();
				}
				}
				setState(581);
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
		enterRule(_localctx, 106, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			typeName();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(583);
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
		enterRule(_localctx, 108, RULE_extendsConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(TK_EXTENDS);
			setState(587);
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
		enterRule(_localctx, 110, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 112, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TK_EQ() { return getToken(TypeScriptParser.TK_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PLUS_ASIGN() { return getToken(TypeScriptParser.TK_PLUS_ASIGN, 0); }
		public TerminalNode TK_MINUS_ASIGN() { return getToken(TypeScriptParser.TK_MINUS_ASIGN, 0); }
		public TerminalNode TK_STAR_ASIGN() { return getToken(TypeScriptParser.TK_STAR_ASIGN, 0); }
		public TerminalNode TK_SLASH_ASIGN() { return getToken(TypeScriptParser.TK_SLASH_ASIGN, 0); }
		public TerminalNode TK_PERCENT_ASIGN() { return getToken(TypeScriptParser.TK_PERCENT_ASIGN, 0); }
		public TerminalNode TK_AND_ASIGN() { return getToken(TypeScriptParser.TK_AND_ASIGN, 0); }
		public TerminalNode TK_OR_ASIGN() { return getToken(TypeScriptParser.TK_OR_ASIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_assignment);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				identifier(0);
				setState(594);
				match(TK_EQ);
				setState(595);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				identifier(0);
				setState(598);
				match(TK_PLUS_ASIGN);
				setState(599);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				identifier(0);
				setState(602);
				match(TK_MINUS_ASIGN);
				setState(603);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				identifier(0);
				setState(606);
				match(TK_STAR_ASIGN);
				setState(607);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(609);
				identifier(0);
				setState(610);
				match(TK_SLASH_ASIGN);
				setState(611);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				identifier(0);
				setState(614);
				match(TK_PERCENT_ASIGN);
				setState(615);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(617);
				identifier(0);
				setState(618);
				match(TK_AND_ASIGN);
				setState(619);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(621);
				identifier(0);
				setState(622);
				match(TK_OR_ASIGN);
				setState(623);
				expression(0);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode TK_POINT() { return getToken(TypeScriptParser.TK_POINT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		return identifier(0);
	}

	private IdentifierContext identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierContext _localctx = new IdentifierContext(_ctx, _parentState);
		IdentifierContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(628);
			match(TK_IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new IdentifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifier);
						setState(630);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(631);
						attribute();
						}
						break;
					case 2:
						{
						_localctx = new IdentifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifier);
						setState(632);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(633);
						match(TK_POINT);
						setState(634);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(639);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(TypeScriptParser.TK_LBRACKET, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(TypeScriptParser.TK_RBRACKET, 0); }
		public TerminalNode TK_POINT() { return getToken(TypeScriptParser.TK_POINT, 0); }
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_attribute);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(TK_LBRACKET);
				setState(641);
				expressionSequence();
				setState(642);
				match(TK_RBRACKET);
				}
				break;
			case TK_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				match(TK_POINT);
				setState(645);
				match(TK_IDENT);
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
		enterRule(_localctx, 120, RULE_functionCall);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(TK_IDENT);
				setState(649);
				match(TK_LPARENT);
				setState(650);
				expressionSequence();
				setState(651);
				match(TK_RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(TK_IDENT);
				setState(654);
				match(TK_LPARENT);
				setState(655);
				match(TK_RPARENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				match(TK_LPARENT);
				setState(657);
				functionExpressionDecl();
				setState(658);
				match(TK_RPARENT);
				setState(659);
				match(TK_LPARENT);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_LPARENT - 82)) | (1L << (TK_LBRACKET - 82)) | (1L << (TK_LCURLY - 82)) | (1L << (TK_IDENT - 82)))) != 0)) {
					{
					setState(660);
					expressionSequence();
					}
				}

				setState(663);
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
		enterRule(_localctx, 122, RULE_functionExpressionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(TK_FUNCTION);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IDENT) {
				{
				setState(668);
				match(TK_IDENT);
				}
			}

			setState(671);
			match(TK_LPARENT);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(672);
				formalParameterList();
				}
			}

			setState(675);
			match(TK_RPARENT);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(676);
				typeAnnotation();
				}
			}

			setState(679);
			match(TK_LCURLY);
			setState(680);
			functionBody();
			setState(681);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionExpressionDeclContext functionExpressionDecl() {
			return getRuleContext(FunctionExpressionDeclContext.class,0);
		}
		public TerminalNode TK_PLUSPLUS() { return getToken(TypeScriptParser.TK_PLUSPLUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TK_MINUSMINUS() { return getToken(TypeScriptParser.TK_MINUSMINUS, 0); }
		public TerminalNode TK_PLUS() { return getToken(TypeScriptParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(TypeScriptParser.TK_MINUS, 0); }
		public TerminalNode TK_BINNOT() { return getToken(TypeScriptParser.TK_BINNOT, 0); }
		public TerminalNode TK_NOT() { return getToken(TypeScriptParser.TK_NOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TK_NEW() { return getToken(TypeScriptParser.TK_NEW, 0); }
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TK_STAR() { return getToken(TypeScriptParser.TK_STAR, 0); }
		public TerminalNode TK_SLASH() { return getToken(TypeScriptParser.TK_SLASH, 0); }
		public TerminalNode TK_PERCENT() { return getToken(TypeScriptParser.TK_PERCENT, 0); }
		public TerminalNode TK_LESS() { return getToken(TypeScriptParser.TK_LESS, 0); }
		public TerminalNode TK_GREAT() { return getToken(TypeScriptParser.TK_GREAT, 0); }
		public TerminalNode TK_LESSEQ() { return getToken(TypeScriptParser.TK_LESSEQ, 0); }
		public TerminalNode TK_GREATEQ() { return getToken(TypeScriptParser.TK_GREATEQ, 0); }
		public TerminalNode TK_EQEQ() { return getToken(TypeScriptParser.TK_EQEQ, 0); }
		public TerminalNode TK_NOTEQ() { return getToken(TypeScriptParser.TK_NOTEQ, 0); }
		public TerminalNode TK_IDENTEQ() { return getToken(TypeScriptParser.TK_IDENTEQ, 0); }
		public TerminalNode TK_IDENTNOTEQ() { return getToken(TypeScriptParser.TK_IDENTNOTEQ, 0); }
		public TerminalNode TK_BIN_AND() { return getToken(TypeScriptParser.TK_BIN_AND, 0); }
		public TerminalNode TK_BIN_OR() { return getToken(TypeScriptParser.TK_BIN_OR, 0); }
		public TerminalNode TK_LOGIC_AND() { return getToken(TypeScriptParser.TK_LOGIC_AND, 0); }
		public TerminalNode TK_LOGIC_OR() { return getToken(TypeScriptParser.TK_LOGIC_OR, 0); }
		public TerminalNode TK_QMARK() { return getToken(TypeScriptParser.TK_QMARK, 0); }
		public TerminalNode TK_COLON() { return getToken(TypeScriptParser.TK_COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(684);
				functionExpressionDecl();
				}
				break;
			case 2:
				{
				setState(685);
				match(TK_PLUSPLUS);
				setState(686);
				expression(25);
				}
				break;
			case 3:
				{
				setState(687);
				match(TK_MINUSMINUS);
				setState(688);
				expression(24);
				}
				break;
			case 4:
				{
				setState(689);
				match(TK_PLUS);
				setState(690);
				expression(21);
				}
				break;
			case 5:
				{
				setState(691);
				match(TK_MINUS);
				setState(692);
				expression(20);
				}
				break;
			case 6:
				{
				setState(693);
				match(TK_BINNOT);
				setState(694);
				expression(19);
				}
				break;
			case 7:
				{
				setState(695);
				match(TK_NOT);
				setState(696);
				expression(18);
				}
				break;
			case 8:
				{
				setState(697);
				functionCall();
				}
				break;
			case 9:
				{
				setState(698);
				match(TK_LPARENT);
				setState(699);
				expression(0);
				setState(700);
				match(TK_RPARENT);
				}
				break;
			case 10:
				{
				setState(702);
				assignment();
				}
				break;
			case 11:
				{
				setState(703);
				match(TK_NEW);
				setState(704);
				expression(0);
				setState(705);
				callSignature();
				}
				break;
			case 12:
				{
				setState(707);
				identifier(0);
				}
				break;
			case 13:
				{
				setState(708);
				arrayLiteral();
				}
				break;
			case 14:
				{
				setState(709);
				objectLiteral();
				}
				break;
			case 15:
				{
				setState(710);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(714);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_SLASH) | (1L << TK_PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(715);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(717);
						_la = _input.LA(1);
						if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(718);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(720);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (TK_LESS - 73)) | (1L << (TK_GREAT - 73)) | (1L << (TK_LESSEQ - 73)) | (1L << (TK_GREATEQ - 73)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(721);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(723);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TK_EQEQ - 65)) | (1L << (TK_NOTEQ - 65)) | (1L << (TK_IDENTEQ - 65)) | (1L << (TK_IDENTNOTEQ - 65)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(724);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(726);
						match(TK_BIN_AND);
						setState(727);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(728);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(729);
						match(TK_BIN_OR);
						setState(730);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(732);
						match(TK_LOGIC_AND);
						setState(733);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(735);
						match(TK_LOGIC_OR);
						setState(736);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(737);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(738);
						match(TK_QMARK);
						setState(739);
						expression(0);
						setState(740);
						match(TK_COLON);
						setState(741);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(744);
						match(TK_PLUSPLUS);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(746);
						match(TK_MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			formalParameterArg();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(753);
				match(TK_COMMA);
				setState(754);
				formalParameterArg();
				}
				}
				setState(759);
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
		enterRule(_localctx, 128, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_EXPORT) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (TK_SEMICOLON - 81)) | (1L << (TK_LPARENT - 81)) | (1L << (TK_LBRACKET - 81)) | (1L << (TK_LCURLY - 81)) | (1L << (TK_IDENT - 81)))) != 0)) {
				{
				{
				setState(760);
				sourceElem();
				}
				}
				setState(765);
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
		enterRule(_localctx, 130, RULE_sourceElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXPORT) {
				{
				setState(766);
				match(TK_EXPORT);
				}
			}

			setState(769);
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
		enterRule(_localctx, 132, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(771);
				accessModifier();
				}
			}

			setState(774);
			identifierOrKeyword();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_QMARK) {
				{
				setState(775);
				match(TK_QMARK);
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(778);
				typeAnnotation();
				}
			}

			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(781);
				match(TK_EQ);
				setState(782);
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
		enterRule(_localctx, 134, RULE_identifierOrKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
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
		enterRule(_localctx, 136, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
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
		case 50:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 58:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 62:
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
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 23);
		case 13:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i\u0318\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\3"+
		"\6\3\u0091\n\3\r\3\16\3\u0092\3\4\3\4\5\4\u0097\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\3\6\5"+
		"\6\u00ad\n\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\5\6\u00b5\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00bf\n\6\3\6\3\6\5\6\u00c3\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d9"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\t\u00e9"+
		"\n\t\3\t\3\t\3\t\5\t\u00ee\n\t\3\t\3\t\3\t\3\n\5\n\u00f4\n\n\3\n\5\n\u00f7"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\r\u0101\n\r\f\r\16\r\u0104\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u010c\n\16\3\17\3\17\3\17\5\17\u0111"+
		"\n\17\3\17\5\17\u0114\n\17\3\17\5\17\u0117\n\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\3\17\3\17\3\17\5\17\u0128"+
		"\n\17\3\17\5\17\u012b\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0132\n\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013e\n\21\3\21"+
		"\5\21\u0141\n\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u014c"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\5\24\u0157\n\24\3\24"+
		"\5\24\u015a\n\24\3\24\5\24\u015d\n\24\3\24\5\24\u0160\n\24\3\25\5\25\u0163"+
		"\n\25\3\25\3\25\3\25\5\25\u0168\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0177\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\5\31\u0181\n\31\3\31\3\31\3\32\5\32\u0186\n\32\3\32\3"+
		"\32\5\32\u018a\n\32\3\32\3\32\5\32\u018e\n\32\3\33\3\33\3\33\7\33\u0193"+
		"\n\33\f\33\16\33\u0196\13\33\3\34\3\34\5\34\u019a\n\34\3\35\5\35\u019d"+
		"\n\35\3\35\3\35\5\35\u01a1\n\35\3\36\5\36\u01a4\n\36\3\36\3\36\3\36\5"+
		"\36\u01a9\n\36\3\36\5\36\u01ac\n\36\3\36\5\36\u01af\n\36\3\37\3\37\3\37"+
		"\5\37\u01b4\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c1\n\""+
		"\3#\3#\3#\7#\u01c6\n#\f#\16#\u01c9\13#\3$\3$\3$\3%\5%\u01cf\n%\3%\3%\5"+
		"%\u01d3\n%\3%\3%\5%\u01d7\n%\3&\3&\3&\7&\u01dc\n&\f&\16&\u01df\13&\3\'"+
		"\3\'\5\'\u01e3\n\'\3\'\5\'\u01e6\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u01f1"+
		"\n)\f)\16)\u01f4\13)\3)\3)\5)\u01f8\n)\3*\3*\5*\u01fc\n*\3+\3+\3+\3+\3"+
		"+\3+\7+\u0204\n+\f+\16+\u0207\13+\3+\3+\5+\u020b\n+\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\5,\u0217\n,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\5\60\u0223"+
		"\n\60\3\61\3\61\3\61\3\62\3\62\5\62\u022a\n\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u0236\n\64\f\64\16\64\u0239\13\64\3\65"+
		"\3\65\5\65\u023d\n\65\3\65\3\65\3\66\3\66\3\66\7\66\u0244\n\66\f\66\16"+
		"\66\u0247\13\66\3\67\3\67\5\67\u024b\n\67\38\38\38\39\39\3:\3:\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\5;\u0274\n;\3<\3<\3<\3<\3<\3<\3<\3<\7<\u027e\n<\f"+
		"<\16<\u0281\13<\3=\3=\3=\3=\3=\3=\5=\u0289\n=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\5>\u0298\n>\3>\3>\5>\u029c\n>\3?\3?\5?\u02a0\n?\3?\3?"+
		"\5?\u02a4\n?\3?\3?\5?\u02a8\n?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02ca\n@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u02ee\n@\f@\16@\u02f1\13@\3A\3A\3"+
		"A\7A\u02f6\nA\fA\16A\u02f9\13A\3B\7B\u02fc\nB\fB\16B\u02ff\13B\3C\5C\u0302"+
		"\nC\3C\3C\3D\5D\u0307\nD\3D\3D\5D\u030b\nD\3D\5D\u030e\nD\3D\3D\5D\u0312"+
		"\nD\3E\3E\3F\3F\3F\2\5fv~G\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\2\17\3\2\33\34\4\2\f\f\17\17\4\2BBRR\5\2\3\3\61\61"+
		"\\\\\3\2\f\17\3\2\5\7\3\2\b\n\3\2\64\66\3\2\62\63\3\2KN\3\2CF\4\2\24\25"+
		"\\\\\5\2\3\3()\61\61\2\u0357\2\u008c\3\2\2\2\4\u0090\3\2\2\2\6\u0094\3"+
		"\2\2\2\b\u00a7\3\2\2\2\n\u00d8\3\2\2\2\f\u00da\3\2\2\2\16\u00e0\3\2\2"+
		"\2\20\u00e8\3\2\2\2\22\u00f3\3\2\2\2\24\u00f8\3\2\2\2\26\u00fb\3\2\2\2"+
		"\30\u00fe\3\2\2\2\32\u010b\3\2\2\2\34\u012a\3\2\2\2\36\u012c\3\2\2\2 "+
		"\u0137\3\2\2\2\"\u0147\3\2\2\2$\u014d\3\2\2\2&\u0156\3\2\2\2(\u0162\3"+
		"\2\2\2*\u016e\3\2\2\2,\u0178\3\2\2\2.\u017b\3\2\2\2\60\u017e\3\2\2\2\62"+
		"\u0185\3\2\2\2\64\u018f\3\2\2\2\66\u0199\3\2\2\28\u019c\3\2\2\2:\u01a3"+
		"\3\2\2\2<\u01b3\3\2\2\2>\u01b5\3\2\2\2@\u01b7\3\2\2\2B\u01b9\3\2\2\2D"+
		"\u01c2\3\2\2\2F\u01ca\3\2\2\2H\u01ce\3\2\2\2J\u01d8\3\2\2\2L\u01e0\3\2"+
		"\2\2N\u01e7\3\2\2\2P\u01f7\3\2\2\2R\u01fb\3\2\2\2T\u020a\3\2\2\2V\u0216"+
		"\3\2\2\2X\u0218\3\2\2\2Z\u021a\3\2\2\2\\\u021d\3\2\2\2^\u0222\3\2\2\2"+
		"`\u0224\3\2\2\2b\u0229\3\2\2\2d\u022b\3\2\2\2f\u022d\3\2\2\2h\u023a\3"+
		"\2\2\2j\u0240\3\2\2\2l\u0248\3\2\2\2n\u024c\3\2\2\2p\u024f\3\2\2\2r\u0251"+
		"\3\2\2\2t\u0273\3\2\2\2v\u0275\3\2\2\2x\u0288\3\2\2\2z\u029b\3\2\2\2|"+
		"\u029d\3\2\2\2~\u02c9\3\2\2\2\u0080\u02f2\3\2\2\2\u0082\u02fd\3\2\2\2"+
		"\u0084\u0301\3\2\2\2\u0086\u0306\3\2\2\2\u0088\u0313\3\2\2\2\u008a\u0315"+
		"\3\2\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7\2\2\3\u008e\3\3\2\2\2\u008f"+
		"\u0091\5\b\5\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\5\3\2\2\2\u0094\u0096\7Z\2\2\u0095\u0097"+
		"\5\4\3\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7[\2\2\u0099\7\3\2\2\2\u009a\u00a8\5\6\4\2\u009b\u00a8\5H%\2\u009c"+
		"\u00a8\5B\"\2\u009d\u00a8\5\n\6\2\u009e\u00a8\5\f\7\2\u009f\u00a8\5\16"+
		"\b\2\u00a0\u00a8\5\20\t\2\u00a1\u00a8\5,\27\2\u00a2\u00a8\5.\30\2\u00a3"+
		"\u00a8\5\60\31\2\u00a4\u00a8\5*\26\2\u00a5\u00a8\5F$\2\u00a6\u00a8\5@"+
		"!\2\u00a7\u009a\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7"+
		"\u009d\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2"+
		"\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\t\3\2\2\2"+
		"\u00a9\u00aa\7\32\2\2\u00aa\u00ac\7T\2\2\u00ab\u00ad\5D#\2\u00ac\u00ab"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\7S\2\2\u00af"+
		"\u00b1\5D#\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2"+
		"\2\u00b2\u00b4\7S\2\2\u00b3\u00b5\5D#\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7U\2\2\u00b7\u00d9\5\b\5\2\u00b8"+
		"\u00b9\7\32\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\5r:\2\u00bb\u00bc\5J&\2"+
		"\u00bc\u00be\7S\2\2\u00bd\u00bf\5D#\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7S\2\2\u00c1\u00c3\5D#\2\u00c2"+
		"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7U"+
		"\2\2\u00c5\u00c6\5\b\5\2\u00c6\u00d9\3\2\2\2\u00c7\u00c8\7\32\2\2\u00c8"+
		"\u00c9\7T\2\2\u00c9\u00ca\5~@\2\u00ca\u00cb\t\2\2\2\u00cb\u00cc\5D#\2"+
		"\u00cc\u00cd\7U\2\2\u00cd\u00ce\5\b\5\2\u00ce\u00d9\3\2\2\2\u00cf\u00d0"+
		"\7\32\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\5r:\2\u00d2\u00d3\5L\'\2\u00d3"+
		"\u00d4\t\2\2\2\u00d4\u00d5\5D#\2\u00d5\u00d6\7U\2\2\u00d6\u00d7\5\b\5"+
		"\2\u00d7\u00d9\3\2\2\2\u00d8\u00a9\3\2\2\2\u00d8\u00b8\3\2\2\2\u00d8\u00c7"+
		"\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d9\13\3\2\2\2\u00da\u00db\7\36\2\2\u00db"+
		"\u00dc\7T\2\2\u00dc\u00dd\5D#\2\u00dd\u00de\7U\2\2\u00de\u00df\5\b\5\2"+
		"\u00df\r\3\2\2\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\5\b\5\2\u00e2\u00e3"+
		"\7\36\2\2\u00e3\u00e4\7T\2\2\u00e4\u00e5\5D#\2\u00e5\u00e6\7U\2\2\u00e6"+
		"\17\3\2\2\2\u00e7\u00e9\7!\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00ed\7\\\2\2\u00ec\u00ee"+
		"\5h\65\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\5\22\n\2\u00f0\u00f1\5\30\r\2\u00f1\21\3\2\2\2\u00f2\u00f4\5\24"+
		"\13\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f7\5\26\f\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\23\3\2\2"+
		"\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\5d\63\2\u00fa\25\3\2\2\2\u00fb\u00fc"+
		"\7 \2\2\u00fc\u00fd\5d\63\2\u00fd\27\3\2\2\2\u00fe\u0102\7Z\2\2\u00ff"+
		"\u0101\5\32\16\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7[\2\2\u0106\31\3\2\2\2\u0107\u010c\5(\25\2\u0108\u010c\5\34\17"+
		"\2\u0109\u010c\5$\23\2\u010a\u010c\5\b\5\2\u010b\u0107\3\2\2\2\u010b\u0108"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\33\3\2\2\2\u010d"+
		"\u010e\5&\24\2\u010e\u0110\5X-\2\u010f\u0111\7Q\2\2\u0110\u010f\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\5Z.\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117\5N(\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7S"+
		"\2\2\u0119\u012b\3\2\2\2\u011a\u011b\5&\24\2\u011b\u011c\5X-\2\u011c\u0122"+
		"\5\62\32\2\u011d\u011e\7Z\2\2\u011e\u011f\5\u0082B\2\u011f\u0120\7[\2"+
		"\2\u0120\u0123\3\2\2\2\u0121\u0123\7S\2\2\u0122\u011d\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u012b\3\2\2\2\u0124\u0127\5&\24\2\u0125\u0128\5\36\20\2"+
		"\u0126\u0128\5 \21\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u012b\5\"\22\2\u012a\u010d\3\2\2\2\u012a\u011a\3\2\2\2"+
		"\u012a\u0124\3\2\2\2\u012a\u0129\3\2\2\2\u012b\35\3\2\2\2\u012c\u012d"+
		"\7%\2\2\u012d\u012e\5X-\2\u012e\u012f\7T\2\2\u012f\u0131\7U\2\2\u0130"+
		"\u0132\5Z.\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2"+
		"\2\u0133\u0134\7Z\2\2\u0134\u0135\5\u0082B\2\u0135\u0136\7[\2\2\u0136"+
		"\37\3\2\2\2\u0137\u0138\7&\2\2\u0138\u0139\5X-\2\u0139\u013d\7T\2\2\u013a"+
		"\u013e\7\\\2\2\u013b\u013e\5P)\2\u013c\u013e\5T+\2\u013d\u013a\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141"+
		"\5Z.\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\7U\2\2\u0143\u0144\7Z\2\2\u0144\u0145\5\u0082B\2\u0145\u0146\7"+
		"[\2\2\u0146!\3\2\2\2\u0147\u014b\7!\2\2\u0148\u0149\7\\\2\2\u0149\u014c"+
		"\5\62\32\2\u014a\u014c\5H%\2\u014b\u0148\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"#\3\2\2\2\u014d\u014e\7V\2\2\u014e\u014f\7\\\2\2\u014f\u0150\7R\2\2\u0150"+
		"\u0151\t\3\2\2\u0151\u0152\7W\2\2\u0152\u0153\5Z.\2\u0153\u0154\7S\2\2"+
		"\u0154%\3\2\2\2\u0155\u0157\7#\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u015a\5p9\2\u0159\u0158\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\7$\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\7\13\2\2\u015f\u015e\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\'\3\2\2\2\u0161\u0163\5p9\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\"\2\2\u0165"+
		"\u0167\7T\2\2\u0166\u0168\5\u0080A\2\u0167\u0166\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7U\2\2\u016a\u016b\7Z\2\2\u016b"+
		"\u016c\5\u0082B\2\u016c\u016d\7[\2\2\u016d)\3\2\2\2\u016e\u016f\7\23\2"+
		"\2\u016f\u0170\7\\\2\2\u0170\u0176\5\62\32\2\u0171\u0172\7Z\2\2\u0172"+
		"\u0173\5\u0082B\2\u0173\u0174\7[\2\2\u0174\u0177\3\2\2\2\u0175\u0177\7"+
		"S\2\2\u0176\u0171\3\2\2\2\u0176\u0175\3\2\2\2\u0177+\3\2\2\2\u0178\u0179"+
		"\7\30\2\2\u0179\u017a\7S\2\2\u017a-\3\2\2\2\u017b\u017c\7\31\2\2\u017c"+
		"\u017d\7S\2\2\u017d/\3\2\2\2\u017e\u0180\7\27\2\2\u017f\u0181\5D#\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7S"+
		"\2\2\u0183\61\3\2\2\2\u0184\u0186\5h\65\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\7T\2\2\u0188\u018a\5\64\33\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\7U\2\2\u018c\u018e\5Z.\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\63\3\2\2\2\u018f\u0194\5\66\34\2\u0190\u0191\7P\2\2\u0191\u0193\5\66"+
		"\34\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\65\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019a\58\35"+
		"\2\u0198\u019a\5:\36\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\67"+
		"\3\2\2\2\u019b\u019d\5p9\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a0\5<\37\2\u019f\u01a1\5Z.\2\u01a0\u019f\3\2\2"+
		"\2\u01a0\u01a1\3\2\2\2\u01a19\3\2\2\2\u01a2\u01a4\5p9\2\u01a3\u01a2\3"+
		"\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ae\5<\37\2\u01a6"+
		"\u01a8\7Q\2\2\u01a7\u01a9\5Z.\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2"+
		"\2\u01a9\u01af\3\2\2\2\u01aa\u01ac\5Z.\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\5N(\2\u01ae\u01a6\3\2\2\2\u01ae"+
		"\u01ab\3\2\2\2\u01af;\3\2\2\2\u01b0\u01b4\5> \2\u01b1\u01b4\5P)\2\u01b2"+
		"\u01b4\5T+\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2"+
		"\2\u01b4=\3\2\2\2\u01b5\u01b6\7\\\2\2\u01b6?\3\2\2\2\u01b7\u01b8\7S\2"+
		"\2\u01b8A\3\2\2\2\u01b9\u01ba\7\21\2\2\u01ba\u01bb\7T\2\2\u01bb\u01bc"+
		"\5D#\2\u01bc\u01bd\7U\2\2\u01bd\u01c0\5\b\5\2\u01be\u01bf\7\22\2\2\u01bf"+
		"\u01c1\5\b\5\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1C\3\2\2\2"+
		"\u01c2\u01c7\5~@\2\u01c3\u01c4\7P\2\2\u01c4\u01c6\5~@\2\u01c5\u01c3\3"+
		"\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"E\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\5~@\2\u01cb\u01cc\7S\2\2\u01cc"+
		"G\3\2\2\2\u01cd\u01cf\5p9\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\5r:\2\u01d1\u01d3\7\13\2\2\u01d2\u01d1\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\5J&\2\u01d5\u01d7"+
		"\7S\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7I\3\2\2\2\u01d8\u01dd"+
		"\5L\'\2\u01d9\u01da\7P\2\2\u01da\u01dc\5L\'\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01deK\3\2\2\2"+
		"\u01df\u01dd\3\2\2\2\u01e0\u01e2\7\\\2\2\u01e1\u01e3\5Z.\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\5N(\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6M\3\2\2\2\u01e7\u01e8\7B\2\2\u01e8"+
		"\u01e9\5~@\2\u01e9O\3\2\2\2\u01ea\u01eb\7V\2\2\u01eb\u01f8\7W\2\2\u01ec"+
		"\u01ed\7V\2\2\u01ed\u01f2\5R*\2\u01ee\u01ef\7P\2\2\u01ef\u01f1\5R*\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7W\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01ea\3\2\2\2\u01f7\u01ec\3\2\2\2\u01f8Q\3\2\2\2"+
		"\u01f9\u01fc\5~@\2\u01fa\u01fc\7\\\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fcS\3\2\2\2\u01fd\u01fe\7Z\2\2\u01fe\u020b\7[\2\2\u01ff\u0200"+
		"\7Z\2\2\u0200\u0205\5V,\2\u0201\u0202\7P\2\2\u0202\u0204\5V,\2\u0203\u0201"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7[\2\2\u0209\u020b\3\2"+
		"\2\2\u020a\u01fd\3\2\2\2\u020a\u01ff\3\2\2\2\u020bU\3\2\2\2\u020c\u020d"+
		"\5X-\2\u020d\u020e\t\4\2\2\u020e\u020f\5~@\2\u020f\u0217\3\2\2\2\u0210"+
		"\u0211\7V\2\2\u0211\u0212\5~@\2\u0212\u0213\7W\2\2\u0213\u0214\7R\2\2"+
		"\u0214\u0215\5~@\2\u0215\u0217\3\2\2\2\u0216\u020c\3\2\2\2\u0216\u0210"+
		"\3\2\2\2\u0217W\3\2\2\2\u0218\u0219\t\5\2\2\u0219Y\3\2\2\2\u021a\u021b"+
		"\7R\2\2\u021b\u021c\5^\60\2\u021c[\3\2\2\2\u021d\u021e\t\6\2\2\u021e]"+
		"\3\2\2\2\u021f\u0223\5`\61\2\u0220\u0223\5b\62\2\u0221\u0223\5f\64\2\u0222"+
		"\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223_\3\2\2\2"+
		"\u0224\u0225\5b\62\2\u0225\u0226\5h\65\2\u0226a\3\2\2\2\u0227\u022a\5"+
		"\\/\2\u0228\u022a\5d\63\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a"+
		"c\3\2\2\2\u022b\u022c\7\\\2\2\u022ce\3\2\2\2\u022d\u022e\b\64\1\2\u022e"+
		"\u022f\5b\62\2\u022f\u0230\7V\2\2\u0230\u0231\7W\2\2\u0231\u0237\3\2\2"+
		"\2\u0232\u0233\f\4\2\2\u0233\u0234\7V\2\2\u0234\u0236\7W\2\2\u0235\u0232"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"g\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\7K\2\2\u023b\u023d\5j\66\2\u023c"+
		"\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7L"+
		"\2\2\u023fi\3\2\2\2\u0240\u0245\5l\67\2\u0241\u0242\7P\2\2\u0242\u0244"+
		"\5l\67\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246k\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\5^\60\2"+
		"\u0249\u024b\5n8\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024bm\3\2"+
		"\2\2\u024c\u024d\7\20\2\2\u024d\u024e\5^\60\2\u024eo\3\2\2\2\u024f\u0250"+
		"\t\7\2\2\u0250q\3\2\2\2\u0251\u0252\t\b\2\2\u0252s\3\2\2\2\u0253\u0254"+
		"\5v<\2\u0254\u0255\7B\2\2\u0255\u0256\5~@\2\u0256\u0274\3\2\2\2\u0257"+
		"\u0258\5v<\2\u0258\u0259\7;\2\2\u0259\u025a\5~@\2\u025a\u0274\3\2\2\2"+
		"\u025b\u025c\5v<\2\u025c\u025d\7<\2\2\u025d\u025e\5~@\2\u025e\u0274\3"+
		"\2\2\2\u025f\u0260\5v<\2\u0260\u0261\7=\2\2\u0261\u0262\5~@\2\u0262\u0274"+
		"\3\2\2\2\u0263\u0264\5v<\2\u0264\u0265\7>\2\2\u0265\u0266\5~@\2\u0266"+
		"\u0274\3\2\2\2\u0267\u0268\5v<\2\u0268\u0269\7A\2\2\u0269\u026a\5~@\2"+
		"\u026a\u0274\3\2\2\2\u026b\u026c\5v<\2\u026c\u026d\7?\2\2\u026d\u026e"+
		"\5~@\2\u026e\u0274\3\2\2\2\u026f\u0270\5v<\2\u0270\u0271\7@\2\2\u0271"+
		"\u0272\5~@\2\u0272\u0274\3\2\2\2\u0273\u0253\3\2\2\2\u0273\u0257\3\2\2"+
		"\2\u0273\u025b\3\2\2\2\u0273\u025f\3\2\2\2\u0273\u0263\3\2\2\2\u0273\u0267"+
		"\3\2\2\2\u0273\u026b\3\2\2\2\u0273\u026f\3\2\2\2\u0274u\3\2\2\2\u0275"+
		"\u0276\b<\1\2\u0276\u0277\7\\\2\2\u0277\u027f\3\2\2\2\u0278\u0279\f\4"+
		"\2\2\u0279\u027e\5x=\2\u027a\u027b\f\3\2\2\u027b\u027c\7O\2\2\u027c\u027e"+
		"\5z>\2\u027d\u0278\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280w\3\2\2\2\u0281\u027f\3\2\2\2"+
		"\u0282\u0283\7V\2\2\u0283\u0284\5D#\2\u0284\u0285\7W\2\2\u0285\u0289\3"+
		"\2\2\2\u0286\u0287\7O\2\2\u0287\u0289\7\\\2\2\u0288\u0282\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289y\3\2\2\2\u028a\u028b\7\\\2\2\u028b\u028c\7T\2\2\u028c"+
		"\u028d\5D#\2\u028d\u028e\7U\2\2\u028e\u029c\3\2\2\2\u028f\u0290\7\\\2"+
		"\2\u0290\u0291\7T\2\2\u0291\u029c\7U\2\2\u0292\u0293\7T\2\2\u0293\u0294"+
		"\5|?\2\u0294\u0295\7U\2\2\u0295\u0297\7T\2\2\u0296\u0298\5D#\2\u0297\u0296"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7U\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u028a\3\2\2\2\u029b\u028f\3\2\2\2\u029b\u0292\3\2"+
		"\2\2\u029c{\3\2\2\2\u029d\u029f\7\23\2\2\u029e\u02a0\7\\\2\2\u029f\u029e"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\7T\2\2\u02a2"+
		"\u02a4\5\u0080A\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5"+
		"\3\2\2\2\u02a5\u02a7\7U\2\2\u02a6\u02a8\5Z.\2\u02a7\u02a6\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\7Z\2\2\u02aa\u02ab\5\u0082"+
		"B\2\u02ab\u02ac\7[\2\2\u02ac}\3\2\2\2\u02ad\u02ae\b@\1\2\u02ae\u02ca\5"+
		"|?\2\u02af\u02b0\79\2\2\u02b0\u02ca\5~@\33\u02b1\u02b2\7:\2\2\u02b2\u02ca"+
		"\5~@\32\u02b3\u02b4\7\62\2\2\u02b4\u02ca\5~@\27\u02b5\u02b6\7\63\2\2\u02b6"+
		"\u02ca\5~@\26\u02b7\u02b8\78\2\2\u02b8\u02ca\5~@\25\u02b9\u02ba\7\67\2"+
		"\2\u02ba\u02ca\5~@\24\u02bb\u02ca\5z>\2\u02bc\u02bd\7T\2\2\u02bd\u02be"+
		"\5~@\2\u02be\u02bf\7U\2\2\u02bf\u02ca\3\2\2\2\u02c0\u02ca\5t;\2\u02c1"+
		"\u02c2\7\'\2\2\u02c2\u02c3\5~@\2\u02c3\u02c4\5\62\32\2\u02c4\u02ca\3\2"+
		"\2\2\u02c5\u02ca\5v<\2\u02c6\u02ca\5P)\2\u02c7\u02ca\5T+\2\u02c8\u02ca"+
		"\5\u008aF\2\u02c9\u02ad\3\2\2\2\u02c9\u02af\3\2\2\2\u02c9\u02b1\3\2\2"+
		"\2\u02c9\u02b3\3\2\2\2\u02c9\u02b5\3\2\2\2\u02c9\u02b7\3\2\2\2\u02c9\u02b9"+
		"\3\2\2\2\u02c9\u02bb\3\2\2\2\u02c9\u02bc\3\2\2\2\u02c9\u02c0\3\2\2\2\u02c9"+
		"\u02c1\3\2\2\2\u02c9\u02c5\3\2\2\2\u02c9\u02c6\3\2\2\2\u02c9\u02c7\3\2"+
		"\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02ef\3\2\2\2\u02cb\u02cc\f\23\2\2\u02cc"+
		"\u02cd\t\t\2\2\u02cd\u02ee\5~@\24\u02ce\u02cf\f\22\2\2\u02cf\u02d0\t\n"+
		"\2\2\u02d0\u02ee\5~@\23\u02d1\u02d2\f\21\2\2\u02d2\u02d3\t\13\2\2\u02d3"+
		"\u02ee\5~@\22\u02d4\u02d5\f\20\2\2\u02d5\u02d6\t\f\2\2\u02d6\u02ee\5~"+
		"@\21\u02d7\u02d8\f\17\2\2\u02d8\u02d9\7G\2\2\u02d9\u02ee\5~@\20\u02da"+
		"\u02db\f\16\2\2\u02db\u02dc\7H\2\2\u02dc\u02ee\5~@\17\u02dd\u02de\f\r"+
		"\2\2\u02de\u02df\7I\2\2\u02df\u02ee\5~@\16\u02e0\u02e1\f\f\2\2\u02e1\u02e2"+
		"\7J\2\2\u02e2\u02ee\5~@\r\u02e3\u02e4\f\13\2\2\u02e4\u02e5\7Q\2\2\u02e5"+
		"\u02e6\5~@\2\u02e6\u02e7\7R\2\2\u02e7\u02e8\5~@\f\u02e8\u02ee\3\2\2\2"+
		"\u02e9\u02ea\f\31\2\2\u02ea\u02ee\79\2\2\u02eb\u02ec\f\30\2\2\u02ec\u02ee"+
		"\7:\2\2\u02ed\u02cb\3\2\2\2\u02ed\u02ce\3\2\2\2\u02ed\u02d1\3\2\2\2\u02ed"+
		"\u02d4\3\2\2\2\u02ed\u02d7\3\2\2\2\u02ed\u02da\3\2\2\2\u02ed\u02dd\3\2"+
		"\2\2\u02ed\u02e0\3\2\2\2\u02ed\u02e3\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\177\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f7\5\u0086D\2\u02f3"+
		"\u02f4\7P\2\2\u02f4\u02f6\5\u0086D\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3"+
		"\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0081\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02fa\u02fc\5\u0084C\2\u02fb\u02fa\3\2\2\2\u02fc\u02ff"+
		"\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0083\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u0300\u0302\7\26\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3"+
		"\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\5\b\5\2\u0304\u0085\3\2\2\2\u0305"+
		"\u0307\5p9\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2"+
		"\2\u0308\u030a\5\u0088E\2\u0309\u030b\7Q\2\2\u030a\u0309\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030e\5Z.\2\u030d\u030c\3\2\2"+
		"\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u0310\7B\2\2\u0310\u0312"+
		"\5~@\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0087\3\2\2\2\u0313"+
		"\u0314\t\r\2\2\u0314\u0089\3\2\2\2\u0315\u0316\t\16\2\2\u0316\u008b\3"+
		"\2\2\2V\u0092\u0096\u00a7\u00ac\u00b0\u00b4\u00be\u00c2\u00d8\u00e8\u00ed"+
		"\u00f3\u00f6\u0102\u010b\u0110\u0113\u0116\u0122\u0127\u012a\u0131\u013d"+
		"\u0140\u014b\u0156\u0159\u015c\u015f\u0162\u0167\u0176\u0180\u0185\u0189"+
		"\u018d\u0194\u0199\u019c\u01a0\u01a3\u01a8\u01ab\u01ae\u01b3\u01c0\u01c7"+
		"\u01ce\u01d2\u01d6\u01dd\u01e2\u01e5\u01f2\u01f7\u01fb\u0205\u020a\u0216"+
		"\u0222\u0229\u0237\u023c\u0245\u024a\u0273\u027d\u027f\u0288\u0297\u029b"+
		"\u029f\u02a3\u02a7\u02c9\u02ed\u02ef\u02f7\u02fd\u0301\u0306\u030a\u030d"+
		"\u0311";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}