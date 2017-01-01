grammar MiniJava;		

goal				:	mainClass classDeclaration+ EOF;
mainClass			:	'class' name=Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}';
classDeclaration	:	'class' name=Identifier ( 'extends' extendName=Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}';
varDeclaration		:	type=typeDeclaration name=Identifier ';';
methodDeclaration	:	'public' typeDeclaration name=Identifier '(' parameterList? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';
typeDeclaration		:	'int' '[' ']'
					|	'boolean'
					|	'int'
					|	Identifier
					;
parameterList		:	type=typeDeclaration name=Identifier
					|	type=typeDeclaration name=Identifier ',' parameterList
					;
statement			:	'{' ( statement )* '}'
					|	'if' '(' expression ')' statement 'else' statement
					|	'while' '(' expression ')' statement
					|	'System.out.println' '(' expression ')' ';'
					|	Identifier '=' expression ';'
					|	Identifier '[' expression ']' '=' expression ';'
					;
expression			:	expression ( '&&' | '<' | '+' | '-' | '*' ) expression
					|	expression '[' expression ']'
					|	expression '.' 'length'
					|	expression '.' Identifier '(' ( expression ( ',' expression )* )? ')'
					|	Digit+
					|	'true'
					|	'false'
					|	Identifier
					|	'this'
					|	'new' 'int' '[' expression ']'
					|	'new' Identifier '(' ')'
					|	'!' expression
					|	'(' expression ')'
					|	Letter+
					;
Identifier			:	Letter+(Letter | Digit | '_')*;
Letter				:	[a-zA-Z];
Digit 				:	[0-9];
WS				    :	[ \r\t\n]+ -> skip ;
COMMENT_BLOCK		:	'/*' .*? '*/' -> skip;
COMMENT_LINE		:	'//' .*? '\r'? '\n' -> skip;