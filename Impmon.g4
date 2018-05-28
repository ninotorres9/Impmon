grammar Impmon;

compilation_unit
    : import_stmts tof_defs
    ;

import_stmts
    : import_stmt*
    ;
import_stmt
    : 'import' name ('.'name)* ';'
    ;

tof_defs
    : (defunc)*
    ;
defunc
    : 'def' name '(' (params)? ')' block
    ;

// statements

stmts
    : stmt*
    ;
stmt
    : ';'               #emptyStmt
    | expr ';'          #toExpr
    | block             #blockStmt
    | if_stmt           #ifStmt
    | while_stmt        #whileStmt
    | for_stmt          #forStmt
    | return_stmt       #returnStmt
    | print_stmt        #printStmt
    ;

if_stmt
    : 'if' '(' expr ')' stmt ('else' stmt)?
    ;
while_stmt
    : 'while' '(' expr ')' stmt
    ;
for_stmt
    : 'for' '(' expr ';' expr ';' expr ')' stmt
    ;
return_stmt
    : 'return' expr ';'
    ;
print_stmt
    : 'print' expr ';'
    ;

// expressions

expr
    : term '=' expr                 #assign
    | term '+=' expr                #addAssign
    | term '-=' expr                #subAssign
    | term '*=' expr                #mulAssign
    | term '/=' expr                #divAssign
    | factor                        #toFactor
    ;

factor
    : factor '*' factor             #mul
    | factor '/' factor             #div
    | factor '+' factor             #add
    | factor '-' factor             #sub
    | factor '>' factor             #gtn
    | factor '<' factor             #ltn
    | factor '>=' factor            #goe
    | factor '<=' factor            #loe
    | factor '==' factor            #eq
    | factor '!=' factor            #neq
    | factor '&&' factor            #and
    | factor '||' factor            #or
    | term                          #toTerm
    ;

term
    : INTEGER                       #int
    | IDENTIFIER                    #iden
    | STRING                        #str
    | '(' expr ')'                  #par
    | term '++'                     #inc
    | term '--'                     #dec
    | term '[' expr ']'             #callArray
    | term '(' args ')'             #callFunc
    | '[' args ']'                  #array
    ;

name
    : IDENTIFIER
    ;
params
    : param (',' param)*
    ;
param
    : name
    ;
block
    : '{' stmts '}'
    ;
args
    : (expr (',' expr)*)?
    ;

// other

IDENTIFIER
    : ([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*;
INTEGER
    : ([1-9])([0-9])*                     ('U')?('L')?
    | '0'('x'|'X')([0-9]|[a-f]|[A-F])+  ('U')?('L')?
    | '0'([0-7])*                       ('U')?('L')?
    ;
STRING
    : '"' ~[\r\n]* '"'
    ;
SKIP_TOKEN
    : [ \t\r\n\f]+ -> skip
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
	;
BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

