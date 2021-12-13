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
		TK_NUMBER=13, TK_EXTENDS=14, TK_IF=15, TK_ELSE=16, NULL_LITERAL=17, BOOLEAN_LITERAL=18, 
		DECIMAL_INTEGER_LITERAL=19, DECIMAL_LITERAL=20, EXPONENT_PART=21, HEX_INTEGER_LITERAL=22, 
		OCTAL_INTEGER_LITERAL=23, OCTAL_INTEGER_LITERAL2=24, BINARY_INTEGER_LITERAL=25, 
		STRING_LITERAL=26, TK_PLUS=27, TK_MINUS=28, TK_STAR=29, TK_SLASH=30, TK_PERCENT=31, 
		TK_NOT=32, TK_BINNOT=33, TK_PLUSPLUS=34, TK_MINUSMINUS=35, TK_PLUS_ASIGN=36, 
		TK_MINUS_ASIGN=37, TK_STAR_ASIGN=38, TK_SLASH_ASIGN=39, TK_AND_ASIGN=40, 
		TK_OR_ASIGN=41, TK_PERCENT_ASIGN=42, TK_EQ=43, TK_EQEQ=44, TK_NOTEQ=45, 
		TK_IDENTEQ=46, TK_IDENTNOTEQ=47, TK_BIN_AND=48, TK_BIN_OR=49, TK_LOGIC_AND=50, 
		TK_LOGIC_OR=51, TK_LESS=52, TK_GREAT=53, TK_LESSEQ=54, TK_GREATEQ=55, 
		TK_POINT=56, TK_COMMA=57, TK_QMARK=58, TK_COLON=59, TK_SEMICOLON=60, TK_LPARENT=61, 
		TK_RPARENT=62, TK_LBRACKET=63, TK_RBRACKET=64, TK_DCUOTE=65, TK_SCUOTE=66, 
		TK_LCURLY=67, TK_RCURLY=68, TK_IDENT=69, DOUBLE_STRING_CHARACTER=70, SINGLE_STRING_CHARACTER=71, 
		ESCAPE_SEQUENCE=72, CHARACTER_ESCAPE_SEQUENCE=73, HEX_ESCAPE_SEQUENCE=74, 
		UNICODE_ESCAPE_SEQUENCE=75, EXTENDED_UNICODE_ESCAPE_SEQUENCE=76, SINGLE_ESCAPE_CHARACTER=77, 
		NON_ESCAPE_CHARACTER=78, LINE_CONTINUATION=79, HEX_DIGIT=80;
	public static final int
		RULE_compilationUnit = 0, RULE_statementList = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_emptyStatement = 4, RULE_ifStatement = 5, RULE_expressionSequence = 6, 
		RULE_expressionStatement = 7, RULE_variableStatement = 8, RULE_variableDeclList = 9, 
		RULE_variableDecl = 10, RULE_initializer = 11, RULE_arrayLiteral = 12, 
		RULE_arrayElement = 13, RULE_objectLiteral = 14, RULE_propertyAssign = 15, 
		RULE_propertyName = 16, RULE_typeAnnotation = 17, RULE_primitiveType = 18, 
		RULE_typeName = 19, RULE_parametricType = 20, RULE_simpleType = 21, RULE_arrayType = 22, 
		RULE_typeParameters = 23, RULE_typeParameterList = 24, RULE_typeParameter = 25, 
		RULE_extendsConstraint = 26, RULE_accessModifier = 27, RULE_varModifier = 28, 
		RULE_assignment = 29, RULE_expression = 30, RULE_literal = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "statementList", "block", "statement", "emptyStatement", 
			"ifStatement", "expressionSequence", "expressionStatement", "variableStatement", 
			"variableDeclList", "variableDecl", "initializer", "arrayLiteral", "arrayElement", 
			"objectLiteral", "propertyAssign", "propertyName", "typeAnnotation", 
			"primitiveType", "typeName", "parametricType", "simpleType", "arrayType", 
			"typeParameters", "typeParameterList", "typeParameter", "extendsConstraint", 
			"accessModifier", "varModifier", "assignment", "expression", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'public'", "'private'", "'protected'", "'var'", "'let'", 
			"'const'", "'readonly'", "'string'", "'any'", "'boolean'", "'number'", 
			"'extends'", "'if'", "'else'", "'null'", null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", 
			"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", 
			"'='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", 
			"'<'", "'>'", "'<='", "'>='", "'.'", "','", "'?'", "':'", "';'", "'('", 
			"')'", "'['", "']'", "'\"'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", "TK_PROTECTED", 
			"TK_VAR", "TK_LET", "TK_CONST", "TK_READ_ONLY", "TK_STRING", "TK_ANY", 
			"TK_BOOLEAN", "TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", "NULL_LITERAL", 
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
			"NON_ESCAPE_CHARACTER", "LINE_CONTINUATION", "HEX_DIGIT"
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
			setState(64);
			statementList();
			setState(65);
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
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_READ_ONLY) | (1L << TK_IF) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS) | (1L << TK_SEMICOLON) | (1L << TK_LPARENT) | (1L << TK_LBRACKET))) != 0) || _la==TK_LCURLY || _la==TK_IDENT );
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
			setState(72);
			match(TK_LCURLY);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_READ_ONLY) | (1L << TK_IF) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS) | (1L << TK_SEMICOLON) | (1L << TK_LPARENT) | (1L << TK_LBRACKET))) != 0) || _la==TK_LCURLY || _la==TK_IDENT) {
				{
				setState(73);
				statementList();
				}
			}

			setState(76);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode TK_SEMICOLON() { return getToken(TypeScriptParser.TK_SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TK_IF);
			setState(88);
			match(TK_LPARENT);
			setState(89);
			expressionSequence();
			setState(90);
			match(TK_RPARENT);
			setState(91);
			statement();
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(92);
				match(TK_ELSE);
				setState(93);
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
		enterRule(_localctx, 12, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			expression(0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(97);
				match(TK_COMMA);
				setState(98);
				expression(0);
				}
				}
				setState(103);
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
		enterRule(_localctx, 14, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expression(0);
			setState(105);
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
		public VariableDeclListContext variableDeclList() {
			return getRuleContext(VariableDeclListContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
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
		enterRule(_localctx, 16, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(107);
				accessModifier();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST))) != 0)) {
				{
				setState(110);
				varModifier();
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(113);
				match(TK_READ_ONLY);
				}
			}

			setState(116);
			variableDeclList();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
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
		enterRule(_localctx, 18, RULE_variableDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			variableDecl();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(121);
				match(TK_COMMA);
				setState(122);
				variableDecl();
				}
				}
				setState(127);
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
		enterRule(_localctx, 20, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(TK_IDENT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(129);
				typeAnnotation();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(132);
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
		enterRule(_localctx, 22, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TK_EQ);
			setState(136);
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
		enterRule(_localctx, 24, RULE_arrayLiteral);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(TK_LBRACKET);
				setState(139);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(TK_LBRACKET);
				setState(141);
				arrayElement();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(142);
					match(TK_COMMA);
					setState(143);
					arrayElement();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
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
		enterRule(_localctx, 26, RULE_arrayElement);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
		enterRule(_localctx, 28, RULE_objectLiteral);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(TK_LCURLY);
				setState(158);
				match(TK_RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(TK_LCURLY);
				setState(160);
				propertyAssign();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(161);
					match(TK_COMMA);
					setState(162);
					propertyAssign();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
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
		enterRule(_localctx, 30, RULE_propertyAssign);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				propertyName();
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==TK_EQ || _la==TK_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				expression(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(TK_LBRACKET);
				setState(177);
				expression(0);
				setState(178);
				match(TK_RBRACKET);
				setState(179);
				match(TK_COLON);
				setState(180);
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
		enterRule(_localctx, 32, RULE_propertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		enterRule(_localctx, 34, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TK_COLON);
			setState(187);
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
		enterRule(_localctx, 36, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 38, RULE_typeName);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				parametricType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				simpleType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
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
		enterRule(_localctx, 40, RULE_parametricType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			simpleType();
			setState(197);
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
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleType);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_STRING:
			case TK_ANY:
			case TK_BOOLEAN:
			case TK_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				primitiveType();
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			simpleType();
			setState(205);
			match(TK_LBRACKET);
			setState(206);
			match(TK_RBRACKET);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(208);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(209);
					match(TK_LBRACKET);
					setState(210);
					match(TK_RBRACKET);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 46, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(TK_LESS);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TK_STRING - 10)) | (1L << (TK_ANY - 10)) | (1L << (TK_BOOLEAN - 10)) | (1L << (TK_NUMBER - 10)) | (1L << (TK_IDENT - 10)))) != 0)) {
				{
				setState(217);
				typeParameterList();
				}
			}

			setState(220);
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
		enterRule(_localctx, 48, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			typeParameter();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(223);
				match(TK_COMMA);
				setState(224);
				typeParameter();
				}
				}
				setState(229);
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
		enterRule(_localctx, 50, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			typeName();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(231);
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
		enterRule(_localctx, 52, RULE_extendsConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(TK_EXTENDS);
			setState(235);
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
		enterRule(_localctx, 54, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 56, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
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
		enterRule(_localctx, 58, RULE_assignment);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(TK_IDENT);
				setState(242);
				match(TK_EQ);
				setState(243);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(TK_IDENT);
				setState(245);
				match(TK_PLUS_ASIGN);
				setState(246);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(TK_IDENT);
				setState(248);
				match(TK_MINUS_ASIGN);
				setState(249);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(TK_IDENT);
				setState(251);
				match(TK_STAR_ASIGN);
				setState(252);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(TK_IDENT);
				setState(254);
				match(TK_SLASH_ASIGN);
				setState(255);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(TK_IDENT);
				setState(257);
				match(TK_PERCENT_ASIGN);
				setState(258);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(TK_IDENT);
				setState(260);
				match(TK_AND_ASIGN);
				setState(261);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				match(TK_IDENT);
				setState(263);
				match(TK_OR_ASIGN);
				setState(264);
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

	public static class ExpressionContext extends ParserRuleContext {
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
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode TK_IDENT() { return getToken(TypeScriptParser.TK_IDENT, 0); }
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(268);
				match(TK_PLUSPLUS);
				setState(269);
				expression(23);
				}
				break;
			case 2:
				{
				setState(270);
				match(TK_MINUSMINUS);
				setState(271);
				expression(22);
				}
				break;
			case 3:
				{
				setState(272);
				match(TK_PLUS);
				setState(273);
				expression(19);
				}
				break;
			case 4:
				{
				setState(274);
				match(TK_MINUS);
				setState(275);
				expression(18);
				}
				break;
			case 5:
				{
				setState(276);
				match(TK_BINNOT);
				setState(277);
				expression(17);
				}
				break;
			case 6:
				{
				setState(278);
				match(TK_NOT);
				setState(279);
				expression(16);
				}
				break;
			case 7:
				{
				setState(280);
				match(TK_LPARENT);
				setState(281);
				expression(0);
				setState(282);
				match(TK_RPARENT);
				}
				break;
			case 8:
				{
				setState(284);
				assignment();
				}
				break;
			case 9:
				{
				setState(285);
				arrayLiteral();
				}
				break;
			case 10:
				{
				setState(286);
				objectLiteral();
				}
				break;
			case 11:
				{
				setState(287);
				match(TK_IDENT);
				}
				break;
			case 12:
				{
				setState(288);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(292);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_SLASH) | (1L << TK_PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(295);
						_la = _input.LA(1);
						if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(298);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_LESS) | (1L << TK_GREAT) | (1L << TK_LESSEQ) | (1L << TK_GREATEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(301);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_EQEQ) | (1L << TK_NOTEQ) | (1L << TK_IDENTEQ) | (1L << TK_IDENTNOTEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(304);
						match(TK_BIN_AND);
						setState(305);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(307);
						match(TK_BIN_OR);
						setState(308);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(310);
						match(TK_LOGIC_AND);
						setState(311);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(313);
						match(TK_LOGIC_OR);
						setState(314);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(316);
						match(TK_QMARK);
						setState(317);
						expression(0);
						setState(318);
						match(TK_COLON);
						setState(319);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(322);
						match(TK_PLUSPLUS);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(324);
						match(TK_MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		case 22:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 30:
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
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\6\3G\n\3\r\3\16\3H\3\4\3\4\5\4M\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3"+
		"\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\t\3\t\3\t\3\n\5\no\n\n\3\n\5\nr\n"+
		"\n\3\n\5\nu\n\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\7\13~\n\13\f\13\16\13"+
		"\u0081\13\13\3\f\3\f\5\f\u0085\n\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13\16\3\16"+
		"\3\16\5\16\u009a\n\16\3\17\3\17\5\17\u009e\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u00a6\n\20\f\20\16\20\u00a9\13\20\3\20\3\20\5\20\u00ad\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b9\n\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u00c5\n\25\3\26"+
		"\3\26\3\26\3\27\3\27\5\27\u00cc\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00d6\n\30\f\30\16\30\u00d9\13\30\3\31\3\31\5\31\u00dd\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7\13\32\3\33"+
		"\3\33\5\33\u00eb\n\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u010c\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0124\n \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \7 \u0148\n \f \16 \u014b\13 \3!\3!\3!\2\4.>\""+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\f"+
		"\4\2--==\5\2\3\3\34\34GG\3\2\f\17\3\2\5\7\3\2\b\n\3\2\37!\3\2\35\36\3"+
		"\2\669\3\2.\61\5\2\3\3\23\24\34\34\2\u0167\2B\3\2\2\2\4F\3\2\2\2\6J\3"+
		"\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16b\3\2\2\2\20j\3\2\2\2\22n\3"+
		"\2\2\2\24z\3\2\2\2\26\u0082\3\2\2\2\30\u0089\3\2\2\2\32\u0099\3\2\2\2"+
		"\34\u009d\3\2\2\2\36\u00ac\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00bc"+
		"\3\2\2\2&\u00bf\3\2\2\2(\u00c4\3\2\2\2*\u00c6\3\2\2\2,\u00cb\3\2\2\2."+
		"\u00cd\3\2\2\2\60\u00da\3\2\2\2\62\u00e0\3\2\2\2\64\u00e8\3\2\2\2\66\u00ec"+
		"\3\2\2\28\u00ef\3\2\2\2:\u00f1\3\2\2\2<\u010b\3\2\2\2>\u0123\3\2\2\2@"+
		"\u014c\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EG\5\b\5\2FE\3\2\2\2GH\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JL\7E\2\2KM\5\4\3\2LK\3\2\2\2LM\3"+
		"\2\2\2MN\3\2\2\2NO\7F\2\2O\7\3\2\2\2PV\5\6\4\2QV\5\22\n\2RV\5\f\7\2SV"+
		"\5\20\t\2TV\5\n\6\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2"+
		"V\t\3\2\2\2WX\7>\2\2X\13\3\2\2\2YZ\7\21\2\2Z[\7?\2\2[\\\5\16\b\2\\]\7"+
		"@\2\2]`\5\b\5\2^_\7\22\2\2_a\5\b\5\2`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2bg"+
		"\5> \2cd\7;\2\2df\5> \2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\17\3"+
		"\2\2\2ig\3\2\2\2jk\5> \2kl\7>\2\2l\21\3\2\2\2mo\58\35\2nm\3\2\2\2no\3"+
		"\2\2\2oq\3\2\2\2pr\5:\36\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\7\13\2\2ts"+
		"\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5\24\13\2wy\7>\2\2xw\3\2\2\2xy\3\2\2\2"+
		"y\23\3\2\2\2z\177\5\26\f\2{|\7;\2\2|~\5\26\f\2}{\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0084\7G\2\2\u0083\u0085\5$\23\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5\30\r\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\7-\2\2\u008a\u008b\5> \2\u008b"+
		"\31\3\2\2\2\u008c\u008d\7A\2\2\u008d\u009a\7B\2\2\u008e\u008f\7A\2\2\u008f"+
		"\u0094\5\34\17\2\u0090\u0091\7;\2\2\u0091\u0093\5\34\17\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7B\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u008c\3\2\2\2\u0099\u008e\3\2\2\2\u009a\33\3\2\2\2\u009b\u009e"+
		"\5> \2\u009c\u009e\7G\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\35\3\2\2\2\u009f\u00a0\7E\2\2\u00a0\u00ad\7F\2\2\u00a1\u00a2\7E\2\2\u00a2"+
		"\u00a7\5 \21\2\u00a3\u00a4\7;\2\2\u00a4\u00a6\5 \21\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7F\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00af"+
		"\5\"\22\2\u00af\u00b0\t\2\2\2\u00b0\u00b1\5> \2\u00b1\u00b9\3\2\2\2\u00b2"+
		"\u00b3\7A\2\2\u00b3\u00b4\5> \2\u00b4\u00b5\7B\2\2\u00b5\u00b6\7=\2\2"+
		"\u00b6\u00b7\5> \2\u00b7\u00b9\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b2"+
		"\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb#\3\2\2\2\u00bc\u00bd"+
		"\7=\2\2\u00bd\u00be\5(\25\2\u00be%\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0\'"+
		"\3\2\2\2\u00c1\u00c5\5*\26\2\u00c2\u00c5\5,\27\2\u00c3\u00c5\5.\30\2\u00c4"+
		"\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5)\3\2\2\2"+
		"\u00c6\u00c7\5,\27\2\u00c7\u00c8\5\60\31\2\u00c8+\3\2\2\2\u00c9\u00cc"+
		"\5&\24\2\u00ca\u00cc\7G\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"-\3\2\2\2\u00cd\u00ce\b\30\1\2\u00ce\u00cf\5,\27\2\u00cf\u00d0\7A\2\2"+
		"\u00d0\u00d1\7B\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\f\4\2\2\u00d3\u00d4"+
		"\7A\2\2\u00d4\u00d6\7B\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8/\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00da\u00dc\7\66\2\2\u00db\u00dd\5\62\32\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\67\2\2\u00df\61\3\2\2"+
		"\2\u00e0\u00e5\5\64\33\2\u00e1\u00e2\7;\2\2\u00e2\u00e4\5\64\33\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\63\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5(\25\2\u00e9\u00eb"+
		"\5\66\34\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\65\3\2\2\2\u00ec"+
		"\u00ed\7\20\2\2\u00ed\u00ee\5(\25\2\u00ee\67\3\2\2\2\u00ef\u00f0\t\5\2"+
		"\2\u00f09\3\2\2\2\u00f1\u00f2\t\6\2\2\u00f2;\3\2\2\2\u00f3\u00f4\7G\2"+
		"\2\u00f4\u00f5\7-\2\2\u00f5\u010c\5> \2\u00f6\u00f7\7G\2\2\u00f7\u00f8"+
		"\7&\2\2\u00f8\u010c\5> \2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7\'\2\2\u00fb"+
		"\u010c\5> \2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7(\2\2\u00fe\u010c\5> \2\u00ff"+
		"\u0100\7G\2\2\u0100\u0101\7)\2\2\u0101\u010c\5> \2\u0102\u0103\7G\2\2"+
		"\u0103\u0104\7,\2\2\u0104\u010c\5> \2\u0105\u0106\7G\2\2\u0106\u0107\7"+
		"*\2\2\u0107\u010c\5> \2\u0108\u0109\7G\2\2\u0109\u010a\7+\2\2\u010a\u010c"+
		"\5> \2\u010b\u00f3\3\2\2\2\u010b\u00f6\3\2\2\2\u010b\u00f9\3\2\2\2\u010b"+
		"\u00fc\3\2\2\2\u010b\u00ff\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0105\3\2"+
		"\2\2\u010b\u0108\3\2\2\2\u010c=\3\2\2\2\u010d\u010e\b \1\2\u010e\u010f"+
		"\7$\2\2\u010f\u0124\5> \31\u0110\u0111\7%\2\2\u0111\u0124\5> \30\u0112"+
		"\u0113\7\35\2\2\u0113\u0124\5> \25\u0114\u0115\7\36\2\2\u0115\u0124\5"+
		"> \24\u0116\u0117\7#\2\2\u0117\u0124\5> \23\u0118\u0119\7\"\2\2\u0119"+
		"\u0124\5> \22\u011a\u011b\7?\2\2\u011b\u011c\5> \2\u011c\u011d\7@\2\2"+
		"\u011d\u0124\3\2\2\2\u011e\u0124\5<\37\2\u011f\u0124\5\32\16\2\u0120\u0124"+
		"\5\36\20\2\u0121\u0124\7G\2\2\u0122\u0124\5@!\2\u0123\u010d\3\2\2\2\u0123"+
		"\u0110\3\2\2\2\u0123\u0112\3\2\2\2\u0123\u0114\3\2\2\2\u0123\u0116\3\2"+
		"\2\2\u0123\u0118\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011e\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0149\3\2\2\2\u0125\u0126\f\21\2\2\u0126\u0127\t\7\2\2\u0127"+
		"\u0148\5> \22\u0128\u0129\f\20\2\2\u0129\u012a\t\b\2\2\u012a\u0148\5>"+
		" \21\u012b\u012c\f\17\2\2\u012c\u012d\t\t\2\2\u012d\u0148\5> \20\u012e"+
		"\u012f\f\16\2\2\u012f\u0130\t\n\2\2\u0130\u0148\5> \17\u0131\u0132\f\r"+
		"\2\2\u0132\u0133\7\62\2\2\u0133\u0148\5> \16\u0134\u0135\f\f\2\2\u0135"+
		"\u0136\7\63\2\2\u0136\u0148\5> \r\u0137\u0138\f\13\2\2\u0138\u0139\7\64"+
		"\2\2\u0139\u0148\5> \f\u013a\u013b\f\n\2\2\u013b\u013c\7\65\2\2\u013c"+
		"\u0148\5> \13\u013d\u013e\f\t\2\2\u013e\u013f\7<\2\2\u013f\u0140\5> \2"+
		"\u0140\u0141\7=\2\2\u0141\u0142\5> \n\u0142\u0148\3\2\2\2\u0143\u0144"+
		"\f\27\2\2\u0144\u0148\7$\2\2\u0145\u0146\f\26\2\2\u0146\u0148\7%\2\2\u0147"+
		"\u0125\3\2\2\2\u0147\u0128\3\2\2\2\u0147\u012b\3\2\2\2\u0147\u012e\3\2"+
		"\2\2\u0147\u0131\3\2\2\2\u0147\u0134\3\2\2\2\u0147\u0137\3\2\2\2\u0147"+
		"\u013a\3\2\2\2\u0147\u013d\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"?\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\t\13\2\2\u014dA\3\2\2\2\36H"+
		"LU`gnqtx\177\u0084\u0087\u0094\u0099\u009d\u00a7\u00ac\u00b8\u00c4\u00cb"+
		"\u00d7\u00dc\u00e5\u00ea\u010b\u0123\u0147\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}