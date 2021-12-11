// Generated from /home/luis/Public/CC/TypeScript.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL_LITERAL=1, BOOLEAN_LITERAL=2, DECIMAL_INTEGER_LITERAL=3, DECIMAL_LITERAL=4, 
		EXPONENT_PART=5, HEX_INTEGER_LITERAL=6, OCTAL_INTEGER_LITERAL=7, OCTAL_INTEGER_LITERAL2=8, 
		BINARY_INTEGER_LITERAL=9, STRING_LITERAL=10, TK_PLUS=11, TK_MINUS=12, 
		TK_STAR=13, TK_SLASH=14, TK_PERCENT=15, TK_NOT=16, TK_BINNOT=17, TK_PLUSPLUS=18, 
		TK_MINUSMINUS=19, TK_EQEQ=20, TK_NOTEQ=21, TK_IDENTEQ=22, TK_IDENTNOTEQ=23, 
		TK_BIN_AND=24, TK_BIN_OR=25, TK_LOGIC_AND=26, TK_LOGIC_OR=27, TK_POINT=28, 
		TK_QMARK=29, TK_COLON=30, TK_SEMICOLON=31, TK_LPARENT=32, TK_RPARENT=33, 
		TK_DCUOTE=34, TK_SCUOTE=35, TK_LCURLY=36, TK_RCURLY=37, DOUBLE_STRING_CHARACTER=38, 
		SINGLE_STRING_CHARACTER=39, ESCAPE_SEQUENCE=40, CHARACTER_ESCAPE_SEQUENCE=41, 
		HEX_ESCAPE_SEQUENCE=42, UNICODE_ESCAPE_SEQUENCE=43, EXTENDED_UNICODE_ESCAPE_SEQUENCE=44, 
		SINGLE_ESCAPE_CHARACTER=45, NON_ESCAPE_CHARACTER=46, LINE_CONTINUATION=47, 
		HEX_DIGIT=48, WS=49;
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
			"TK_LOGIC_AND", "TK_LOGIC_OR", "TK_POINT", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", 
			"TK_LPARENT", "TK_RPARENT", "TK_DCUOTE", "TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", 
			"DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", 
			"CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", 
			"EXTENDED_UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
			"LINE_CONTINUATION", "HEX_DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'", null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'=='", 
			"'!='", "'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", "'.'", "'?'", 
			"':'", "';'", "'('", "')'", "'\"'", "'''", "'{'", "'}'"
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
			"TK_LOGIC_AND", "TK_LOGIC_OR", "TK_POINT", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", 
			"TK_LPARENT", "TK_RPARENT", "TK_DCUOTE", "TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", 
			"DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3t\n\3\3\4\3\4\3\4\7\4y\n"+
		"\4\f\4\16\4|\13\4\5\4~\n\4\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13\5\3"+
		"\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\5\5\u008f\n\5\3\5\3\5\6\5"+
		"\u0093\n\5\r\5\16\5\u0094\3\5\5\5\u0098\n\5\3\5\3\5\5\5\u009c\n\5\5\5"+
		"\u009e\n\5\3\6\3\6\5\6\u00a2\n\6\3\6\6\6\u00a5\n\6\r\6\16\6\u00a6\3\7"+
		"\3\7\3\7\6\7\u00ac\n\7\r\7\16\7\u00ad\3\b\3\b\6\b\u00b2\n\b\r\b\16\b\u00b3"+
		"\3\t\3\t\3\t\6\t\u00b9\n\t\r\t\16\t\u00ba\3\n\3\n\3\n\6\n\u00c0\n\n\r"+
		"\n\16\n\u00c1\3\13\3\13\7\13\u00c6\n\13\f\13\16\13\u00c9\13\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13\3\13\3\13\5\13\u00d6"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\5\'\u011c\n\'\3(\3(\3(\3(\5(\u0122\n("+
		"\3)\3)\3)\5)\u0127\n)\3*\3*\5*\u012b\n*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\6-\u013a\n-\r-\16-\u013b\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\62\6\62\u014a\n\62\r\62\16\62\u014b\3\62\3\62\2\2\63\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\22\3\2\63;\3\2\62;"+
		"\4\2GGgg\4\2--//\4\2ZZzz\3\2\629\4\2QQqq\4\2DDdd\3\2\62\63\6\2\f\f\17"+
		"\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62"+
		";^^ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;CHch\5\2\13\f\17\17\""+
		"\"\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5s\3\2\2\2\7}\3\2\2\2\t\u009d\3"+
		"\2\2\2\13\u009f\3\2\2\2\r\u00a8\3\2\2\2\17\u00af\3\2\2\2\21\u00b5\3\2"+
		"\2\2\23\u00bc\3\2\2\2\25\u00d5\3\2\2\2\27\u00d7\3\2\2\2\31\u00d9\3\2\2"+
		"\2\33\u00db\3\2\2\2\35\u00dd\3\2\2\2\37\u00df\3\2\2\2!\u00e1\3\2\2\2#"+
		"\u00e3\3\2\2\2%\u00e5\3\2\2\2\'\u00e8\3\2\2\2)\u00eb\3\2\2\2+\u00ee\3"+
		"\2\2\2-\u00f1\3\2\2\2/\u00f5\3\2\2\2\61\u00f9\3\2\2\2\63\u00fb\3\2\2\2"+
		"\65\u00fd\3\2\2\2\67\u0100\3\2\2\29\u0103\3\2\2\2;\u0105\3\2\2\2=\u0107"+
		"\3\2\2\2?\u0109\3\2\2\2A\u010b\3\2\2\2C\u010d\3\2\2\2E\u010f\3\2\2\2G"+
		"\u0111\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2\2\2M\u011b\3\2\2\2O\u0121\3\2"+
		"\2\2Q\u0126\3\2\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2W\u0130\3\2\2\2Y\u0136"+
		"\3\2\2\2[\u013f\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a\u0146\3\2\2\2c"+
		"\u0149\3\2\2\2ef\7p\2\2fg\7w\2\2gh\7n\2\2hi\7n\2\2i\4\3\2\2\2jk\7v\2\2"+
		"kl\7t\2\2lm\7w\2\2mt\7g\2\2no\7h\2\2op\7c\2\2pq\7n\2\2qr\7u\2\2rt\7g\2"+
		"\2sj\3\2\2\2sn\3\2\2\2t\6\3\2\2\2u~\7\62\2\2vz\t\2\2\2wy\t\3\2\2xw\3\2"+
		"\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}u\3\2\2\2}v\3\2"+
		"\2\2~\b\3\2\2\2\177\u0083\t\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008a\59\35\2\u0087\u0089\t\3"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5\13"+
		"\6\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009e\3\2\2\2\u0090"+
		"\u0092\59\35\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0098\5\13\6\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009e\3"+
		"\2\2\2\u0099\u009b\5\7\4\2\u009a\u009c\5\13\6\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\177\3\2\2\2\u009d\u0090\3\2\2"+
		"\2\u009d\u0099\3\2\2\2\u009e\n\3\2\2\2\u009f\u00a1\t\4\2\2\u00a0\u00a2"+
		"\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a5\t\3\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\f\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\u00ab"+
		"\t\6\2\2\u00aa\u00ac\5a\61\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\16\3\2\2\2\u00af\u00b1\7\62\2"+
		"\2\u00b0\u00b2\t\7\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7\62\2\2\u00b6"+
		"\u00b8\t\b\2\2\u00b7\u00b9\t\7\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\22\3\2\2\2\u00bc\u00bd"+
		"\7\62\2\2\u00bd\u00bf\t\t\2\2\u00be\u00c0\t\n\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\24"+
		"\3\2\2\2\u00c3\u00c7\5E#\2\u00c4\u00c6\5M\'\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5E#\2\u00cb\u00d6\3\2\2\2\u00cc\u00d0"+
		"\5G$\2\u00cd\u00cf\5O(\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d4\5G$\2\u00d4\u00d6\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00cc"+
		"\3\2\2\2\u00d6\26\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\30\3\2\2\2\u00d9\u00da"+
		"\7/\2\2\u00da\32\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\34\3\2\2\2\u00dd\u00de"+
		"\7\61\2\2\u00de\36\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0 \3\2\2\2\u00e1\u00e2"+
		"\7#\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7\u0080\2\2\u00e4$\3\2\2\2\u00e5\u00e6"+
		"\7-\2\2\u00e6\u00e7\7-\2\2\u00e7&\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea"+
		"\7/\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ed\7?\2\2\u00ed*\3"+
		"\2\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\7?\2\2\u00f0,\3\2\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2\u00f3\7?\2\2\u00f3\u00f4\7?\2\2\u00f4.\3\2\2\2\u00f5\u00f6"+
		"\7#\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7?\2\2\u00f8\60\3\2\2\2\u00f9\u00fa"+
		"\7(\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7~\2\2\u00fc\64\3\2\2\2\u00fd\u00fe"+
		"\7(\2\2\u00fe\u00ff\7(\2\2\u00ff\66\3\2\2\2\u0100\u0101\7~\2\2\u0101\u0102"+
		"\7~\2\2\u01028\3\2\2\2\u0103\u0104\7\60\2\2\u0104:\3\2\2\2\u0105\u0106"+
		"\7A\2\2\u0106<\3\2\2\2\u0107\u0108\7<\2\2\u0108>\3\2\2\2\u0109\u010a\7"+
		"=\2\2\u010a@\3\2\2\2\u010b\u010c\7*\2\2\u010cB\3\2\2\2\u010d\u010e\7+"+
		"\2\2\u010eD\3\2\2\2\u010f\u0110\7$\2\2\u0110F\3\2\2\2\u0111\u0112\7)\2"+
		"\2\u0112H\3\2\2\2\u0113\u0114\7}\2\2\u0114J\3\2\2\2\u0115\u0116\7\177"+
		"\2\2\u0116L\3\2\2\2\u0117\u011c\n\13\2\2\u0118\u0119\7^\2\2\u0119\u011c"+
		"\5Q)\2\u011a\u011c\5_\60\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011cN\3\2\2\2\u011d\u0122\n\f\2\2\u011e\u011f\7^\2\2\u011f"+
		"\u0122\5Q)\2\u0120\u0122\5_\60\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2"+
		"\2\u0121\u0120\3\2\2\2\u0122P\3\2\2\2\u0123\u0127\5S*\2\u0124\u0127\5"+
		"U+\2\u0125\u0127\5Y-\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125"+
		"\3\2\2\2\u0127R\3\2\2\2\u0128\u012b\5[.\2\u0129\u012b\5]/\2\u012a\u0128"+
		"\3\2\2\2\u012a\u0129\3\2\2\2\u012bT\3\2\2\2\u012c\u012d\7z\2\2\u012d\u012e"+
		"\5a\61\2\u012e\u012f\5a\61\2\u012fV\3\2\2\2\u0130\u0131\7w\2\2\u0131\u0132"+
		"\5a\61\2\u0132\u0133\5a\61\2\u0133\u0134\5a\61\2\u0134\u0135\5a\61\2\u0135"+
		"X\3\2\2\2\u0136\u0137\7w\2\2\u0137\u0139\5I%\2\u0138\u013a\5a\61\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\5K&\2\u013eZ\3\2\2\2\u013f\u0140"+
		"\t\r\2\2\u0140\\\3\2\2\2\u0141\u0142\n\16\2\2\u0142^\3\2\2\2\u0143\u0144"+
		"\7^\2\2\u0144\u0145\t\17\2\2\u0145`\3\2\2\2\u0146\u0147\t\20\2\2\u0147"+
		"b\3\2\2\2\u0148\u014a\t\21\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e"+
		"\b\62\2\2\u014ed\3\2\2\2\34\2sz}\u0083\u008a\u008e\u0094\u0097\u009b\u009d"+
		"\u00a1\u00a6\u00ad\u00b3\u00ba\u00c1\u00c7\u00d0\u00d5\u011b\u0121\u0126"+
		"\u012a\u013b\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}