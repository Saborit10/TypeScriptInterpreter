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
		T__0=1, T__1=2, T__2=3, T__3=4, NUMERIC_LITERAL=5, WS=6, TK_PUBLIC=7, 
		TK_PRIVATE=8, TK_PROTECTED=9, TK_VAR=10, TK_LET=11, TK_CONST=12, TK_READ_ONLY=13, 
		TK_STRING=14, TK_ANY=15, TK_BOOLEAN=16, TK_NUMBER=17, TK_EXTENDS=18, TK_IF=19, 
		TK_ELSE=20, TK_FUNCTION=21, TK_TYPE=22, TK_REQUIRE=23, TK_EXPORT=24, TK_RETURN=25, 
		TK_CONTINUE=26, TK_BREAK=27, TK_FOR=28, TK_IN=29, TK_OF=30, TK_DO=31, 
		TK_WHILE=32, TK_CLASS=33, TK_IMPLEMENTS=34, TK_ABSTRACT=35, TK_CONSTRUCTOR=36, 
		TK_ASYNC=37, TK_STATIC=38, TK_GET=39, TK_SET=40, TK_NEW=41, TK_SWITCH=42, 
		TK_CASE=43, TK_DEFAULT=44, TK_THIS=45, NULL_LITERAL=46, BOOLEAN_LITERAL=47, 
		DECIMAL_INTEGER_LITERAL=48, DECIMAL_LITERAL=49, EXPONENT_PART=50, HEX_INTEGER_LITERAL=51, 
		OCTAL_INTEGER_LITERAL=52, OCTAL_INTEGER_LITERAL2=53, BINARY_INTEGER_LITERAL=54, 
		STRING_LITERAL=55, TK_PLUS=56, TK_MINUS=57, TK_STAR=58, TK_SLASH=59, TK_PERCENT=60, 
		TK_NOT=61, TK_BINNOT=62, TK_PLUSPLUS=63, TK_MINUSMINUS=64, TK_PLUS_ASIGN=65, 
		TK_MINUS_ASIGN=66, TK_STAR_ASIGN=67, TK_SLASH_ASIGN=68, TK_AND_ASIGN=69, 
		TK_OR_ASIGN=70, TK_PERCENT_ASIGN=71, TK_EQ=72, TK_EQEQ=73, TK_NOTEQ=74, 
		TK_IDENTEQ=75, TK_IDENTNOTEQ=76, TK_BIN_AND=77, TK_BIN_OR=78, TK_LOGIC_AND=79, 
		TK_LOGIC_OR=80, TK_LESS=81, TK_GREAT=82, TK_LESSEQ=83, TK_GREATEQ=84, 
		TK_POINT=85, TK_COMMA=86, TK_QMARK=87, TK_COLON=88, TK_SEMICOLON=89, TK_LPARENT=90, 
		TK_RPARENT=91, TK_LBRACKET=92, TK_RBRACKET=93, TK_DCUOTE=94, TK_SCUOTE=95, 
		TK_LCURLY=96, TK_RCURLY=97, TK_IDENT=98, DOUBLE_STRING_CHARACTER=99, SINGLE_STRING_CHARACTER=100, 
		ESCAPE_SEQUENCE=101, CHARACTER_ESCAPE_SEQUENCE=102, HEX_ESCAPE_SEQUENCE=103, 
		UNICODE_ESCAPE_SEQUENCE=104, EXTENDED_UNICODE_ESCAPE_SEQUENCE=105, SINGLE_ESCAPE_CHARACTER=106, 
		NON_ESCAPE_CHARACTER=107, LINE_CONTINUATION=108, HEX_DIGIT=109, TK_MULTILINE_COMMENT=110, 
		TK_SINGLELINE_COMMENT=111;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NUMERIC_LITERAL", "WS", "TK_PUBLIC", 
			"TK_PRIVATE", "TK_PROTECTED", "TK_VAR", "TK_LET", "TK_CONST", "TK_READ_ONLY", 
			"TK_STRING", "TK_ANY", "TK_BOOLEAN", "TK_NUMBER", "TK_EXTENDS", "TK_IF", 
			"TK_ELSE", "TK_FUNCTION", "TK_TYPE", "TK_REQUIRE", "TK_EXPORT", "TK_RETURN", 
			"TK_CONTINUE", "TK_BREAK", "TK_FOR", "TK_IN", "TK_OF", "TK_DO", "TK_WHILE", 
			"TK_CLASS", "TK_IMPLEMENTS", "TK_ABSTRACT", "TK_CONSTRUCTOR", "TK_ASYNC", 
			"TK_STATIC", "TK_GET", "TK_SET", "TK_NEW", "TK_SWITCH", "TK_CASE", "TK_DEFAULT", 
			"TK_THIS", "NULL_LITERAL", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", 
			"DECIMAL_LITERAL", "EXPONENT_PART", "HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", 
			"OCTAL_INTEGER_LITERAL2", "BINARY_INTEGER_LITERAL", "STRING_LITERAL", 
			"TK_PLUS", "TK_MINUS", "TK_STAR", "TK_SLASH", "TK_PERCENT", "TK_NOT", 
			"TK_BINNOT", "TK_PLUSPLUS", "TK_MINUSMINUS", "TK_PLUS_ASIGN", "TK_MINUS_ASIGN", 
			"TK_STAR_ASIGN", "TK_SLASH_ASIGN", "TK_AND_ASIGN", "TK_OR_ASIGN", "TK_PERCENT_ASIGN", 
			"TK_EQ", "TK_EQEQ", "TK_NOTEQ", "TK_IDENTEQ", "TK_IDENTNOTEQ", "TK_BIN_AND", 
			"TK_BIN_OR", "TK_LOGIC_AND", "TK_LOGIC_OR", "TK_LESS", "TK_GREAT", "TK_LESSEQ", 
			"TK_GREATEQ", "TK_POINT", "TK_COMMA", "TK_QMARK", "TK_COLON", "TK_SEMICOLON", 
			"TK_LPARENT", "TK_RPARENT", "TK_LBRACKET", "TK_RBRACKET", "TK_DCUOTE", 
			"TK_SCUOTE", "TK_LCURLY", "TK_RCURLY", "TK_IDENT", "DOUBLE_STRING_CHARACTER", 
			"SINGLE_STRING_CHARACTER", "ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", 
			"HEX_ESCAPE_SEQUENCE", "UNICODE_ESCAPE_SEQUENCE", "EXTENDED_UNICODE_ESCAPE_SEQUENCE", 
			"SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", "LINE_CONTINUATION", 
			"HEX_DIGIT", "TK_MULTILINE_COMMENT", "TK_SINGLELINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console.log'", "'Math.sin'", "'Math.tan'", "'Math.exp'", null, 
			null, "'public'", "'private'", "'protected'", "'var'", "'let'", "'const'", 
			"'readonly'", "'string'", "'any'", "'boolean'", "'number'", "'extends'", 
			"'if'", "'else'", "'function'", "'type'", "'require'", "'export'", "'return'", 
			"'continue'", "'break'", "'for'", "'in'", "'of'", "'do'", "'while'", 
			"'class'", "'implements'", "'abstract'", "'constructor'", "'async'", 
			"'static'", "'get'", "'set'", "'new'", "'switch'", "'case'", "'default'", 
			"'this'", "'null'", null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'|'", "'&&'", "'||'", "'<'", "'>'", "'<='", 
			"'>='", "'.'", "','", "'?'", "':'", "';'", "'('", "')'", "'['", "']'", 
			"'\"'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMERIC_LITERAL", "WS", "TK_PUBLIC", "TK_PRIVATE", 
			"TK_PROTECTED", "TK_VAR", "TK_LET", "TK_CONST", "TK_READ_ONLY", "TK_STRING", 
			"TK_ANY", "TK_BOOLEAN", "TK_NUMBER", "TK_EXTENDS", "TK_IF", "TK_ELSE", 
			"TK_FUNCTION", "TK_TYPE", "TK_REQUIRE", "TK_EXPORT", "TK_RETURN", "TK_CONTINUE", 
			"TK_BREAK", "TK_FOR", "TK_IN", "TK_OF", "TK_DO", "TK_WHILE", "TK_CLASS", 
			"TK_IMPLEMENTS", "TK_ABSTRACT", "TK_CONSTRUCTOR", "TK_ASYNC", "TK_STATIC", 
			"TK_GET", "TK_SET", "TK_NEW", "TK_SWITCH", "TK_CASE", "TK_DEFAULT", "TK_THIS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2q\u0343\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u010e\n\6\3\7\6\7\u0111\n\7\r\7\16\7\u0112\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u021d\n\60\3\61\3\61\3\61\7\61\u0222\n\61\f"+
		"\61\16\61\u0225\13\61\5\61\u0227\n\61\3\62\3\62\7\62\u022b\n\62\f\62\16"+
		"\62\u022e\13\62\3\62\3\62\7\62\u0232\n\62\f\62\16\62\u0235\13\62\3\62"+
		"\5\62\u0238\n\62\3\62\3\62\3\62\7\62\u023d\n\62\f\62\16\62\u0240\13\62"+
		"\3\62\5\62\u0243\n\62\3\62\3\62\6\62\u0247\n\62\r\62\16\62\u0248\3\62"+
		"\5\62\u024c\n\62\3\62\3\62\5\62\u0250\n\62\5\62\u0252\n\62\3\63\3\63\5"+
		"\63\u0256\n\63\3\63\6\63\u0259\n\63\r\63\16\63\u025a\3\64\3\64\3\64\6"+
		"\64\u0260\n\64\r\64\16\64\u0261\3\65\3\65\6\65\u0266\n\65\r\65\16\65\u0267"+
		"\3\66\3\66\3\66\6\66\u026d\n\66\r\66\16\66\u026e\3\67\3\67\3\67\6\67\u0274"+
		"\n\67\r\67\16\67\u0275\38\38\78\u027a\n8\f8\168\u027d\138\38\38\38\38"+
		"\78\u0283\n8\f8\168\u0286\138\38\38\58\u028a\n8\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3"+
		"E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3"+
		"M\3M\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3U\3U\3"+
		"U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`"+
		"\3a\3a\3b\3b\3c\3c\7c\u02f5\nc\fc\16c\u02f8\13c\3d\3d\3d\3d\5d\u02fe\n"+
		"d\3e\3e\3e\3e\5e\u0304\ne\3f\3f\3f\5f\u0309\nf\3g\3g\5g\u030d\ng\3h\3"+
		"h\3h\3h\3i\3i\3i\3i\3i\3i\3j\3j\3j\6j\u031c\nj\rj\16j\u031d\3j\3j\3k\3"+
		"k\3l\3l\3m\3m\3m\3n\3n\3o\3o\3o\3o\7o\u032f\no\fo\16o\u0332\13o\3o\3o"+
		"\3o\3o\3o\3p\3p\3p\3p\7p\u033d\np\fp\16p\u0340\13p\3p\3p\3\u0330\2q\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cb"+
		"g\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00df"+
		"q\3\2\24\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2ZZzz\3"+
		"\2\629\4\2QQqq\4\2DDdd\3\2\62\63\6\2&&C\\aac|\7\2&&\62;C\\aac|\6\2\f\f"+
		"\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$)"+
		")\62;^^ddhhppttvxzz\5\2\f\f\17\17\u202a\u202b\5\2\62;CHch\2\u0369\2\3"+
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
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\3\u00e1\3\2\2\2\5\u00ed\3\2\2\2\7\u00f6\3\2\2\2\t\u00ff\3\2\2"+
		"\2\13\u010d\3\2\2\2\r\u0110\3\2\2\2\17\u0116\3\2\2\2\21\u011d\3\2\2\2"+
		"\23\u0125\3\2\2\2\25\u012f\3\2\2\2\27\u0133\3\2\2\2\31\u0137\3\2\2\2\33"+
		"\u013d\3\2\2\2\35\u0146\3\2\2\2\37\u014d\3\2\2\2!\u0151\3\2\2\2#\u0159"+
		"\3\2\2\2%\u0160\3\2\2\2\'\u0168\3\2\2\2)\u016b\3\2\2\2+\u0170\3\2\2\2"+
		"-\u0179\3\2\2\2/\u017e\3\2\2\2\61\u0186\3\2\2\2\63\u018d\3\2\2\2\65\u0194"+
		"\3\2\2\2\67\u019d\3\2\2\29\u01a3\3\2\2\2;\u01a7\3\2\2\2=\u01aa\3\2\2\2"+
		"?\u01ad\3\2\2\2A\u01b0\3\2\2\2C\u01b6\3\2\2\2E\u01bc\3\2\2\2G\u01c7\3"+
		"\2\2\2I\u01d0\3\2\2\2K\u01dc\3\2\2\2M\u01e2\3\2\2\2O\u01e9\3\2\2\2Q\u01ed"+
		"\3\2\2\2S\u01f1\3\2\2\2U\u01f5\3\2\2\2W\u01fc\3\2\2\2Y\u0201\3\2\2\2["+
		"\u0209\3\2\2\2]\u020e\3\2\2\2_\u021c\3\2\2\2a\u0226\3\2\2\2c\u0251\3\2"+
		"\2\2e\u0253\3\2\2\2g\u025c\3\2\2\2i\u0263\3\2\2\2k\u0269\3\2\2\2m\u0270"+
		"\3\2\2\2o\u0289\3\2\2\2q\u028b\3\2\2\2s\u028d\3\2\2\2u\u028f\3\2\2\2w"+
		"\u0291\3\2\2\2y\u0293\3\2\2\2{\u0295\3\2\2\2}\u0297\3\2\2\2\177\u0299"+
		"\3\2\2\2\u0081\u029c\3\2\2\2\u0083\u029f\3\2\2\2\u0085\u02a2\3\2\2\2\u0087"+
		"\u02a5\3\2\2\2\u0089\u02a8\3\2\2\2\u008b\u02ab\3\2\2\2\u008d\u02ae\3\2"+
		"\2\2\u008f\u02b1\3\2\2\2\u0091\u02b4\3\2\2\2\u0093\u02b6\3\2\2\2\u0095"+
		"\u02b9\3\2\2\2\u0097\u02bc\3\2\2\2\u0099\u02c0\3\2\2\2\u009b\u02c4\3\2"+
		"\2\2\u009d\u02c6\3\2\2\2\u009f\u02c8\3\2\2\2\u00a1\u02cb\3\2\2\2\u00a3"+
		"\u02ce\3\2\2\2\u00a5\u02d0\3\2\2\2\u00a7\u02d2\3\2\2\2\u00a9\u02d5\3\2"+
		"\2\2\u00ab\u02d8\3\2\2\2\u00ad\u02da\3\2\2\2\u00af\u02dc\3\2\2\2\u00b1"+
		"\u02de\3\2\2\2\u00b3\u02e0\3\2\2\2\u00b5\u02e2\3\2\2\2\u00b7\u02e4\3\2"+
		"\2\2\u00b9\u02e6\3\2\2\2\u00bb\u02e8\3\2\2\2\u00bd\u02ea\3\2\2\2\u00bf"+
		"\u02ec\3\2\2\2\u00c1\u02ee\3\2\2\2\u00c3\u02f0\3\2\2\2\u00c5\u02f2\3\2"+
		"\2\2\u00c7\u02fd\3\2\2\2\u00c9\u0303\3\2\2\2\u00cb\u0308\3\2\2\2\u00cd"+
		"\u030c\3\2\2\2\u00cf\u030e\3\2\2\2\u00d1\u0312\3\2\2\2\u00d3\u0318\3\2"+
		"\2\2\u00d5\u0321\3\2\2\2\u00d7\u0323\3\2\2\2\u00d9\u0325\3\2\2\2\u00db"+
		"\u0328\3\2\2\2\u00dd\u032a\3\2\2\2\u00df\u0338\3\2\2\2\u00e1\u00e2\7e"+
		"\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7\60\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7i\2\2\u00ec\4\3\2\2\2\u00ed"+
		"\u00ee\7O\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7j\2\2"+
		"\u00f1\u00f2\7\60\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5"+
		"\7p\2\2\u00f5\6\3\2\2\2\u00f6\u00f7\7O\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\b\3\2\2\2\u00ff\u0100\7O\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7v\2\2\u0102\u0103\7j\2\2\u0103\u0104\7\60\2"+
		"\2\u0104\u0105\7g\2\2\u0105\u0106\7z\2\2\u0106\u0107\7r\2\2\u0107\n\3"+
		"\2\2\2\u0108\u010e\5c\62\2\u0109\u010e\5m\67\2\u010a\u010e\5i\65\2\u010b"+
		"\u010e\5k\66\2\u010c\u010e\5g\64\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\f\3\2\2\2\u010f\u0111\t\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\b\7\2\2\u0115\16\3\2\2\2\u0116\u0117\7r\2\2\u0117\u0118\7w\2\2\u0118"+
		"\u0119\7d\2\2\u0119\u011a\7n\2\2\u011a\u011b\7k\2\2\u011b\u011c\7e\2\2"+
		"\u011c\20\3\2\2\2\u011d\u011e\7r\2\2\u011e\u011f\7t\2\2\u011f\u0120\7"+
		"k\2\2\u0120\u0121\7x\2\2\u0121\u0122\7c\2\2\u0122\u0123\7v\2\2\u0123\u0124"+
		"\7g\2\2\u0124\22\3\2\2\2\u0125\u0126\7r\2\2\u0126\u0127\7t\2\2\u0127\u0128"+
		"\7q\2\2\u0128\u0129\7v\2\2\u0129\u012a\7g\2\2\u012a\u012b\7e\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7g\2\2\u012d\u012e\7f\2\2\u012e\24\3\2\2\2\u012f"+
		"\u0130\7x\2\2\u0130\u0131\7c\2\2\u0131\u0132\7t\2\2\u0132\26\3\2\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135\u0136\7v\2\2\u0136\30\3\2\2\2\u0137"+
		"\u0138\7e\2\2\u0138\u0139\7q\2\2\u0139\u013a\7p\2\2\u013a\u013b\7u\2\2"+
		"\u013b\u013c\7v\2\2\u013c\32\3\2\2\2\u013d\u013e\7t\2\2\u013e\u013f\7"+
		"g\2\2\u013f\u0140\7c\2\2\u0140\u0141\7f\2\2\u0141\u0142\7q\2\2\u0142\u0143"+
		"\7p\2\2\u0143\u0144\7n\2\2\u0144\u0145\7{\2\2\u0145\34\3\2\2\2\u0146\u0147"+
		"\7u\2\2\u0147\u0148\7v\2\2\u0148\u0149\7t\2\2\u0149\u014a\7k\2\2\u014a"+
		"\u014b\7p\2\2\u014b\u014c\7i\2\2\u014c\36\3\2\2\2\u014d\u014e\7c\2\2\u014e"+
		"\u014f\7p\2\2\u014f\u0150\7{\2\2\u0150 \3\2\2\2\u0151\u0152\7d\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7q\2\2\u0154\u0155\7n\2\2\u0155\u0156\7g\2\2"+
		"\u0156\u0157\7c\2\2\u0157\u0158\7p\2\2\u0158\"\3\2\2\2\u0159\u015a\7p"+
		"\2\2\u015a\u015b\7w\2\2\u015b\u015c\7o\2\2\u015c\u015d\7d\2\2\u015d\u015e"+
		"\7g\2\2\u015e\u015f\7t\2\2\u015f$\3\2\2\2\u0160\u0161\7g\2\2\u0161\u0162"+
		"\7z\2\2\u0162\u0163\7v\2\2\u0163\u0164\7g\2\2\u0164\u0165\7p\2\2\u0165"+
		"\u0166\7f\2\2\u0166\u0167\7u\2\2\u0167&\3\2\2\2\u0168\u0169\7k\2\2\u0169"+
		"\u016a\7h\2\2\u016a(\3\2\2\2\u016b\u016c\7g\2\2\u016c\u016d\7n\2\2\u016d"+
		"\u016e\7u\2\2\u016e\u016f\7g\2\2\u016f*\3\2\2\2\u0170\u0171\7h\2\2\u0171"+
		"\u0172\7w\2\2\u0172\u0173\7p\2\2\u0173\u0174\7e\2\2\u0174\u0175\7v\2\2"+
		"\u0175\u0176\7k\2\2\u0176\u0177\7q\2\2\u0177\u0178\7p\2\2\u0178,\3\2\2"+
		"\2\u0179\u017a\7v\2\2\u017a\u017b\7{\2\2\u017b\u017c\7r\2\2\u017c\u017d"+
		"\7g\2\2\u017d.\3\2\2\2\u017e\u017f\7t\2\2\u017f\u0180\7g\2\2\u0180\u0181"+
		"\7s\2\2\u0181\u0182\7w\2\2\u0182\u0183\7k\2\2\u0183\u0184\7t\2\2\u0184"+
		"\u0185\7g\2\2\u0185\60\3\2\2\2\u0186\u0187\7g\2\2\u0187\u0188\7z\2\2\u0188"+
		"\u0189\7r\2\2\u0189\u018a\7q\2\2\u018a\u018b\7t\2\2\u018b\u018c\7v\2\2"+
		"\u018c\62\3\2\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f\u0190\7"+
		"v\2\2\u0190\u0191\7w\2\2\u0191\u0192\7t\2\2\u0192\u0193\7p\2\2\u0193\64"+
		"\3\2\2\2\u0194\u0195\7e\2\2\u0195\u0196\7q\2\2\u0196\u0197\7p\2\2\u0197"+
		"\u0198\7v\2\2\u0198\u0199\7k\2\2\u0199\u019a\7p\2\2\u019a\u019b\7w\2\2"+
		"\u019b\u019c\7g\2\2\u019c\66\3\2\2\2\u019d\u019e\7d\2\2\u019e\u019f\7"+
		"t\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7m\2\2\u01a28"+
		"\3\2\2\2\u01a3\u01a4\7h\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7t\2\2\u01a6"+
		":\3\2\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7p\2\2\u01a9<\3\2\2\2\u01aa\u01ab"+
		"\7q\2\2\u01ab\u01ac\7h\2\2\u01ac>\3\2\2\2\u01ad\u01ae\7f\2\2\u01ae\u01af"+
		"\7q\2\2\u01af@\3\2\2\2\u01b0\u01b1\7y\2\2\u01b1\u01b2\7j\2\2\u01b2\u01b3"+
		"\7k\2\2\u01b3\u01b4\7n\2\2\u01b4\u01b5\7g\2\2\u01b5B\3\2\2\2\u01b6\u01b7"+
		"\7e\2\2\u01b7\u01b8\7n\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7u\2\2\u01ba"+
		"\u01bb\7u\2\2\u01bbD\3\2\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7o\2\2\u01be"+
		"\u01bf\7r\2\2\u01bf\u01c0\7n\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7o\2\2"+
		"\u01c2\u01c3\7g\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6"+
		"\7u\2\2\u01c6F\3\2\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7d\2\2\u01c9\u01ca"+
		"\7u\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd\7c\2\2\u01cd"+
		"\u01ce\7e\2\2\u01ce\u01cf\7v\2\2\u01cfH\3\2\2\2\u01d0\u01d1\7e\2\2\u01d1"+
		"\u01d2\7q\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7v\2\2"+
		"\u01d5\u01d6\7t\2\2\u01d6\u01d7\7w\2\2\u01d7\u01d8\7e\2\2\u01d8\u01d9"+
		"\7v\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7t\2\2\u01dbJ\3\2\2\2\u01dc\u01dd"+
		"\7c\2\2\u01dd\u01de\7u\2\2\u01de\u01df\7{\2\2\u01df\u01e0\7p\2\2\u01e0"+
		"\u01e1\7e\2\2\u01e1L\3\2\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4\7v\2\2\u01e4"+
		"\u01e5\7c\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7e\2\2"+
		"\u01e8N\3\2\2\2\u01e9\u01ea\7i\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7v\2"+
		"\2\u01ecP\3\2\2\2\u01ed\u01ee\7u\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7"+
		"v\2\2\u01f0R\3\2\2\2\u01f1\u01f2\7p\2\2\u01f2\u01f3\7g\2\2\u01f3\u01f4"+
		"\7y\2\2\u01f4T\3\2\2\2\u01f5\u01f6\7u\2\2\u01f6\u01f7\7y\2\2\u01f7\u01f8"+
		"\7k\2\2\u01f8\u01f9\7v\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7j\2\2\u01fb"+
		"V\3\2\2\2\u01fc\u01fd\7e\2\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7u\2\2\u01ff"+
		"\u0200\7g\2\2\u0200X\3\2\2\2\u0201\u0202\7f\2\2\u0202\u0203\7g\2\2\u0203"+
		"\u0204\7h\2\2\u0204\u0205\7c\2\2\u0205\u0206\7w\2\2\u0206\u0207\7n\2\2"+
		"\u0207\u0208\7v\2\2\u0208Z\3\2\2\2\u0209\u020a\7v\2\2\u020a\u020b\7j\2"+
		"\2\u020b\u020c\7k\2\2\u020c\u020d\7u\2\2\u020d\\\3\2\2\2\u020e\u020f\7"+
		"p\2\2\u020f\u0210\7w\2\2\u0210\u0211\7n\2\2\u0211\u0212\7n\2\2\u0212^"+
		"\3\2\2\2\u0213\u0214\7v\2\2\u0214\u0215\7t\2\2\u0215\u0216\7w\2\2\u0216"+
		"\u021d\7g\2\2\u0217\u0218\7h\2\2\u0218\u0219\7c\2\2\u0219\u021a\7n\2\2"+
		"\u021a\u021b\7u\2\2\u021b\u021d\7g\2\2\u021c\u0213\3\2\2\2\u021c\u0217"+
		"\3\2\2\2\u021d`\3\2\2\2\u021e\u0227\7\62\2\2\u021f\u0223\t\3\2\2\u0220"+
		"\u0222\t\4\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u021e\3\2\2\2\u0226\u021f\3\2\2\2\u0227b\3\2\2\2\u0228\u022c\t\3\2\2"+
		"\u0229\u022b\t\4\2\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0233\5\u00abV\2\u0230\u0232\t\4\2\2\u0231\u0230\3\2\2\2\u0232\u0235"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0236\u0238\5e\63\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u0252\3\2\2\2\u0239\u023a\7\62\2\2\u023a\u023e\5\u00abV\2\u023b"+
		"\u023d\t\4\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0241"+
		"\u0243\5e\63\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0252\3\2"+
		"\2\2\u0244\u0246\5\u00abV\2\u0245\u0247\t\4\2\2\u0246\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2"+
		"\2\2\u024a\u024c\5e\63\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u0252\3\2\2\2\u024d\u024f\5a\61\2\u024e\u0250\5e\63\2\u024f\u024e\3\2"+
		"\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0228\3\2\2\2\u0251"+
		"\u0239\3\2\2\2\u0251\u0244\3\2\2\2\u0251\u024d\3\2\2\2\u0252d\3\2\2\2"+
		"\u0253\u0255\t\5\2\2\u0254\u0256\t\6\2\2\u0255\u0254\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\t\4\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bf\3\2\2\2"+
		"\u025c\u025d\7\62\2\2\u025d\u025f\t\7\2\2\u025e\u0260\5\u00dbn\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262h\3\2\2\2\u0263\u0265\7\62\2\2\u0264\u0266\t\b\2\2\u0265\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"j\3\2\2\2\u0269\u026a\7\62\2\2\u026a\u026c\t\t\2\2\u026b\u026d\t\b\2\2"+
		"\u026c\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026fl\3\2\2\2\u0270\u0271\7\62\2\2\u0271\u0273\t\n\2\2\u0272"+
		"\u0274\t\13\2\2\u0273\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0273\3"+
		"\2\2\2\u0275\u0276\3\2\2\2\u0276n\3\2\2\2\u0277\u027b\5\u00bd_\2\u0278"+
		"\u027a\5\u00c7d\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e"+
		"\u027f\5\u00bd_\2\u027f\u028a\3\2\2\2\u0280\u0284\5\u00bf`\2\u0281\u0283"+
		"\5\u00c9e\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288"+
		"\5\u00bf`\2\u0288\u028a\3\2\2\2\u0289\u0277\3\2\2\2\u0289\u0280\3\2\2"+
		"\2\u028ap\3\2\2\2\u028b\u028c\7-\2\2\u028cr\3\2\2\2\u028d\u028e\7/\2\2"+
		"\u028et\3\2\2\2\u028f\u0290\7,\2\2\u0290v\3\2\2\2\u0291\u0292\7\61\2\2"+
		"\u0292x\3\2\2\2\u0293\u0294\7\'\2\2\u0294z\3\2\2\2\u0295\u0296\7#\2\2"+
		"\u0296|\3\2\2\2\u0297\u0298\7\u0080\2\2\u0298~\3\2\2\2\u0299\u029a\7-"+
		"\2\2\u029a\u029b\7-\2\2\u029b\u0080\3\2\2\2\u029c\u029d\7/\2\2\u029d\u029e"+
		"\7/\2\2\u029e\u0082\3\2\2\2\u029f\u02a0\7-\2\2\u02a0\u02a1\7?\2\2\u02a1"+
		"\u0084\3\2\2\2\u02a2\u02a3\7/\2\2\u02a3\u02a4\7?\2\2\u02a4\u0086\3\2\2"+
		"\2\u02a5\u02a6\7,\2\2\u02a6\u02a7\7?\2\2\u02a7\u0088\3\2\2\2\u02a8\u02a9"+
		"\7\61\2\2\u02a9\u02aa\7?\2\2\u02aa\u008a\3\2\2\2\u02ab\u02ac\7(\2\2\u02ac"+
		"\u02ad\7?\2\2\u02ad\u008c\3\2\2\2\u02ae\u02af\7~\2\2\u02af\u02b0\7?\2"+
		"\2\u02b0\u008e\3\2\2\2\u02b1\u02b2\7\'\2\2\u02b2\u02b3\7?\2\2\u02b3\u0090"+
		"\3\2\2\2\u02b4\u02b5\7?\2\2\u02b5\u0092\3\2\2\2\u02b6\u02b7\7?\2\2\u02b7"+
		"\u02b8\7?\2\2\u02b8\u0094\3\2\2\2\u02b9\u02ba\7#\2\2\u02ba\u02bb\7?\2"+
		"\2\u02bb\u0096\3\2\2\2\u02bc\u02bd\7?\2\2\u02bd\u02be\7?\2\2\u02be\u02bf"+
		"\7?\2\2\u02bf\u0098\3\2\2\2\u02c0\u02c1\7#\2\2\u02c1\u02c2\7?\2\2\u02c2"+
		"\u02c3\7?\2\2\u02c3\u009a\3\2\2\2\u02c4\u02c5\7(\2\2\u02c5\u009c\3\2\2"+
		"\2\u02c6\u02c7\7~\2\2\u02c7\u009e\3\2\2\2\u02c8\u02c9\7(\2\2\u02c9\u02ca"+
		"\7(\2\2\u02ca\u00a0\3\2\2\2\u02cb\u02cc\7~\2\2\u02cc\u02cd\7~\2\2\u02cd"+
		"\u00a2\3\2\2\2\u02ce\u02cf\7>\2\2\u02cf\u00a4\3\2\2\2\u02d0\u02d1\7@\2"+
		"\2\u02d1\u00a6\3\2\2\2\u02d2\u02d3\7>\2\2\u02d3\u02d4\7?\2\2\u02d4\u00a8"+
		"\3\2\2\2\u02d5\u02d6\7@\2\2\u02d6\u02d7\7?\2\2\u02d7\u00aa\3\2\2\2\u02d8"+
		"\u02d9\7\60\2\2\u02d9\u00ac\3\2\2\2\u02da\u02db\7.\2\2\u02db\u00ae\3\2"+
		"\2\2\u02dc\u02dd\7A\2\2\u02dd\u00b0\3\2\2\2\u02de\u02df\7<\2\2\u02df\u00b2"+
		"\3\2\2\2\u02e0\u02e1\7=\2\2\u02e1\u00b4\3\2\2\2\u02e2\u02e3\7*\2\2\u02e3"+
		"\u00b6\3\2\2\2\u02e4\u02e5\7+\2\2\u02e5\u00b8\3\2\2\2\u02e6\u02e7\7]\2"+
		"\2\u02e7\u00ba\3\2\2\2\u02e8\u02e9\7_\2\2\u02e9\u00bc\3\2\2\2\u02ea\u02eb"+
		"\7$\2\2\u02eb\u00be\3\2\2\2\u02ec\u02ed\7)\2\2\u02ed\u00c0\3\2\2\2\u02ee"+
		"\u02ef\7}\2\2\u02ef\u00c2\3\2\2\2\u02f0\u02f1\7\177\2\2\u02f1\u00c4\3"+
		"\2\2\2\u02f2\u02f6\t\f\2\2\u02f3\u02f5\t\r\2\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u00c6\3\2"+
		"\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fe\n\16\2\2\u02fa\u02fb\7^\2\2\u02fb"+
		"\u02fe\5\u00cbf\2\u02fc\u02fe\5\u00d9m\2\u02fd\u02f9\3\2\2\2\u02fd\u02fa"+
		"\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fe\u00c8\3\2\2\2\u02ff\u0304\n\17\2\2"+
		"\u0300\u0301\7^\2\2\u0301\u0304\5\u00cbf\2\u0302\u0304\5\u00d9m\2\u0303"+
		"\u02ff\3\2\2\2\u0303\u0300\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u00ca\3\2"+
		"\2\2\u0305\u0309\5\u00cdg\2\u0306\u0309\5\u00cfh\2\u0307\u0309\5\u00d3"+
		"j\2\u0308\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309"+
		"\u00cc\3\2\2\2\u030a\u030d\5\u00d5k\2\u030b\u030d\5\u00d7l\2\u030c\u030a"+
		"\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u00ce\3\2\2\2\u030e\u030f\7z\2\2\u030f"+
		"\u0310\5\u00dbn\2\u0310\u0311\5\u00dbn\2\u0311\u00d0\3\2\2\2\u0312\u0313"+
		"\7w\2\2\u0313\u0314\5\u00dbn\2\u0314\u0315\5\u00dbn\2\u0315\u0316\5\u00db"+
		"n\2\u0316\u0317\5\u00dbn\2\u0317\u00d2\3\2\2\2\u0318\u0319\7w\2\2\u0319"+
		"\u031b\5\u00c1a\2\u031a\u031c\5\u00dbn\2\u031b\u031a\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0320\5\u00c3b\2\u0320\u00d4\3\2\2\2\u0321\u0322\t\20\2\2\u0322\u00d6"+
		"\3\2\2\2\u0323\u0324\n\21\2\2\u0324\u00d8\3\2\2\2\u0325\u0326\7^\2\2\u0326"+
		"\u0327\t\22\2\2\u0327\u00da\3\2\2\2\u0328\u0329\t\23\2\2\u0329\u00dc\3"+
		"\2\2\2\u032a\u032b\7\61\2\2\u032b\u032c\7,\2\2\u032c\u0330\3\2\2\2\u032d"+
		"\u032f\13\2\2\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u0331\3"+
		"\2\2\2\u0330\u032e\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333"+
		"\u0334\7,\2\2\u0334\u0335\7\61\2\2\u0335\u0336\3\2\2\2\u0336\u0337\bo"+
		"\3\2\u0337\u00de\3\2\2\2\u0338\u0339\7\61\2\2\u0339\u033a\7\61\2\2\u033a"+
		"\u033e\3\2\2\2\u033b\u033d\n\22\2\2\u033c\u033b\3\2\2\2\u033d\u0340\3"+
		"\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0341\u0342\bp\3\2\u0342\u00e0\3\2\2\2\"\2\u010d\u0112"+
		"\u021c\u0223\u0226\u022c\u0233\u0237\u023e\u0242\u0248\u024b\u024f\u0251"+
		"\u0255\u025a\u0261\u0267\u026e\u0275\u027b\u0284\u0289\u02f6\u02fd\u0303"+
		"\u0308\u030c\u031d\u0330\u033e\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}