grammar Impmon;

// 编译单元
compilation_unit
    : import_stmts tof_defs
    ;

// import声明
import_stmts    
    : import_stmt*
    ;
import_stmt
    : 'import' name ('.'name)* ';'
    ;

// 定义
tof_defs
    : (defunc | defvars | defconst | defstruct | defunion | typedef)*
    ;
defunc
    : type name '(' (params)? ')' block
    ;
defvars
    : type name ('=' expr (',' name ('=' expr)?)* )?';'
    ;
defconst
    : 'const' defvars ';'
    ;
defstruct
    : 'struct' name member_list
    ;
defunion
    : 'union' name member_list
    ;
typedef
    : 'typedef' type IDENTIFIER ';'
    ;

// stmts
stmts
    : stmt*
    ;
stmt
    : ';'               #passStmt
    | labeled_stmt      #labeledStmt
    | expr ';'          #toExpr
    | block             #blockStmt
    | if_stmt           #ifStmt
    | while_stmt        #whileStmt
    | for_stmt          #forStmt
    | switch_stmt       #switchStmt
    | break_stmt        #breakStmt
    | continue_stmt     #continueStmt
    | goto_stmt         #gotoStmt
    | return_stmt       #returnStmt
    | print_stmt        #printStmt
    ;

labeled_stmt
    : IDENTIFIER ':' stmt
    ;
if_stmt 
    : 'if' '(' expr ')' stmt ('else' stmt)?
    ;
while_stmt
    : 'while' '(' expr ')' stmt
    ;
dowhile_stmt
    : 'do' stmt 'while' '(' expr ')'
    ;
for_stmt
    : 'for' '(' expr ';' expr ';' expr ')' stmt
    ;
switch_stmt
    : 'switch' '(' expr ')' ('case' expr ':' stmt)* ('default' ':' stmt)?
    ;
break_stmt
    : 'break' ';'
    ;
continue_stmt
    : 'continue' ';'
    ;
goto_stmt
    : 'goto' IDENTIFIER ';'
    ;
return_stmt
    : 'return' ';'
    | 'return' expr ';'
    ;

print_stmt
    : 'print' expr ';'
    ;

// expr
expr
    : term '=' expr                 #assign
    | term '+=' expr                #add_assign
    | term '-=' expr                #sub_assign
    | term '*=' expr                #mul_assign
    | term '/=' expr                #div_assign
    | factor                        #to_factor
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
    | term                          #to_term
    ;

term 
    : INTEGER                       #int
    | CHARACTER                     #char
    | IDENTIFIER                    #iden
    | '(' expr ')'                  #par
    | term '++'                     #inc
    | term '--'                     #dec
    | term '[' expr ']'             #call_array
    | term '(' args ')'             #call_func
    ;


// 其他
storage:
    ('static')?
    ;
type
    : typeref
    ;
typeref 
    : typeref_base '['']'
    | typeref_base '[' INTEGER ']'
    | typeref_base '*'
    | typeref_base
    ; // 差一个函数指针
typeref_base
    : 'void'
    | 'char'
    | 'int'
    ;   

name
    : IDENTIFIER
    ;
       //: 'void' 
params
    : param (',' param)*
    | param (',' '...')? 
    ;
param
    : type name 
    ;
// 临时变量列表 + 语句列表
block
    : '{' defvar_list stmts '}'
    ;
defvar_list
    : defvars*
    ;
member_list
    : '{' (slot ';')* '}'
    ;
slot
    : type name
    ;
args
    : (expr (',' expr)*)?
    ;




// 标识符

IDENTIFIER
    : ([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*; 
INTEGER
    : ([1-9])([0-9])*                     ('U')?('L')?
    | '0'('x'|'X')([0-9]|[a-f]|[A-F])+  ('U')?('L')?
    | '0'([0-7])*                       ('U')?('L')?
    ;
CHARACTER
    : '\'' ~[\r\n]* '\''
    ;
STRING
    : '"' ~[\r\n]* '"'
    ;
BASETYPE
    : 'void'
    | 'int'
    | 'char'
    ;

// 需要忽略的字符

SKIP_TOKEN
    : [ \t\r\n\f]+ -> skip 
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
	;
BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

