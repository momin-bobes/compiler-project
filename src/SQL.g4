/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : sqlite-parser; an ANTLR4 grammar for SQLite
 *                https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
grammar SQL;


parse
 : ( sql_stmt_list |  functiondeclaration| var_stmt| error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
 :
//  ( K_EXPLAIN ( K_QUERY K_PLAN )? )? ( alter_table_stmt

                                      (alter_table_stmt
//                                      | analyze_stmt
//                                      | attach_stmt
//                                      | begin_stmt
//                                      | commit_stmt
//                                      | compound_select_stmt
//                                      | create_index_stmt
                                      | create_table_stmt
//                                      | create_trigger_stmt
//                                      | create_view_stmt
//                                      | create_virtual_table_stmt
                                      | delete_stmt
//                                      | delete_stmt_limited
//                                      | detach_stmt
//                                      | drop_index_stmt
                                      | drop_table_stmt
//                                      | drop_trigger_stmt
//                                      | drop_view_stmt
                                      | factored_select_stmt
                                      | insert_stmt
//                                      | pragma_stmt
//                                      | reindex_stmt
//                                      | release_stmt
//                                      | rollback_stmt
//                                      | savepoint_stmt
//                                      | simple_select_stmt
//                                      | select_stmt
                                      | update_stmt
//                                      | update_stmt_limited
//                                      | vacuum_stmt




  )
  ;

  argument_stmt
  : function_name '(' expr (',' expr)* ')'
  ;
 higher_stmt
 : function_name '(' arry_name ',' K_FUNCTION  higher_stmt1 fun_body  ')' ';'
 ;
  higher_stmt1
  : '(' K_VAR ? expr? (',' (K_VAR)? expr)* ')'
  ;
//json_stmt
// : '{' json_form  (property ASSIGN json_stmt)* '}' ';'
// ;
//
// json_form
// : (property':' json_1',')* (property':' json_1 )
//
// ;
value
    : expr
    |array
    |object1
    //|'null'
    ;
    array
    :( '['( value (',' value)* )']')?
    | '[' ']'
    ;
    pair
    : property (':' value)?
    ;
    object1
    : ('{' (pair (',' pair)* )'}')?
    | '{' '}'
    ;
    pair_T
    :
    '.'pair
    ;
   json_stmt
   :
   object1|array|pair_T
   ;
 json_call
 : property '.' property  (json_call3)* (ASSIGN (IDENTIFIER | NUMERIC_LITERAL) )?
 ;
  json_call3
: ( '.' property)
;
 functiondeclaration
 : parameter fun_body
 ;
 fun_body
 :'{' ((argument_stmt | state_stmt ))*  '}'
 ;
 return_cont2:
 (expr)|(select_core);
 return_contunet
 :
 any_name |expr|rele_onecond;

state_stmt
:rele_if
|rele_for
|rele_while
|rele_switch
|rele_dowhile
|rele_forach
|json_call ';'
| K_PRINT '(' (print_content)*  ')' ';'
| expr';'
|var_stmt ';'?
|(array_stmt) ';'
|rele_onecond
|role_re_con
;
role_re_con
:K_RETURN ((rele_ifcond?';'?| ( return_contunet)* )';')(return_cont2)?

;

print_content
:
expr('+' expr)* | ( json_call ('+' IDENTIFIER)* )
;

rele_if
:K_IF ( ('('expr ')')('{'((state_stmt))*'}'|((state_stmt))) ( (else_stmt)|(else_stmt)*))

;
else_stmt
:
(K_ELSE state_stmt)|(K_ELSE('{'(state_stmt)*'}'))

;

rele_onecond
:
 K_VAR? expr  ASSIGN  (expr  '?'expr_or_rele_ifcond':' (expr_or_rele_ifcond )*  ';' )
;
expr_or_rele_ifcond
: (expr| rele_ifcond )

;
rele_ifcond
:(expr '?' expr ':' expr)
|('('expr '?' expr ':' expr')')
;
rele_for
:K_FOR (oprint1';'oprint2';'oprint3)  ('{' (state_stmt)*  '}')?
;
oprint1
:'('K_VAR? namef operations? ASSIGN (namef|NUMERIC_LITERAL)
;
namef
:
any_name
;
operations
:(PLUS|PLUS_PLUS|MINUS_MINUS|MINUS)
;
oprint2
:expr
;
oprint3
:expr')'
;
rele_while
:K_WHILE'('expr')' ((('{' ( (state_stmt )* )  '}') ) |(state_stmt ))
;
rele_switch
:K_SWITCH'('expr')''{'(rele_case1)*((K_DEFAULT ':' rele_case))?(state_stmt)*'}'
;
rele_case1
:K_CASE expr':'rele_case
;
rele_case
:'{'(state_stmt)* '}'|(state_stmt)*
;
rele_dowhile
:K_DO '{'(state_stmt)* '}' K_WHILE '(' expr')' ';'
;
rele_forach
:K_FOR '('expr':'expr')'('{'(state_stmt)*  '}')? (state_stmt)*
;
var_stmt
:(K_VAR)? (name_x) ( ASSIGN? ((argument_stmt) | expr | (select_core) | (higher_stmt) |(json_stmt) )?';'?(ASSIGN(select_core))? )?
;
array_stmt
:  K_VAR? name_x '['  ']'( ASSIGN ( ( ('{'(expr(','expr)*)?'}') | '[' (expr(','expr)*)  ']'  ) | (select_core) | ( function_name1 ) | (expr) ))?
;

alter_table_stmt
 :
//  K_ALTER K_TABLE K_ONLY? ( database_name '.' )? source_table_name
K_ALTER K_TABLE  ( database_name '.' )? source_table_name
   ( K_RENAME K_TO new_table_name
   | alter_table_add
   | alter_table_add_constraint
   | K_ADD K_COLUMN? column_def
   )
//   K_ENABLE? (unknown)?
 ;

alter_table_add_constraint
 : K_ADD K_CONSTRAINT any_name table_constraint
 ;

alter_table_add
 : K_ADD table_constraint
 ;

//analyze_stmt
// : K_ANALYZE ( database_name | table_or_index_name | database_name '.' table_or_index_name )?
// ;
//
//attach_stmt
// : K_ATTACH K_DATABASE? expr K_AS database_name
// ;

//begin_stmt
// : K_BEGIN ( K_DEFERRED | K_IMMEDIATE | K_EXCLUSIVE )? ( K_TRANSACTION transaction_name? )?
// ;
//
//commit_stmt
// : ( K_COMMIT | K_END ) ( K_TRANSACTION transaction_name? )?
// ;
//
//compound_select_stmt
// : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
//   select_core ( ( K_UNION K_ALL? | K_INTERSECT | K_EXCEPT ) select_core )+
//   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
// ;
//
//create_index_stmt
// : K_CREATE K_UNIQUE? K_INDEX ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? index_name K_ON table_name '(' indexed_column ( ',' indexed_column )* ')'
//   ( K_WHERE expr )?
// ;

create_table_stmt
 :
// K_CREATE ( K_TEMP | K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
//   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')' ( K_WITHOUT IDENTI FIER )?
 ( '(' column_def ( ',' table_constraint | ',' column_def )* ')'
   | K_AS select_stmt)
//   ) (unknown)?
 ;

//create_trigger_stmt
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TRIGGER ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? trigger_name ( K_BEFORE  | K_AFTER | K_INSTEAD K_OF )?
//   ( K_DELETE | K_INSERT | K_UPDATE ( K_OF column_name ( ',' column_name )* )? ) K_ON ( database_name '.' )? table_name
//   ( K_FOR K_EACH K_ROW )? ( K_WHEN expr )?
//   K_BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) ';' )+ K_END
// ;
//
//create_view_stmt
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_VIEW ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? view_name K_AS select_stmt
// ;
//
//create_virtual_table_stmt
// : K_CREATE K_VIRTUAL K_TABLE ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? table_name
//   K_USING module_name ( '(' module_argument ( ',' module_argument )* ')' )?
// ;

delete_stmt
 :
// with_clause? K_DELETE K_FROM qualified_table_name
K_DELETE K_FROM qualified_table_name
   ( K_WHERE expr )?
 ;

//delete_stmt_limited
// : with_clause? K_DELETE K_FROM qualified_table_name
//   ( K_WHERE expr )?
//   ( ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//     K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
//   )?
// ;
//
//detach_stmt
// : K_DETACH K_DATABASE? database_name
// ;

//drop_index_stmt
// : K_DROP K_INDEX ( K_IF K_EXISTS )? ( database_name '.' )? index_name
// ;

drop_table_stmt
 : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name
 ;

//drop_trigger_stmt
// : K_DROP K_TRIGGER ( K_IF K_EXISTS )? ( database_name '.' )? trigger_name
// ;
//
//drop_view_stmt
// : K_DROP K_VIEW ( K_IF K_EXISTS )? ( database_name '.' )? view_name
// ;

factored_select_stmt
 :
// ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
   select_core
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

insert_stmt
 :
//  with_clause? ( K_INSERT
//                | K_REPLACE
//                | K_INSERT K_OR K_REPLACE
//                | K_INSERT K_OR K_ROLLBACK
//                | K_INSERT K_OR K_ABORT
//                | K_INSERT K_OR K_FAIL
                 K_INSERT  K_INTO
   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
   | select_stmt
   | K_DEFAULT K_VALUES
   )
 ;

//pragma_stmt
// : K_PRAGMA ( database_name '.' )? pragma_name ( '=' pragma_value
//                                               | '(' pragma_value ')' )?
// ;
//
//reindex_stmt
// : K_REINDEX ( collation_name
//             | ( database_name '.' )? ( table_name | index_name )
//             )?
// ;
//
//release_stmt
// : K_RELEASE K_SAVEPOINT? savepoint_name
// ;
//
//rollback_stmt
// : K_ROLLBACK ( K_TRANSACTION transaction_name? )? ( K_TO K_SAVEPOINT? savepoint_name )?
// ;
//
//savepoint_stmt
// : K_SAVEPOINT savepoint_name
// ;
//
//simple_select_stmt
// : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
//   select_core ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
// ;

select_stmt
 :
//  ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
//   select_or_values ( compound_operator select_or_values )*
 select_or_values
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

update_stmt
 :
// with_clause? K_UPDATE ( K_OR K_ROLLBACK
//                         | K_OR K_ABORT
//                         | K_OR K_REPLACE
//                         | K_OR K_FAIL
//                         | K_OR K_IGNORE )? qualified_table_name
                            K_UPDATE qualified_table_name
   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
 ;

//update_stmt_limited
// : with_clause? K_UPDATE ( K_OR K_ROLLBACK
//                         | K_OR K_ABORT
//                         | K_OR K_REPLACE
//                         | K_OR K_FAIL
//                         | K_OR K_IGNORE )? qualified_table_name
//   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
//   ( ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//     K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
//   )?
// ;

//vacuum_stmt
// : K_VACUUM
// ;

column_def
 : column_name ( column_constraint | type_name )*
 ;

type_name
 : name ( '('  type_name_real ')'
         | '(' type_name_real ',' type_name_real ')' )?
 ;
 type_name_real
 :
     signed_number (any_name)?
  ;
column_constraint
 :
 ( K_CONSTRAINT name )?
   ( column_constraint_primary_key
   | column_constraint_foreign_key
   | column_constraint_not_null
   | column_constraint_null
//   | K_UNIQUE conflict_clause
   | K_CHECK '(' expr ')'
   | column_default
   | K_COLLATE collation_name
   )
 ;

column_constraint_primary_key
 :
//  K_PRIMARY K_KEY ( K_ASC | K_DESC )? conflict_clause K_AUTOINCREMENT?
K_PRIMARY K_KEY( K_ASC | K_DESC )? K_AUTOINCREMENT?
 ;

column_constraint_foreign_key
 : foreign_key_clause
 ;

column_constraint_not_null
 :
//  K_NOT K_NULL conflict_clause
  K_NOT K_NULL
 ;

column_constraint_null
 :
// K_NULL conflict_clause
K_NULL
 ;

column_default
 : K_DEFAULT (column_default_value | '(' expr ')' | K_NEXTVAL '(' expr ')' | any_name )  ( TOW_POINT any_name+ )?
 ;

column_default_value
 : ( signed_number | literal_value )
 ;

//conflict_clause
// : ( K_ON K_CONFLICT ( K_ROLLBACK
//                     | K_ABORT
//                     | K_FAIL
//                     | K_IGNORE
//                     | K_REPLACE
//                     )
//   )?
// ;

/*
    SQLite understands the following binary operators, in order from highest to
    lowest precedence:

    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR

*/
parameter
:
((function_name '(' varable?')' ))
;
varable
:
 ( K_DISTINCT?K_VAR? (name_x)(ASSIGN  expr )? ( list_var )*  )
 ;
 list_var
 :',' K_VAR? name_x (ASSIGN expr)? ;
//json_1
//
//: expr
// |  '[' ('"' expr '"')*  expr* (',' expr)*  ']' (json_stmt*)
//   |  '['  (json_stmt ',')*  json_stmt  ']' json_form*
//   | '{'  json_form'}' json_form*
//   |  '[' expr? (',' expr)*  ']'
//;



expr
 :
   literal_value
  |  identy
  |  unary_operator1
  | database_name1
  | function_name1
  |  opexp
  |expr opre_all expr
  |  expr (op )* expr
  | kword1
  | ((PLUS_PLUS)|(MINUS_MINUS))
  | expr ('+'|'-')
  |expr  (PLUS_PLUS|MINUS_MINUS)
  |existsselect
  | '(' expr ')'
  | '['  expr']'
//  |  expr ASSIGN expr ';'

//  |  expr '||'  expr

//  |expr ASSIGN K_NEW expr ('('expr'.' K_IN')')?

//  |expr '&&' expr

//  | expr ( '*' | '/' | '%' ) expr
//  | expr ( '+'| '-' )expr

//  | expr ( '<<' | '>>' | '&' | '|' ) expr
//  | expr ( '<' | '<=' | '>' | '>=' ) expr
//  | expr(   '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
//  | expr K_AND expr
//  | expr K_OR expr


  //----alaa------------------------------------
 |  expr exprselect

 ;
 opre_all
 :
  K_OR
  |K_AND
  |(   '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP )
  |( '<' | '<=' | '>' | '>=' )
|  ( '<<' | '>>' | '&' | '|' )
  |('+'|'-')
  |( '*' | '/' | '%' )
  |'&&'
  |'||'
  | ASSIGN
  ;
 op:
 AMP_AMP |PIPE2 |NOT_EQ1 | NOT_EQ2|NOT_EQ3
 ;
 opexp
 :
 '!'expr
 |'.'expr;
 kword1:
 ( K_NULL |K_TRUE|K_FALSE |K_BREAK|K_CONTINUE )
 ;

 existsselect:

 ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')'
 ;
 exprselect
 :
 K_NOT? K_IN select_expr

 ;
 select_expr
 :
 ( '(' ( select_stmt  | expr ( ',' expr )*   )?  ')'

  | ( database_name '.' )? table_name )
 ;

 identy
 :IDENTIFIER
 ;
database_name1
:( ( database_name '.' )? table_name '.' )*   column_name
;
  unary_operator1
  :
  unary_operator expr;
  function_name1
  :
   function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')';
//defult_stmt
//:( K_DISTINCT?K_VAR? IDENTIFIER ( ',' K_VAR? IDENTIFIER  (ASSIGN expr))*)
//
//|( K_DISTINCT?K_VAR? IDENTIFIER (ASSIGN expr) ( ',' K_VAR? IDENTIFIER  (ASSIGN expr))*)
//;
foreign_key_clause
 : K_REFERENCES ( database_name '.' )? foreign_table ( '(' fk_target_column_name ( ',' fk_target_column_name )* ')' )?
   ( match_name  )*

   ( K_NOT? K_DEFERRABLE ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE )? K_ENABLE? )?
 ;
match_name
:( K_ON ( K_DELETE | K_UPDATE ) ( K_SET K_NULL
                                     | K_SET K_DEFAULT
                                     | K_CASCADE
                                     | K_RESTRICT
                                     | K_NO K_ACTION )
      | K_MATCH name
      )
;
fk_target_column_name
 : name
 ;

//raise_function
// : K_RAISE '(' ( K_IGNORE
//               | ( K_ROLLBACK | K_ABORT | K_FAIL ) ',' error_message )
//           ')'
// ;

indexed_column
 : column_name ( K_COLLATE collation_name )? ( K_ASC | K_DESC )?
 ;

table_constraint
 : ( K_CONSTRAINT name )?
   ( table_constraint_primary_key
   | table_constraint_key
   | table_constraint_unique
   | K_CHECK '(' expr ')'
   | table_constraint_foreign_key
   )
 ;

table_constraint_primary_key
 :
// K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_foreign_key
 : K_FOREIGN K_KEY '(' fk_origin_column_name ( ',' fk_origin_column_name )* ')' foreign_key_clause
 ;

table_constraint_unique
 :
//  K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_key
 :
// K_KEY name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
K_KEY name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

fk_origin_column_name
 : column_name
 ;

//with_clause
// : K_WITH K_RECURSIVE? cte_table_name K_AS '(' select_stmt ')' ( ',' cte_table_name K_AS '(' select_stmt ')' )*
// ;

qualified_table_name
 : ( database_name '.' )? table_name ( K_INDEXED K_BY index_name
                                     | K_NOT K_INDEXED )?
 ;

ordering_term
 : expr ( K_COLLATE collation_name )? ( K_ASC | K_DESC )?
 ;

pragma_value
 : signed_number
 | name
 | STRING_LITERAL
 ;

common_table_expression
 : table_name ( '(' column_name ( ',' column_name )* ')' )? K_AS '(' select_stmt ')'
 ;

result_column
 : '*'
 | table_name '.' '*'
 | expr ( K_AS? column_alias )?
 ;

table_or_subquery
 : ( database_name '.' )? table_name ( K_AS? table_alias )?
   ( K_INDEXED K_BY index_name
   | K_NOT K_INDEXED )?
 | '(' ( table_or_subquery ( ',' table_or_subquery )*
       | join_clause )
   ')' ( K_AS? table_alias )?
 | '(' select_stmt ')' ( K_AS? table_alias )?
 ;

join_clause
 :
  table_or_subquery ( join_operator table_or_subquery join_constraint )*
 ;

join_operator
 : ','
// | K_NATURAL? ( K_LEFT K_OUTER? | K_INNER | K_CROSS )? K_JOIN
( K_LEFT K_OUTER? | K_INNER)? K_JOIN
 ;

join_constraint
 :
//  ( K_ON expr
//   | K_USING '(' column_name ( ',' column_name )* ')' )?
( K_ON expr)?
 ;


LBRACE : '{' ;
RBRACE : '}' ;
COLON : ':' ;
QUESTION : '?' ;
T__7 : '::' ;
LBRACK : '[' ;
T__9 : '"' ;
RBRACK : ']' ;
select_core
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;
//
//compound_operator
// : K_UNION
// | K_UNION K_ALL
// | K_INTERSECT
// | K_EXCEPT
// ;

cte_table_name
 : table_name ( '(' column_name ( ',' column_name )* ')' )?
 ;

signed_number
 : ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;

error_message
 : STRING_LITERAL
 ;

module_argument // TODO check what exactly is permitted here
 : expr
 | column_def
 ;

column_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;


keyword
 : K_ABORT
 | K_VAR
 | K_ACTION
 | K_ADD
 | K_AFTER
 | K_ALL
 | K_ALTER
 | K_ANALYZE
 | K_AND
 | K_AS
 | K_ASC
 | K_ATTACH
 | K_AUTOINCREMENT
 | K_BEFORE
 | K_BEGIN
 | K_BETWEEN
 | K_BY
 | K_CASCADE
 | K_CASE
 | K_CAST
 | K_CHECK
 | K_COLLATE
 | K_COLUMN
 | K_COMMIT
 | K_CONFLICT
 | K_CONSTRAINT
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DELETE
 | K_DESC
 | K_DETACH
 | K_DISTINCT
 | K_DROP
 | K_EACH
 | K_ELSE
 | K_END
 | K_ENABLE
 | K_ESCAPE
 | K_EXCEPT
 | K_EXCLUSIVE
 | K_EXISTS
 | K_EXPLAIN
 | K_FAIL
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IGNORE
 | K_IMMEDIATE
 | K_IN
 | K_INDEX
 | K_INDEXED
 | K_INITIALLY
 | K_INNER
 | K_INSERT
 | K_INSTEAD
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_MATCH
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PLAN
 | K_PRAGMA
 | K_PRIMARY
 | K_QUERY
 | K_RAISE
 | K_RECURSIVE
 | K_REFERENCES
 | K_REGEXP
 | K_REINDEX
 | K_RELEASE
 | K_RENAME
 | K_REPLACE
 | K_RESTRICT
 | K_RIGHT
 | K_ROLLBACK
 | K_ROW
 | K_SAVEPOINT
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_TEMP
 | K_TEMPORARY
 | K_THEN
 | K_TO
 | K_TRANSACTION
 | K_TRIGGER
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VACUUM
 | K_VALUES
 | K_VIEW
 | K_VIRTUAL
 | K_WHEN
 | K_WHERE
 | K_WITH
 | K_WITHOUT
 | K_NEXTVAL
 |K_NEW
 |K_FALSE
 |K_TRUE
 |K_WHILE
 |K_RETURN
 |K_SWITCH
 |K_BREAK
 |K_DO
 |K_CONTINUE
 |K_PRINT
 |K_FOREACH
 |K_ARRAY
 |K_FUNCTION
 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+
unknown
 : .+?
 ;

name
 : any_name
 ;
 name_x
 : any_name
 ;

function_name
 : any_name
 ;
 arry_name
 : any_name
 ;

database_name
 : any_name
 ;

source_table_name
 : any_name
 ;

table_name
 : any_name
 ;

table_or_index_name
 : any_name
 ;

new_table_name
 : any_name
 ;

column_name
 : any_name
 ;

collation_name
 : any_name
 ;

foreign_table
 : any_name
 ;

index_name
 : any_name
 ;

trigger_name
 : any_name
 ;

view_name
 : any_name
 ;

module_name
 : any_name
 ;

pragma_name
 : any_name
 ;

savepoint_name
 : any_name
 ;

table_alias
 : any_name
 ;

transaction_name
 : any_name
 ;

any_name
 : IDENTIFIER

 | STRING_LITERAL
 | '('any_name')'
 ;
property
:  IDENTIFIER

;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
AMP_AMP: '&&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';
PLUS_PLUS:'++';
MINUS_MINUS:'--';
NOT_EQ3: '!';
TOW_POINT : '::';
// http://www.sqlite.org/lang_keywords.html
K_NEW: N E W;
K_TRUE: T R U E;
K_FALSE:F A L S E;
K_VAR : V A R ;
K_RETURN: R E T U R N ;
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_BREAK: B R E A K;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_WHILE: W H I L E;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_SWITCH: S W I T C H;
K_DO : D O ;
K_CONTINUE : C O N T I N U E;
K_PRINT : P R I N T ;
K_FOREACH:F O R E A C H;
K_ARRAY:A R R A Y;
K_FUNCTION: F U N C T I O N ;
IDENTIFIER
 :
 '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'  ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set

 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
// | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

//SINGLE_LINE_COMMENT
// :  ~[\r\n]* -> channel(HIDDEN)
// ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 :
  [ \u000B\t\r\n] -> channel(HIDDEN)

 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
