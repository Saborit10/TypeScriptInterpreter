grammar TypeScript;

compilationUnit
	: expression EOF
	;

expression
	: TK_PLUSPLUS expression
	| TK_MINUSMINUS expression
	| TK_PLUS expression
    | TK_MINUS expression
    | TK_BINNOT expression
    | TK_NOT expression
	| expression (TK_STAR | TK_SLASH | TK_PERCENT) expression
	| expression (TK_PLUS | TK_MINUS) expression
	| expression (TK_LESS | TK_GREAT | TK_LESSEQ | TK_GREATEQ) expression
	| expression (TK_EQEQ | TK_NOTEQ | TK_IDENTEQ | TK_IDENTNOTEQ) expression
    | expression TK_BIN_AND expression
    | expression TK_BIN_OR expression
    | expression TK_LOGIC_AND expression
    | expression TK_LOGIC_OR expression
	| expression TK_QMARK expression TK_COLON expression
	| TK_LPARENT expression TK_RPARENT
	| literal
	;

// Literals
literal
	: NULL_LITERAL
	| BOOLEAN_LITERAL
	| DECIMAL_INTEGER_LITERAL
	| DECIMAL_LITERAL
	| BINARY_INTEGER_LITERAL
	| OCTAL_INTEGER_LITERAL
	| OCTAL_INTEGER_LITERAL2
	| HEX_INTEGER_LITERAL
	| STRING_LITERAL
	;

NULL_LITERAL
	: 'null'
	;

BOOLEAN_LITERAL
	: 'true'
	| 'false'
	;

DECIMAL_INTEGER_LITERAL
	: '0'
	| [1-9] [0-9]*
	;

DECIMAL_LITERAL:
	[1-9] [0-9]* TK_POINT [0-9]* EXPONENT_PART?
	| TK_POINT [0-9]+ EXPONENT_PART?
	| DECIMAL_INTEGER_LITERAL EXPONENT_PART?
	;

EXPONENT_PART
	: [eE] [+-]? [0-9]+
	;

HEX_INTEGER_LITERAL: '0' [xX] HEX_DIGIT+;
OCTAL_INTEGER_LITERAL: '0' [0-7]+;
OCTAL_INTEGER_LITERAL2: '0' [oO] [0-7]+;
BINARY_INTEGER_LITERAL: '0' [bB] [01]+;


STRING_LITERAL
	: TK_DCUOTE DOUBLE_STRING_CHARACTER* TK_DCUOTE
	| TK_SCUOTE SINGLE_STRING_CHARACTER* TK_SCUOTE
	;

// Operators
TK_PLUS: '+';
TK_MINUS: '-';
TK_STAR: '*';
TK_SLASH: '/';
TK_PERCENT: '%';
TK_NOT: '!';
TK_BINNOT: '~';
TK_PLUSPLUS: '++';
TK_MINUSMINUS: '--';

TK_EQEQ: '==';
TK_NOTEQ: '!=';
TK_IDENTEQ: '===';
TK_IDENTNOTEQ: '!==';
TK_BIN_AND: '&';
TK_BIN_OR: '|';
TK_LOGIC_AND: '&&';
TK_LOGIC_OR: '||';
TK_LESS: '<';
TK_GREAT: '>';
TK_LESSEQ: '<=';
TK_GREATEQ: '>=';


TK_POINT: '.';
TK_QMARK: '?';
TK_COLON: ':';
TK_SEMICOLON: ';';

TK_LPARENT: '(';
TK_RPARENT: ')';

TK_DCUOTE: '"';
TK_SCUOTE: '\'';
TK_LCURLY: '{';
TK_RCURLY: '}';

DOUBLE_STRING_CHARACTER
	: ~["\\\r\n]
	| '\\' ESCAPE_SEQUENCE
	| LINE_CONTINUATION
	;

SINGLE_STRING_CHARACTER
	: ~['\\\r\n]
	| '\\' ESCAPE_SEQUENCE
	| LINE_CONTINUATION;

ESCAPE_SEQUENCE
	: CHARACTER_ESCAPE_SEQUENCE
	// | '0'
	| HEX_ESCAPE_SEQUENCE
	| EXTENDED_UNICODE_ESCAPE_SEQUENCE
	;

CHARACTER_ESCAPE_SEQUENCE
	: SINGLE_ESCAPE_CHARACTER
	| NON_ESCAPE_CHARACTER
	;

HEX_ESCAPE_SEQUENCE
	: 'x' HEX_DIGIT HEX_DIGIT
	;

UNICODE_ESCAPE_SEQUENCE
	: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;

EXTENDED_UNICODE_ESCAPE_SEQUENCE
	: 'u' TK_LCURLY HEX_DIGIT+ TK_RCURLY;

SINGLE_ESCAPE_CHARACTER: ['"\\bfnrtv];
NON_ESCAPE_CHARACTER: ~['"\\bfnrtv0-9xu\r\n];
LINE_CONTINUATION: '\\' [\r\n\u2028\u2029];

HEX_DIGIT: [0-9a-fA-F];

// Skip spaces, tabs, newlines, \r (Windows).
WS: [ \t\r\n]+ -> skip;
