// Generated from /home/luis/Public/CC/src/grammar/TypeScript.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", "TK_PROTECTED", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2n\u0322\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u00ed\n\3\3\4\6\4\u00f0\n\4\r\4\16\4\u00f1\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01fc\n-\3.\3.\3.\7.\u0201\n"+
		".\f.\16.\u0204\13.\5.\u0206\n.\3/\3/\7/\u020a\n/\f/\16/\u020d\13/\3/\3"+
		"/\7/\u0211\n/\f/\16/\u0214\13/\3/\5/\u0217\n/\3/\3/\3/\7/\u021c\n/\f/"+
		"\16/\u021f\13/\3/\5/\u0222\n/\3/\3/\6/\u0226\n/\r/\16/\u0227\3/\5/\u022b"+
		"\n/\3/\3/\5/\u022f\n/\5/\u0231\n/\3\60\3\60\5\60\u0235\n\60\3\60\6\60"+
		"\u0238\n\60\r\60\16\60\u0239\3\61\3\61\3\61\6\61\u023f\n\61\r\61\16\61"+
		"\u0240\3\62\3\62\6\62\u0245\n\62\r\62\16\62\u0246\3\63\3\63\3\63\6\63"+
		"\u024c\n\63\r\63\16\63\u024d\3\64\3\64\3\64\6\64\u0253\n\64\r\64\16\64"+
		"\u0254\3\65\3\65\7\65\u0259\n\65\f\65\16\65\u025c\13\65\3\65\3\65\3\65"+
		"\3\65\7\65\u0262\n\65\f\65\16\65\u0265\13\65\3\65\3\65\5\65\u0269\n\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3"+
		"G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3"+
		"N\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3"+
		"Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\7`\u02d4\n`\f`\16`\u02d7"+
		"\13`\3a\3a\3a\3a\5a\u02dd\na\3b\3b\3b\3b\5b\u02e3\nb\3c\3c\3c\5c\u02e8"+
		"\nc\3d\3d\5d\u02ec\nd\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3g\3g\3g\6g\u02fb"+
		"\ng\rg\16g\u02fc\3g\3g\3h\3h\3i\3i\3j\3j\3j\3k\3k\3l\3l\3l\3l\7l\u030e"+
		"\nl\fl\16l\u0311\13l\3l\3l\3l\3l\3l\3m\3m\3m\3m\7m\u031c\nm\fm\16m\u031f"+
		"\13m\3m\3m\3\u030f\2n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9"+
		"n\3\2\24\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2ZZzz\3"+
		"\2\629\4\2QQqq\4\2DDdd\3\2\62\63\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\f\f"+
		"\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$)"+
		")\62;^^ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;CHch\2\u0348\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\3\u00db\3\2\2\2\5\u00ec\3\2\2\2\7\u00ef"+
		"\3\2\2\2\t\u00f5\3\2\2\2\13\u00fc\3\2\2\2\r\u0104\3\2\2\2\17\u010e\3\2"+
		"\2\2\21\u0112\3\2\2\2\23\u0116\3\2\2\2\25\u011c\3\2\2\2\27\u0125\3\2\2"+
		"\2\31\u012c\3\2\2\2\33\u0130\3\2\2\2\35\u0138\3\2\2\2\37\u013f\3\2\2\2"+
		"!\u0147\3\2\2\2#\u014a\3\2\2\2%\u014f\3\2\2\2\'\u0158\3\2\2\2)\u015d\3"+
		"\2\2\2+\u0165\3\2\2\2-\u016c\3\2\2\2/\u0173\3\2\2\2\61\u017c\3\2\2\2\63"+
		"\u0182\3\2\2\2\65\u0186\3\2\2\2\67\u0189\3\2\2\29\u018c\3\2\2\2;\u018f"+
		"\3\2\2\2=\u0195\3\2\2\2?\u019b\3\2\2\2A\u01a6\3\2\2\2C\u01af\3\2\2\2E"+
		"\u01bb\3\2\2\2G\u01c1\3\2\2\2I\u01c8\3\2\2\2K\u01cc\3\2\2\2M\u01d0\3\2"+
		"\2\2O\u01d4\3\2\2\2Q\u01db\3\2\2\2S\u01e0\3\2\2\2U\u01e8\3\2\2\2W\u01ed"+
		"\3\2\2\2Y\u01fb\3\2\2\2[\u0205\3\2\2\2]\u0230\3\2\2\2_\u0232\3\2\2\2a"+
		"\u023b\3\2\2\2c\u0242\3\2\2\2e\u0248\3\2\2\2g\u024f\3\2\2\2i\u0268\3\2"+
		"\2\2k\u026a\3\2\2\2m\u026c\3\2\2\2o\u026e\3\2\2\2q\u0270\3\2\2\2s\u0272"+
		"\3\2\2\2u\u0274\3\2\2\2w\u0276\3\2\2\2y\u0278\3\2\2\2{\u027b\3\2\2\2}"+
		"\u027e\3\2\2\2\177\u0281\3\2\2\2\u0081\u0284\3\2\2\2\u0083\u0287\3\2\2"+
		"\2\u0085\u028a\3\2\2\2\u0087\u028d\3\2\2\2\u0089\u0290\3\2\2\2\u008b\u0293"+
		"\3\2\2\2\u008d\u0295\3\2\2\2\u008f\u0298\3\2\2\2\u0091\u029b\3\2\2\2\u0093"+
		"\u029f\3\2\2\2\u0095\u02a3\3\2\2\2\u0097\u02a5\3\2\2\2\u0099\u02a7\3\2"+
		"\2\2\u009b\u02aa\3\2\2\2\u009d\u02ad\3\2\2\2\u009f\u02af\3\2\2\2\u00a1"+
		"\u02b1\3\2\2\2\u00a3\u02b4\3\2\2\2\u00a5\u02b7\3\2\2\2\u00a7\u02b9\3\2"+
		"\2\2\u00a9\u02bb\3\2\2\2\u00ab\u02bd\3\2\2\2\u00ad\u02bf\3\2\2\2\u00af"+
		"\u02c1\3\2\2\2\u00b1\u02c3\3\2\2\2\u00b3\u02c5\3\2\2\2\u00b5\u02c7\3\2"+
		"\2\2\u00b7\u02c9\3\2\2\2\u00b9\u02cb\3\2\2\2\u00bb\u02cd\3\2\2\2\u00bd"+
		"\u02cf\3\2\2\2\u00bf\u02d1\3\2\2\2\u00c1\u02dc\3\2\2\2\u00c3\u02e2\3\2"+
		"\2\2\u00c5\u02e7\3\2\2\2\u00c7\u02eb\3\2\2\2\u00c9\u02ed\3\2\2\2\u00cb"+
		"\u02f1\3\2\2\2\u00cd\u02f7\3\2\2\2\u00cf\u0300\3\2\2\2\u00d1\u0302\3\2"+
		"\2\2\u00d3\u0304\3\2\2\2\u00d5\u0307\3\2\2\2\u00d7\u0309\3\2\2\2\u00d9"+
		"\u0317\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2"+
		"\2\u00de\u00df\7u\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7i\2\2\u00e6\4\3\2\2\2\u00e7\u00ed\5]/\2\u00e8\u00ed\5g\64\2\u00e9"+
		"\u00ed\5c\62\2\u00ea\u00ed\5e\63\2\u00eb\u00ed\5a\61\2\u00ec\u00e7\3\2"+
		"\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\6\3\2\2\2\u00ee\u00f0\t\2\2\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\b\4\2\2\u00f4\b\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6"+
		"\u00f7\7w\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7e\2\2\u00fb\n\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7t"+
		"\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7c\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7g\2\2\u0103\f\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106"+
		"\7t\2\2\u0106\u0107\7q\2\2\u0107\u0108\7v\2\2\u0108\u0109\7g\2\2\u0109"+
		"\u010a\7e\2\2\u010a\u010b\7v\2\2\u010b\u010c\7g\2\2\u010c\u010d\7f\2\2"+
		"\u010d\16\3\2\2\2\u010e\u010f\7x\2\2\u010f\u0110\7c\2\2\u0110\u0111\7"+
		"t\2\2\u0111\20\3\2\2\2\u0112\u0113\7n\2\2\u0113\u0114\7g\2\2\u0114\u0115"+
		"\7v\2\2\u0115\22\3\2\2\2\u0116\u0117\7e\2\2\u0117\u0118\7q\2\2\u0118\u0119"+
		"\7p\2\2\u0119\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b\24\3\2\2\2\u011c\u011d"+
		"\7t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7c\2\2\u011f\u0120\7f\2\2\u0120"+
		"\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122\u0123\7n\2\2\u0123\u0124\7{\2\2"+
		"\u0124\26\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127\7v\2\2\u0127\u0128\7"+
		"t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b\7i\2\2\u012b\30"+
		"\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e\7p\2\2\u012e\u012f\7{\2\2\u012f"+
		"\32\3\2\2\2\u0130\u0131\7d\2\2\u0131\u0132\7q\2\2\u0132\u0133\7q\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135\u0136\7c\2\2\u0136\u0137\7p\2\2"+
		"\u0137\34\3\2\2\2\u0138\u0139\7p\2\2\u0139\u013a\7w\2\2\u013a\u013b\7"+
		"o\2\2\u013b\u013c\7d\2\2\u013c\u013d\7g\2\2\u013d\u013e\7t\2\2\u013e\36"+
		"\3\2\2\2\u013f\u0140\7g\2\2\u0140\u0141\7z\2\2\u0141\u0142\7v\2\2\u0142"+
		"\u0143\7g\2\2\u0143\u0144\7p\2\2\u0144\u0145\7f\2\2\u0145\u0146\7u\2\2"+
		"\u0146 \3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149\7h\2\2\u0149\"\3\2\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7n\2\2\u014c\u014d\7u\2\2\u014d\u014e"+
		"\7g\2\2\u014e$\3\2\2\2\u014f\u0150\7h\2\2\u0150\u0151\7w\2\2\u0151\u0152"+
		"\7p\2\2\u0152\u0153\7e\2\2\u0153\u0154\7v\2\2\u0154\u0155\7k\2\2\u0155"+
		"\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157&\3\2\2\2\u0158\u0159\7v\2\2\u0159"+
		"\u015a\7{\2\2\u015a\u015b\7r\2\2\u015b\u015c\7g\2\2\u015c(\3\2\2\2\u015d"+
		"\u015e\7t\2\2\u015e\u015f\7g\2\2\u015f\u0160\7s\2\2\u0160\u0161\7w\2\2"+
		"\u0161\u0162\7k\2\2\u0162\u0163\7t\2\2\u0163\u0164\7g\2\2\u0164*\3\2\2"+
		"\2\u0165\u0166\7g\2\2\u0166\u0167\7z\2\2\u0167\u0168\7r\2\2\u0168\u0169"+
		"\7q\2\2\u0169\u016a\7t\2\2\u016a\u016b\7v\2\2\u016b,\3\2\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u016e\7g\2\2\u016e\u016f\7v\2\2\u016f\u0170\7w\2\2\u0170"+
		"\u0171\7t\2\2\u0171\u0172\7p\2\2\u0172.\3\2\2\2\u0173\u0174\7e\2\2\u0174"+
		"\u0175\7q\2\2\u0175\u0176\7p\2\2\u0176\u0177\7v\2\2\u0177\u0178\7k\2\2"+
		"\u0178\u0179\7p\2\2\u0179\u017a\7w\2\2\u017a\u017b\7g\2\2\u017b\60\3\2"+
		"\2\2\u017c\u017d\7d\2\2\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2\u017f\u0180"+
		"\7c\2\2\u0180\u0181\7m\2\2\u0181\62\3\2\2\2\u0182\u0183\7h\2\2\u0183\u0184"+
		"\7q\2\2\u0184\u0185\7t\2\2\u0185\64\3\2\2\2\u0186\u0187\7k\2\2\u0187\u0188"+
		"\7p\2\2\u0188\66\3\2\2\2\u0189\u018a\7q\2\2\u018a\u018b\7h\2\2\u018b8"+
		"\3\2\2\2\u018c\u018d\7f\2\2\u018d\u018e\7q\2\2\u018e:\3\2\2\2\u018f\u0190"+
		"\7y\2\2\u0190\u0191\7j\2\2\u0191\u0192\7k\2\2\u0192\u0193\7n\2\2\u0193"+
		"\u0194\7g\2\2\u0194<\3\2\2\2\u0195\u0196\7e\2\2\u0196\u0197\7n\2\2\u0197"+
		"\u0198\7c\2\2\u0198\u0199\7u\2\2\u0199\u019a\7u\2\2\u019a>\3\2\2\2\u019b"+
		"\u019c\7k\2\2\u019c\u019d\7o\2\2\u019d\u019e\7r\2\2\u019e\u019f\7n\2\2"+
		"\u019f\u01a0\7g\2\2\u01a0\u01a1\7o\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3"+
		"\7p\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7u\2\2\u01a5@\3\2\2\2\u01a6\u01a7"+
		"\7c\2\2\u01a7\u01a8\7d\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa\7v\2\2\u01aa"+
		"\u01ab\7t\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7e\2\2\u01ad\u01ae\7v\2\2"+
		"\u01aeB\3\2\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7p\2"+
		"\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6"+
		"\7w\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7q\2\2\u01b9"+
		"\u01ba\7t\2\2\u01baD\3\2\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7u\2\2\u01bd"+
		"\u01be\7{\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7e\2\2\u01c0F\3\2\2\2\u01c1"+
		"\u01c2\7u\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7v\2\2"+
		"\u01c5\u01c6\7k\2\2\u01c6\u01c7\7e\2\2\u01c7H\3\2\2\2\u01c8\u01c9\7i\2"+
		"\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7v\2\2\u01cbJ\3\2\2\2\u01cc\u01cd\7"+
		"u\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf\7v\2\2\u01cfL\3\2\2\2\u01d0\u01d1"+
		"\7p\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7y\2\2\u01d3N\3\2\2\2\u01d4\u01d5"+
		"\7u\2\2\u01d5\u01d6\7y\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7v\2\2\u01d8"+
		"\u01d9\7e\2\2\u01d9\u01da\7j\2\2\u01daP\3\2\2\2\u01db\u01dc\7e\2\2\u01dc"+
		"\u01dd\7c\2\2\u01dd\u01de\7u\2\2\u01de\u01df\7g\2\2\u01dfR\3\2\2\2\u01e0"+
		"\u01e1\7f\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7h\2\2\u01e3\u01e4\7c\2\2"+
		"\u01e4\u01e5\7w\2\2\u01e5\u01e6\7n\2\2\u01e6\u01e7\7v\2\2\u01e7T\3\2\2"+
		"\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7j\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec"+
		"\7u\2\2\u01ecV\3\2\2\2\u01ed\u01ee\7p\2\2\u01ee\u01ef\7w\2\2\u01ef\u01f0"+
		"\7n\2\2\u01f0\u01f1\7n\2\2\u01f1X\3\2\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4"+
		"\7t\2\2\u01f4\u01f5\7w\2\2\u01f5\u01fc\7g\2\2\u01f6\u01f7\7h\2\2\u01f7"+
		"\u01f8\7c\2\2\u01f8\u01f9\7n\2\2\u01f9\u01fa\7u\2\2\u01fa\u01fc\7g\2\2"+
		"\u01fb\u01f2\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fcZ\3\2\2\2\u01fd\u0206\7"+
		"\62\2\2\u01fe\u0202\t\3\2\2\u01ff\u0201\t\4\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u01fd\3\2\2\2\u0205\u01fe\3\2\2\2\u0206"+
		"\\\3\2\2\2\u0207\u020b\t\3\2\2\u0208\u020a\t\4\2\2\u0209\u0208\3\2\2\2"+
		"\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0212\5\u00a5S\2\u020f\u0211\t\4\2"+
		"\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\5_\60\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0231\3\2\2\2\u0218\u0219\7\62"+
		"\2\2\u0219\u021d\5\u00a5S\2\u021a\u021c\t\4\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0221\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u0220\u0222\5_\60\2\u0221\u0220\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0231\3\2\2\2\u0223\u0225\5\u00a5S\2\u0224\u0226"+
		"\t\4\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u022b\5_\60\2\u022a\u0229\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u0231\3\2\2\2\u022c\u022e\5[.\2\u022d\u022f"+
		"\5_\60\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u0207\3\2\2\2\u0230\u0218\3\2\2\2\u0230\u0223\3\2\2\2\u0230\u022c\3\2"+
		"\2\2\u0231^\3\2\2\2\u0232\u0234\t\5\2\2\u0233\u0235\t\6\2\2\u0234\u0233"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0238\t\4\2\2\u0237"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a`\3\2\2\2\u023b\u023c\7\62\2\2\u023c\u023e\t\7\2\2\u023d\u023f"+
		"\5\u00d5k\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241b\3\2\2\2\u0242\u0244\7\62\2\2\u0243\u0245"+
		"\t\b\2\2\u0244\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247d\3\2\2\2\u0248\u0249\7\62\2\2\u0249\u024b\t\t\2\2"+
		"\u024a\u024c\t\b\2\2\u024b\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024ef\3\2\2\2\u024f\u0250\7\62\2\2\u0250"+
		"\u0252\t\n\2\2\u0251\u0253\t\13\2\2\u0252\u0251\3\2\2\2\u0253\u0254\3"+
		"\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255h\3\2\2\2\u0256\u025a"+
		"\5\u00b7\\\2\u0257\u0259\5\u00c1a\2\u0258\u0257\3\2\2\2\u0259\u025c\3"+
		"\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u025e\5\u00b7\\\2\u025e\u0269\3\2\2\2\u025f\u0263"+
		"\5\u00b9]\2\u0260\u0262\5\u00c3b\2\u0261\u0260\3\2\2\2\u0262\u0265\3\2"+
		"\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u0267\5\u00b9]\2\u0267\u0269\3\2\2\2\u0268\u0256"+
		"\3\2\2\2\u0268\u025f\3\2\2\2\u0269j\3\2\2\2\u026a\u026b\7-\2\2\u026bl"+
		"\3\2\2\2\u026c\u026d\7/\2\2\u026dn\3\2\2\2\u026e\u026f\7,\2\2\u026fp\3"+
		"\2\2\2\u0270\u0271\7\61\2\2\u0271r\3\2\2\2\u0272\u0273\7\'\2\2\u0273t"+
		"\3\2\2\2\u0274\u0275\7#\2\2\u0275v\3\2\2\2\u0276\u0277\7\u0080\2\2\u0277"+
		"x\3\2\2\2\u0278\u0279\7-\2\2\u0279\u027a\7-\2\2\u027az\3\2\2\2\u027b\u027c"+
		"\7/\2\2\u027c\u027d\7/\2\2\u027d|\3\2\2\2\u027e\u027f\7-\2\2\u027f\u0280"+
		"\7?\2\2\u0280~\3\2\2\2\u0281\u0282\7/\2\2\u0282\u0283\7?\2\2\u0283\u0080"+
		"\3\2\2\2\u0284\u0285\7,\2\2\u0285\u0286\7?\2\2\u0286\u0082\3\2\2\2\u0287"+
		"\u0288\7\61\2\2\u0288\u0289\7?\2\2\u0289\u0084\3\2\2\2\u028a\u028b\7("+
		"\2\2\u028b\u028c\7?\2\2\u028c\u0086\3\2\2\2\u028d\u028e\7~\2\2\u028e\u028f"+
		"\7?\2\2\u028f\u0088\3\2\2\2\u0290\u0291\7\'\2\2\u0291\u0292\7?\2\2\u0292"+
		"\u008a\3\2\2\2\u0293\u0294\7?\2\2\u0294\u008c\3\2\2\2\u0295\u0296\7?\2"+
		"\2\u0296\u0297\7?\2\2\u0297\u008e\3\2\2\2\u0298\u0299\7#\2\2\u0299\u029a"+
		"\7?\2\2\u029a\u0090\3\2\2\2\u029b\u029c\7?\2\2\u029c\u029d\7?\2\2\u029d"+
		"\u029e\7?\2\2\u029e\u0092\3\2\2\2\u029f\u02a0\7#\2\2\u02a0\u02a1\7?\2"+
		"\2\u02a1\u02a2\7?\2\2\u02a2\u0094\3\2\2\2\u02a3\u02a4\7(\2\2\u02a4\u0096"+
		"\3\2\2\2\u02a5\u02a6\7~\2\2\u02a6\u0098\3\2\2\2\u02a7\u02a8\7(\2\2\u02a8"+
		"\u02a9\7(\2\2\u02a9\u009a\3\2\2\2\u02aa\u02ab\7~\2\2\u02ab\u02ac\7~\2"+
		"\2\u02ac\u009c\3\2\2\2\u02ad\u02ae\7>\2\2\u02ae\u009e\3\2\2\2\u02af\u02b0"+
		"\7@\2\2\u02b0\u00a0\3\2\2\2\u02b1\u02b2\7>\2\2\u02b2\u02b3\7?\2\2\u02b3"+
		"\u00a2\3\2\2\2\u02b4\u02b5\7@\2\2\u02b5\u02b6\7?\2\2\u02b6\u00a4\3\2\2"+
		"\2\u02b7\u02b8\7\60\2\2\u02b8\u00a6\3\2\2\2\u02b9\u02ba\7.\2\2\u02ba\u00a8"+
		"\3\2\2\2\u02bb\u02bc\7A\2\2\u02bc\u00aa\3\2\2\2\u02bd\u02be\7<\2\2\u02be"+
		"\u00ac\3\2\2\2\u02bf\u02c0\7=\2\2\u02c0\u00ae\3\2\2\2\u02c1\u02c2\7*\2"+
		"\2\u02c2\u00b0\3\2\2\2\u02c3\u02c4\7+\2\2\u02c4\u00b2\3\2\2\2\u02c5\u02c6"+
		"\7]\2\2\u02c6\u00b4\3\2\2\2\u02c7\u02c8\7_\2\2\u02c8\u00b6\3\2\2\2\u02c9"+
		"\u02ca\7$\2\2\u02ca\u00b8\3\2\2\2\u02cb\u02cc\7)\2\2\u02cc\u00ba\3\2\2"+
		"\2\u02cd\u02ce\7}\2\2\u02ce\u00bc\3\2\2\2\u02cf\u02d0\7\177\2\2\u02d0"+
		"\u00be\3\2\2\2\u02d1\u02d5\t\f\2\2\u02d2\u02d4\t\r\2\2\u02d3\u02d2\3\2"+
		"\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u00c0\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02dd\n\16\2\2\u02d9\u02da\7"+
		"^\2\2\u02da\u02dd\5\u00c5c\2\u02db\u02dd\5\u00d3j\2\u02dc\u02d8\3\2\2"+
		"\2\u02dc\u02d9\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u00c2\3\2\2\2\u02de\u02e3"+
		"\n\17\2\2\u02df\u02e0\7^\2\2\u02e0\u02e3\5\u00c5c\2\u02e1\u02e3\5\u00d3"+
		"j\2\u02e2\u02de\3\2\2\2\u02e2\u02df\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3"+
		"\u00c4\3\2\2\2\u02e4\u02e8\5\u00c7d\2\u02e5\u02e8\5\u00c9e\2\u02e6\u02e8"+
		"\5\u00cdg\2\u02e7\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2"+
		"\2\u02e8\u00c6\3\2\2\2\u02e9\u02ec\5\u00cfh\2\u02ea\u02ec\5\u00d1i\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec\u00c8\3\2\2\2\u02ed\u02ee\7z"+
		"\2\2\u02ee\u02ef\5\u00d5k\2\u02ef\u02f0\5\u00d5k\2\u02f0\u00ca\3\2\2\2"+
		"\u02f1\u02f2\7w\2\2\u02f2\u02f3\5\u00d5k\2\u02f3\u02f4\5\u00d5k\2\u02f4"+
		"\u02f5\5\u00d5k\2\u02f5\u02f6\5\u00d5k\2\u02f6\u00cc\3\2\2\2\u02f7\u02f8"+
		"\7w\2\2\u02f8\u02fa\5\u00bb^\2\u02f9\u02fb\5\u00d5k\2\u02fa\u02f9\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02ff\5\u00bd_\2\u02ff\u00ce\3\2\2\2\u0300\u0301"+
		"\t\20\2\2\u0301\u00d0\3\2\2\2\u0302\u0303\n\21\2\2\u0303\u00d2\3\2\2\2"+
		"\u0304\u0305\7^\2\2\u0305\u0306\t\22\2\2\u0306\u00d4\3\2\2\2\u0307\u0308"+
		"\t\23\2\2\u0308\u00d6\3\2\2\2\u0309\u030a\7\61\2\2\u030a\u030b\7,\2\2"+
		"\u030b\u030f\3\2\2\2\u030c\u030e\13\2\2\2\u030d\u030c\3\2\2\2\u030e\u0311"+
		"\3\2\2\2\u030f\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0312\u0313\7,\2\2\u0313\u0314\7\61\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u0316\bl\3\2\u0316\u00d8\3\2\2\2\u0317\u0318\7\61\2\2\u0318"+
		"\u0319\7\61\2\2\u0319\u031d\3\2\2\2\u031a\u031c\n\22\2\2\u031b\u031a\3"+
		"\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0320\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\bm\3\2\u0321\u00da\3\2"+
		"\2\2\"\2\u00ec\u00f1\u01fb\u0202\u0205\u020b\u0212\u0216\u021d\u0221\u0227"+
		"\u022a\u022e\u0230\u0234\u0239\u0240\u0246\u024d\u0254\u025a\u0263\u0268"+
		"\u02d5\u02dc\u02e2\u02e7\u02eb\u02fc\u030f\u031d\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}