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
		NUMERIC_LITERAL=1, WS=2, TK_PUBLIC=3, TK_PRIVATE=4, TK_PROTECTED=5, TK_VAR=6, 
		TK_LET=7, TK_CONST=8, TK_READ_ONLY=9, TK_STRING=10, TK_ANY=11, TK_BOOLEAN=12, 
		TK_NUMBER=13, TK_EXTENDS=14, TK_IF=15, TK_ELSE=16, TK_FUNCTION=17, TK_TYPE=18, 
		TK_REQUIRE=19, TK_EXPORT=20, TK_RETURN=21, TK_CONTINUE=22, TK_BREAK=23, 
		NULL_LITERAL=24, BOOLEAN_LITERAL=25, DECIMAL_INTEGER_LITERAL=26, DECIMAL_LITERAL=27, 
		EXPONENT_PART=28, HEX_INTEGER_LITERAL=29, OCTAL_INTEGER_LITERAL=30, OCTAL_INTEGER_LITERAL2=31, 
		BINARY_INTEGER_LITERAL=32, STRING_LITERAL=33, TK_PLUS=34, TK_MINUS=35, 
		TK_STAR=36, TK_SLASH=37, TK_PERCENT=38, TK_NOT=39, TK_BINNOT=40, TK_PLUSPLUS=41, 
		TK_MINUSMINUS=42, TK_PLUS_ASIGN=43, TK_MINUS_ASIGN=44, TK_STAR_ASIGN=45, 
		TK_SLASH_ASIGN=46, TK_AND_ASIGN=47, TK_OR_ASIGN=48, TK_PERCENT_ASIGN=49, 
		TK_EQ=50, TK_EQEQ=51, TK_NOTEQ=52, TK_IDENTEQ=53, TK_IDENTNOTEQ=54, TK_BIN_AND=55, 
		TK_BIN_OR=56, TK_LOGIC_AND=57, TK_LOGIC_OR=58, TK_LESS=59, TK_GREAT=60, 
		TK_LESSEQ=61, TK_GREATEQ=62, TK_POINT=63, TK_COMMA=64, TK_QMARK=65, TK_COLON=66, 
		TK_SEMICOLON=67, TK_LPARENT=68, TK_RPARENT=69, TK_LBRACKET=70, TK_RBRACKET=71, 
		TK_DCUOTE=72, TK_SCUOTE=73, TK_LCURLY=74, TK_RCURLY=75, TK_IDENT=76, DOUBLE_STRING_CHARACTER=77, 
		SINGLE_STRING_CHARACTER=78, ESCAPE_SEQUENCE=79, CHARACTER_ESCAPE_SEQUENCE=80, 
		HEX_ESCAPE_SEQUENCE=81, UNICODE_ESCAPE_SEQUENCE=82, EXTENDED_UNICODE_ESCAPE_SEQUENCE=83, 
		SINGLE_ESCAPE_CHARACTER=84, NON_ESCAPE_CHARACTER=85, LINE_CONTINUATION=86, 
		HEX_DIGIT=87;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", "TK_PROTECTED", "TK_VAR", 
			"TK_LET", "TK_CONST", "TK_READ_ONLY", "TK_STRING", "TK_ANY", "TK_BOOLEAN", 
			"TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", "TK_FUNCTION", "TK_TYPE", 
			"TK_REQUIRE", "TK_EXPORT", "TK_RETURN", "TK_CONTINUE", "TK_BREAK", "NULL_LITERAL", 
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
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'public'", "'private'", "'protected'", "'var'", "'let'", 
			"'const'", "'readonly'", "'string'", "'any'", "'boolean'", "'number'", 
			"'extends'", "'if'", "'else'", "'function'", "'type'", "'require'", "'export'", 
			"'return'", "'continue'", "'break'", "'null'", null, null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
			"'~'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'%='", "'='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'|'", "'&&'", 
			"'||'", "'<'", "'>'", "'<='", "'>='", "'.'", "','", "'?'", "':'", "';'", 
			"'('", "')'", "'['", "']'", "'\"'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", "TK_PROTECTED", 
			"TK_VAR", "TK_LET", "TK_CONST", "TK_READ_ONLY", "TK_STRING", "TK_ANY", 
			"TK_BOOLEAN", "TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", "TK_FUNCTION", 
			"TK_TYPE", "TK_REQUIRE", "TK_EXPORT", "TK_RETURN", "TK_CONTINUE", "TK_BREAK", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u025d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\5\2\u00b7\n\2\3\3\6\3\u00ba"+
		"\n\3\r\3\16\3\u00bb\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015b\n\32\3\33\3\33"+
		"\3\33\7\33\u0160\n\33\f\33\16\33\u0163\13\33\5\33\u0165\n\33\3\34\3\34"+
		"\7\34\u0169\n\34\f\34\16\34\u016c\13\34\3\34\3\34\7\34\u0170\n\34\f\34"+
		"\16\34\u0173\13\34\3\34\5\34\u0176\n\34\3\34\3\34\6\34\u017a\n\34\r\34"+
		"\16\34\u017b\3\34\5\34\u017f\n\34\3\34\3\34\5\34\u0183\n\34\5\34\u0185"+
		"\n\34\3\35\3\35\5\35\u0189\n\35\3\35\6\35\u018c\n\35\r\35\16\35\u018d"+
		"\3\36\3\36\3\36\6\36\u0193\n\36\r\36\16\36\u0194\3\37\3\37\6\37\u0199"+
		"\n\37\r\37\16\37\u019a\3 \3 \3 \6 \u01a0\n \r \16 \u01a1\3!\3!\3!\6!\u01a7"+
		"\n!\r!\16!\u01a8\3\"\3\"\7\"\u01ad\n\"\f\"\16\"\u01b0\13\"\3\"\3\"\3\""+
		"\3\"\7\"\u01b6\n\"\f\"\16\"\u01b9\13\"\3\"\3\"\5\"\u01bd\n\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"L\3L\3M\3M\7M\u0228\nM\fM\16M\u022b\13M\3N\3N\3N\3N\5N\u0231\nN\3O\3O"+
		"\3O\3O\5O\u0237\nO\3P\3P\3P\5P\u023c\nP\3Q\3Q\5Q\u0240\nQ\3R\3R\3R\3R"+
		"\3S\3S\3S\3S\3S\3S\3T\3T\3T\6T\u024f\nT\rT\16T\u0250\3T\3T\3U\3U\3V\3"+
		"V\3W\3W\3W\3X\3X\2\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\3\2\24"+
		"\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2ZZzz\3\2\629\4"+
		"\2QQqq\4\2DDdd\3\2\62\63\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\f\f\17\17$"+
		"$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^"+
		"ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;CHch\2\u027e\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\3\u00b6\3\2\2\2\5\u00b9"+
		"\3\2\2\2\7\u00bf\3\2\2\2\t\u00c6\3\2\2\2\13\u00ce\3\2\2\2\r\u00d8\3\2"+
		"\2\2\17\u00dc\3\2\2\2\21\u00e0\3\2\2\2\23\u00e6\3\2\2\2\25\u00ef\3\2\2"+
		"\2\27\u00f6\3\2\2\2\31\u00fa\3\2\2\2\33\u0102\3\2\2\2\35\u0109\3\2\2\2"+
		"\37\u0111\3\2\2\2!\u0114\3\2\2\2#\u0119\3\2\2\2%\u0122\3\2\2\2\'\u0127"+
		"\3\2\2\2)\u012f\3\2\2\2+\u0136\3\2\2\2-\u013d\3\2\2\2/\u0146\3\2\2\2\61"+
		"\u014c\3\2\2\2\63\u015a\3\2\2\2\65\u0164\3\2\2\2\67\u0184\3\2\2\29\u0186"+
		"\3\2\2\2;\u018f\3\2\2\2=\u0196\3\2\2\2?\u019c\3\2\2\2A\u01a3\3\2\2\2C"+
		"\u01bc\3\2\2\2E\u01be\3\2\2\2G\u01c0\3\2\2\2I\u01c2\3\2\2\2K\u01c4\3\2"+
		"\2\2M\u01c6\3\2\2\2O\u01c8\3\2\2\2Q\u01ca\3\2\2\2S\u01cc\3\2\2\2U\u01cf"+
		"\3\2\2\2W\u01d2\3\2\2\2Y\u01d5\3\2\2\2[\u01d8\3\2\2\2]\u01db\3\2\2\2_"+
		"\u01de\3\2\2\2a\u01e1\3\2\2\2c\u01e4\3\2\2\2e\u01e7\3\2\2\2g\u01e9\3\2"+
		"\2\2i\u01ec\3\2\2\2k\u01ef\3\2\2\2m\u01f3\3\2\2\2o\u01f7\3\2\2\2q\u01f9"+
		"\3\2\2\2s\u01fb\3\2\2\2u\u01fe\3\2\2\2w\u0201\3\2\2\2y\u0203\3\2\2\2{"+
		"\u0205\3\2\2\2}\u0208\3\2\2\2\177\u020b\3\2\2\2\u0081\u020d\3\2\2\2\u0083"+
		"\u020f\3\2\2\2\u0085\u0211\3\2\2\2\u0087\u0213\3\2\2\2\u0089\u0215\3\2"+
		"\2\2\u008b\u0217\3\2\2\2\u008d\u0219\3\2\2\2\u008f\u021b\3\2\2\2\u0091"+
		"\u021d\3\2\2\2\u0093\u021f\3\2\2\2\u0095\u0221\3\2\2\2\u0097\u0223\3\2"+
		"\2\2\u0099\u0225\3\2\2\2\u009b\u0230\3\2\2\2\u009d\u0236\3\2\2\2\u009f"+
		"\u023b\3\2\2\2\u00a1\u023f\3\2\2\2\u00a3\u0241\3\2\2\2\u00a5\u0245\3\2"+
		"\2\2\u00a7\u024b\3\2\2\2\u00a9\u0254\3\2\2\2\u00ab\u0256\3\2\2\2\u00ad"+
		"\u0258\3\2\2\2\u00af\u025b\3\2\2\2\u00b1\u00b7\5\67\34\2\u00b2\u00b7\5"+
		"A!\2\u00b3\u00b7\5=\37\2\u00b4\u00b7\5? \2\u00b5\u00b7\5;\36\2\u00b6\u00b1"+
		"\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\4\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\b\3\2\2\u00be\6\3\2\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7k\2\2"+
		"\u00c4\u00c5\7e\2\2\u00c5\b\3\2\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7t"+
		"\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\n\3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7f\2\2"+
		"\u00d7\f\3\2\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t"+
		"\2\2\u00db\16\3\2\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de\u00df"+
		"\7v\2\2\u00df\20\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3"+
		"\7p\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\22\3\2\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7f\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7{\2\2"+
		"\u00ee\24\3\2\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7"+
		"t\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7i\2\2\u00f5\26"+
		"\3\2\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7{\2\2\u00f9"+
		"\30\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7p\2\2"+
		"\u0101\32\3\2\2\2\u0102\u0103\7p\2\2\u0103\u0104\7w\2\2\u0104\u0105\7"+
		"o\2\2\u0105\u0106\7d\2\2\u0106\u0107\7g\2\2\u0107\u0108\7t\2\2\u0108\34"+
		"\3\2\2\2\u0109\u010a\7g\2\2\u010a\u010b\7z\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7p\2\2\u010e\u010f\7f\2\2\u010f\u0110\7u\2\2"+
		"\u0110\36\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113\7h\2\2\u0113 \3\2\2\2"+
		"\u0114\u0115\7g\2\2\u0115\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117\u0118"+
		"\7g\2\2\u0118\"\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b\7w\2\2\u011b\u011c"+
		"\7p\2\2\u011c\u011d\7e\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7q\2\2\u0120\u0121\7p\2\2\u0121$\3\2\2\2\u0122\u0123\7v\2\2\u0123"+
		"\u0124\7{\2\2\u0124\u0125\7r\2\2\u0125\u0126\7g\2\2\u0126&\3\2\2\2\u0127"+
		"\u0128\7t\2\2\u0128\u0129\7g\2\2\u0129\u012a\7s\2\2\u012a\u012b\7w\2\2"+
		"\u012b\u012c\7k\2\2\u012c\u012d\7t\2\2\u012d\u012e\7g\2\2\u012e(\3\2\2"+
		"\2\u012f\u0130\7g\2\2\u0130\u0131\7z\2\2\u0131\u0132\7r\2\2\u0132\u0133"+
		"\7q\2\2\u0133\u0134\7t\2\2\u0134\u0135\7v\2\2\u0135*\3\2\2\2\u0136\u0137"+
		"\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139\7v\2\2\u0139\u013a\7w\2\2\u013a"+
		"\u013b\7t\2\2\u013b\u013c\7p\2\2\u013c,\3\2\2\2\u013d\u013e\7e\2\2\u013e"+
		"\u013f\7q\2\2\u013f\u0140\7p\2\2\u0140\u0141\7v\2\2\u0141\u0142\7k\2\2"+
		"\u0142\u0143\7p\2\2\u0143\u0144\7w\2\2\u0144\u0145\7g\2\2\u0145.\3\2\2"+
		"\2\u0146\u0147\7d\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7c\2\2\u014a\u014b\7m\2\2\u014b\60\3\2\2\2\u014c\u014d\7p\2\2\u014d\u014e"+
		"\7w\2\2\u014e\u014f\7n\2\2\u014f\u0150\7n\2\2\u0150\62\3\2\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7t\2\2\u0153\u0154\7w\2\2\u0154\u015b\7g\2\2\u0155"+
		"\u0156\7h\2\2\u0156\u0157\7c\2\2\u0157\u0158\7n\2\2\u0158\u0159\7u\2\2"+
		"\u0159\u015b\7g\2\2\u015a\u0151\3\2\2\2\u015a\u0155\3\2\2\2\u015b\64\3"+
		"\2\2\2\u015c\u0165\7\62\2\2\u015d\u0161\t\3\2\2\u015e\u0160\t\4\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u015c\3\2\2\2\u0164"+
		"\u015d\3\2\2\2\u0165\66\3\2\2\2\u0166\u016a\t\3\2\2\u0167\u0169\t\4\2"+
		"\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0171\5\177@\2"+
		"\u016e\u0170\t\4\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0176\59\35\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0185\3\2"+
		"\2\2\u0177\u0179\5\177@\2\u0178\u017a\t\4\2\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u017f\59\35\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0185\3\2\2\2\u0180\u0182\5\65\33\2\u0181\u0183\59\35\2\u0182\u0181\3"+
		"\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0166\3\2\2\2\u0184"+
		"\u0177\3\2\2\2\u0184\u0180\3\2\2\2\u01858\3\2\2\2\u0186\u0188\t\5\2\2"+
		"\u0187\u0189\t\6\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b"+
		"\3\2\2\2\u018a\u018c\t\4\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e:\3\2\2\2\u018f\u0190\7\62\2\2"+
		"\u0190\u0192\t\7\2\2\u0191\u0193\5\u00afX\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195<\3\2\2\2"+
		"\u0196\u0198\7\62\2\2\u0197\u0199\t\b\2\2\u0198\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b>\3\2\2\2\u019c"+
		"\u019d\7\62\2\2\u019d\u019f\t\t\2\2\u019e\u01a0\t\b\2\2\u019f\u019e\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"@\3\2\2\2\u01a3\u01a4\7\62\2\2\u01a4\u01a6\t\n\2\2\u01a5\u01a7\t\13\2"+
		"\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9B\3\2\2\2\u01aa\u01ae\5\u0091I\2\u01ab\u01ad\5\u009bN\2"+
		"\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5\u0091I"+
		"\2\u01b2\u01bd\3\2\2\2\u01b3\u01b7\5\u0093J\2\u01b4\u01b6\5\u009dO\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\5\u0093J\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01aa\3\2\2\2\u01bc\u01b3\3\2\2\2\u01bdD\3\2\2\2"+
		"\u01be\u01bf\7-\2\2\u01bfF\3\2\2\2\u01c0\u01c1\7/\2\2\u01c1H\3\2\2\2\u01c2"+
		"\u01c3\7,\2\2\u01c3J\3\2\2\2\u01c4\u01c5\7\61\2\2\u01c5L\3\2\2\2\u01c6"+
		"\u01c7\7\'\2\2\u01c7N\3\2\2\2\u01c8\u01c9\7#\2\2\u01c9P\3\2\2\2\u01ca"+
		"\u01cb\7\u0080\2\2\u01cbR\3\2\2\2\u01cc\u01cd\7-\2\2\u01cd\u01ce\7-\2"+
		"\2\u01ceT\3\2\2\2\u01cf\u01d0\7/\2\2\u01d0\u01d1\7/\2\2\u01d1V\3\2\2\2"+
		"\u01d2\u01d3\7-\2\2\u01d3\u01d4\7?\2\2\u01d4X\3\2\2\2\u01d5\u01d6\7/\2"+
		"\2\u01d6\u01d7\7?\2\2\u01d7Z\3\2\2\2\u01d8\u01d9\7,\2\2\u01d9\u01da\7"+
		"?\2\2\u01da\\\3\2\2\2\u01db\u01dc\7\61\2\2\u01dc\u01dd\7?\2\2\u01dd^\3"+
		"\2\2\2\u01de\u01df\7(\2\2\u01df\u01e0\7?\2\2\u01e0`\3\2\2\2\u01e1\u01e2"+
		"\7~\2\2\u01e2\u01e3\7?\2\2\u01e3b\3\2\2\2\u01e4\u01e5\7\'\2\2\u01e5\u01e6"+
		"\7?\2\2\u01e6d\3\2\2\2\u01e7\u01e8\7?\2\2\u01e8f\3\2\2\2\u01e9\u01ea\7"+
		"?\2\2\u01ea\u01eb\7?\2\2\u01ebh\3\2\2\2\u01ec\u01ed\7#\2\2\u01ed\u01ee"+
		"\7?\2\2\u01eej\3\2\2\2\u01ef\u01f0\7?\2\2\u01f0\u01f1\7?\2\2\u01f1\u01f2"+
		"\7?\2\2\u01f2l\3\2\2\2\u01f3\u01f4\7#\2\2\u01f4\u01f5\7?\2\2\u01f5\u01f6"+
		"\7?\2\2\u01f6n\3\2\2\2\u01f7\u01f8\7(\2\2\u01f8p\3\2\2\2\u01f9\u01fa\7"+
		"~\2\2\u01far\3\2\2\2\u01fb\u01fc\7(\2\2\u01fc\u01fd\7(\2\2\u01fdt\3\2"+
		"\2\2\u01fe\u01ff\7~\2\2\u01ff\u0200\7~\2\2\u0200v\3\2\2\2\u0201\u0202"+
		"\7>\2\2\u0202x\3\2\2\2\u0203\u0204\7@\2\2\u0204z\3\2\2\2\u0205\u0206\7"+
		">\2\2\u0206\u0207\7?\2\2\u0207|\3\2\2\2\u0208\u0209\7@\2\2\u0209\u020a"+
		"\7?\2\2\u020a~\3\2\2\2\u020b\u020c\7\60\2\2\u020c\u0080\3\2\2\2\u020d"+
		"\u020e\7.\2\2\u020e\u0082\3\2\2\2\u020f\u0210\7A\2\2\u0210\u0084\3\2\2"+
		"\2\u0211\u0212\7<\2\2\u0212\u0086\3\2\2\2\u0213\u0214\7=\2\2\u0214\u0088"+
		"\3\2\2\2\u0215\u0216\7*\2\2\u0216\u008a\3\2\2\2\u0217\u0218\7+\2\2\u0218"+
		"\u008c\3\2\2\2\u0219\u021a\7]\2\2\u021a\u008e\3\2\2\2\u021b\u021c\7_\2"+
		"\2\u021c\u0090\3\2\2\2\u021d\u021e\7$\2\2\u021e\u0092\3\2\2\2\u021f\u0220"+
		"\7)\2\2\u0220\u0094\3\2\2\2\u0221\u0222\7}\2\2\u0222\u0096\3\2\2\2\u0223"+
		"\u0224\7\177\2\2\u0224\u0098\3\2\2\2\u0225\u0229\t\f\2\2\u0226\u0228\t"+
		"\r\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u009a\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0231\n\16"+
		"\2\2\u022d\u022e\7^\2\2\u022e\u0231\5\u009fP\2\u022f\u0231\5\u00adW\2"+
		"\u0230\u022c\3\2\2\2\u0230\u022d\3\2\2\2\u0230\u022f\3\2\2\2\u0231\u009c"+
		"\3\2\2\2\u0232\u0237\n\17\2\2\u0233\u0234\7^\2\2\u0234\u0237\5\u009fP"+
		"\2\u0235\u0237\5\u00adW\2\u0236\u0232\3\2\2\2\u0236\u0233\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\u009e\3\2\2\2\u0238\u023c\5\u00a1Q\2\u0239\u023c"+
		"\5\u00a3R\2\u023a\u023c\5\u00a7T\2\u023b\u0238\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023b\u023a\3\2\2\2\u023c\u00a0\3\2\2\2\u023d\u0240\5\u00a9U\2\u023e"+
		"\u0240\5\u00abV\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u00a2"+
		"\3\2\2\2\u0241\u0242\7z\2\2\u0242\u0243\5\u00afX\2\u0243\u0244\5\u00af"+
		"X\2\u0244\u00a4\3\2\2\2\u0245\u0246\7w\2\2\u0246\u0247\5\u00afX\2\u0247"+
		"\u0248\5\u00afX\2\u0248\u0249\5\u00afX\2\u0249\u024a\5\u00afX\2\u024a"+
		"\u00a6\3\2\2\2\u024b\u024c\7w\2\2\u024c\u024e\5\u0095K\2\u024d\u024f\5"+
		"\u00afX\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2"+
		"\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\5\u0097L\2\u0253"+
		"\u00a8\3\2\2\2\u0254\u0255\t\20\2\2\u0255\u00aa\3\2\2\2\u0256\u0257\n"+
		"\21\2\2\u0257\u00ac\3\2\2\2\u0258\u0259\7^\2\2\u0259\u025a\t\22\2\2\u025a"+
		"\u00ae\3\2\2\2\u025b\u025c\t\23\2\2\u025c\u00b0\3\2\2\2\36\2\u00b6\u00bb"+
		"\u015a\u0161\u0164\u016a\u0171\u0175\u017b\u017e\u0182\u0184\u0188\u018d"+
		"\u0194\u019a\u01a1\u01a8\u01ae\u01b7\u01bc\u0229\u0230\u0236\u023b\u023f"+
		"\u0250\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}