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
			"TK_SWITCH", "TK_CASE", "TK_DEFAULT", "TK_THIS", "NULL_LITERAL", "BOOLEAN_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u0314\b\1\4\2\t"+
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
		"k\4l\tl\3\2\3\2\3\2\3\2\3\2\5\2\u00df\n\2\3\3\6\3\u00e2\n\3\r\3\16\3\u00e3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01ee\n,\3"+
		"-\3-\3-\7-\u01f3\n-\f-\16-\u01f6\13-\5-\u01f8\n-\3.\3.\7.\u01fc\n.\f."+
		"\16.\u01ff\13.\3.\3.\7.\u0203\n.\f.\16.\u0206\13.\3.\5.\u0209\n.\3.\3"+
		".\3.\7.\u020e\n.\f.\16.\u0211\13.\3.\5.\u0214\n.\3.\3.\6.\u0218\n.\r."+
		"\16.\u0219\3.\5.\u021d\n.\3.\3.\5.\u0221\n.\5.\u0223\n.\3/\3/\5/\u0227"+
		"\n/\3/\6/\u022a\n/\r/\16/\u022b\3\60\3\60\3\60\6\60\u0231\n\60\r\60\16"+
		"\60\u0232\3\61\3\61\6\61\u0237\n\61\r\61\16\61\u0238\3\62\3\62\3\62\6"+
		"\62\u023e\n\62\r\62\16\62\u023f\3\63\3\63\3\63\6\63\u0245\n\63\r\63\16"+
		"\63\u0246\3\64\3\64\7\64\u024b\n\64\f\64\16\64\u024e\13\64\3\64\3\64\3"+
		"\64\3\64\7\64\u0254\n\64\f\64\16\64\u0257\13\64\3\64\3\64\5\64\u025b\n"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3="+
		"\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D"+
		"\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3K\3K\3L\3L\3L"+
		"\3M\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\7_\u02c6\n_\f"+
		"_\16_\u02c9\13_\3`\3`\3`\3`\5`\u02cf\n`\3a\3a\3a\3a\5a\u02d5\na\3b\3b"+
		"\3b\5b\u02da\nb\3c\3c\5c\u02de\nc\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f"+
		"\3f\6f\u02ed\nf\rf\16f\u02ee\3f\3f\3g\3g\3h\3h\3i\3i\3i\3j\3j\3k\3k\3"+
		"k\3k\7k\u0300\nk\fk\16k\u0303\13k\3k\3k\3k\3k\3k\3l\3l\3l\3l\7l\u030e"+
		"\nl\fl\16l\u0311\13l\3l\3l\3\u0301\2m\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bf"+
		"a\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3"+
		"k\u00d5l\u00d7m\3\2\24\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2"+
		"--//\4\2ZZzz\3\2\629\4\2QQqq\4\2DDdd\3\2\62\63\6\2&&C\\aac|\7\2&&\62;"+
		"C\\aac|\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16"+
		"\2\f\f\17\17$$))\62;^^ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;C"+
		"Hch\2\u033a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\3\u00de\3\2\2\2\5\u00e1\3\2\2\2\7\u00e7"+
		"\3\2\2\2\t\u00ee\3\2\2\2\13\u00f6\3\2\2\2\r\u0100\3\2\2\2\17\u0104\3\2"+
		"\2\2\21\u0108\3\2\2\2\23\u010e\3\2\2\2\25\u0117\3\2\2\2\27\u011e\3\2\2"+
		"\2\31\u0122\3\2\2\2\33\u012a\3\2\2\2\35\u0131\3\2\2\2\37\u0139\3\2\2\2"+
		"!\u013c\3\2\2\2#\u0141\3\2\2\2%\u014a\3\2\2\2\'\u014f\3\2\2\2)\u0157\3"+
		"\2\2\2+\u015e\3\2\2\2-\u0165\3\2\2\2/\u016e\3\2\2\2\61\u0174\3\2\2\2\63"+
		"\u0178\3\2\2\2\65\u017b\3\2\2\2\67\u017e\3\2\2\29\u0181\3\2\2\2;\u0187"+
		"\3\2\2\2=\u018d\3\2\2\2?\u0198\3\2\2\2A\u01a1\3\2\2\2C\u01ad\3\2\2\2E"+
		"\u01b3\3\2\2\2G\u01ba\3\2\2\2I\u01be\3\2\2\2K\u01c2\3\2\2\2M\u01c6\3\2"+
		"\2\2O\u01cd\3\2\2\2Q\u01d2\3\2\2\2S\u01da\3\2\2\2U\u01df\3\2\2\2W\u01ed"+
		"\3\2\2\2Y\u01f7\3\2\2\2[\u0222\3\2\2\2]\u0224\3\2\2\2_\u022d\3\2\2\2a"+
		"\u0234\3\2\2\2c\u023a\3\2\2\2e\u0241\3\2\2\2g\u025a\3\2\2\2i\u025c\3\2"+
		"\2\2k\u025e\3\2\2\2m\u0260\3\2\2\2o\u0262\3\2\2\2q\u0264\3\2\2\2s\u0266"+
		"\3\2\2\2u\u0268\3\2\2\2w\u026a\3\2\2\2y\u026d\3\2\2\2{\u0270\3\2\2\2}"+
		"\u0273\3\2\2\2\177\u0276\3\2\2\2\u0081\u0279\3\2\2\2\u0083\u027c\3\2\2"+
		"\2\u0085\u027f\3\2\2\2\u0087\u0282\3\2\2\2\u0089\u0285\3\2\2\2\u008b\u0287"+
		"\3\2\2\2\u008d\u028a\3\2\2\2\u008f\u028d\3\2\2\2\u0091\u0291\3\2\2\2\u0093"+
		"\u0295\3\2\2\2\u0095\u0297\3\2\2\2\u0097\u0299\3\2\2\2\u0099\u029c\3\2"+
		"\2\2\u009b\u029f\3\2\2\2\u009d\u02a1\3\2\2\2\u009f\u02a3\3\2\2\2\u00a1"+
		"\u02a6\3\2\2\2\u00a3\u02a9\3\2\2\2\u00a5\u02ab\3\2\2\2\u00a7\u02ad\3\2"+
		"\2\2\u00a9\u02af\3\2\2\2\u00ab\u02b1\3\2\2\2\u00ad\u02b3\3\2\2\2\u00af"+
		"\u02b5\3\2\2\2\u00b1\u02b7\3\2\2\2\u00b3\u02b9\3\2\2\2\u00b5\u02bb\3\2"+
		"\2\2\u00b7\u02bd\3\2\2\2\u00b9\u02bf\3\2\2\2\u00bb\u02c1\3\2\2\2\u00bd"+
		"\u02c3\3\2\2\2\u00bf\u02ce\3\2\2\2\u00c1\u02d4\3\2\2\2\u00c3\u02d9\3\2"+
		"\2\2\u00c5\u02dd\3\2\2\2\u00c7\u02df\3\2\2\2\u00c9\u02e3\3\2\2\2\u00cb"+
		"\u02e9\3\2\2\2\u00cd\u02f2\3\2\2\2\u00cf\u02f4\3\2\2\2\u00d1\u02f6\3\2"+
		"\2\2\u00d3\u02f9\3\2\2\2\u00d5\u02fb\3\2\2\2\u00d7\u0309\3\2\2\2\u00d9"+
		"\u00df\5[.\2\u00da\u00df\5e\63\2\u00db\u00df\5a\61\2\u00dc\u00df\5c\62"+
		"\2\u00dd\u00df\5_\60\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\4\3\2\2\2\u00e0"+
		"\u00e2\t\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\3\2\2\u00e6"+
		"\6\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7d\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7e\2\2\u00ed\b\3\2\2\2\u00ee"+
		"\u00ef\7r\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7x\2\2"+
		"\u00f2\u00f3\7c\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\n\3\2"+
		"\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7v\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7f\2\2\u00ff\f\3\2\2\2\u0100\u0101\7x\2\2\u0101"+
		"\u0102\7c\2\2\u0102\u0103\7t\2\2\u0103\16\3\2\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7g\2\2\u0106\u0107\7v\2\2\u0107\20\3\2\2\2\u0108\u0109\7e\2\2\u0109"+
		"\u010a\7q\2\2\u010a\u010b\7p\2\2\u010b\u010c\7u\2\2\u010c\u010d\7v\2\2"+
		"\u010d\22\3\2\2\2\u010e\u010f\7t\2\2\u010f\u0110\7g\2\2\u0110\u0111\7"+
		"c\2\2\u0111\u0112\7f\2\2\u0112\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7n\2\2\u0115\u0116\7{\2\2\u0116\24\3\2\2\2\u0117\u0118\7u\2\2\u0118\u0119"+
		"\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u011d\7i\2\2\u011d\26\3\2\2\2\u011e\u011f\7c\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7{\2\2\u0121\30\3\2\2\2\u0122\u0123\7d\2\2\u0123\u0124\7q\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7n\2\2\u0126\u0127\7g\2\2\u0127\u0128\7c\2\2"+
		"\u0128\u0129\7p\2\2\u0129\32\3\2\2\2\u012a\u012b\7p\2\2\u012b\u012c\7"+
		"w\2\2\u012c\u012d\7o\2\2\u012d\u012e\7d\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7t\2\2\u0130\34\3\2\2\2\u0131\u0132\7g\2\2\u0132\u0133\7z\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137\7f\2\2\u0137"+
		"\u0138\7u\2\2\u0138\36\3\2\2\2\u0139\u013a\7k\2\2\u013a\u013b\7h\2\2\u013b"+
		" \3\2\2\2\u013c\u013d\7g\2\2\u013d\u013e\7n\2\2\u013e\u013f\7u\2\2\u013f"+
		"\u0140\7g\2\2\u0140\"\3\2\2\2\u0141\u0142\7h\2\2\u0142\u0143\7w\2\2\u0143"+
		"\u0144\7p\2\2\u0144\u0145\7e\2\2\u0145\u0146\7v\2\2\u0146\u0147\7k\2\2"+
		"\u0147\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149$\3\2\2\2\u014a\u014b\7v\2"+
		"\2\u014b\u014c\7{\2\2\u014c\u014d\7r\2\2\u014d\u014e\7g\2\2\u014e&\3\2"+
		"\2\2\u014f\u0150\7t\2\2\u0150\u0151\7g\2\2\u0151\u0152\7s\2\2\u0152\u0153"+
		"\7w\2\2\u0153\u0154\7k\2\2\u0154\u0155\7t\2\2\u0155\u0156\7g\2\2\u0156"+
		"(\3\2\2\2\u0157\u0158\7g\2\2\u0158\u0159\7z\2\2\u0159\u015a\7r\2\2\u015a"+
		"\u015b\7q\2\2\u015b\u015c\7t\2\2\u015c\u015d\7v\2\2\u015d*\3\2\2\2\u015e"+
		"\u015f\7t\2\2\u015f\u0160\7g\2\2\u0160\u0161\7v\2\2\u0161\u0162\7w\2\2"+
		"\u0162\u0163\7t\2\2\u0163\u0164\7p\2\2\u0164,\3\2\2\2\u0165\u0166\7e\2"+
		"\2\u0166\u0167\7q\2\2\u0167\u0168\7p\2\2\u0168\u0169\7v\2\2\u0169\u016a"+
		"\7k\2\2\u016a\u016b\7p\2\2\u016b\u016c\7w\2\2\u016c\u016d\7g\2\2\u016d"+
		".\3\2\2\2\u016e\u016f\7d\2\2\u016f\u0170\7t\2\2\u0170\u0171\7g\2\2\u0171"+
		"\u0172\7c\2\2\u0172\u0173\7m\2\2\u0173\60\3\2\2\2\u0174\u0175\7h\2\2\u0175"+
		"\u0176\7q\2\2\u0176\u0177\7t\2\2\u0177\62\3\2\2\2\u0178\u0179\7k\2\2\u0179"+
		"\u017a\7p\2\2\u017a\64\3\2\2\2\u017b\u017c\7q\2\2\u017c\u017d\7h\2\2\u017d"+
		"\66\3\2\2\2\u017e\u017f\7f\2\2\u017f\u0180\7q\2\2\u01808\3\2\2\2\u0181"+
		"\u0182\7y\2\2\u0182\u0183\7j\2\2\u0183\u0184\7k\2\2\u0184\u0185\7n\2\2"+
		"\u0185\u0186\7g\2\2\u0186:\3\2\2\2\u0187\u0188\7e\2\2\u0188\u0189\7n\2"+
		"\2\u0189\u018a\7c\2\2\u018a\u018b\7u\2\2\u018b\u018c\7u\2\2\u018c<\3\2"+
		"\2\2\u018d\u018e\7k\2\2\u018e\u018f\7o\2\2\u018f\u0190\7r\2\2\u0190\u0191"+
		"\7n\2\2\u0191\u0192\7g\2\2\u0192\u0193\7o\2\2\u0193\u0194\7g\2\2\u0194"+
		"\u0195\7p\2\2\u0195\u0196\7v\2\2\u0196\u0197\7u\2\2\u0197>\3\2\2\2\u0198"+
		"\u0199\7c\2\2\u0199\u019a\7d\2\2\u019a\u019b\7u\2\2\u019b\u019c\7v\2\2"+
		"\u019c\u019d\7t\2\2\u019d\u019e\7c\2\2\u019e\u019f\7e\2\2\u019f\u01a0"+
		"\7v\2\2\u01a0@\3\2\2\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4"+
		"\7p\2\2\u01a4\u01a5\7u\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7t\2\2\u01a7"+
		"\u01a8\7w\2\2\u01a8\u01a9\7e\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7q\2\2"+
		"\u01ab\u01ac\7t\2\2\u01acB\3\2\2\2\u01ad\u01ae\7c\2\2\u01ae\u01af\7u\2"+
		"\2\u01af\u01b0\7{\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7e\2\2\u01b2D\3\2"+
		"\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7"+
		"\7v\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\7e\2\2\u01b9F\3\2\2\2\u01ba\u01bb"+
		"\7i\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7v\2\2\u01bdH\3\2\2\2\u01be\u01bf"+
		"\7u\2\2\u01bf\u01c0\7g\2\2\u01c0\u01c1\7v\2\2\u01c1J\3\2\2\2\u01c2\u01c3"+
		"\7p\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7y\2\2\u01c5L\3\2\2\2\u01c6\u01c7"+
		"\7u\2\2\u01c7\u01c8\7y\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7v\2\2\u01ca"+
		"\u01cb\7e\2\2\u01cb\u01cc\7j\2\2\u01ccN\3\2\2\2\u01cd\u01ce\7e\2\2\u01ce"+
		"\u01cf\7c\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7g\2\2\u01d1P\3\2\2\2\u01d2"+
		"\u01d3\7f\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7h\2\2\u01d5\u01d6\7c\2\2"+
		"\u01d6\u01d7\7w\2\2\u01d7\u01d8\7n\2\2\u01d8\u01d9\7v\2\2\u01d9R\3\2\2"+
		"\2\u01da\u01db\7v\2\2\u01db\u01dc\7j\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de"+
		"\7u\2\2\u01deT\3\2\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7w\2\2\u01e1\u01e2"+
		"\7n\2\2\u01e2\u01e3\7n\2\2\u01e3V\3\2\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6"+
		"\7t\2\2\u01e6\u01e7\7w\2\2\u01e7\u01ee\7g\2\2\u01e8\u01e9\7h\2\2\u01e9"+
		"\u01ea\7c\2\2\u01ea\u01eb\7n\2\2\u01eb\u01ec\7u\2\2\u01ec\u01ee\7g\2\2"+
		"\u01ed\u01e4\3\2\2\2\u01ed\u01e8\3\2\2\2\u01eeX\3\2\2\2\u01ef\u01f8\7"+
		"\62\2\2\u01f0\u01f4\t\3\2\2\u01f1\u01f3\t\4\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f8"+
		"Z\3\2\2\2\u01f9\u01fd\t\3\2\2\u01fa\u01fc\t\4\2\2\u01fb\u01fa\3\2\2\2"+
		"\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0204\5\u00a3R\2\u0201\u0203\t\4\2"+
		"\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\5]/\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0223\3\2\2\2\u020a\u020b\7\62"+
		"\2\2\u020b\u020f\5\u00a3R\2\u020c\u020e\t\4\2\2\u020d\u020c\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0213\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0214\5]/\2\u0213\u0212\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0223\3\2\2\2\u0215\u0217\5\u00a3R\2\u0216\u0218\t\4\2"+
		"\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5]/\2\u021c\u021b\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u0223\3\2\2\2\u021e\u0220\5Y-\2\u021f\u0221\5]/\2"+
		"\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u01f9"+
		"\3\2\2\2\u0222\u020a\3\2\2\2\u0222\u0215\3\2\2\2\u0222\u021e\3\2\2\2\u0223"+
		"\\\3\2\2\2\u0224\u0226\t\5\2\2\u0225\u0227\t\6\2\2\u0226\u0225\3\2\2\2"+
		"\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u022a\t\4\2\2\u0229\u0228"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"^\3\2\2\2\u022d\u022e\7\62\2\2\u022e\u0230\t\7\2\2\u022f\u0231\5\u00d3"+
		"j\2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233`\3\2\2\2\u0234\u0236\7\62\2\2\u0235\u0237\t\b\2\2"+
		"\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239b\3\2\2\2\u023a\u023b\7\62\2\2\u023b\u023d\t\t\2\2\u023c"+
		"\u023e\t\b\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240d\3\2\2\2\u0241\u0242\7\62\2\2\u0242\u0244"+
		"\t\n\2\2\u0243\u0245\t\13\2\2\u0244\u0243\3\2\2\2\u0245\u0246\3\2\2\2"+
		"\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247f\3\2\2\2\u0248\u024c\5"+
		"\u00b5[\2\u0249\u024b\5\u00bf`\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2"+
		"\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024c"+
		"\3\2\2\2\u024f\u0250\5\u00b5[\2\u0250\u025b\3\2\2\2\u0251\u0255\5\u00b7"+
		"\\\2\u0252\u0254\5\u00c1a\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0258\u0259\5\u00b7\\\2\u0259\u025b\3\2\2\2\u025a\u0248\3\2\2\2\u025a"+
		"\u0251\3\2\2\2\u025bh\3\2\2\2\u025c\u025d\7-\2\2\u025dj\3\2\2\2\u025e"+
		"\u025f\7/\2\2\u025fl\3\2\2\2\u0260\u0261\7,\2\2\u0261n\3\2\2\2\u0262\u0263"+
		"\7\61\2\2\u0263p\3\2\2\2\u0264\u0265\7\'\2\2\u0265r\3\2\2\2\u0266\u0267"+
		"\7#\2\2\u0267t\3\2\2\2\u0268\u0269\7\u0080\2\2\u0269v\3\2\2\2\u026a\u026b"+
		"\7-\2\2\u026b\u026c\7-\2\2\u026cx\3\2\2\2\u026d\u026e\7/\2\2\u026e\u026f"+
		"\7/\2\2\u026fz\3\2\2\2\u0270\u0271\7-\2\2\u0271\u0272\7?\2\2\u0272|\3"+
		"\2\2\2\u0273\u0274\7/\2\2\u0274\u0275\7?\2\2\u0275~\3\2\2\2\u0276\u0277"+
		"\7,\2\2\u0277\u0278\7?\2\2\u0278\u0080\3\2\2\2\u0279\u027a\7\61\2\2\u027a"+
		"\u027b\7?\2\2\u027b\u0082\3\2\2\2\u027c\u027d\7(\2\2\u027d\u027e\7?\2"+
		"\2\u027e\u0084\3\2\2\2\u027f\u0280\7~\2\2\u0280\u0281\7?\2\2\u0281\u0086"+
		"\3\2\2\2\u0282\u0283\7\'\2\2\u0283\u0284\7?\2\2\u0284\u0088\3\2\2\2\u0285"+
		"\u0286\7?\2\2\u0286\u008a\3\2\2\2\u0287\u0288\7?\2\2\u0288\u0289\7?\2"+
		"\2\u0289\u008c\3\2\2\2\u028a\u028b\7#\2\2\u028b\u028c\7?\2\2\u028c\u008e"+
		"\3\2\2\2\u028d\u028e\7?\2\2\u028e\u028f\7?\2\2\u028f\u0290\7?\2\2\u0290"+
		"\u0090\3\2\2\2\u0291\u0292\7#\2\2\u0292\u0293\7?\2\2\u0293\u0294\7?\2"+
		"\2\u0294\u0092\3\2\2\2\u0295\u0296\7(\2\2\u0296\u0094\3\2\2\2\u0297\u0298"+
		"\7~\2\2\u0298\u0096\3\2\2\2\u0299\u029a\7(\2\2\u029a\u029b\7(\2\2\u029b"+
		"\u0098\3\2\2\2\u029c\u029d\7~\2\2\u029d\u029e\7~\2\2\u029e\u009a\3\2\2"+
		"\2\u029f\u02a0\7>\2\2\u02a0\u009c\3\2\2\2\u02a1\u02a2\7@\2\2\u02a2\u009e"+
		"\3\2\2\2\u02a3\u02a4\7>\2\2\u02a4\u02a5\7?\2\2\u02a5\u00a0\3\2\2\2\u02a6"+
		"\u02a7\7@\2\2\u02a7\u02a8\7?\2\2\u02a8\u00a2\3\2\2\2\u02a9\u02aa\7\60"+
		"\2\2\u02aa\u00a4\3\2\2\2\u02ab\u02ac\7.\2\2\u02ac\u00a6\3\2\2\2\u02ad"+
		"\u02ae\7A\2\2\u02ae\u00a8\3\2\2\2\u02af\u02b0\7<\2\2\u02b0\u00aa\3\2\2"+
		"\2\u02b1\u02b2\7=\2\2\u02b2\u00ac\3\2\2\2\u02b3\u02b4\7*\2\2\u02b4\u00ae"+
		"\3\2\2\2\u02b5\u02b6\7+\2\2\u02b6\u00b0\3\2\2\2\u02b7\u02b8\7]\2\2\u02b8"+
		"\u00b2\3\2\2\2\u02b9\u02ba\7_\2\2\u02ba\u00b4\3\2\2\2\u02bb\u02bc\7$\2"+
		"\2\u02bc\u00b6\3\2\2\2\u02bd\u02be\7)\2\2\u02be\u00b8\3\2\2\2\u02bf\u02c0"+
		"\7}\2\2\u02c0\u00ba\3\2\2\2\u02c1\u02c2\7\177\2\2\u02c2\u00bc\3\2\2\2"+
		"\u02c3\u02c7\t\f\2\2\u02c4\u02c6\t\r\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9"+
		"\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u00be\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02ca\u02cf\n\16\2\2\u02cb\u02cc\7^\2\2\u02cc\u02cf\5\u00c3"+
		"b\2\u02cd\u02cf\5\u00d1i\2\u02ce\u02ca\3\2\2\2\u02ce\u02cb\3\2\2\2\u02ce"+
		"\u02cd\3\2\2\2\u02cf\u00c0\3\2\2\2\u02d0\u02d5\n\17\2\2\u02d1\u02d2\7"+
		"^\2\2\u02d2\u02d5\5\u00c3b\2\u02d3\u02d5\5\u00d1i\2\u02d4\u02d0\3\2\2"+
		"\2\u02d4\u02d1\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5\u00c2\3\2\2\2\u02d6\u02da"+
		"\5\u00c5c\2\u02d7\u02da\5\u00c7d\2\u02d8\u02da\5\u00cbf\2\u02d9\u02d6"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da\u00c4\3\2\2\2\u02db"+
		"\u02de\5\u00cdg\2\u02dc\u02de\5\u00cfh\2\u02dd\u02db\3\2\2\2\u02dd\u02dc"+
		"\3\2\2\2\u02de\u00c6\3\2\2\2\u02df\u02e0\7z\2\2\u02e0\u02e1\5\u00d3j\2"+
		"\u02e1\u02e2\5\u00d3j\2\u02e2\u00c8\3\2\2\2\u02e3\u02e4\7w\2\2\u02e4\u02e5"+
		"\5\u00d3j\2\u02e5\u02e6\5\u00d3j\2\u02e6\u02e7\5\u00d3j\2\u02e7\u02e8"+
		"\5\u00d3j\2\u02e8\u00ca\3\2\2\2\u02e9\u02ea\7w\2\2\u02ea\u02ec\5\u00b9"+
		"]\2\u02eb\u02ed\5\u00d3j\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\5\u00bb"+
		"^\2\u02f1\u00cc\3\2\2\2\u02f2\u02f3\t\20\2\2\u02f3\u00ce\3\2\2\2\u02f4"+
		"\u02f5\n\21\2\2\u02f5\u00d0\3\2\2\2\u02f6\u02f7\7^\2\2\u02f7\u02f8\t\22"+
		"\2\2\u02f8\u00d2\3\2\2\2\u02f9\u02fa\t\23\2\2\u02fa\u00d4\3\2\2\2\u02fb"+
		"\u02fc\7\61\2\2\u02fc\u02fd\7,\2\2\u02fd\u0301\3\2\2\2\u02fe\u0300\13"+
		"\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u0302\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\7,"+
		"\2\2\u0305\u0306\7\61\2\2\u0306\u0307\3\2\2\2\u0307\u0308\bk\3\2\u0308"+
		"\u00d6\3\2\2\2\u0309\u030a\7\61\2\2\u030a\u030b\7\61\2\2\u030b\u030f\3"+
		"\2\2\2\u030c\u030e\n\22\2\2\u030d\u030c\3\2\2\2\u030e\u0311\3\2\2\2\u030f"+
		"\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u030f\3\2"+
		"\2\2\u0312\u0313\bl\3\2\u0313\u00d8\3\2\2\2\"\2\u00de\u00e3\u01ed\u01f4"+
		"\u01f7\u01fd\u0204\u0208\u020f\u0213\u0219\u021c\u0220\u0222\u0226\u022b"+
		"\u0232\u0238\u023f\u0246\u024c\u0255\u025a\u02c7\u02ce\u02d4\u02d9\u02dd"+
		"\u02ee\u0301\u030f\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}