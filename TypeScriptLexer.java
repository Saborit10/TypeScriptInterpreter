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
			"TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", "NULL_LITERAL", "BOOLEAN_LITERAL", 
			"DECIMAL_INTEGER_LITERAL", "DECIMAL_LITERAL", "EXPONENT_PART", "HEX_INTEGER_LITERAL", 
			"OCTAL_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL2", "BINARY_INTEGER_LITERAL", 
			"STRING_LITERAL", "TK_PLUS", "TK_MINUS", "TK_STAR", "TK_SLASH", "TK_PERCENT", 
			"TK_NOT", "TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", "TK_PLUS_ASIGN", 
			"TK_MINUS_ASIGN", "TK_STAR_ASIGN", "TK_SLASH_ASIGN", "TK_AND_ASIGN", 
			"TK_OR_ASIGN", "TK_PERCENT_ASIGN", "TK_EQ", "TK_EQEQ", "TK_NOTEQ", "TK_IDENTEQ", 
			"TK_IDENTNOTEQ", "TK_BIN_AND", "TK_BIN_OR", "TK_LOGIC_AND", "TK_LOGIC_OR", 
			"TK_LESS", "TK_GREAT", "TK_LESSEQ", "TK_GREATEQ", "TK_POINT", "TK_COMMA", 
			"TK_QMARK", "TK_COLON", "TK_SEMICOLON", "TK_LPARENT", "TK_RPARENT", "TK_LBRACKET", 
			"TK_RBRACKET", "TK_DCUOTE", "TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", "TK_IDENT", 
			"DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", 
			"CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", 
			"EXTENDED_UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
			"LINE_CONTINUATION", "HEX_DIGIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u021c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\u00a9\n\2\3\3\6\3\u00ac\n\3\r\3\16\3\u00ad\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u011a\n\23\3\24\3\24\3\24\7\24\u011f"+
		"\n\24\f\24\16\24\u0122\13\24\5\24\u0124\n\24\3\25\3\25\7\25\u0128\n\25"+
		"\f\25\16\25\u012b\13\25\3\25\3\25\7\25\u012f\n\25\f\25\16\25\u0132\13"+
		"\25\3\25\5\25\u0135\n\25\3\25\3\25\6\25\u0139\n\25\r\25\16\25\u013a\3"+
		"\25\5\25\u013e\n\25\3\25\3\25\5\25\u0142\n\25\5\25\u0144\n\25\3\26\3\26"+
		"\5\26\u0148\n\26\3\26\6\26\u014b\n\26\r\26\16\26\u014c\3\27\3\27\3\27"+
		"\6\27\u0152\n\27\r\27\16\27\u0153\3\30\3\30\6\30\u0158\n\30\r\30\16\30"+
		"\u0159\3\31\3\31\3\31\6\31\u015f\n\31\r\31\16\31\u0160\3\32\3\32\3\32"+
		"\6\32\u0166\n\32\r\32\16\32\u0167\3\33\3\33\7\33\u016c\n\33\f\33\16\33"+
		"\u016f\13\33\3\33\3\33\3\33\3\33\7\33\u0175\n\33\f\33\16\33\u0178\13\33"+
		"\3\33\3\33\5\33\u017c\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\7F\u01e7\nF"+
		"\fF\16F\u01ea\13F\3G\3G\3G\3G\5G\u01f0\nG\3H\3H\3H\3H\5H\u01f6\nH\3I\3"+
		"I\3I\5I\u01fb\nI\3J\3J\5J\u01ff\nJ\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3"+
		"M\3M\6M\u020e\nM\rM\16M\u020f\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\2\2R\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\3\2\24"+
		"\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2ZZzz\3\2\629\4"+
		"\2QQqq\4\2DDdd\3\2\62\63\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\f\f\17\17$"+
		"$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^"+
		"ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;CHch\2\u023d\2\3\3\2\2\2"+
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
		"\3\2\2\2\3\u00a8\3\2\2\2\5\u00ab\3\2\2\2\7\u00b1\3\2\2\2\t\u00b8\3\2\2"+
		"\2\13\u00c0\3\2\2\2\r\u00ca\3\2\2\2\17\u00ce\3\2\2\2\21\u00d2\3\2\2\2"+
		"\23\u00d8\3\2\2\2\25\u00e1\3\2\2\2\27\u00e8\3\2\2\2\31\u00ec\3\2\2\2\33"+
		"\u00f4\3\2\2\2\35\u00fb\3\2\2\2\37\u0103\3\2\2\2!\u0106\3\2\2\2#\u010b"+
		"\3\2\2\2%\u0119\3\2\2\2\'\u0123\3\2\2\2)\u0143\3\2\2\2+\u0145\3\2\2\2"+
		"-\u014e\3\2\2\2/\u0155\3\2\2\2\61\u015b\3\2\2\2\63\u0162\3\2\2\2\65\u017b"+
		"\3\2\2\2\67\u017d\3\2\2\29\u017f\3\2\2\2;\u0181\3\2\2\2=\u0183\3\2\2\2"+
		"?\u0185\3\2\2\2A\u0187\3\2\2\2C\u0189\3\2\2\2E\u018b\3\2\2\2G\u018e\3"+
		"\2\2\2I\u0191\3\2\2\2K\u0194\3\2\2\2M\u0197\3\2\2\2O\u019a\3\2\2\2Q\u019d"+
		"\3\2\2\2S\u01a0\3\2\2\2U\u01a3\3\2\2\2W\u01a6\3\2\2\2Y\u01a8\3\2\2\2["+
		"\u01ab\3\2\2\2]\u01ae\3\2\2\2_\u01b2\3\2\2\2a\u01b6\3\2\2\2c\u01b8\3\2"+
		"\2\2e\u01ba\3\2\2\2g\u01bd\3\2\2\2i\u01c0\3\2\2\2k\u01c2\3\2\2\2m\u01c4"+
		"\3\2\2\2o\u01c7\3\2\2\2q\u01ca\3\2\2\2s\u01cc\3\2\2\2u\u01ce\3\2\2\2w"+
		"\u01d0\3\2\2\2y\u01d2\3\2\2\2{\u01d4\3\2\2\2}\u01d6\3\2\2\2\177\u01d8"+
		"\3\2\2\2\u0081\u01da\3\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01de\3\2\2\2\u0087"+
		"\u01e0\3\2\2\2\u0089\u01e2\3\2\2\2\u008b\u01e4\3\2\2\2\u008d\u01ef\3\2"+
		"\2\2\u008f\u01f5\3\2\2\2\u0091\u01fa\3\2\2\2\u0093\u01fe\3\2\2\2\u0095"+
		"\u0200\3\2\2\2\u0097\u0204\3\2\2\2\u0099\u020a\3\2\2\2\u009b\u0213\3\2"+
		"\2\2\u009d\u0215\3\2\2\2\u009f\u0217\3\2\2\2\u00a1\u021a\3\2\2\2\u00a3"+
		"\u00a9\5)\25\2\u00a4\u00a9\5\63\32\2\u00a5\u00a9\5/\30\2\u00a6\u00a9\5"+
		"\61\31\2\u00a7\u00a9\5-\27\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\4\3\2\2\2"+
		"\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\3\2\2\u00b0"+
		"\6\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7d\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7e\2\2\u00b7\b\3\2\2\2\u00b8"+
		"\u00b9\7r\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7x\2\2"+
		"\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\n\3\2"+
		"\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7f\2\2\u00c9\f\3\2\2\2\u00ca\u00cb\7x\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7t\2\2\u00cd\16\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1\20\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2"+
		"\u00d7\22\3\2\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7"+
		"c\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2\2\u00de\u00df"+
		"\7n\2\2\u00df\u00e0\7{\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6"+
		"\u00e7\7i\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\u00eb\7{\2\2\u00eb\30\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7q\2\2\u00ee"+
		"\u00ef\7q\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7c\2\2"+
		"\u00f2\u00f3\7p\2\2\u00f3\32\3\2\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7"+
		"w\2\2\u00f6\u00f7\7o\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa"+
		"\7t\2\2\u00fa\34\3\2\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7z\2\2\u00fd\u00fe"+
		"\7v\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7f\2\2\u0101"+
		"\u0102\7u\2\2\u0102\36\3\2\2\2\u0103\u0104\7k\2\2\u0104\u0105\7h\2\2\u0105"+
		" \3\2\2\2\u0106\u0107\7g\2\2\u0107\u0108\7n\2\2\u0108\u0109\7u\2\2\u0109"+
		"\u010a\7g\2\2\u010a\"\3\2\2\2\u010b\u010c\7p\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u010e\7n\2\2\u010e\u010f\7n\2\2\u010f$\3\2\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7w\2\2\u0113\u011a\7g\2\2\u0114\u0115\7h\2\2"+
		"\u0115\u0116\7c\2\2\u0116\u0117\7n\2\2\u0117\u0118\7u\2\2\u0118\u011a"+
		"\7g\2\2\u0119\u0110\3\2\2\2\u0119\u0114\3\2\2\2\u011a&\3\2\2\2\u011b\u0124"+
		"\7\62\2\2\u011c\u0120\t\3\2\2\u011d\u011f\t\4\2\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011c\3\2\2\2\u0124"+
		"(\3\2\2\2\u0125\u0129\t\3\2\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0130\5q9\2\u012d\u012f\t\4\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\5+\26\2\u0134"+
		"\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0144\3\2\2\2\u0136\u0138\5q"+
		"9\2\u0137\u0139\t\4\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e\5+"+
		"\26\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0144\3\2\2\2\u013f"+
		"\u0141\5\'\24\2\u0140\u0142\5+\26\2\u0141\u0140\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u0144\3\2\2\2\u0143\u0125\3\2\2\2\u0143\u0136\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0144*\3\2\2\2\u0145\u0147\t\5\2\2\u0146\u0148\t\6\2\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b"+
		"\t\4\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d,\3\2\2\2\u014e\u014f\7\62\2\2\u014f\u0151\t\7\2\2"+
		"\u0150\u0152\5\u00a1Q\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154.\3\2\2\2\u0155\u0157\7\62\2\2"+
		"\u0156\u0158\t\b\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\60\3\2\2\2\u015b\u015c\7\62\2\2\u015c"+
		"\u015e\t\t\2\2\u015d\u015f\t\b\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\62\3\2\2\2\u0162\u0163"+
		"\7\62\2\2\u0163\u0165\t\n\2\2\u0164\u0166\t\13\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\64"+
		"\3\2\2\2\u0169\u016d\5\u0083B\2\u016a\u016c\5\u008dG\2\u016b\u016a\3\2"+
		"\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5\u0083B\2\u0171\u017c"+
		"\3\2\2\2\u0172\u0176\5\u0085C\2\u0173\u0175\5\u008fH\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\5\u0085C\2\u017a\u017c"+
		"\3\2\2\2\u017b\u0169\3\2\2\2\u017b\u0172\3\2\2\2\u017c\66\3\2\2\2\u017d"+
		"\u017e\7-\2\2\u017e8\3\2\2\2\u017f\u0180\7/\2\2\u0180:\3\2\2\2\u0181\u0182"+
		"\7,\2\2\u0182<\3\2\2\2\u0183\u0184\7\61\2\2\u0184>\3\2\2\2\u0185\u0186"+
		"\7\'\2\2\u0186@\3\2\2\2\u0187\u0188\7#\2\2\u0188B\3\2\2\2\u0189\u018a"+
		"\7\u0080\2\2\u018aD\3\2\2\2\u018b\u018c\7-\2\2\u018c\u018d\7-\2\2\u018d"+
		"F\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190\7/\2\2\u0190H\3\2\2\2\u0191\u0192"+
		"\7-\2\2\u0192\u0193\7?\2\2\u0193J\3\2\2\2\u0194\u0195\7/\2\2\u0195\u0196"+
		"\7?\2\2\u0196L\3\2\2\2\u0197\u0198\7,\2\2\u0198\u0199\7?\2\2\u0199N\3"+
		"\2\2\2\u019a\u019b\7\61\2\2\u019b\u019c\7?\2\2\u019cP\3\2\2\2\u019d\u019e"+
		"\7(\2\2\u019e\u019f\7?\2\2\u019fR\3\2\2\2\u01a0\u01a1\7~\2\2\u01a1\u01a2"+
		"\7?\2\2\u01a2T\3\2\2\2\u01a3\u01a4\7\'\2\2\u01a4\u01a5\7?\2\2\u01a5V\3"+
		"\2\2\2\u01a6\u01a7\7?\2\2\u01a7X\3\2\2\2\u01a8\u01a9\7?\2\2\u01a9\u01aa"+
		"\7?\2\2\u01aaZ\3\2\2\2\u01ab\u01ac\7#\2\2\u01ac\u01ad\7?\2\2\u01ad\\\3"+
		"\2\2\2\u01ae\u01af\7?\2\2\u01af\u01b0\7?\2\2\u01b0\u01b1\7?\2\2\u01b1"+
		"^\3\2\2\2\u01b2\u01b3\7#\2\2\u01b3\u01b4\7?\2\2\u01b4\u01b5\7?\2\2\u01b5"+
		"`\3\2\2\2\u01b6\u01b7\7(\2\2\u01b7b\3\2\2\2\u01b8\u01b9\7~\2\2\u01b9d"+
		"\3\2\2\2\u01ba\u01bb\7(\2\2\u01bb\u01bc\7(\2\2\u01bcf\3\2\2\2\u01bd\u01be"+
		"\7~\2\2\u01be\u01bf\7~\2\2\u01bfh\3\2\2\2\u01c0\u01c1\7>\2\2\u01c1j\3"+
		"\2\2\2\u01c2\u01c3\7@\2\2\u01c3l\3\2\2\2\u01c4\u01c5\7>\2\2\u01c5\u01c6"+
		"\7?\2\2\u01c6n\3\2\2\2\u01c7\u01c8\7@\2\2\u01c8\u01c9\7?\2\2\u01c9p\3"+
		"\2\2\2\u01ca\u01cb\7\60\2\2\u01cbr\3\2\2\2\u01cc\u01cd\7.\2\2\u01cdt\3"+
		"\2\2\2\u01ce\u01cf\7A\2\2\u01cfv\3\2\2\2\u01d0\u01d1\7<\2\2\u01d1x\3\2"+
		"\2\2\u01d2\u01d3\7=\2\2\u01d3z\3\2\2\2\u01d4\u01d5\7*\2\2\u01d5|\3\2\2"+
		"\2\u01d6\u01d7\7+\2\2\u01d7~\3\2\2\2\u01d8\u01d9\7]\2\2\u01d9\u0080\3"+
		"\2\2\2\u01da\u01db\7_\2\2\u01db\u0082\3\2\2\2\u01dc\u01dd\7$\2\2\u01dd"+
		"\u0084\3\2\2\2\u01de\u01df\7)\2\2\u01df\u0086\3\2\2\2\u01e0\u01e1\7}\2"+
		"\2\u01e1\u0088\3\2\2\2\u01e2\u01e3\7\177\2\2\u01e3\u008a\3\2\2\2\u01e4"+
		"\u01e8\t\f\2\2\u01e5\u01e7\t\r\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u008c\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01f0\n\16\2\2\u01ec\u01ed\7^\2\2\u01ed\u01f0\5\u0091"+
		"I\2\u01ee\u01f0\5\u009fP\2\u01ef\u01eb\3\2\2\2\u01ef\u01ec\3\2\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u008e\3\2\2\2\u01f1\u01f6\n\17\2\2\u01f2\u01f3\7"+
		"^\2\2\u01f3\u01f6\5\u0091I\2\u01f4\u01f6\5\u009fP\2\u01f5\u01f1\3\2\2"+
		"\2\u01f5\u01f2\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u0090\3\2\2\2\u01f7\u01fb"+
		"\5\u0093J\2\u01f8\u01fb\5\u0095K\2\u01f9\u01fb\5\u0099M\2\u01fa\u01f7"+
		"\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u0092\3\2\2\2\u01fc"+
		"\u01ff\5\u009bN\2\u01fd\u01ff\5\u009dO\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01ff\u0094\3\2\2\2\u0200\u0201\7z\2\2\u0201\u0202\5\u00a1Q\2"+
		"\u0202\u0203\5\u00a1Q\2\u0203\u0096\3\2\2\2\u0204\u0205\7w\2\2\u0205\u0206"+
		"\5\u00a1Q\2\u0206\u0207\5\u00a1Q\2\u0207\u0208\5\u00a1Q\2\u0208\u0209"+
		"\5\u00a1Q\2\u0209\u0098\3\2\2\2\u020a\u020b\7w\2\2\u020b\u020d\5\u0087"+
		"D\2\u020c\u020e\5\u00a1Q\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5\u0089"+
		"E\2\u0212\u009a\3\2\2\2\u0213\u0214\t\20\2\2\u0214\u009c\3\2\2\2\u0215"+
		"\u0216\n\21\2\2\u0216\u009e\3\2\2\2\u0217\u0218\7^\2\2\u0218\u0219\t\22"+
		"\2\2\u0219\u00a0\3\2\2\2\u021a\u021b\t\23\2\2\u021b\u00a2\3\2\2\2\36\2"+
		"\u00a8\u00ad\u0119\u0120\u0123\u0129\u0130\u0134\u013a\u013d\u0141\u0143"+
		"\u0147\u014c\u0153\u0159\u0160\u0167\u016d\u0176\u017b\u01e8\u01ef\u01f5"+
		"\u01fa\u01fe\u020f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}