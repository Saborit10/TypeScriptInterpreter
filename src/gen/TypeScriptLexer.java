package src.gen;
// Generated from ./src/grammar/TypeScript.g4 by ANTLR 4.7.2
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
		TK_NUMBER=13, TK_EXTENDS=14, TK_IF=15, TK_ELSE=16, TK_FUNCTION=17, TK_TYPE=18, 
		TK_REQUIRE=19, TK_EXPORT=20, TK_RETURN=21, TK_CONTINUE=22, TK_BREAK=23, 
		TK_FOR=24, TK_IN=25, TK_OF=26, TK_DO=27, TK_WHILE=28, TK_CLASS=29, TK_IMPLEMENTS=30, 
		TK_ABSTRACT=31, TK_CONSTRUCTOR=32, TK_ASYNC=33, TK_STATIC=34, TK_GET=35, 
		TK_SET=36, TK_NEW=37, TK_SWITCH=38, TK_CASE=39, TK_DEFAULT=40, NULL_LITERAL=41, 
		BOOLEAN_LITERAL=42, DECIMAL_INTEGER_LITERAL=43, DECIMAL_LITERAL=44, EXPONENT_PART=45, 
		HEX_INTEGER_LITERAL=46, OCTAL_INTEGER_LITERAL=47, OCTAL_INTEGER_LITERAL2=48, 
		BINARY_INTEGER_LITERAL=49, STRING_LITERAL=50, TK_PLUS=51, TK_MINUS=52, 
		TK_STAR=53, TK_SLASH=54, TK_PERCENT=55, TK_NOT=56, TK_BINNOT=57, TK_PLUSPLUS=58, 
		TK_MINUSMINUS=59, TK_PLUS_ASIGN=60, TK_MINUS_ASIGN=61, TK_STAR_ASIGN=62, 
		TK_SLASH_ASIGN=63, TK_AND_ASIGN=64, TK_OR_ASIGN=65, TK_PERCENT_ASIGN=66, 
		TK_EQ=67, TK_EQEQ=68, TK_NOTEQ=69, TK_IDENTEQ=70, TK_IDENTNOTEQ=71, TK_BIN_AND=72, 
		TK_BIN_OR=73, TK_LOGIC_AND=74, TK_LOGIC_OR=75, TK_LESS=76, TK_GREAT=77, 
		TK_LESSEQ=78, TK_GREATEQ=79, TK_POINT=80, TK_COMMA=81, TK_QMARK=82, TK_COLON=83, 
		TK_SEMICOLON=84, TK_LPARENT=85, TK_RPARENT=86, TK_LBRACKET=87, TK_RBRACKET=88, 
		TK_DCUOTE=89, TK_SCUOTE=90, TK_LCURLY=91, TK_RCURLY=92, TK_IDENT=93, DOUBLE_STRING_CHARACTER=94, 
		SINGLE_STRING_CHARACTER=95, ESCAPE_SEQUENCE=96, CHARACTER_ESCAPE_SEQUENCE=97, 
		HEX_ESCAPE_SEQUENCE=98, UNICODE_ESCAPE_SEQUENCE=99, EXTENDED_UNICODE_ESCAPE_SEQUENCE=100, 
		SINGLE_ESCAPE_CHARACTER=101, NON_ESCAPE_CHARACTER=102, LINE_CONTINUATION=103, 
		HEX_DIGIT=104, TK_MULTILINE_COMMENT=105, TK_SINGLELINE_COMMENT=106;
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
			"TK_REQUIRE", "TK_EXPORT", "TK_RETURN", "TK_CONTINUE", "TK_BREAK", "TK_FOR", 
			"TK_IN", "TK_OF", "TK_DO", "TK_WHILE", "TK_CLASS", "TK_IMPLEMENTS", "TK_ABSTRACT", 
			"TK_CONSTRUCTOR", "TK_ASYNC", "TK_STATIC", "TK_GET", "TK_SET", "TK_NEW", 
			"TK_SWITCH", "TK_CASE", "TK_DEFAULT", "NULL_LITERAL", "BOOLEAN_LITERAL", 
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
			"LINE_CONTINUATION", "HEX_DIGIT", "TK_MULTILINE_COMMENT", "TK_SINGLELINE_COMMENT"
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
			"'default'", "'null'", null, null, null, null, null, null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'='", "'=='", 
			"'!='", "'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", "'<'", "'>'", 
			"'<='", "'>='", "'.'", "','", "'?'", "':'", "';'", "'('", "')'", "'['", 
			"']'", "'\"'", "'''", "'{'", "'}'"
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
			"TK_NEW", "TK_SWITCH", "TK_CASE", "TK_DEFAULT", "NULL_LITERAL", "BOOLEAN_LITERAL", 
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
			"LINE_CONTINUATION", "HEX_DIGIT", "TK_MULTILINE_COMMENT", "TK_SINGLELINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2l\u030d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\3\2\3\2\3\2\3\2\5\2\u00dd\n\2\3\3\6\3\u00e0\n\3\r\3\16\3\u00e1\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01e7\n+\3,\3,\3,\7,\u01ec"+
		"\n,\f,\16,\u01ef\13,\5,\u01f1\n,\3-\3-\7-\u01f5\n-\f-\16-\u01f8\13-\3"+
		"-\3-\7-\u01fc\n-\f-\16-\u01ff\13-\3-\5-\u0202\n-\3-\3-\3-\7-\u0207\n-"+
		"\f-\16-\u020a\13-\3-\5-\u020d\n-\3-\3-\6-\u0211\n-\r-\16-\u0212\3-\5-"+
		"\u0216\n-\3-\3-\5-\u021a\n-\5-\u021c\n-\3.\3.\5.\u0220\n.\3.\6.\u0223"+
		"\n.\r.\16.\u0224\3/\3/\3/\6/\u022a\n/\r/\16/\u022b\3\60\3\60\6\60\u0230"+
		"\n\60\r\60\16\60\u0231\3\61\3\61\3\61\6\61\u0237\n\61\r\61\16\61\u0238"+
		"\3\62\3\62\3\62\6\62\u023e\n\62\r\62\16\62\u023f\3\63\3\63\7\63\u0244"+
		"\n\63\f\63\16\63\u0247\13\63\3\63\3\63\3\63\3\63\7\63\u024d\n\63\f\63"+
		"\16\63\u0250\13\63\3\63\3\63\5\63\u0254\n\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>"+
		"\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F"+
		"\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O"+
		"\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y"+
		"\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\7^\u02bf\n^\f^\16^\u02c2\13^\3_\3_\3"+
		"_\3_\5_\u02c8\n_\3`\3`\3`\3`\5`\u02ce\n`\3a\3a\3a\5a\u02d3\na\3b\3b\5"+
		"b\u02d7\nb\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\6e\u02e6\ne\re\16e\u02e7"+
		"\3e\3e\3f\3f\3g\3g\3h\3h\3h\3i\3i\3j\3j\3j\3j\7j\u02f9\nj\fj\16j\u02fc"+
		"\13j\3j\3j\3j\3j\3j\3k\3k\3k\3k\7k\u0307\nk\fk\16k\u030a\13k\3k\3k\3\u02fa"+
		"\2l\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9"+
		"f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\3\2\24\5\2\13\f\17\17\"\""+
		"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2ZZzz\3\2\629\4\2QQqq\4\2DDdd\3\2\62"+
		"\63\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^"+
		"\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\5\2\f\f\17"+
		"\17\u202a\u202b\5\2\62;CHch\2\u0333\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\3\u00dc\3\2\2\2\5\u00df\3\2\2"+
		"\2\7\u00e5\3\2\2\2\t\u00ec\3\2\2\2\13\u00f4\3\2\2\2\r\u00fe\3\2\2\2\17"+
		"\u0102\3\2\2\2\21\u0106\3\2\2\2\23\u010c\3\2\2\2\25\u0115\3\2\2\2\27\u011c"+
		"\3\2\2\2\31\u0120\3\2\2\2\33\u0128\3\2\2\2\35\u012f\3\2\2\2\37\u0137\3"+
		"\2\2\2!\u013a\3\2\2\2#\u013f\3\2\2\2%\u0148\3\2\2\2\'\u014d\3\2\2\2)\u0155"+
		"\3\2\2\2+\u015c\3\2\2\2-\u0163\3\2\2\2/\u016c\3\2\2\2\61\u0172\3\2\2\2"+
		"\63\u0176\3\2\2\2\65\u0179\3\2\2\2\67\u017c\3\2\2\29\u017f\3\2\2\2;\u0185"+
		"\3\2\2\2=\u018b\3\2\2\2?\u0196\3\2\2\2A\u019f\3\2\2\2C\u01ab\3\2\2\2E"+
		"\u01b1\3\2\2\2G\u01b8\3\2\2\2I\u01bc\3\2\2\2K\u01c0\3\2\2\2M\u01c4\3\2"+
		"\2\2O\u01cb\3\2\2\2Q\u01d0\3\2\2\2S\u01d8\3\2\2\2U\u01e6\3\2\2\2W\u01f0"+
		"\3\2\2\2Y\u021b\3\2\2\2[\u021d\3\2\2\2]\u0226\3\2\2\2_\u022d\3\2\2\2a"+
		"\u0233\3\2\2\2c\u023a\3\2\2\2e\u0253\3\2\2\2g\u0255\3\2\2\2i\u0257\3\2"+
		"\2\2k\u0259\3\2\2\2m\u025b\3\2\2\2o\u025d\3\2\2\2q\u025f\3\2\2\2s\u0261"+
		"\3\2\2\2u\u0263\3\2\2\2w\u0266\3\2\2\2y\u0269\3\2\2\2{\u026c\3\2\2\2}"+
		"\u026f\3\2\2\2\177\u0272\3\2\2\2\u0081\u0275\3\2\2\2\u0083\u0278\3\2\2"+
		"\2\u0085\u027b\3\2\2\2\u0087\u027e\3\2\2\2\u0089\u0280\3\2\2\2\u008b\u0283"+
		"\3\2\2\2\u008d\u0286\3\2\2\2\u008f\u028a\3\2\2\2\u0091\u028e\3\2\2\2\u0093"+
		"\u0290\3\2\2\2\u0095\u0292\3\2\2\2\u0097\u0295\3\2\2\2\u0099\u0298\3\2"+
		"\2\2\u009b\u029a\3\2\2\2\u009d\u029c\3\2\2\2\u009f\u029f\3\2\2\2\u00a1"+
		"\u02a2\3\2\2\2\u00a3\u02a4\3\2\2\2\u00a5\u02a6\3\2\2\2\u00a7\u02a8\3\2"+
		"\2\2\u00a9\u02aa\3\2\2\2\u00ab\u02ac\3\2\2\2\u00ad\u02ae\3\2\2\2\u00af"+
		"\u02b0\3\2\2\2\u00b1\u02b2\3\2\2\2\u00b3\u02b4\3\2\2\2\u00b5\u02b6\3\2"+
		"\2\2\u00b7\u02b8\3\2\2\2\u00b9\u02ba\3\2\2\2\u00bb\u02bc\3\2\2\2\u00bd"+
		"\u02c7\3\2\2\2\u00bf\u02cd\3\2\2\2\u00c1\u02d2\3\2\2\2\u00c3\u02d6\3\2"+
		"\2\2\u00c5\u02d8\3\2\2\2\u00c7\u02dc\3\2\2\2\u00c9\u02e2\3\2\2\2\u00cb"+
		"\u02eb\3\2\2\2\u00cd\u02ed\3\2\2\2\u00cf\u02ef\3\2\2\2\u00d1\u02f2\3\2"+
		"\2\2\u00d3\u02f4\3\2\2\2\u00d5\u0302\3\2\2\2\u00d7\u00dd\5Y-\2\u00d8\u00dd"+
		"\5c\62\2\u00d9\u00dd\5_\60\2\u00da\u00dd\5a\61\2\u00db\u00dd\5]/\2\u00dc"+
		"\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00db\3\2\2\2\u00dd\4\3\2\2\2\u00de\u00e0\t\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\b\3\2\2\u00e4\6\3\2\2\2\u00e5\u00e6\7r\2\2"+
		"\u00e6\u00e7\7w\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00eb\7e\2\2\u00eb\b\3\2\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7x\2\2\u00f0\u00f1\7c\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\n\3\2\2\2\u00f4\u00f5\7r\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2"+
		"\u00f9\u00fa\7e\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7f\2\2\u00fd\f\3\2\2\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7c\2\2\u0100\u0101"+
		"\7t\2\2\u0101\16\3\2\2\2\u0102\u0103\7n\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7v\2\2\u0105\20\3\2\2\2\u0106\u0107\7e\2\2\u0107\u0108\7q\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7u\2\2\u010a\u010b\7v\2\2\u010b\22\3\2\2\2\u010c\u010d"+
		"\7t\2\2\u010d\u010e\7g\2\2\u010e\u010f\7c\2\2\u010f\u0110\7f\2\2\u0110"+
		"\u0111\7q\2\2\u0111\u0112\7p\2\2\u0112\u0113\7n\2\2\u0113\u0114\7{\2\2"+
		"\u0114\24\3\2\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7"+
		"t\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7i\2\2\u011b\26"+
		"\3\2\2\2\u011c\u011d\7c\2\2\u011d\u011e\7p\2\2\u011e\u011f\7{\2\2\u011f"+
		"\30\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122\7q\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0124\7n\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126\u0127\7p\2\2"+
		"\u0127\32\3\2\2\2\u0128\u0129\7p\2\2\u0129\u012a\7w\2\2\u012a\u012b\7"+
		"o\2\2\u012b\u012c\7d\2\2\u012c\u012d\7g\2\2\u012d\u012e\7t\2\2\u012e\34"+
		"\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7z\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7p\2\2\u0134\u0135\7f\2\2\u0135\u0136\7u\2\2"+
		"\u0136\36\3\2\2\2\u0137\u0138\7k\2\2\u0138\u0139\7h\2\2\u0139 \3\2\2\2"+
		"\u013a\u013b\7g\2\2\u013b\u013c\7n\2\2\u013c\u013d\7u\2\2\u013d\u013e"+
		"\7g\2\2\u013e\"\3\2\2\2\u013f\u0140\7h\2\2\u0140\u0141\7w\2\2\u0141\u0142"+
		"\7p\2\2\u0142\u0143\7e\2\2\u0143\u0144\7v\2\2\u0144\u0145\7k\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7p\2\2\u0147$\3\2\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7{\2\2\u014a\u014b\7r\2\2\u014b\u014c\7g\2\2\u014c&\3\2\2\2\u014d"+
		"\u014e\7t\2\2\u014e\u014f\7g\2\2\u014f\u0150\7s\2\2\u0150\u0151\7w\2\2"+
		"\u0151\u0152\7k\2\2\u0152\u0153\7t\2\2\u0153\u0154\7g\2\2\u0154(\3\2\2"+
		"\2\u0155\u0156\7g\2\2\u0156\u0157\7z\2\2\u0157\u0158\7r\2\2\u0158\u0159"+
		"\7q\2\2\u0159\u015a\7t\2\2\u015a\u015b\7v\2\2\u015b*\3\2\2\2\u015c\u015d"+
		"\7t\2\2\u015d\u015e\7g\2\2\u015e\u015f\7v\2\2\u015f\u0160\7w\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7p\2\2\u0162,\3\2\2\2\u0163\u0164\7e\2\2\u0164"+
		"\u0165\7q\2\2\u0165\u0166\7p\2\2\u0166\u0167\7v\2\2\u0167\u0168\7k\2\2"+
		"\u0168\u0169\7p\2\2\u0169\u016a\7w\2\2\u016a\u016b\7g\2\2\u016b.\3\2\2"+
		"\2\u016c\u016d\7d\2\2\u016d\u016e\7t\2\2\u016e\u016f\7g\2\2\u016f\u0170"+
		"\7c\2\2\u0170\u0171\7m\2\2\u0171\60\3\2\2\2\u0172\u0173\7h\2\2\u0173\u0174"+
		"\7q\2\2\u0174\u0175\7t\2\2\u0175\62\3\2\2\2\u0176\u0177\7k\2\2\u0177\u0178"+
		"\7p\2\2\u0178\64\3\2\2\2\u0179\u017a\7q\2\2\u017a\u017b\7h\2\2\u017b\66"+
		"\3\2\2\2\u017c\u017d\7f\2\2\u017d\u017e\7q\2\2\u017e8\3\2\2\2\u017f\u0180"+
		"\7y\2\2\u0180\u0181\7j\2\2\u0181\u0182\7k\2\2\u0182\u0183\7n\2\2\u0183"+
		"\u0184\7g\2\2\u0184:\3\2\2\2\u0185\u0186\7e\2\2\u0186\u0187\7n\2\2\u0187"+
		"\u0188\7c\2\2\u0188\u0189\7u\2\2\u0189\u018a\7u\2\2\u018a<\3\2\2\2\u018b"+
		"\u018c\7k\2\2\u018c\u018d\7o\2\2\u018d\u018e\7r\2\2\u018e\u018f\7n\2\2"+
		"\u018f\u0190\7g\2\2\u0190\u0191\7o\2\2\u0191\u0192\7g\2\2\u0192\u0193"+
		"\7p\2\2\u0193\u0194\7v\2\2\u0194\u0195\7u\2\2\u0195>\3\2\2\2\u0196\u0197"+
		"\7c\2\2\u0197\u0198\7d\2\2\u0198\u0199\7u\2\2\u0199\u019a\7v\2\2\u019a"+
		"\u019b\7t\2\2\u019b\u019c\7c\2\2\u019c\u019d\7e\2\2\u019d\u019e\7v\2\2"+
		"\u019e@\3\2\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7p\2"+
		"\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6"+
		"\7w\2\2\u01a6\u01a7\7e\2\2\u01a7\u01a8\7v\2\2\u01a8\u01a9\7q\2\2\u01a9"+
		"\u01aa\7t\2\2\u01aaB\3\2\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7u\2\2\u01ad"+
		"\u01ae\7{\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7e\2\2\u01b0D\3\2\2\2\u01b1"+
		"\u01b2\7u\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7c\2\2\u01b4\u01b5\7v\2\2"+
		"\u01b5\u01b6\7k\2\2\u01b6\u01b7\7e\2\2\u01b7F\3\2\2\2\u01b8\u01b9\7i\2"+
		"\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7v\2\2\u01bbH\3\2\2\2\u01bc\u01bd\7"+
		"u\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7v\2\2\u01bfJ\3\2\2\2\u01c0\u01c1"+
		"\7p\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7y\2\2\u01c3L\3\2\2\2\u01c4\u01c5"+
		"\7u\2\2\u01c5\u01c6\7y\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7v\2\2\u01c8"+
		"\u01c9\7e\2\2\u01c9\u01ca\7j\2\2\u01caN\3\2\2\2\u01cb\u01cc\7e\2\2\u01cc"+
		"\u01cd\7c\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf\7g\2\2\u01cfP\3\2\2\2\u01d0"+
		"\u01d1\7f\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7h\2\2\u01d3\u01d4\7c\2\2"+
		"\u01d4\u01d5\7w\2\2\u01d5\u01d6\7n\2\2\u01d6\u01d7\7v\2\2\u01d7R\3\2\2"+
		"\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7w\2\2\u01da\u01db\7n\2\2\u01db\u01dc"+
		"\7n\2\2\u01dcT\3\2\2\2\u01dd\u01de\7v\2\2\u01de\u01df\7t\2\2\u01df\u01e0"+
		"\7w\2\2\u01e0\u01e7\7g\2\2\u01e1\u01e2\7h\2\2\u01e2\u01e3\7c\2\2\u01e3"+
		"\u01e4\7n\2\2\u01e4\u01e5\7u\2\2\u01e5\u01e7\7g\2\2\u01e6\u01dd\3\2\2"+
		"\2\u01e6\u01e1\3\2\2\2\u01e7V\3\2\2\2\u01e8\u01f1\7\62\2\2\u01e9\u01ed"+
		"\t\3\2\2\u01ea\u01ec\t\4\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01f0\u01e8\3\2\2\2\u01f0\u01e9\3\2\2\2\u01f1X\3\2\2\2\u01f2\u01f6"+
		"\t\3\2\2\u01f3\u01f5\t\4\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fd\5\u00a1Q\2\u01fa\u01fc\t\4\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0201\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\5[.\2\u0201\u0200\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u021c\3\2\2\2\u0203\u0204\7\62\2\2\u0204\u0208\5\u00a1"+
		"Q\2\u0205\u0207\t\4\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u020d\5[.\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u021c"+
		"\3\2\2\2\u020e\u0210\5\u00a1Q\2\u020f\u0211\t\4\2\2\u0210\u020f\3\2\2"+
		"\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215"+
		"\3\2\2\2\u0214\u0216\5[.\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u021c\3\2\2\2\u0217\u0219\5W,\2\u0218\u021a\5[.\2\u0219\u0218\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u01f2\3\2\2\2\u021b\u0203"+
		"\3\2\2\2\u021b\u020e\3\2\2\2\u021b\u0217\3\2\2\2\u021cZ\3\2\2\2\u021d"+
		"\u021f\t\5\2\2\u021e\u0220\t\6\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0222\3\2\2\2\u0221\u0223\t\4\2\2\u0222\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\\\3\2\2\2"+
		"\u0226\u0227\7\62\2\2\u0227\u0229\t\7\2\2\u0228\u022a\5\u00d1i\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c^\3\2\2\2\u022d\u022f\7\62\2\2\u022e\u0230\t\b\2\2\u022f\u022e"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"`\3\2\2\2\u0233\u0234\7\62\2\2\u0234\u0236\t\t\2\2\u0235\u0237\t\b\2\2"+
		"\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239b\3\2\2\2\u023a\u023b\7\62\2\2\u023b\u023d\t\n\2\2\u023c"+
		"\u023e\t\13\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3"+
		"\2\2\2\u023f\u0240\3\2\2\2\u0240d\3\2\2\2\u0241\u0245\5\u00b3Z\2\u0242"+
		"\u0244\5\u00bd_\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u0249\5\u00b3Z\2\u0249\u0254\3\2\2\2\u024a\u024e\5\u00b5[\2\u024b\u024d"+
		"\5\u00bf`\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252"+
		"\5\u00b5[\2\u0252\u0254\3\2\2\2\u0253\u0241\3\2\2\2\u0253\u024a\3\2\2"+
		"\2\u0254f\3\2\2\2\u0255\u0256\7-\2\2\u0256h\3\2\2\2\u0257\u0258\7/\2\2"+
		"\u0258j\3\2\2\2\u0259\u025a\7,\2\2\u025al\3\2\2\2\u025b\u025c\7\61\2\2"+
		"\u025cn\3\2\2\2\u025d\u025e\7\'\2\2\u025ep\3\2\2\2\u025f\u0260\7#\2\2"+
		"\u0260r\3\2\2\2\u0261\u0262\7\u0080\2\2\u0262t\3\2\2\2\u0263\u0264\7-"+
		"\2\2\u0264\u0265\7-\2\2\u0265v\3\2\2\2\u0266\u0267\7/\2\2\u0267\u0268"+
		"\7/\2\2\u0268x\3\2\2\2\u0269\u026a\7-\2\2\u026a\u026b\7?\2\2\u026bz\3"+
		"\2\2\2\u026c\u026d\7/\2\2\u026d\u026e\7?\2\2\u026e|\3\2\2\2\u026f\u0270"+
		"\7,\2\2\u0270\u0271\7?\2\2\u0271~\3\2\2\2\u0272\u0273\7\61\2\2\u0273\u0274"+
		"\7?\2\2\u0274\u0080\3\2\2\2\u0275\u0276\7(\2\2\u0276\u0277\7?\2\2\u0277"+
		"\u0082\3\2\2\2\u0278\u0279\7~\2\2\u0279\u027a\7?\2\2\u027a\u0084\3\2\2"+
		"\2\u027b\u027c\7\'\2\2\u027c\u027d\7?\2\2\u027d\u0086\3\2\2\2\u027e\u027f"+
		"\7?\2\2\u027f\u0088\3\2\2\2\u0280\u0281\7?\2\2\u0281\u0282\7?\2\2\u0282"+
		"\u008a\3\2\2\2\u0283\u0284\7#\2\2\u0284\u0285\7?\2\2\u0285\u008c\3\2\2"+
		"\2\u0286\u0287\7?\2\2\u0287\u0288\7?\2\2\u0288\u0289\7?\2\2\u0289\u008e"+
		"\3\2\2\2\u028a\u028b\7#\2\2\u028b\u028c\7?\2\2\u028c\u028d\7?\2\2\u028d"+
		"\u0090\3\2\2\2\u028e\u028f\7(\2\2\u028f\u0092\3\2\2\2\u0290\u0291\7~\2"+
		"\2\u0291\u0094\3\2\2\2\u0292\u0293\7(\2\2\u0293\u0294\7(\2\2\u0294\u0096"+
		"\3\2\2\2\u0295\u0296\7~\2\2\u0296\u0297\7~\2\2\u0297\u0098\3\2\2\2\u0298"+
		"\u0299\7>\2\2\u0299\u009a\3\2\2\2\u029a\u029b\7@\2\2\u029b\u009c\3\2\2"+
		"\2\u029c\u029d\7>\2\2\u029d\u029e\7?\2\2\u029e\u009e\3\2\2\2\u029f\u02a0"+
		"\7@\2\2\u02a0\u02a1\7?\2\2\u02a1\u00a0\3\2\2\2\u02a2\u02a3\7\60\2\2\u02a3"+
		"\u00a2\3\2\2\2\u02a4\u02a5\7.\2\2\u02a5\u00a4\3\2\2\2\u02a6\u02a7\7A\2"+
		"\2\u02a7\u00a6\3\2\2\2\u02a8\u02a9\7<\2\2\u02a9\u00a8\3\2\2\2\u02aa\u02ab"+
		"\7=\2\2\u02ab\u00aa\3\2\2\2\u02ac\u02ad\7*\2\2\u02ad\u00ac\3\2\2\2\u02ae"+
		"\u02af\7+\2\2\u02af\u00ae\3\2\2\2\u02b0\u02b1\7]\2\2\u02b1\u00b0\3\2\2"+
		"\2\u02b2\u02b3\7_\2\2\u02b3\u00b2\3\2\2\2\u02b4\u02b5\7$\2\2\u02b5\u00b4"+
		"\3\2\2\2\u02b6\u02b7\7)\2\2\u02b7\u00b6\3\2\2\2\u02b8\u02b9\7}\2\2\u02b9"+
		"\u00b8\3\2\2\2\u02ba\u02bb\7\177\2\2\u02bb\u00ba\3\2\2\2\u02bc\u02c0\t"+
		"\f\2\2\u02bd\u02bf\t\r\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u00bc\3\2\2\2\u02c2\u02c0\3\2"+
		"\2\2\u02c3\u02c8\n\16\2\2\u02c4\u02c5\7^\2\2\u02c5\u02c8\5\u00c1a\2\u02c6"+
		"\u02c8\5\u00cfh\2\u02c7\u02c3\3\2\2\2\u02c7\u02c4\3\2\2\2\u02c7\u02c6"+
		"\3\2\2\2\u02c8\u00be\3\2\2\2\u02c9\u02ce\n\17\2\2\u02ca\u02cb\7^\2\2\u02cb"+
		"\u02ce\5\u00c1a\2\u02cc\u02ce\5\u00cfh\2\u02cd\u02c9\3\2\2\2\u02cd\u02ca"+
		"\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u00c0\3\2\2\2\u02cf\u02d3\5\u00c3b"+
		"\2\u02d0\u02d3\5\u00c5c\2\u02d1\u02d3\5\u00c9e\2\u02d2\u02cf\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u00c2\3\2\2\2\u02d4\u02d7\5\u00cb"+
		"f\2\u02d5\u02d7\5\u00cdg\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7"+
		"\u00c4\3\2\2\2\u02d8\u02d9\7z\2\2\u02d9\u02da\5\u00d1i\2\u02da\u02db\5"+
		"\u00d1i\2\u02db\u00c6\3\2\2\2\u02dc\u02dd\7w\2\2\u02dd\u02de\5\u00d1i"+
		"\2\u02de\u02df\5\u00d1i\2\u02df\u02e0\5\u00d1i\2\u02e0\u02e1\5\u00d1i"+
		"\2\u02e1\u00c8\3\2\2\2\u02e2\u02e3\7w\2\2\u02e3\u02e5\5\u00b7\\\2\u02e4"+
		"\u02e6\5\u00d1i\2\u02e5\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e5"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\5\u00b9]"+
		"\2\u02ea\u00ca\3\2\2\2\u02eb\u02ec\t\20\2\2\u02ec\u00cc\3\2\2\2\u02ed"+
		"\u02ee\n\21\2\2\u02ee\u00ce\3\2\2\2\u02ef\u02f0\7^\2\2\u02f0\u02f1\t\22"+
		"\2\2\u02f1\u00d0\3\2\2\2\u02f2\u02f3\t\23\2\2\u02f3\u00d2\3\2\2\2\u02f4"+
		"\u02f5\7\61\2\2\u02f5\u02f6\7,\2\2\u02f6\u02fa\3\2\2\2\u02f7\u02f9\13"+
		"\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\7,"+
		"\2\2\u02fe\u02ff\7\61\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\bj\3\2\u0301"+
		"\u00d4\3\2\2\2\u0302\u0303\7\61\2\2\u0303\u0304\7\61\2\2\u0304\u0308\3"+
		"\2\2\2\u0305\u0307\n\22\2\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030b\u030c\bk\3\2\u030c\u00d6\3\2\2\2\"\2\u00dc\u00e1\u01e6\u01ed"+
		"\u01f0\u01f6\u01fd\u0201\u0208\u020c\u0212\u0215\u0219\u021b\u021f\u0224"+
		"\u022b\u0231\u0238\u023f\u0245\u024e\u0253\u02c0\u02c7\u02cd\u02d2\u02d6"+
		"\u02e7\u02fa\u0308\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}