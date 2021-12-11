// Generated from TypeScript.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL_LITERAL=1, BOOLEAN_LITERAL=2, DECIMAL_INTEGER_LITERAL=3, DECIMAL_LITERAL=4, 
		EXPONENT_PART=5, HEX_INTEGER_LITERAL=6, OCTAL_INTEGER_LITERAL=7, OCTAL_INTEGER_LITERAL2=8, 
		BINARY_INTEGER_LITERAL=9, STRING_LITERAL=10, TK_PLUS=11, TK_MINUS=12, 
		TK_STAR=13, TK_SLASH=14, TK_PERCENT=15, TK_NOT=16, TK_BINNOT=17, TK_PLUSPLUS=18, 
		TK_MINUSMINUS=19, TK_EQEQ=20, TK_NOTEQ=21, TK_IDENTEQ=22, TK_IDENTNOTEQ=23, 
		TK_BIN_AND=24, TK_BIN_OR=25, TK_LOGIC_AND=26, TK_LOGIC_OR=27, TK_LESS=28, 
		TK_GREAT=29, TK_LESSEQ=30, TK_GREATEQ=31, TK_POINT=32, TK_QMARK=33, TK_COLON=34, 
		TK_SEMICOLON=35, TK_LPARENT=36, TK_RPARENT=37, TK_DCUOTE=38, TK_SCUOTE=39, 
		TK_LCURLY=40, TK_RCURLY=41, DOUBLE_STRING_CHARACTER=42, SINGLE_STRING_CHARACTER=43, 
		ESCAPE_SEQUENCE=44, CHARACTER_ESCAPE_SEQUENCE=45, HEX_ESCAPE_SEQUENCE=46, 
		UNICODE_ESCAPE_SEQUENCE=47, EXTENDED_UNICODE_ESCAPE_SEQUENCE=48, SINGLE_ESCAPE_CHARACTER=49, 
		NON_ESCAPE_CHARACTER=50, LINE_CONTINUATION=51, HEX_DIGIT=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NULL_LITERAL", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", "DECIMAL_LITERAL", 
			"EXPONENT_PART", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL2", 
			"BINARY_INTEGER_LITERAL", "STRING_LITERAL", "TK_PLUS", "TK_MINUS", "TK_STAR", 
			"TK_SLASH", "TK_PERCENT", "TK_NOT", "TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", 
			"TK_EQEQ", "TK_NOTEQ", "TK_IDENTEQ", "TK_IDENTNOTEQ", "TK_BIN_AND", "TK_BIN_OR", 
			"TK_LOGIC_AND", "TK_LOGIC_OR", "TK_LESS", "TK_GREAT", "TK_LESSEQ", "TK_GREATEQ", 
			"TK_POINT", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", "TK_LPARENT", "TK_RPARENT", 
			"TK_DCUOTE", "TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", "DOUBLE_STRING_CHARACTER", 
			"SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", 
			"HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", "EXTENDED_UNICODE_ESCAPE_SEQUENCE", 
			"SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", "LINE_CONTINUATION", 
			"HEX_DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'", null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'=='", 
			"'!='", "'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", "'<'", "'>'", 
			"'<='", "'>='", "'.'", "'?'", "':'", "';'", "'('", "')'", "'\"'", "'''", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL_LITERAL", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", "DECIMAL_LITERAL", 
			"EXPONENT_PART", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL2", 
			"BINARY_INTEGER_LITERAL", "STRING_LITERAL", "TK_PLUS", "TK_MINUS", "TK_STAR", 
			"TK_SLASH", "TK_PERCENT", "TK_NOT", "TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", 
			"TK_EQEQ", "TK_NOTEQ", "TK_IDENTEQ", "TK_IDENTNOTEQ", "TK_BIN_AND", "TK_BIN_OR", 
			"TK_LOGIC_AND", "TK_LOGIC_OR", "TK_LESS", "TK_GREAT", "TK_LESSEQ", "TK_GREATEQ", 
			"TK_POINT", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", "TK_LPARENT", "TK_RPARENT", 
			"TK_DCUOTE", "TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", "DOUBLE_STRING_CHARACTER", 
			"SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", 
			"HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", "EXTENDED_UNICODE_ESCAPE_SEQUENCE", 
			"SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", "LINE_CONTINUATION", 
			"HEX_DIGIT", "WS"
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


	public TypeScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0161\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3|\n\3\3\4\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\5"+
		"\4\u0086\n\4\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\3\5\3\5\7\5\u0091"+
		"\n\5\f\5\16\5\u0094\13\5\3\5\5\5\u0097\n\5\3\5\3\5\6\5\u009b\n\5\r\5\16"+
		"\5\u009c\3\5\5\5\u00a0\n\5\3\5\3\5\5\5\u00a4\n\5\5\5\u00a6\n\5\3\6\3\6"+
		"\5\6\u00aa\n\6\3\6\6\6\u00ad\n\6\r\6\16\6\u00ae\3\7\3\7\3\7\6\7\u00b4"+
		"\n\7\r\7\16\7\u00b5\3\b\3\b\6\b\u00ba\n\b\r\b\16\b\u00bb\3\t\3\t\3\t\6"+
		"\t\u00c1\n\t\r\t\16\t\u00c2\3\n\3\n\3\n\6\n\u00c8\n\n\r\n\16\n\u00c9\3"+
		"\13\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00d7\n\13\f\13\16\13\u00da\13\13\3\13\3\13\5\13\u00de\n\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\5+\u012e\n+\3,\3,"+
		"\3,\3,\5,\u0134\n,\3-\3-\3-\5-\u0139\n-\3.\3.\5.\u013d\n.\3/\3/\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\6\61\u014c\n\61\r\61\16"+
		"\61\u014d\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\6\66\u015c\n\66\r\66\16\66\u015d\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2\22\3\2\63;\3\2\62"+
		";\4\2GGgg\4\2--//\4\2ZZzz\3\2\629\4\2QQqq\4\2DDdd\3\2\62\63\6\2\f\f\17"+
		"\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62"+
		";^^ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;CHch\5\2\13\f\17\17\""+
		"\"\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\3m\3\2\2\2\5{\3\2\2\2\7\u0085\3\2\2\2\t\u00a5\3\2\2\2\13\u00a7\3\2\2"+
		"\2\r\u00b0\3\2\2\2\17\u00b7\3\2\2\2\21\u00bd\3\2\2\2\23\u00c4\3\2\2\2"+
		"\25\u00dd\3\2\2\2\27\u00df\3\2\2\2\31\u00e1\3\2\2\2\33\u00e3\3\2\2\2\35"+
		"\u00e5\3\2\2\2\37\u00e7\3\2\2\2!\u00e9\3\2\2\2#\u00eb\3\2\2\2%\u00ed\3"+
		"\2\2\2\'\u00f0\3\2\2\2)\u00f3\3\2\2\2+\u00f6\3\2\2\2-\u00f9\3\2\2\2/\u00fd"+
		"\3\2\2\2\61\u0101\3\2\2\2\63\u0103\3\2\2\2\65\u0105\3\2\2\2\67\u0108\3"+
		"\2\2\29\u010b\3\2\2\2;\u010d\3\2\2\2=\u010f\3\2\2\2?\u0112\3\2\2\2A\u0115"+
		"\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G\u011b\3\2\2\2I\u011d\3\2\2\2K"+
		"\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2\2\2S\u0127\3\2"+
		"\2\2U\u012d\3\2\2\2W\u0133\3\2\2\2Y\u0138\3\2\2\2[\u013c\3\2\2\2]\u013e"+
		"\3\2\2\2_\u0142\3\2\2\2a\u0148\3\2\2\2c\u0151\3\2\2\2e\u0153\3\2\2\2g"+
		"\u0155\3\2\2\2i\u0158\3\2\2\2k\u015b\3\2\2\2mn\7p\2\2no\7w\2\2op\7n\2"+
		"\2pq\7n\2\2q\4\3\2\2\2rs\7v\2\2st\7t\2\2tu\7w\2\2u|\7g\2\2vw\7h\2\2wx"+
		"\7c\2\2xy\7n\2\2yz\7u\2\2z|\7g\2\2{r\3\2\2\2{v\3\2\2\2|\6\3\2\2\2}\u0086"+
		"\7\62\2\2~\u0082\t\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0086\b\3\2\2\2\u0087\u008b"+
		"\t\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0092\5A!\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0097\5\13\6\2\u0096\u0095\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u00a6\3\2\2\2\u0098\u009a\5A!\2\u0099\u009b\t\3\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\13\6\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a6\3\2\2\2\u00a1\u00a3\5\7\4\2\u00a2\u00a4\5\13"+
		"\6\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u0087\3\2\2\2\u00a5\u0098\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\n\3\2\2\2"+
		"\u00a7\u00a9\t\4\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\f\3\2\2\2"+
		"\u00b0\u00b1\7\62\2\2\u00b1\u00b3\t\6\2\2\u00b2\u00b4\5i\65\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\16\3\2\2\2\u00b7\u00b9\7\62\2\2\u00b8\u00ba\t\7\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\20"+
		"\3\2\2\2\u00bd\u00be\7\62\2\2\u00be\u00c0\t\b\2\2\u00bf\u00c1\t\7\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00c7\t\t\2\2\u00c6"+
		"\u00c8\t\n\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\24\3\2\2\2\u00cb\u00cf\5M\'\2\u00cc\u00ce"+
		"\5U+\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5M"+
		"\'\2\u00d3\u00de\3\2\2\2\u00d4\u00d8\5O(\2\u00d5\u00d7\5W,\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5O(\2\u00dc\u00de\3\2\2"+
		"\2\u00dd\u00cb\3\2\2\2\u00dd\u00d4\3\2\2\2\u00de\26\3\2\2\2\u00df\u00e0"+
		"\7-\2\2\u00e0\30\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2\32\3\2\2\2\u00e3\u00e4"+
		"\7,\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\36\3\2\2\2\u00e7\u00e8"+
		"\7\'\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\"\3\2\2\2\u00eb\u00ec"+
		"\7\u0080\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7-\2\2\u00ee\u00ef\7-\2\2\u00ef"+
		"&\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2\7/\2\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7?\2\2\u00f4\u00f5\7?\2\2\u00f5*\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\7?\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100"+
		"\7?\2\2\u0100\60\3\2\2\2\u0101\u0102\7(\2\2\u0102\62\3\2\2\2\u0103\u0104"+
		"\7~\2\2\u0104\64\3\2\2\2\u0105\u0106\7(\2\2\u0106\u0107\7(\2\2\u0107\66"+
		"\3\2\2\2\u0108\u0109\7~\2\2\u0109\u010a\7~\2\2\u010a8\3\2\2\2\u010b\u010c"+
		"\7>\2\2\u010c:\3\2\2\2\u010d\u010e\7@\2\2\u010e<\3\2\2\2\u010f\u0110\7"+
		">\2\2\u0110\u0111\7?\2\2\u0111>\3\2\2\2\u0112\u0113\7@\2\2\u0113\u0114"+
		"\7?\2\2\u0114@\3\2\2\2\u0115\u0116\7\60\2\2\u0116B\3\2\2\2\u0117\u0118"+
		"\7A\2\2\u0118D\3\2\2\2\u0119\u011a\7<\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		"=\2\2\u011cH\3\2\2\2\u011d\u011e\7*\2\2\u011eJ\3\2\2\2\u011f\u0120\7+"+
		"\2\2\u0120L\3\2\2\2\u0121\u0122\7$\2\2\u0122N\3\2\2\2\u0123\u0124\7)\2"+
		"\2\u0124P\3\2\2\2\u0125\u0126\7}\2\2\u0126R\3\2\2\2\u0127\u0128\7\177"+
		"\2\2\u0128T\3\2\2\2\u0129\u012e\n\13\2\2\u012a\u012b\7^\2\2\u012b\u012e"+
		"\5Y-\2\u012c\u012e\5g\64\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012eV\3\2\2\2\u012f\u0134\n\f\2\2\u0130\u0131\7^\2\2\u0131"+
		"\u0134\5Y-\2\u0132\u0134\5g\64\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2"+
		"\2\u0133\u0132\3\2\2\2\u0134X\3\2\2\2\u0135\u0139\5[.\2\u0136\u0139\5"+
		"]/\2\u0137\u0139\5a\61\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139Z\3\2\2\2\u013a\u013d\5c\62\2\u013b\u013d\5e\63\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\\\3\2\2\2\u013e\u013f\7"+
		"z\2\2\u013f\u0140\5i\65\2\u0140\u0141\5i\65\2\u0141^\3\2\2\2\u0142\u0143"+
		"\7w\2\2\u0143\u0144\5i\65\2\u0144\u0145\5i\65\2\u0145\u0146\5i\65\2\u0146"+
		"\u0147\5i\65\2\u0147`\3\2\2\2\u0148\u0149\7w\2\2\u0149\u014b\5Q)\2\u014a"+
		"\u014c\5i\65\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\5S*\2\u0150b"+
		"\3\2\2\2\u0151\u0152\t\r\2\2\u0152d\3\2\2\2\u0153\u0154\n\16\2\2\u0154"+
		"f\3\2\2\2\u0155\u0156\7^\2\2\u0156\u0157\t\17\2\2\u0157h\3\2\2\2\u0158"+
		"\u0159\t\20\2\2\u0159j\3\2\2\2\u015a\u015c\t\21\2\2\u015b\u015a\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\b\66\2\2\u0160l\3\2\2\2\34\2{\u0082\u0085\u008b\u0092"+
		"\u0096\u009c\u009f\u00a3\u00a5\u00a9\u00ae\u00b5\u00bb\u00c2\u00c9\u00cf"+
		"\u00d8\u00dd\u012d\u0133\u0138\u013c\u014d\u015d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}