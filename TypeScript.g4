grammar TypeScript;

compilationUnit
	: statementList EOF
	;

statementList
	: statement+
	;

block
	: TK_LCURLY statementList? TK_RCURLY
	;

statement
	: block
	| variableStatement
	| ifStatement
	// | forStatement
	// | whileStatement
	// | doStatement
	// | switchStatement
	// | classStatement
	// | functionStatement
	| expressionStatement
	| emptyStatement
	;

emptyStatement
	: TK_SEMICOLON
	;

ifStatement
	: TK_IF TK_LPARENT expressionSequence TK_RPARENT statement (TK_ELSE statement)?
	;

expressionSequence
	: expression (TK_COMMA expression)*
	;

expressionStatement
	: expression TK_SEMICOLON
	; 

variableStatement
	: accessModifier? varModifier? TK_READ_ONLY? variableDeclList TK_SEMICOLON?
	;

variableDeclList
	: variableDecl (',' variableDecl)*
	;

variableDecl
	// : (TK_IDENT | arrayLiteral | objectLiteral ) typeAnnotation?; // Nasty stuff
	: TK_IDENT typeAnnotation? initializer?
	;

initializer
	: TK_EQ expression
	;

arrayLiteral
	: TK_LBRACKET TK_RBRACKET
	| TK_LBRACKET arrayElement (TK_COMMA arrayElement)* TK_RBRACKET
	;

arrayElement
	: expression
	| TK_IDENT
	;

objectLiteral
	: TK_LCURLY TK_RCURLY
	| TK_LCURLY propertyAssign (TK_COMMA propertyAssign)* TK_RCURLY
	;

propertyAssign
	: propertyName (TK_COLON | TK_EQ) expression
	| TK_LBRACKET expression TK_RBRACKET TK_COLON expression
 	;

propertyName
	: TK_IDENT
	| STRING_LITERAL
	| NUMERIC_LITERAL
	;

typeAnnotation
	: TK_COLON typeName
	;

primitiveType
	: TK_STRING
	| TK_ANY
	| TK_BOOLEAN
	| TK_NUMBER
	// | TK_SYMBOL
	;

typeName
	: parametricType
	| simpleType
	| arrayType
	;

parametricType
	: simpleType typeParameters
	;

simpleType
	: primitiveType
	| TK_IDENT
	;

arrayType
	: arrayType TK_LBRACKET TK_RBRACKET
	| simpleType TK_LBRACKET TK_RBRACKET
	;

typeParameters
	: TK_LESS typeParameterList? TK_GREAT
	;

typeParameterList
	: typeParameter (TK_COMMA typeParameter)*
	;

typeParameter
	: typeName extendsConstraint?
	// | typeParameters
	;

extendsConstraint
	: TK_EXTENDS typeName
	;

accessModifier
	: TK_PUBLIC
	| TK_PRIVATE
	| TK_PROTECTED
	;

varModifier
	: TK_VAR
	| TK_LET
	| TK_CONST
	;

assignment
	: TK_IDENT TK_EQ expression
	| TK_IDENT TK_PLUS_ASIGN expression
	| TK_IDENT TK_MINUS_ASIGN expression
	| TK_IDENT TK_STAR_ASIGN expression
	| TK_IDENT TK_SLASH_ASIGN expression
	| TK_IDENT TK_PERCENT_ASIGN expression
	| TK_IDENT TK_AND_ASIGN expression
	| TK_IDENT TK_OR_ASIGN expression
	;

expression
	: TK_PLUSPLUS expression
	| TK_MINUSMINUS expression
	| expression TK_PLUSPLUS
	| expression TK_MINUSMINUS
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
	| assignment
	| arrayLiteral
	| objectLiteral
	| TK_IDENT
	| literal
	;

// Literals
literal
	: NULL_LITERAL
	| BOOLEAN_LITERAL
	| NUMERIC_LITERAL
	| STRING_LITERAL
	;

NUMERIC_LITERAL
	: DECIMAL_LITERAL
	| BINARY_INTEGER_LITERAL
	| OCTAL_INTEGER_LITERAL
	| OCTAL_INTEGER_LITERAL2
	| HEX_INTEGER_LITERAL
	;

/*
	Lexer
**/

// Skip spaces, tabs, newlines, \r (Windows).
WS: [ \t\r\n]+ -> skip;

// Reserved Words
TK_PUBLIC: 'public';
TK_PRIVATE: 'private';
TK_PROTECTED: 'protected';
TK_VAR: 'var';
TK_LET: 'let';
TK_CONST: 'const';
TK_READ_ONLY: 'readonly';
TK_STRING: 'string';
TK_ANY: 'any';
TK_BOOLEAN: 'boolean';
TK_NUMBER: 'number';
TK_EXTENDS: 'extends';
TK_IF: 'if';
TK_ELSE: 'else';

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
TK_PLUS_ASIGN: '+=';
TK_MINUS_ASIGN: '-=';
TK_STAR_ASIGN: '*=';
TK_SLASH_ASIGN: '/=';
TK_AND_ASIGN: '&=';
TK_OR_ASIGN: '|=';
TK_PERCENT_ASIGN: '%=';

TK_EQ: '=';
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
TK_COMMA: ',';
TK_QMARK: '?';
TK_COLON: ':';
TK_SEMICOLON: ';';

TK_LPARENT: '(';
TK_RPARENT: ')';
TK_LBRACKET: '[';
TK_RBRACKET: ']';

TK_DCUOTE: '"';
TK_SCUOTE: '\'';
TK_LCURLY: '{';
TK_RCURLY: '}';


// Identifierss
TK_IDENT
	: [$_A-Za-z] [$_A-Za-z0-9]*
	;

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
