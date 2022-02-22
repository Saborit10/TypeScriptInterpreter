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
		T__0=1, NUMERIC_LITERAL=2, WS=3, TK_PUBLIC=4, TK_PRIVATE=5, TK_PROTECTED=6, 
		TK_VAR=7, TK_LET=8, TK_CONST=9, TK_READ_ONLY=10, TK_STRING=11, TK_ANY=12, 
		TK_BOOLEAN=13, TK_NUMBER=14, TK_EXTENDS=15, TK_IF=16, TK_ELSE=17, TK_FUNCTION=18, 
		TK_TYPE=19, TK_REQUIRE=20, TK_EXPORT=21, TK_RETURN=22, TK_CONTINUE=23, 
		TK_BREAK=24, TK_FOR=25, TK_IN=26, TK_OF=27, TK_DO=28, TK_WHILE=29, TK_CLASS=30, 
		TK_IMPLEMENTS=31, TK_ABSTRACT=32, TK_CONSTRUCTOR=33, TK_ASYNC=34, TK_STATIC=35, 
		TK_GET=36, TK_SET=37, TK_NEW=38, TK_SWITCH=39, TK_CASE=40, TK_DEFAULT=41, 
		TK_THIS=42, NULL_LITERAL=43, BOOLEAN_LITERAL=44, DECIMAL_INTEGER_LITERAL=45, 
		DECIMAL_LITERAL=46, EXPONENT_PART=47, HEX_INTEGER_LITERAL=48, OCTAL_INTEGER_LITERAL=49, 
		OCTAL_INTEGER_LITERAL2=50, BINARY_INTEGER_LITERAL=51, STRING_LITERAL=52, 
		TK_PLUS=53, TK_MINUS=54, TK_STAR=55, TK_SLASH=56, TK_PERCENT=57, TK_NOT=58, 
		TK_BINNOT=59, TK_PLUSPLUS=60, TK_MINUSMINUS=61, TK_PLUS_ASIGN=62, TK_MINUS_ASIGN=63, 
		TK_STAR_ASIGN=64, TK_SLASH_ASIGN=65, TK_AND_ASIGN=66, TK_OR_ASIGN=67, 
		TK_PERCENT_ASIGN=68, TK_EQ=69, TK_EQEQ=70, TK_NOTEQ=71, TK_IDENTEQ=72, 
		TK_IDENTNOTEQ=73, TK_BIN_AND=74, TK_BIN_OR=75, TK_LOGIC_AND=76, TK_LOGIC_OR=77, 
		TK_LESS=78, TK_GREAT=79, TK_LESSEQ=80, TK_GREATEQ=81, TK_POINT=82, TK_COMMA=83, 
		TK_QMARK=84, TK_COLON=85, TK_SEMICOLON=86, TK_LPARENT=87, TK_RPARENT=88, 
		TK_LBRACKET=89, TK_RBRACKET=90, TK_DCUOTE=91, TK_SCUOTE=92, TK_LCURLY=93, 
		TK_RCURLY=94, TK_IDENT=95, DOUBLE_STRING_CHARACTER=96, SINGLE_STRING_CHARACTER=97, 
		ESCAPE_SEQUENCE=98, CHARACTER_ESCAPE_SEQUENCE=99, HEX_ESCAPE_SEQUENCE=100, 
		UNICODE_ESCAPE_SEQUENCE=101, EXTENDED_UNICODE_ESCAPE_SEQUENCE=102, SINGLE_ESCAPE_CHARACTER=103, 
		NON_ESCAPE_CHARACTER=104, LINE_CONTINUATION=105, HEX_DIGIT=106, TK_MULTILINE_COMMENT=107, 
		TK_SINGLELINE_COMMENT=108;
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
		RULE_assignmentOperator = 68, RULE_expression = 69, RULE_formalParameterList = 70, 
		RULE_functionBody = 71, RULE_sourceElem = 72, RULE_formalParameterArg = 73, 
		RULE_identifierOrKeyword = 74, RULE_literal = 75;
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
			"functionExpressionDecl", "assignmentOperator", "expression", "formalParameterList", 
			"functionBody", "sourceElem", "formalParameterArg", "identifierOrKeyword", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console.log'", null, null, "'public'", "'private'", "'protected'", 
			"'var'", "'let'", "'const'", "'readonly'", "'string'", "'any'", "'boolean'", 
			"'number'", "'extends'", "'if'", "'else'", "'function'", "'type'", "'require'", 
			"'export'", "'return'", "'continue'", "'break'", "'for'", "'in'", "'of'", 
			"'do'", "'while'", "'class'", "'implements'", "'abstract'", "'constructor'", 
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
			null, null, "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", "TK_PROTECTED", 
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			statementList();
			setState(153);
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
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				statement();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_SEMICOLON - 86)) | (1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0) );
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
			setState(160);
			match(TK_LCURLY);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_SEMICOLON - 86)) | (1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
				{
				setState(161);
				statementList();
				}
			}

			setState(164);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				printStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				variableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				doStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				switchStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				classStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(175);
				continueStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(176);
				breakStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(177);
				returnStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(178);
				functionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(179);
				expressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(180);
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
			setState(183);
			match(T__0);
			setState(184);
			match(TK_LPARENT);
			setState(185);
			expression(0);
			setState(186);
			match(TK_RPARENT);
			setState(187);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ForNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(TK_FOR);
				setState(190);
				match(TK_LPARENT);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
					{
					setState(191);
					expressionSequence();
					}
				}

				setState(194);
				match(TK_SEMICOLON);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
					{
					setState(195);
					conditionExpressionSequence();
					}
				}

				setState(198);
				match(TK_SEMICOLON);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
					{
					setState(199);
					lastExpressionSequence();
					}
				}

				setState(202);
				match(TK_RPARENT);
				setState(203);
				statement();
				}
				break;
			case 2:
				_localctx = new ForVarNormalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(TK_FOR);
				setState(205);
				match(TK_LPARENT);
				setState(206);
				varModifier();
				setState(207);
				variableDeclList();
				setState(208);
				match(TK_SEMICOLON);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
					{
					setState(209);
					conditionExpressionSequence();
					}
				}

				setState(212);
				match(TK_SEMICOLON);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
					{
					setState(213);
					lastExpressionSequence();
					}
				}

				setState(216);
				match(TK_RPARENT);
				setState(217);
				statement();
				}
				break;
			case 3:
				_localctx = new ForIteratorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(TK_FOR);
				setState(220);
				match(TK_LPARENT);
				setState(221);
				expression(0);
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				expressionSequence();
				setState(224);
				match(TK_RPARENT);
				setState(225);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarIteratorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(TK_FOR);
				setState(228);
				match(TK_LPARENT);
				setState(229);
				varModifier();
				setState(230);
				variableDecl();
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==TK_IN || _la==TK_OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				expressionSequence();
				setState(233);
				match(TK_RPARENT);
				setState(234);
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
			setState(238);
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
			setState(242);
			match(TK_WHILE);
			setState(243);
			match(TK_LPARENT);
			setState(244);
			expressionSequence();
			setState(245);
			match(TK_RPARENT);
			setState(246);
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
			setState(248);
			match(TK_DO);
			setState(249);
			statement();
			setState(250);
			match(TK_WHILE);
			setState(251);
			match(TK_LPARENT);
			setState(252);
			expressionSequence();
			setState(253);
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
			setState(255);
			match(TK_SWITCH);
			setState(256);
			match(TK_LPARENT);
			setState(257);
			expressionSequence();
			setState(258);
			match(TK_RPARENT);
			setState(259);
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
			setState(261);
			match(TK_LCURLY);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_CASE) {
				{
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262);
					caseClause();
					}
					}
					setState(265); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_CASE );
				}
			}

			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFAULT) {
				{
				setState(269);
				defaultClause();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_CASE) {
					{
					setState(270);
					afterCaseClauseList();
					}
				}

				}
			}

			setState(275);
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
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				caseClause();
				}
				}
				setState(280); 
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
			setState(282);
			match(TK_CASE);
			setState(283);
			expressionSequence();
			setState(284);
			match(TK_COLON);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_SEMICOLON - 86)) | (1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
				{
				setState(285);
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
			setState(288);
			match(TK_DEFAULT);
			setState(289);
			match(TK_COLON);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_SEMICOLON - 86)) | (1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
				{
				setState(290);
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
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ABSTRACT) {
				{
				setState(293);
				match(TK_ABSTRACT);
				}
			}

			setState(296);
			match(TK_CLASS);
			setState(297);
			match(TK_IDENT);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(298);
				typeParameters();
				}
			}

			setState(301);
			classHeritage();
			setState(302);
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
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(304);
				classExtendsClause();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IMPLEMENTS) {
				{
				setState(307);
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
			setState(310);
			match(TK_EXTENDS);
			setState(311);
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
			setState(313);
			match(TK_IMPLEMENTS);
			setState(314);
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
			setState(316);
			match(TK_LCURLY);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_READ_ONLY) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_CONSTRUCTOR) | (1L << TK_ASYNC) | (1L << TK_STATIC) | (1L << TK_GET) | (1L << TK_SET) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_SEMICOLON - 86)) | (1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
				{
				{
				setState(317);
				classElement();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				memberDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				indexMemberDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
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
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ClassMemberPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				propertyMemberBase();
				setState(332);
				propertyName();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_QMARK) {
					{
					setState(333);
					match(TK_QMARK);
					}
				}

				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(336);
					typeAnnotation();
					}
				}

				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_EQ) {
					{
					setState(339);
					initializer();
					}
				}

				setState(342);
				match(TK_SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ClassMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				propertyMemberBase();
				setState(345);
				propertyName();
				setState(346);
				callSignature();
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LCURLY:
					{
					{
					setState(347);
					match(TK_LCURLY);
					setState(348);
					functionBody();
					setState(349);
					match(TK_RCURLY);
					}
					}
					break;
				case TK_SEMICOLON:
					{
					setState(351);
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
				setState(354);
				propertyMemberBase();
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_GET:
					{
					setState(355);
					getter();
					}
					break;
				case TK_SET:
					{
					setState(356);
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
				setState(359);
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
			setState(362);
			match(TK_GET);
			setState(363);
			propertyName();
			setState(364);
			match(TK_LPARENT);
			setState(365);
			match(TK_RPARENT);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(366);
				typeAnnotation();
				}
			}

			setState(369);
			match(TK_LCURLY);
			setState(370);
			functionBody();
			setState(371);
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
			setState(373);
			match(TK_SET);
			setState(374);
			propertyName();
			setState(375);
			match(TK_LPARENT);
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(376);
				match(TK_IDENT);
				}
				break;
			case TK_LBRACKET:
				{
				setState(377);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				{
				setState(378);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(381);
				typeAnnotation();
				}
			}

			setState(384);
			match(TK_RPARENT);
			setState(385);
			match(TK_LCURLY);
			setState(386);
			functionBody();
			setState(387);
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
			setState(389);
			match(TK_ABSTRACT);
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(390);
				match(TK_IDENT);
				setState(391);
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
				setState(392);
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
			setState(395);
			match(TK_LBRACKET);
			setState(396);
			match(TK_IDENT);
			setState(397);
			match(TK_COLON);
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==TK_STRING || _la==TK_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(399);
			match(TK_RBRACKET);
			setState(400);
			typeAnnotation();
			setState(401);
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
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ASYNC) {
				{
				setState(403);
				match(TK_ASYNC);
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(406);
				accessModifier();
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_STATIC) {
				{
				setState(409);
				match(TK_STATIC);
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(412);
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
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(415);
				accessModifier();
				}
			}

			setState(418);
			match(TK_CONSTRUCTOR);
			setState(419);
			match(TK_LPARENT);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(420);
				formalParameterList();
				}
			}

			setState(423);
			match(TK_RPARENT);
			setState(424);
			match(TK_LCURLY);
			setState(425);
			functionBody();
			setState(426);
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
			setState(428);
			match(TK_FUNCTION);
			setState(429);
			match(TK_IDENT);
			setState(430);
			callSignature();
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LCURLY:
				{
				{
				setState(431);
				match(TK_LCURLY);
				setState(432);
				functionBody();
				setState(433);
				match(TK_RCURLY);
				}
				}
				break;
			case TK_SEMICOLON:
				{
				setState(435);
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
			setState(438);
			match(TK_CONTINUE);
			setState(439);
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
			setState(441);
			match(TK_BREAK);
			setState(442);
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
			setState(444);
			match(TK_RETURN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
				{
				setState(445);
				expressionSequence();
				}
			}

			setState(448);
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
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LESS) {
				{
				setState(450);
				typeParameters();
				}
			}

			setState(453);
			match(TK_LPARENT);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (TK_LBRACKET - 89)) | (1L << (TK_LCURLY - 89)) | (1L << (TK_IDENT - 89)))) != 0)) {
				{
				setState(454);
				parameterList();
				}
			}

			setState(457);
			match(TK_RPARENT);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(458);
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
			setState(461);
			parameter();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(462);
				match(TK_COMMA);
				setState(463);
				parameter();
				}
				}
				setState(468);
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
			setState(469);
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
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(471);
				accessModifier();
				}
			}

			setState(474);
			identifierOrPattern();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(475);
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
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(478);
				accessModifier();
				}
			}

			setState(481);
			identifierOrPattern();
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_QMARK:
				{
				setState(482);
				match(TK_QMARK);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(483);
					typeAnnotation();
					}
				}

				}
				break;
			case TK_EQ:
			case TK_COLON:
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_COLON) {
					{
					setState(486);
					typeAnnotation();
					}
				}

				setState(489);
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
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				identifierOrReservedWord();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				arrayLiteral();
				}
				break;
			case TK_LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
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
			setState(497);
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
			setState(499);
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
			setState(501);
			match(TK_IF);
			setState(502);
			match(TK_LPARENT);
			setState(503);
			expressionSequence();
			setState(504);
			match(TK_RPARENT);
			setState(505);
			statement();
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(506);
				match(TK_ELSE);
				setState(507);
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
			setState(510);
			expression(0);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(511);
				match(TK_COMMA);
				setState(512);
				expression(0);
				}
				}
				setState(517);
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
			setState(518);
			expression(0);
			setState(519);
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
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(521);
				accessModifier();
				}
			}

			setState(524);
			varModifier();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_READ_ONLY) {
				{
				setState(525);
				match(TK_READ_ONLY);
				}
			}

			setState(528);
			variableDeclList();
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(529);
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
			setState(532);
			variableDecl();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(533);
				match(TK_COMMA);
				setState(534);
				variableDecl();
				}
				}
				setState(539);
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
			setState(540);
			match(TK_IDENT);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(541);
				typeAnnotation();
				}
			}

			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(544);
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
			setState(547);
			match(TK_EQ);
			setState(548);
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
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new ArrayLiteralEmptyAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(TK_LBRACKET);
				setState(551);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(TK_LBRACKET);
				setState(553);
				arrayElement();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(554);
					match(TK_COMMA);
					setState(555);
					arrayElement();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(561);
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
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
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
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new ObjLiteralEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(TK_LCURLY);
				setState(570);
				match(TK_RCURLY);
				}
				break;
			case 2:
				_localctx = new ObjLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(TK_LCURLY);
				setState(572);
				propertyAssign();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(573);
					match(TK_COMMA);
					setState(574);
					propertyAssign();
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580);
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
			setState(584);
			propertyName();
			setState(585);
			_la = _input.LA(1);
			if ( !(_la==TK_EQ || _la==TK_COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(586);
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
			setState(588);
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
			setState(590);
			match(TK_COLON);
			setState(591);
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
			setState(593);
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
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				parametricType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				simpleType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
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
			setState(600);
			simpleType();
			setState(601);
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
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_STRING:
			case TK_BOOLEAN:
			case TK_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				primitiveType();
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
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
			setState(607);
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
			setState(610);
			simpleType();
			setState(611);
			match(TK_LBRACKET);
			setState(612);
			match(TK_RBRACKET);
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
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
					setState(614);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(615);
					match(TK_LBRACKET);
					setState(616);
					match(TK_RBRACKET);
					}
					} 
				}
				setState(621);
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
			setState(622);
			match(TK_LESS);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << TK_BOOLEAN) | (1L << TK_NUMBER))) != 0) || _la==TK_IDENT) {
				{
				setState(623);
				typeParameterList();
				}
			}

			setState(626);
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
			setState(628);
			typeParameter();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(629);
				match(TK_COMMA);
				setState(630);
				typeParameter();
				}
				}
				setState(635);
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
			setState(636);
			typeName();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXTENDS) {
				{
				setState(637);
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
			setState(640);
			match(TK_EXTENDS);
			setState(641);
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
			setState(643);
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
			setState(645);
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
			setState(647);
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
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(TK_IDENT);
				setState(650);
				match(TK_LPARENT);
				setState(651);
				expressionSequence();
				setState(652);
				match(TK_RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(TK_IDENT);
				setState(655);
				match(TK_LPARENT);
				setState(656);
				match(TK_RPARENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(TK_LPARENT);
				setState(658);
				functionExpressionDecl();
				setState(659);
				match(TK_RPARENT);
				setState(660);
				match(TK_LPARENT);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << TK_FUNCTION) | (1L << TK_NEW) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (TK_LPARENT - 87)) | (1L << (TK_LBRACKET - 87)) | (1L << (TK_LCURLY - 87)) | (1L << (TK_IDENT - 87)))) != 0)) {
					{
					setState(661);
					expressionSequence();
					}
				}

				setState(664);
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
			setState(668);
			match(TK_FUNCTION);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_IDENT) {
				{
				setState(669);
				match(TK_IDENT);
				}
			}

			setState(672);
			match(TK_LPARENT);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_TYPE) | (1L << TK_REQUIRE))) != 0) || _la==TK_IDENT) {
				{
				setState(673);
				formalParameterList();
				}
			}

			setState(676);
			match(TK_RPARENT);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(677);
				typeAnnotation();
				}
			}

			setState(680);
			match(TK_LCURLY);
			setState(681);
			functionBody();
			setState(682);
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
			setState(684);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (TK_PLUS_ASIGN - 62)) | (1L << (TK_MINUS_ASIGN - 62)) | (1L << (TK_STAR_ASIGN - 62)) | (1L << (TK_SLASH_ASIGN - 62)) | (1L << (TK_AND_ASIGN - 62)) | (1L << (TK_OR_ASIGN - 62)) | (1L << (TK_PERCENT_ASIGN - 62)) | (1L << (TK_EQ - 62)))) != 0)) ) {
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
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFunctionObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(687);
				functionExpressionDecl();
				}
				break;
			case 2:
				{
				_localctx = new ExprPlusPlusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(TK_PLUSPLUS);
				setState(689);
				expression(33);
				}
				break;
			case 3:
				{
				_localctx = new ExprMinusMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(690);
				match(TK_MINUSMINUS);
				setState(691);
				expression(32);
				}
				break;
			case 4:
				{
				_localctx = new ExprPlusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(692);
				match(TK_PLUS);
				setState(693);
				expression(29);
				}
				break;
			case 5:
				{
				_localctx = new ExprMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(694);
				match(TK_MINUS);
				setState(695);
				expression(28);
				}
				break;
			case 6:
				{
				_localctx = new ExprBinaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(696);
				match(TK_BINNOT);
				setState(697);
				expression(27);
				}
				break;
			case 7:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(698);
				match(TK_NOT);
				setState(699);
				expression(26);
				}
				break;
			case 8:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(700);
				functionCall();
				}
				break;
			case 9:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(701);
				match(TK_LPARENT);
				setState(702);
				expressionSequence();
				setState(703);
				match(TK_RPARENT);
				}
				break;
			case 10:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(705);
				match(TK_NEW);
				setState(706);
				functionCall();
				}
				break;
			case 11:
				{
				_localctx = new ExprArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(707);
				arrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new ExprObjectLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(708);
				objectLiteral();
				}
				break;
			case 13:
				{
				_localctx = new ExprPrimitiveLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(709);
				literal();
				}
				break;
			case 14:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(710);
				match(TK_IDENT);
				}
				break;
			case 15:
				{
				_localctx = new ExprThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(711);
				match(TK_THIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(783);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivPercContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(715);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_SLASH) | (1L << TK_PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(716);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new ExprSumSubsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(718);
						_la = _input.LA(1);
						if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(719);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new ExprComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(721);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TK_LESS - 78)) | (1L << (TK_GREAT - 78)) | (1L << (TK_LESSEQ - 78)) | (1L << (TK_GREATEQ - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(722);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(723);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(724);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (TK_EQEQ - 70)) | (1L << (TK_NOTEQ - 70)) | (1L << (TK_IDENTEQ - 70)) | (1L << (TK_IDENTNOTEQ - 70)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(725);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new ExprBinAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(727);
						match(TK_BIN_AND);
						setState(728);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new ExprBinOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(730);
						match(TK_BIN_OR);
						setState(731);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new ExprLogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(733);
						match(TK_LOGIC_AND);
						setState(734);
						expression(20);
						}
						break;
					case 8:
						{
						_localctx = new ExprLogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(736);
						match(TK_LOGIC_OR);
						setState(737);
						expression(19);
						}
						break;
					case 9:
						{
						_localctx = new ExprTernaryOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(739);
						match(TK_QMARK);
						setState(740);
						expression(0);
						setState(741);
						match(TK_COLON);
						setState(742);
						expression(18);
						}
						break;
					case 10:
						{
						_localctx = new ExprAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(745);
						match(TK_EQ);
						setState(746);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new ExprPlusAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(748);
						match(TK_PLUS_ASIGN);
						setState(749);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ExprMinusAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(751);
						match(TK_MINUS_ASIGN);
						setState(752);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new ExprMultAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(754);
						match(TK_STAR_ASIGN);
						setState(755);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new ExprDivAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(757);
						match(TK_SLASH_ASIGN);
						setState(758);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new ExprPercentAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(759);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(760);
						match(TK_PERCENT_ASIGN);
						setState(761);
						expression(10);
						}
						break;
					case 16:
						{
						_localctx = new ExprAndAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(763);
						match(TK_AND_ASIGN);
						setState(764);
						expression(9);
						}
						break;
					case 17:
						{
						_localctx = new ExprOrAsigContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(766);
						match(TK_OR_ASIGN);
						setState(767);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new ExprObjectIndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(769);
						match(TK_LBRACKET);
						setState(770);
						expressionSequence();
						setState(771);
						match(TK_RBRACKET);
						}
						break;
					case 19:
						{
						_localctx = new ExprDotIdentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(773);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(774);
						match(TK_POINT);
						setState(775);
						identifier();
						}
						break;
					case 20:
						{
						_localctx = new ExprDotFunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(776);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(777);
						match(TK_POINT);
						setState(778);
						functionCall();
						}
						break;
					case 21:
						{
						_localctx = new ExprOpPlusPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(779);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(780);
						match(TK_PLUSPLUS);
						}
						break;
					case 22:
						{
						_localctx = new ExprOpMinusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(782);
						match(TK_MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(787);
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
		enterRule(_localctx, 140, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			formalParameterArg();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(789);
				match(TK_COMMA);
				setState(790);
				formalParameterArg();
				}
				}
				setState(795);
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
		enterRule(_localctx, 142, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMERIC_LITERAL) | (1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED) | (1L << TK_VAR) | (1L << TK_LET) | (1L << TK_CONST) | (1L << TK_IF) | (1L << TK_FUNCTION) | (1L << TK_EXPORT) | (1L << TK_RETURN) | (1L << TK_CONTINUE) | (1L << TK_BREAK) | (1L << TK_FOR) | (1L << TK_DO) | (1L << TK_WHILE) | (1L << TK_CLASS) | (1L << TK_ABSTRACT) | (1L << TK_NEW) | (1L << TK_SWITCH) | (1L << TK_THIS) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_NOT) | (1L << TK_BINNOT) | (1L << TK_PLUSPLUS) | (1L << TK_MINUSMINUS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (TK_SEMICOLON - 86)) | (1L << (TK_LPARENT - 86)) | (1L << (TK_LBRACKET - 86)) | (1L << (TK_LCURLY - 86)) | (1L << (TK_IDENT - 86)))) != 0)) {
				{
				{
				setState(796);
				sourceElem();
				}
				}
				setState(801);
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
		enterRule(_localctx, 144, RULE_sourceElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXPORT) {
				{
				setState(802);
				match(TK_EXPORT);
				}
			}

			setState(805);
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
		enterRule(_localctx, 146, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PUBLIC) | (1L << TK_PRIVATE) | (1L << TK_PROTECTED))) != 0)) {
				{
				setState(807);
				accessModifier();
				}
			}

			setState(810);
			identifierOrKeyword();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_QMARK) {
				{
				setState(811);
				match(TK_QMARK);
				}
			}

			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(814);
				typeAnnotation();
				}
			}

			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EQ) {
				{
				setState(817);
				match(TK_EQ);
				setState(818);
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
		enterRule(_localctx, 148, RULE_identifierOrKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
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
		enterRule(_localctx, 150, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u033c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\3\6\3\u009f\n\3\r\3\16\3\u00a0"+
		"\3\4\3\4\5\4\u00a5\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u00b8\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\5\7\u00c3\n\7\3\7\3\7\5\7\u00c7\n\7\3\7\3\7\5\7\u00cb\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00d5\n\7\3\7\3\7\5\7\u00d9\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00ef\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\6\r\u010a\n\r\r\r\16\r"+
		"\u010b\5\r\u010e\n\r\3\r\3\r\5\r\u0112\n\r\5\r\u0114\n\r\3\r\3\r\3\16"+
		"\6\16\u0119\n\16\r\16\16\16\u011a\3\17\3\17\3\17\3\17\5\17\u0121\n\17"+
		"\3\20\3\20\3\20\5\20\u0126\n\20\3\21\5\21\u0129\n\21\3\21\3\21\3\21\5"+
		"\21\u012e\n\21\3\21\3\21\3\21\3\22\5\22\u0134\n\22\3\22\5\22\u0137\n\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u0141\n\25\f\25\16\25\u0144"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u014c\n\26\3\27\3\27\3\27\5"+
		"\27\u0151\n\27\3\27\5\27\u0154\n\27\3\27\5\27\u0157\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0163\n\27\3\27\3\27\3\27\5\27"+
		"\u0168\n\27\3\27\5\27\u016b\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0172\n"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017e\n\31"+
		"\3\31\5\31\u0181\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32"+
		"\u018c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\5\34\u0197\n"+
		"\34\3\34\5\34\u019a\n\34\3\34\5\34\u019d\n\34\3\34\5\34\u01a0\n\34\3\35"+
		"\5\35\u01a3\n\35\3\35\3\35\3\35\5\35\u01a8\n\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b7\n\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\5!\u01c1\n!\3!\3!\3\"\5\"\u01c6\n\"\3\"\3\"\5\"\u01ca"+
		"\n\"\3\"\3\"\5\"\u01ce\n\"\3#\3#\3#\7#\u01d3\n#\f#\16#\u01d6\13#\3$\3"+
		"$\3%\5%\u01db\n%\3%\3%\5%\u01df\n%\3&\5&\u01e2\n&\3&\3&\3&\5&\u01e7\n"+
		"&\3&\5&\u01ea\n&\3&\5&\u01ed\n&\3\'\3\'\3\'\5\'\u01f2\n\'\3(\3(\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\5*\u01ff\n*\3+\3+\3+\7+\u0204\n+\f+\16+\u0207\13"+
		"+\3,\3,\3,\3-\5-\u020d\n-\3-\3-\5-\u0211\n-\3-\3-\5-\u0215\n-\3.\3.\3"+
		".\7.\u021a\n.\f.\16.\u021d\13.\3/\3/\5/\u0221\n/\3/\5/\u0224\n/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u022f\n\61\f\61\16\61\u0232"+
		"\13\61\3\61\3\61\5\61\u0236\n\61\3\62\3\62\5\62\u023a\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\7\63\u0242\n\63\f\63\16\63\u0245\13\63\3\63\3\63\5"+
		"\63\u0249\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\38\58\u0259\n8\39\39\39\3:\3:\5:\u0260\n:\3;\3;\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\7<\u026c\n<\f<\16<\u026f\13<\3=\3=\5=\u0273\n=\3=\3=\3>\3>\3"+
		">\7>\u027a\n>\f>\16>\u027d\13>\3?\3?\5?\u0281\n?\3@\3@\3@\3A\3A\3B\3B"+
		"\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0299\nD\3D\3D\5D\u029d"+
		"\nD\3E\3E\5E\u02a1\nE\3E\3E\5E\u02a5\nE\3E\3E\5E\u02a9\nE\3E\3E\3E\3E"+
		"\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\5G\u02cb\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0312\nG\fG\16G\u0315\13G\3H\3H\3H\7H\u031a"+
		"\nH\fH\16H\u031d\13H\3I\7I\u0320\nI\fI\16I\u0323\13I\3J\5J\u0326\nJ\3"+
		"J\3J\3K\5K\u032b\nK\3K\3K\5K\u032f\nK\3K\5K\u0332\nK\3K\3K\5K\u0336\n"+
		"K\3L\3L\3M\3M\3M\2\4v\u008cN\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\20\3\2"+
		"\34\35\4\2\r\r\20\20\4\2GGWW\5\2\4\4\66\66aa\4\2\r\r\17\20\3\2\6\b\3\2"+
		"\t\13\3\2@G\3\29;\3\2\678\3\2PS\3\2HK\4\2\25\26aa\5\2\4\4-.\66\66\2\u037c"+
		"\2\u009a\3\2\2\2\4\u009e\3\2\2\2\6\u00a2\3\2\2\2\b\u00b7\3\2\2\2\n\u00b9"+
		"\3\2\2\2\f\u00ee\3\2\2\2\16\u00f0\3\2\2\2\20\u00f2\3\2\2\2\22\u00f4\3"+
		"\2\2\2\24\u00fa\3\2\2\2\26\u0101\3\2\2\2\30\u0107\3\2\2\2\32\u0118\3\2"+
		"\2\2\34\u011c\3\2\2\2\36\u0122\3\2\2\2 \u0128\3\2\2\2\"\u0133\3\2\2\2"+
		"$\u0138\3\2\2\2&\u013b\3\2\2\2(\u013e\3\2\2\2*\u014b\3\2\2\2,\u016a\3"+
		"\2\2\2.\u016c\3\2\2\2\60\u0177\3\2\2\2\62\u0187\3\2\2\2\64\u018d\3\2\2"+
		"\2\66\u0196\3\2\2\28\u01a2\3\2\2\2:\u01ae\3\2\2\2<\u01b8\3\2\2\2>\u01bb"+
		"\3\2\2\2@\u01be\3\2\2\2B\u01c5\3\2\2\2D\u01cf\3\2\2\2F\u01d7\3\2\2\2H"+
		"\u01da\3\2\2\2J\u01e1\3\2\2\2L\u01f1\3\2\2\2N\u01f3\3\2\2\2P\u01f5\3\2"+
		"\2\2R\u01f7\3\2\2\2T\u0200\3\2\2\2V\u0208\3\2\2\2X\u020c\3\2\2\2Z\u0216"+
		"\3\2\2\2\\\u021e\3\2\2\2^\u0225\3\2\2\2`\u0235\3\2\2\2b\u0239\3\2\2\2"+
		"d\u0248\3\2\2\2f\u024a\3\2\2\2h\u024e\3\2\2\2j\u0250\3\2\2\2l\u0253\3"+
		"\2\2\2n\u0258\3\2\2\2p\u025a\3\2\2\2r\u025f\3\2\2\2t\u0261\3\2\2\2v\u0263"+
		"\3\2\2\2x\u0270\3\2\2\2z\u0276\3\2\2\2|\u027e\3\2\2\2~\u0282\3\2\2\2\u0080"+
		"\u0285\3\2\2\2\u0082\u0287\3\2\2\2\u0084\u0289\3\2\2\2\u0086\u029c\3\2"+
		"\2\2\u0088\u029e\3\2\2\2\u008a\u02ae\3\2\2\2\u008c\u02ca\3\2\2\2\u008e"+
		"\u0316\3\2\2\2\u0090\u0321\3\2\2\2\u0092\u0325\3\2\2\2\u0094\u032a\3\2"+
		"\2\2\u0096\u0337\3\2\2\2\u0098\u0339\3\2\2\2\u009a\u009b\5\4\3\2\u009b"+
		"\u009c\7\2\2\3\u009c\3\3\2\2\2\u009d\u009f\5\b\5\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\5\3"+
		"\2\2\2\u00a2\u00a4\7_\2\2\u00a3\u00a5\5\4\3\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7`\2\2\u00a7\7\3\2\2\2"+
		"\u00a8\u00b8\5\n\6\2\u00a9\u00b8\5\6\4\2\u00aa\u00b8\5X-\2\u00ab\u00b8"+
		"\5R*\2\u00ac\u00b8\5\f\7\2\u00ad\u00b8\5\22\n\2\u00ae\u00b8\5\24\13\2"+
		"\u00af\u00b8\5\26\f\2\u00b0\u00b8\5 \21\2\u00b1\u00b8\5<\37\2\u00b2\u00b8"+
		"\5> \2\u00b3\u00b8\5@!\2\u00b4\u00b8\5:\36\2\u00b5\u00b8\5V,\2\u00b6\u00b8"+
		"\5P)\2\u00b7\u00a8\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00aa\3\2\2\2\u00b7"+
		"\u00ab\3\2\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00ae\3\2"+
		"\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b6\3\2\2\2\u00b8\t\3\2\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb"+
		"\7Y\2\2\u00bb\u00bc\5\u008cG\2\u00bc\u00bd\7Z\2\2\u00bd\u00be\7X\2\2\u00be"+
		"\13\3\2\2\2\u00bf\u00c0\7\33\2\2\u00c0\u00c2\7Y\2\2\u00c1\u00c3\5T+\2"+
		"\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6"+
		"\7X\2\2\u00c5\u00c7\5\16\b\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\7X\2\2\u00c9\u00cb\5\20\t\2\u00ca\u00c9\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7Z\2\2\u00cd"+
		"\u00ef\5\b\5\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7Y\2\2\u00d0\u00d1\5\u0082"+
		"B\2\u00d1\u00d2\5Z.\2\u00d2\u00d4\7X\2\2\u00d3\u00d5\5\16\b\2\u00d4\u00d3"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7X\2\2\u00d7"+
		"\u00d9\5\20\t\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00db\7Z\2\2\u00db\u00dc\5\b\5\2\u00dc\u00ef\3\2\2\2\u00dd"+
		"\u00de\7\33\2\2\u00de\u00df\7Y\2\2\u00df\u00e0\5\u008cG\2\u00e0\u00e1"+
		"\t\2\2\2\u00e1\u00e2\5T+\2\u00e2\u00e3\7Z\2\2\u00e3\u00e4\5\b\5\2\u00e4"+
		"\u00ef\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\7Y\2\2\u00e7\u00e8\5\u0082"+
		"B\2\u00e8\u00e9\5\\/\2\u00e9\u00ea\t\2\2\2\u00ea\u00eb\5T+\2\u00eb\u00ec"+
		"\7Z\2\2\u00ec\u00ed\5\b\5\2\u00ed\u00ef\3\2\2\2\u00ee\u00bf\3\2\2\2\u00ee"+
		"\u00ce\3\2\2\2\u00ee\u00dd\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ef\r\3\2\2\2"+
		"\u00f0\u00f1\5T+\2\u00f1\17\3\2\2\2\u00f2\u00f3\5T+\2\u00f3\21\3\2\2\2"+
		"\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7Y\2\2\u00f6\u00f7\5T+\2\u00f7\u00f8"+
		"\7Z\2\2\u00f8\u00f9\5\b\5\2\u00f9\23\3\2\2\2\u00fa\u00fb\7\36\2\2\u00fb"+
		"\u00fc\5\b\5\2\u00fc\u00fd\7\37\2\2\u00fd\u00fe\7Y\2\2\u00fe\u00ff\5T"+
		"+\2\u00ff\u0100\7Z\2\2\u0100\25\3\2\2\2\u0101\u0102\7)\2\2\u0102\u0103"+
		"\7Y\2\2\u0103\u0104\5T+\2\u0104\u0105\7Z\2\2\u0105\u0106\5\30\r\2\u0106"+
		"\27\3\2\2\2\u0107\u010d\7_\2\2\u0108\u010a\5\34\17\2\u0109\u0108\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0113\3\2\2\2\u010f"+
		"\u0111\5\36\20\2\u0110\u0112\5\32\16\2\u0111\u0110\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\7`\2\2\u0116\31\3\2\2\2\u0117\u0119\5\34\17"+
		"\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\33\3\2\2\2\u011c\u011d\7*\2\2\u011d\u011e\5T+\2\u011e\u0120"+
		"\7W\2\2\u011f\u0121\5\4\3\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\35\3\2\2\2\u0122\u0123\7+\2\2\u0123\u0125\7W\2\2\u0124\u0126\5\4\3\2"+
		"\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\37\3\2\2\2\u0127\u0129"+
		"\7\"\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\7 \2\2\u012b\u012d\7a\2\2\u012c\u012e\5x=\2\u012d\u012c\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\"\22\2\u0130\u0131"+
		"\5(\25\2\u0131!\3\2\2\2\u0132\u0134\5$\23\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\5&\24\2\u0136\u0135\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137#\3\2\2\2\u0138\u0139\7\21\2\2\u0139\u013a"+
		"\5t;\2\u013a%\3\2\2\2\u013b\u013c\7!\2\2\u013c\u013d\5t;\2\u013d\'\3\2"+
		"\2\2\u013e\u0142\7_\2\2\u013f\u0141\5*\26\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7`\2\2\u0146)\3\2\2\2\u0147\u014c"+
		"\58\35\2\u0148\u014c\5,\27\2\u0149\u014c\5\64\33\2\u014a\u014c\5\b\5\2"+
		"\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014c+\3\2\2\2\u014d\u014e\5\66\34\2\u014e\u0150\5h\65\2\u014f"+
		"\u0151\7V\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0154\5j\66\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0157\5^\60\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7X\2\2\u0159\u016b\3\2\2\2\u015a"+
		"\u015b\5\66\34\2\u015b\u015c\5h\65\2\u015c\u0162\5B\"\2\u015d\u015e\7"+
		"_\2\2\u015e\u015f\5\u0090I\2\u015f\u0160\7`\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u0163\7X\2\2\u0162\u015d\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u016b\3\2"+
		"\2\2\u0164\u0167\5\66\34\2\u0165\u0168\5.\30\2\u0166\u0168\5\60\31\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016b\5\62"+
		"\32\2\u016a\u014d\3\2\2\2\u016a\u015a\3\2\2\2\u016a\u0164\3\2\2\2\u016a"+
		"\u0169\3\2\2\2\u016b-\3\2\2\2\u016c\u016d\7&\2\2\u016d\u016e\5h\65\2\u016e"+
		"\u016f\7Y\2\2\u016f\u0171\7Z\2\2\u0170\u0172\5j\66\2\u0171\u0170\3\2\2"+
		"\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7_\2\2\u0174\u0175"+
		"\5\u0090I\2\u0175\u0176\7`\2\2\u0176/\3\2\2\2\u0177\u0178\7\'\2\2\u0178"+
		"\u0179\5h\65\2\u0179\u017d\7Y\2\2\u017a\u017e\7a\2\2\u017b\u017e\5`\61"+
		"\2\u017c\u017e\5d\63\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0181\5j\66\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7Z\2\2\u0183\u0184\7_\2"+
		"\2\u0184\u0185\5\u0090I\2\u0185\u0186\7`\2\2\u0186\61\3\2\2\2\u0187\u018b"+
		"\7\"\2\2\u0188\u0189\7a\2\2\u0189\u018c\5B\"\2\u018a\u018c\5X-\2\u018b"+
		"\u0188\3\2\2\2\u018b\u018a\3\2\2\2\u018c\63\3\2\2\2\u018d\u018e\7[\2\2"+
		"\u018e\u018f\7a\2\2\u018f\u0190\7W\2\2\u0190\u0191\t\3\2\2\u0191\u0192"+
		"\7\\\2\2\u0192\u0193\5j\66\2\u0193\u0194\7X\2\2\u0194\65\3\2\2\2\u0195"+
		"\u0197\7$\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u019a\5\u0080A\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u019d\7%\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\7\f\2\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\67\3\2\2\2\u01a1\u01a3\5\u0080A\2\u01a2\u01a1\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7#\2\2\u01a5"+
		"\u01a7\7Y\2\2\u01a6\u01a8\5\u008eH\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7Z\2\2\u01aa\u01ab\7_\2\2\u01ab"+
		"\u01ac\5\u0090I\2\u01ac\u01ad\7`\2\2\u01ad9\3\2\2\2\u01ae\u01af\7\24\2"+
		"\2\u01af\u01b0\7a\2\2\u01b0\u01b6\5B\"\2\u01b1\u01b2\7_\2\2\u01b2\u01b3"+
		"\5\u0090I\2\u01b3\u01b4\7`\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b7\7X\2\2"+
		"\u01b6\u01b1\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7;\3\2\2\2\u01b8\u01b9\7"+
		"\31\2\2\u01b9\u01ba\7X\2\2\u01ba=\3\2\2\2\u01bb\u01bc\7\32\2\2\u01bc\u01bd"+
		"\7X\2\2\u01bd?\3\2\2\2\u01be\u01c0\7\30\2\2\u01bf\u01c1\5T+\2\u01c0\u01bf"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7X\2\2\u01c3"+
		"A\3\2\2\2\u01c4\u01c6\5x=\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\7Y\2\2\u01c8\u01ca\5D#\2\u01c9\u01c8\3\2\2"+
		"\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\7Z\2\2\u01cc\u01ce"+
		"\5j\66\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceC\3\2\2\2\u01cf"+
		"\u01d4\5F$\2\u01d0\u01d1\7U\2\2\u01d1\u01d3\5F$\2\u01d2\u01d0\3\2\2\2"+
		"\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5E\3"+
		"\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\5H%\2\u01d8G\3\2\2\2\u01d9\u01db"+
		"\5\u0080A\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2"+
		"\2\u01dc\u01de\5L\'\2\u01dd\u01df\5j\66\2\u01de\u01dd\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01dfI\3\2\2\2\u01e0\u01e2\5\u0080A\2\u01e1\u01e0\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01ec\5L\'\2\u01e4\u01e6\7V\2"+
		"\2\u01e5\u01e7\5j\66\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ed"+
		"\3\2\2\2\u01e8\u01ea\5j\66\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ed\5^\60\2\u01ec\u01e4\3\2\2\2\u01ec\u01e9\3\2"+
		"\2\2\u01edK\3\2\2\2\u01ee\u01f2\5N(\2\u01ef\u01f2\5`\61\2\u01f0\u01f2"+
		"\5d\63\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"M\3\2\2\2\u01f3\u01f4\7a\2\2\u01f4O\3\2\2\2\u01f5\u01f6\7X\2\2\u01f6Q"+
		"\3\2\2\2\u01f7\u01f8\7\22\2\2\u01f8\u01f9\7Y\2\2\u01f9\u01fa\5T+\2\u01fa"+
		"\u01fb\7Z\2\2\u01fb\u01fe\5\b\5\2\u01fc\u01fd\7\23\2\2\u01fd\u01ff\5\b"+
		"\5\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffS\3\2\2\2\u0200\u0205"+
		"\5\u008cG\2\u0201\u0202\7U\2\2\u0202\u0204\5\u008cG\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"U\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\5\u008cG\2\u0209\u020a\7X\2"+
		"\2\u020aW\3\2\2\2\u020b\u020d\5\u0080A\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\5\u0082B\2\u020f\u0211\7\f\2"+
		"\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214"+
		"\5Z.\2\u0213\u0215\7X\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"Y\3\2\2\2\u0216\u021b\5\\/\2\u0217\u0218\7U\2\2\u0218\u021a\5\\/\2\u0219"+
		"\u0217\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c[\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220\7a\2\2\u021f\u0221"+
		"\5j\66\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0224\5^\60\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224]\3\2\2\2"+
		"\u0225\u0226\7G\2\2\u0226\u0227\5\u008cG\2\u0227_\3\2\2\2\u0228\u0229"+
		"\7[\2\2\u0229\u0236\7\\\2\2\u022a\u022b\7[\2\2\u022b\u0230\5b\62\2\u022c"+
		"\u022d\7U\2\2\u022d\u022f\5b\62\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0234\7\\\2\2\u0234\u0236\3\2\2\2\u0235\u0228\3\2"+
		"\2\2\u0235\u022a\3\2\2\2\u0236a\3\2\2\2\u0237\u023a\5\u008cG\2\u0238\u023a"+
		"\7a\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023ac\3\2\2\2\u023b\u023c"+
		"\7_\2\2\u023c\u0249\7`\2\2\u023d\u023e\7_\2\2\u023e\u0243\5f\64\2\u023f"+
		"\u0240\7U\2\2\u0240\u0242\5f\64\2\u0241\u023f\3\2\2\2\u0242\u0245\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0247\7`\2\2\u0247\u0249\3\2\2\2\u0248\u023b\3\2"+
		"\2\2\u0248\u023d\3\2\2\2\u0249e\3\2\2\2\u024a\u024b\5h\65\2\u024b\u024c"+
		"\t\4\2\2\u024c\u024d\5\u008cG\2\u024dg\3\2\2\2\u024e\u024f\t\5\2\2\u024f"+
		"i\3\2\2\2\u0250\u0251\7W\2\2\u0251\u0252\5n8\2\u0252k\3\2\2\2\u0253\u0254"+
		"\t\6\2\2\u0254m\3\2\2\2\u0255\u0259\5p9\2\u0256\u0259\5r:\2\u0257\u0259"+
		"\5v<\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259"+
		"o\3\2\2\2\u025a\u025b\5r:\2\u025b\u025c\5x=\2\u025cq\3\2\2\2\u025d\u0260"+
		"\5l\67\2\u025e\u0260\5t;\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260"+
		"s\3\2\2\2\u0261\u0262\7a\2\2\u0262u\3\2\2\2\u0263\u0264\b<\1\2\u0264\u0265"+
		"\5r:\2\u0265\u0266\7[\2\2\u0266\u0267\7\\\2\2\u0267\u026d\3\2\2\2\u0268"+
		"\u0269\f\4\2\2\u0269\u026a\7[\2\2\u026a\u026c\7\\\2\2\u026b\u0268\3\2"+
		"\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"w\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\7P\2\2\u0271\u0273\5z>\2\u0272"+
		"\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\7Q"+
		"\2\2\u0275y\3\2\2\2\u0276\u027b\5|?\2\u0277\u0278\7U\2\2\u0278\u027a\5"+
		"|?\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c{\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0280\5n8\2\u027f"+
		"\u0281\5~@\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281}\3\2\2\2\u0282"+
		"\u0283\7\21\2\2\u0283\u0284\5n8\2\u0284\177\3\2\2\2\u0285\u0286\t\7\2"+
		"\2\u0286\u0081\3\2\2\2\u0287\u0288\t\b\2\2\u0288\u0083\3\2\2\2\u0289\u028a"+
		"\7a\2\2\u028a\u0085\3\2\2\2\u028b\u028c\7a\2\2\u028c\u028d\7Y\2\2\u028d"+
		"\u028e\5T+\2\u028e\u028f\7Z\2\2\u028f\u029d\3\2\2\2\u0290\u0291\7a\2\2"+
		"\u0291\u0292\7Y\2\2\u0292\u029d\7Z\2\2\u0293\u0294\7Y\2\2\u0294\u0295"+
		"\5\u0088E\2\u0295\u0296\7Z\2\2\u0296\u0298\7Y\2\2\u0297\u0299\5T+\2\u0298"+
		"\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\7Z"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u028b\3\2\2\2\u029c\u0290\3\2\2\2\u029c"+
		"\u0293\3\2\2\2\u029d\u0087\3\2\2\2\u029e\u02a0\7\24\2\2\u029f\u02a1\7"+
		"a\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a4\7Y\2\2\u02a3\u02a5\5\u008eH\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3"+
		"\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\7Z\2\2\u02a7\u02a9\5j\66\2\u02a8"+
		"\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7_"+
		"\2\2\u02ab\u02ac\5\u0090I\2\u02ac\u02ad\7`\2\2\u02ad\u0089\3\2\2\2\u02ae"+
		"\u02af\t\t\2\2\u02af\u008b\3\2\2\2\u02b0\u02b1\bG\1\2\u02b1\u02cb\5\u0088"+
		"E\2\u02b2\u02b3\7>\2\2\u02b3\u02cb\5\u008cG#\u02b4\u02b5\7?\2\2\u02b5"+
		"\u02cb\5\u008cG\"\u02b6\u02b7\7\67\2\2\u02b7\u02cb\5\u008cG\37\u02b8\u02b9"+
		"\78\2\2\u02b9\u02cb\5\u008cG\36\u02ba\u02bb\7=\2\2\u02bb\u02cb\5\u008c"+
		"G\35\u02bc\u02bd\7<\2\2\u02bd\u02cb\5\u008cG\34\u02be\u02cb\5\u0086D\2"+
		"\u02bf\u02c0\7Y\2\2\u02c0\u02c1\5T+\2\u02c1\u02c2\7Z\2\2\u02c2\u02cb\3"+
		"\2\2\2\u02c3\u02c4\7(\2\2\u02c4\u02cb\5\u0086D\2\u02c5\u02cb\5`\61\2\u02c6"+
		"\u02cb\5d\63\2\u02c7\u02cb\5\u0098M\2\u02c8\u02cb\7a\2\2\u02c9\u02cb\7"+
		",\2\2\u02ca\u02b0\3\2\2\2\u02ca\u02b2\3\2\2\2\u02ca\u02b4\3\2\2\2\u02ca"+
		"\u02b6\3\2\2\2\u02ca\u02b8\3\2\2\2\u02ca\u02ba\3\2\2\2\u02ca\u02bc\3\2"+
		"\2\2\u02ca\u02be\3\2\2\2\u02ca\u02bf\3\2\2\2\u02ca\u02c3\3\2\2\2\u02ca"+
		"\u02c5\3\2\2\2\u02ca\u02c6\3\2\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02ca\u02c9\3\2\2\2\u02cb\u0313\3\2\2\2\u02cc\u02cd\f\33\2\2\u02cd"+
		"\u02ce\t\n\2\2\u02ce\u0312\5\u008cG\34\u02cf\u02d0\f\32\2\2\u02d0\u02d1"+
		"\t\13\2\2\u02d1\u0312\5\u008cG\33\u02d2\u02d3\f\31\2\2\u02d3\u02d4\t\f"+
		"\2\2\u02d4\u0312\5\u008cG\32\u02d5\u02d6\f\30\2\2\u02d6\u02d7\t\r\2\2"+
		"\u02d7\u0312\5\u008cG\31\u02d8\u02d9\f\27\2\2\u02d9\u02da\7L\2\2\u02da"+
		"\u0312\5\u008cG\30\u02db\u02dc\f\26\2\2\u02dc\u02dd\7M\2\2\u02dd\u0312"+
		"\5\u008cG\27\u02de\u02df\f\25\2\2\u02df\u02e0\7N\2\2\u02e0\u0312\5\u008c"+
		"G\26\u02e1\u02e2\f\24\2\2\u02e2\u02e3\7O\2\2\u02e3\u0312\5\u008cG\25\u02e4"+
		"\u02e5\f\23\2\2\u02e5\u02e6\7V\2\2\u02e6\u02e7\5\u008cG\2\u02e7\u02e8"+
		"\7W\2\2\u02e8\u02e9\5\u008cG\24\u02e9\u0312\3\2\2\2\u02ea\u02eb\f\20\2"+
		"\2\u02eb\u02ec\7G\2\2\u02ec\u0312\5\u008cG\21\u02ed\u02ee\f\17\2\2\u02ee"+
		"\u02ef\7@\2\2\u02ef\u0312\5\u008cG\20\u02f0\u02f1\f\16\2\2\u02f1\u02f2"+
		"\7A\2\2\u02f2\u0312\5\u008cG\17\u02f3\u02f4\f\r\2\2\u02f4\u02f5\7B\2\2"+
		"\u02f5\u0312\5\u008cG\16\u02f6\u02f7\f\f\2\2\u02f7\u02f8\7C\2\2\u02f8"+
		"\u0312\5\u008cG\r\u02f9\u02fa\f\13\2\2\u02fa\u02fb\7F\2\2\u02fb\u0312"+
		"\5\u008cG\f\u02fc\u02fd\f\n\2\2\u02fd\u02fe\7D\2\2\u02fe\u0312\5\u008c"+
		"G\13\u02ff\u0300\f\t\2\2\u0300\u0301\7E\2\2\u0301\u0312\5\u008cG\n\u0302"+
		"\u0303\f&\2\2\u0303\u0304\7[\2\2\u0304\u0305\5T+\2\u0305\u0306\7\\\2\2"+
		"\u0306\u0312\3\2\2\2\u0307\u0308\f%\2\2\u0308\u0309\7T\2\2\u0309\u0312"+
		"\5\u0084C\2\u030a\u030b\f$\2\2\u030b\u030c\7T\2\2\u030c\u0312\5\u0086"+
		"D\2\u030d\u030e\f!\2\2\u030e\u0312\7>\2\2\u030f\u0310\f \2\2\u0310\u0312"+
		"\7?\2\2\u0311\u02cc\3\2\2\2\u0311\u02cf\3\2\2\2\u0311\u02d2\3\2\2\2\u0311"+
		"\u02d5\3\2\2\2\u0311\u02d8\3\2\2\2\u0311\u02db\3\2\2\2\u0311\u02de\3\2"+
		"\2\2\u0311\u02e1\3\2\2\2\u0311\u02e4\3\2\2\2\u0311\u02ea\3\2\2\2\u0311"+
		"\u02ed\3\2\2\2\u0311\u02f0\3\2\2\2\u0311\u02f3\3\2\2\2\u0311\u02f6\3\2"+
		"\2\2\u0311\u02f9\3\2\2\2\u0311\u02fc\3\2\2\2\u0311\u02ff\3\2\2\2\u0311"+
		"\u0302\3\2\2\2\u0311\u0307\3\2\2\2\u0311\u030a\3\2\2\2\u0311\u030d\3\2"+
		"\2\2\u0311\u030f\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u008d\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u031b\5\u0094"+
		"K\2\u0317\u0318\7U\2\2\u0318\u031a\5\u0094K\2\u0319\u0317\3\2\2\2\u031a"+
		"\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u008f\3\2"+
		"\2\2\u031d\u031b\3\2\2\2\u031e\u0320\5\u0092J\2\u031f\u031e\3\2\2\2\u0320"+
		"\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0091\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0324\u0326\7\27\2\2\u0325\u0324\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\5\b\5\2\u0328\u0093\3\2"+
		"\2\2\u0329\u032b\5\u0080A\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032e\5\u0096L\2\u032d\u032f\7V\2\2\u032e\u032d\3"+
		"\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u0332\5j\66\2\u0331"+
		"\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0334\7G"+
		"\2\2\u0334\u0336\5\u008cG\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0095\3\2\2\2\u0337\u0338\t\16\2\2\u0338\u0097\3\2\2\2\u0339\u033a\t"+
		"\17\2\2\u033a\u0099\3\2\2\2W\u00a0\u00a4\u00b7\u00c2\u00c6\u00ca\u00d4"+
		"\u00d8\u00ee\u010b\u010d\u0111\u0113\u011a\u0120\u0125\u0128\u012d\u0133"+
		"\u0136\u0142\u014b\u0150\u0153\u0156\u0162\u0167\u016a\u0171\u017d\u0180"+
		"\u018b\u0196\u0199\u019c\u019f\u01a2\u01a7\u01b6\u01c0\u01c5\u01c9\u01cd"+
		"\u01d4\u01da\u01de\u01e1\u01e6\u01e9\u01ec\u01f1\u01fe\u0205\u020c\u0210"+
		"\u0214\u021b\u0220\u0223\u0230\u0235\u0239\u0243\u0248\u0258\u025f\u026d"+
		"\u0272\u027b\u0280\u0298\u029c\u02a0\u02a4\u02a8\u02ca\u0311\u0313\u031b"+
		"\u0321\u0325\u032a\u032e\u0331\u0335";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}