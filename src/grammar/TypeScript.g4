grammar TypeScript;


/* Representa un codigo en typescript */
compilationUnit
	: statementList EOF
	;

/* Lista de Sentencias */
statementList
	: statement+
	;

/* Bloque */
block
	: TK_LCURLY statementList? TK_RCURLY
	;

/* Sentencia */
statement
	: block //
	| variableStatement //
	| ifStatement //
	| forStatement
	| whileStatement
	| doStatement
	| switchStatement
	| classStatement //*
	| continueStatement
    | breakStatement //
    | returnStatement //
	| functionStatement
	| expressionStatement
	| emptyStatement
	;

/* Sentencia For */
forStatement
	: TK_FOR TK_LPARENT expressionSequence? TK_SEMICOLON expressionSequence? TK_SEMICOLON expressionSequence? TK_RPARENT statement
	| TK_FOR TK_LPARENT varModifier variableDeclList TK_SEMICOLON expressionSequence? TK_SEMICOLON expressionSequence? TK_RPARENT statement
    | TK_FOR TK_LPARENT expression (TK_IN | TK_OF) expressionSequence TK_RPARENT statement
    | TK_FOR TK_LPARENT varModifier variableDecl (TK_IN | TK_OF) expressionSequence TK_RPARENT statement
	;

/* Sentencia While */
whileStatement
	: TK_WHILE TK_LPARENT expressionSequence TK_RPARENT statement 
	;

/* Sentencia Do-While */
doStatement
	: TK_DO statement TK_WHILE TK_LPARENT expressionSequence TK_RPARENT
	;

/* Sentencia Switch */
switchStatement
	: TK_SWITCH '(' expressionSequence ')' caseBlock
	;

caseBlock
	: TK_LCURLY (caseClause+)? (defaultClause (caseClause+)?)? TK_RCURLY
	;

caseClause
	: TK_CASE expressionSequence TK_COLON statementList?
	;

defaultClause
	: TK_DEFAULT ':' statementList?
	;

/* Sentencia para Declarar un Clase */
classStatement
	: TK_ABSTRACT? TK_CLASS TK_IDENT typeParameters? classHeritage classBody
	;

/* Clausula de Herencia de una Clase (extends A, implements B) */
classHeritage
	: classExtendsClause? implementsClause?
	;

/* Clausula Extends de una Clase (extends A) */
classExtendsClause
	: TK_EXTENDS referenceType
	;

/* Clausula Implements de una Clase (implements A) */
implementsClause
	: TK_IMPLEMENTS referenceType
	;

/* Cuerpo de una Clase */
classBody
	: TK_LCURLY classElement* TK_RCURLY
	;

/* Elemento de una Clase */
classElement
	: constructorDeclaration
	| memberDecl
	| indexMemberDecl
	| statement
	;

/* Declaracio de un Miembro de una Clase */
memberDecl
	: propertyMemberBase propertyName TK_QMARK? typeAnnotation? initializer? TK_SEMICOLON					#ClassMemberProperty
	| propertyMemberBase propertyName callSignature ( (TK_LCURLY functionBody TK_RCURLY) | TK_SEMICOLON)	#ClassMemberMethod
    | propertyMemberBase (getter | setter)																	#ClassMemberGetterSetter
    | abstractDecl																							#ClassMemberAbstract
    ;

/* Getter */
getter
    : TK_GET propertyName TK_LPARENT TK_RPARENT typeAnnotation? TK_LCURLY functionBody TK_RCURLY
    ;

/* Setter */
setter
    : TK_SET propertyName TK_LPARENT ( TK_IDENT | arrayLiteral | objectLiteral) typeAnnotation? TK_RPARENT TK_LCURLY functionBody TK_RCURLY
    ;

/* Declaracio de un Miembro Abstracto de una Clase */
abstractDecl
	: TK_ABSTRACT (TK_IDENT callSignature | variableStatement)
	;

/*  */
indexMemberDecl
	: TK_LBRACKET TK_IDENT TK_COLON (TK_NUMBER|TK_STRING) TK_RBRACKET typeAnnotation TK_SEMICOLON
	;

/* Primera Parte de la Declaracion de un Miembro de una Clase. Tiene los Modificadores de Acceso */
propertyMemberBase
	: TK_ASYNC? accessModifier? TK_STATIC? TK_READ_ONLY?
	;

/* Declaracion de un Constructor de una Clase*/
constructorDeclaration
	: accessModifier? TK_CONSTRUCTOR TK_LPARENT formalParameterList? TK_RPARENT TK_LCURLY functionBody TK_RCURLY
	;

/* Declaracion de una Funcion */
functionStatement
	: TK_FUNCTION TK_IDENT callSignature ( (TK_LCURLY functionBody TK_RCURLY) | TK_SEMICOLON)
	;

/* Sentencia Continue */
continueStatement
	: TK_CONTINUE TK_SEMICOLON
	;

/* Sentencia Break */
breakStatement
	: TK_BREAK TK_SEMICOLON
	;

/* Sentencia Return */
returnStatement
	: TK_RETURN (expressionSequence)? TK_SEMICOLON
	;

/* Signatura de la Llamada a una Funcion */
callSignature
	: typeParameters? TK_LPARENT parameterList? TK_RPARENT typeAnnotation?
	;

/* Lista de Parametros */
parameterList
	: parameter (TK_COMMA parameter)*;

/* Parametro de una Funcion */
parameter
	: requiredParameter
	// | optionalParameter
	;

/* Parametro Requerido */
requiredParameter
	: accessModifier? identifierOrPattern typeAnnotation?
	;

/* Parametro Opcional */
optionalParameter
	: accessModifier? identifierOrPattern (TK_QMARK typeAnnotation? | typeAnnotation? initializer)
	;

/* Identificador, Palabra Reservada, Literal de Objeto o Literal de Arreglo */
identifierOrPattern
	: identifierOrReservedWord
	| arrayLiteral
	| objectLiteral
	;

identifierOrReservedWord
	: TK_IDENT
	// | reservedWord
	;

// reservedWord
// 	: NULL_LITERAL
// 	| BOOLEAN_LITERAL
// 	;

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
	: accessModifier? varModifier TK_READ_ONLY? variableDeclList TK_SEMICOLON?
	;

variableDeclList
	: variableDecl (TK_COMMA variableDecl)*
	;

variableDecl
	: TK_IDENT typeAnnotation? initializer?
	;

initializer
	: TK_EQ expression
	;

arrayLiteral
	: TK_LBRACKET TK_RBRACKET																		#ArrayLiteralEmptyAlt
	| TK_LBRACKET arrayElement (TK_COMMA arrayElement)* TK_RBRACKET									#ArrayLiteralAlt
	;

arrayElement
	: expression
	| TK_IDENT
	;

objectLiteral
	: TK_LCURLY TK_RCURLY																			#ObjLiteralEmpty
	| TK_LCURLY propertyAssign (TK_COMMA propertyAssign)* TK_RCURLY									#ObjLiteral
	;

propertyAssign
	: propertyName (TK_COLON | TK_EQ) expression
	// | TK_LBRACKET expression TK_RBRACKET TK_COLON expression
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
	| TK_BOOLEAN
	| TK_NUMBER
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
	| referenceType
	;

referenceType
	: TK_IDENT
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

identifier
	: TK_IDENT
	;

functionCall
	: TK_IDENT TK_LPARENT expressionSequence TK_RPARENT
	| TK_IDENT TK_LPARENT TK_RPARENT
	| TK_LPARENT functionExpressionDecl	TK_RPARENT TK_LPARENT expressionSequence? TK_RPARENT
	;

functionExpressionDecl
	: TK_FUNCTION TK_IDENT? TK_LPARENT formalParameterList? TK_RPARENT typeAnnotation? TK_LCURLY functionBody TK_RCURLY
	;

assignmentOperator
	: TK_EQ
	| TK_PLUS_ASIGN
	| TK_MINUS_ASIGN
	| TK_STAR_ASIGN
	| TK_SLASH_ASIGN
	| TK_PERCENT_ASIGN
	| TK_AND_ASIGN
	| TK_OR_ASIGN
	;

expression
	: functionExpressionDecl														#ExprFunctionObject //
	| expression '[' expressionSequence ']'											#ExprObjectIndex //
    | expression '.' identifier														#ExprDotIdent //
    | expression '.' functionCall													#ExprDotFunctionCall
	| TK_PLUSPLUS expression														#ExprPlusPlusOp
	| TK_MINUSMINUS expression														#ExprMinusMinusOp
	| expression TK_PLUSPLUS														#ExprOpPlusPlus
	| expression TK_MINUSMINUS														#ExprOpMinusMinus
	| TK_PLUS expression															#ExprPlusOp //
    | TK_MINUS expression															#ExprMinusOp //
    | TK_BINNOT expression															#ExprBinaryNot //
    | TK_NOT expression																#ExprNot //
	| expression (TK_STAR | TK_SLASH | TK_PERCENT) expression						#ExprMultDivPerc //
	| expression (TK_PLUS | TK_MINUS) expression									#ExprSumSubs //
	| expression (TK_LESS | TK_GREAT | TK_LESSEQ | TK_GREATEQ) expression			#ExprComparator //
	| expression (TK_EQEQ | TK_NOTEQ | TK_IDENTEQ | TK_IDENTNOTEQ) expression		#ExprEquality //
	| expression TK_BIN_AND expression												#ExprBinAnd //
    | expression TK_BIN_OR expression												#ExprBinOr //
    | expression TK_LOGIC_AND expression											#ExprLogicAnd // 
    | expression TK_LOGIC_OR expression												#ExprLogicOr //
	| expression TK_QMARK expression TK_COLON expression							#ExprTernaryOperator
	| functionCall																	#ExprFunctionCall //
	| TK_LPARENT expressionSequence TK_RPARENT										#ExprParent //
	| expression TK_EQ expression													#ExprAsig //
	| expression TK_PLUS_ASIGN expression											#ExprPlusAsig //
	| expression TK_MINUS_ASIGN expression											#ExprMinusAsig // 
	| expression TK_STAR_ASIGN expression											#ExprMultAsig //
	| expression TK_SLASH_ASIGN expression											#ExprDivAsig //
	| expression TK_PERCENT_ASIGN expression										#ExprPercentAsig //
	| expression TK_AND_ASIGN expression											#ExprAndAsig //
	| expression TK_OR_ASIGN expression												#ExprOrAsig //
	| TK_NEW functionCall															#ExprNew //
	| arrayLiteral																	#ExprArrayLiteral //
	| objectLiteral																	#ExprObjectLiteral //
	| literal																		#ExprPrimitiveLiteral //
	| TK_IDENT																		#ExprIdentifier //
	| TK_THIS																		#ExprThis //
	;

formalParameterList
	: formalParameterArg (TK_COMMA formalParameterArg)*
	;

functionBody
	: sourceElem*
	;

sourceElem
	: TK_EXPORT? statement
	;

formalParameterArg
	: accessModifier? identifierOrKeyword TK_QMARK? typeAnnotation? (TK_EQ expression)? 
	;

identifierOrKeyword
	: TK_IDENT
	| TK_TYPE
	| TK_REQUIRE
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
TK_FUNCTION: 'function';
TK_TYPE: 'type';
TK_REQUIRE: 'require';
TK_EXPORT: 'export';
TK_RETURN: 'return';
TK_CONTINUE: 'continue';
TK_BREAK: 'break';
TK_FOR: 'for';
TK_IN: 'in';
TK_OF: 'of';
TK_DO: 'do';
TK_WHILE: 'while';
TK_CLASS: 'class';
TK_IMPLEMENTS: 'implements';
TK_ABSTRACT: 'abstract';
TK_CONSTRUCTOR: 'constructor';
TK_ASYNC: 'async';
TK_STATIC: 'static';
TK_GET: 'get';
TK_SET: 'set';
TK_NEW: 'new';
TK_SWITCH: 'switch';
TK_CASE: 'case';
TK_DEFAULT: 'default';
TK_THIS: 'this';

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

DECIMAL_LITERAL
	: [1-9] [0-9]* TK_POINT [0-9]* EXPONENT_PART?
	| '0' TK_POINT [0-9]* EXPONENT_PART?
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


TK_MULTILINE_COMMENT:               '/*' .*? '*/'             -> channel(HIDDEN);
TK_SINGLELINE_COMMENT:              '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
