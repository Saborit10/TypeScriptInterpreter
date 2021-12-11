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
		NULL_LITERAL=1, BOOLEAN_LITERAL=2, DECIMAL_INTEGER_LITERAL=3, DECIMAL_LITERAL=4, 
		EXPONENT_PART=5, HEX_INTEGER_LITERAL=6, OCTAL_INTEGER_LITERAL=7, OCTAL_INTEGER_LITERAL2=8, 
		BINARY_INTEGER_LITERAL=9, STRING_LITERAL=10, TK_PLUS=11, TK_MINUS=12, 
		TK_STAR=13, TK_SLASH=14, TK_PERCENT=15, TK_NOT=16, TK_BINNOT=17, TK_PLUSPLUS=18, 
		TK_MINUSMINUS=19, TK_POINT=20, TK_LPARENT=21, TK_RPARENT=22, TK_DCUOTE=23, 
		TK_SCUOTE=24, TK_LCURLY=25, TK_RCURLY=26, DOUBLE_STRING_CHARACTER=27, 
		SINGLE_STRING_CHARACTER=28, ESCAPE_SEQUENCE=29, CHARACTER_ESCAPE_SEQUENCE=30, 
		HEX_ESCAPE_SEQUENCE=31, UNICODE_ESCAPE_SEQUENCE=32, EXTENDED_UNICODE_ESCAPE_SEQUENCE=33, 
		SINGLE_ESCAPE_CHARACTER=34, NON_ESCAPE_CHARACTER=35, LINE_CONTINUATION=36, 
		HEX_DIGIT=37, WS=38;
	public static final int
		RULE_compilationUnit = 0, RULE_arithmeticExpr = 1, RULE_literal = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "arithmeticExpr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'", null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'.'", 
			"'('", "')'", "'\"'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL_LITERAL", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", "DECIMAL_LITERAL", 
			"EXPONENT_PART", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL2", 
			"BINARY_INTEGER_LITERAL", "STRING_LITERAL", "TK_PLUS", "TK_MINUS", "TK_STAR", 
			"TK_SLASH", "TK_PERCENT", "TK_NOT", "TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", 
			"TK_POINT", "TK_LPARENT", "TK_RPARENT", "TK_DCUOTE", "TK_SCUOTE", "TK_LCURLY", 
			"TK_RCURLY", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", 
			"CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", 
			"EXTENDED_UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
			"LINE_CONTINUATION", "HEX_DIGIT", "WS"
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
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
			setState(6);
			arithmeticExpr(0);
			setState(7);
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

	public static class ArithmeticExprContext extends ParserRuleContext {
		public TerminalNode TK_PLUSPLUS() { return getToken(TypeScriptParser.TK_PLUSPLUS, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode TK_MINUSMINUS() { return getToken(TypeScriptParser.TK_MINUSMINUS, 0); }
		public TerminalNode TK_PLUS() { return getToken(TypeScriptParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(TypeScriptParser.TK_MINUS, 0); }
		public TerminalNode TK_BINNOT() { return getToken(TypeScriptParser.TK_BINNOT, 0); }
		public TerminalNode TK_NOT() { return getToken(TypeScriptParser.TK_NOT, 0); }
		public TerminalNode TK_LPARENT() { return getToken(TypeScriptParser.TK_LPARENT, 0); }
		public TerminalNode TK_RPARENT() { return getToken(TypeScriptParser.TK_RPARENT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TK_STAR() { return getToken(TypeScriptParser.TK_STAR, 0); }
		public TerminalNode TK_SLASH() { return getToken(TypeScriptParser.TK_SLASH, 0); }
		public TerminalNode TK_PERCENT() { return getToken(TypeScriptParser.TK_PERCENT, 0); }
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		return arithmeticExpr(0);
	}

	private ArithmeticExprContext arithmeticExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, _parentState);
		ArithmeticExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_arithmeticExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PLUSPLUS:
				{
				setState(10);
				match(TK_PLUSPLUS);
				setState(11);
				arithmeticExpr(10);
				}
				break;
			case TK_MINUSMINUS:
				{
				setState(12);
				match(TK_MINUSMINUS);
				setState(13);
				arithmeticExpr(9);
				}
				break;
			case TK_PLUS:
				{
				setState(14);
				match(TK_PLUS);
				setState(15);
				arithmeticExpr(8);
				}
				break;
			case TK_MINUS:
				{
				setState(16);
				match(TK_MINUS);
				setState(17);
				arithmeticExpr(7);
				}
				break;
			case TK_BINNOT:
				{
				setState(18);
				match(TK_BINNOT);
				setState(19);
				arithmeticExpr(6);
				}
				break;
			case TK_NOT:
				{
				setState(20);
				match(TK_NOT);
				setState(21);
				arithmeticExpr(5);
				}
				break;
			case TK_LPARENT:
				{
				setState(22);
				match(TK_LPARENT);
				setState(23);
				arithmeticExpr(0);
				setState(24);
				match(TK_RPARENT);
				}
				break;
			case NULL_LITERAL:
			case BOOLEAN_LITERAL:
			case DECIMAL_INTEGER_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_INTEGER_LITERAL:
			case OCTAL_INTEGER_LITERAL:
			case OCTAL_INTEGER_LITERAL2:
			case BINARY_INTEGER_LITERAL:
			case STRING_LITERAL:
				{
				setState(26);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_SLASH) | (1L << TK_PERCENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						arithmeticExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						_la = _input.LA(1);
						if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(34);
						arithmeticExpr(4);
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(TypeScriptParser.DECIMAL_INTEGER_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(TypeScriptParser.DECIMAL_LITERAL, 0); }
		public TerminalNode BINARY_INTEGER_LITERAL() { return getToken(TypeScriptParser.BINARY_INTEGER_LITERAL, 0); }
		public TerminalNode OCTAL_INTEGER_LITERAL() { return getToken(TypeScriptParser.OCTAL_INTEGER_LITERAL, 0); }
		public TerminalNode OCTAL_INTEGER_LITERAL2() { return getToken(TypeScriptParser.OCTAL_INTEGER_LITERAL2, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(TypeScriptParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TypeScriptParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << DECIMAL_INTEGER_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << OCTAL_INTEGER_LITERAL) | (1L << OCTAL_INTEGER_LITERAL2) | (1L << BINARY_INTEGER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
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
		case 1:
			return arithmeticExpr_sempred((ArithmeticExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpr_sempred(ArithmeticExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(-\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3&\n\3\f\3"+
		"\16\3)\13\3\3\4\3\4\3\4\2\3\4\5\2\4\6\2\5\3\2\17\21\3\2\r\16\4\2\3\6\b"+
		"\f\2\62\2\b\3\2\2\2\4\35\3\2\2\2\6*\3\2\2\2\b\t\5\4\3\2\t\n\7\2\2\3\n"+
		"\3\3\2\2\2\13\f\b\3\1\2\f\r\7\24\2\2\r\36\5\4\3\f\16\17\7\25\2\2\17\36"+
		"\5\4\3\13\20\21\7\r\2\2\21\36\5\4\3\n\22\23\7\16\2\2\23\36\5\4\3\t\24"+
		"\25\7\23\2\2\25\36\5\4\3\b\26\27\7\22\2\2\27\36\5\4\3\7\30\31\7\27\2\2"+
		"\31\32\5\4\3\2\32\33\7\30\2\2\33\36\3\2\2\2\34\36\5\6\4\2\35\13\3\2\2"+
		"\2\35\16\3\2\2\2\35\20\3\2\2\2\35\22\3\2\2\2\35\24\3\2\2\2\35\26\3\2\2"+
		"\2\35\30\3\2\2\2\35\34\3\2\2\2\36\'\3\2\2\2\37 \f\6\2\2 !\t\2\2\2!&\5"+
		"\4\3\7\"#\f\5\2\2#$\t\3\2\2$&\5\4\3\6%\37\3\2\2\2%\"\3\2\2\2&)\3\2\2\2"+
		"\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\t\4\2\2+\7\3\2\2\2\5\35"+
		"%\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}