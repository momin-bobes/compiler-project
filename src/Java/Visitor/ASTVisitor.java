package Java.Visitor;

import Java.AST.*;
import Java.AST.QueryStmt.*;

public interface ASTVisitor {
    public void visit(Parse p);
    public void visit(FunctionDeclaration funcDec);
    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);




    public void visit(Factored_select_Stmt factored_select_stmt);
    public void visit(UpdateStmt updateStmt);
    public void visit(alter_table_stmt alter_stmt);
    public void visit(DeleteStmt deleteStmt);
    public void visit(Create_Stmt create_stmt);
    public void visit(Drop_stmt drop_stmt);
    public void visit(Insert_Stmt insert_stmt);

    public void visit(alter_table_add alter_table_add);
    public void visit(alter_table_add_costraint alter_table_add_constraint);
    public void visit(Column_Alias column_alias);
    public void visit(Column_constraint column_constraint);
    public void visit(Column_constraint_FK column_constraint_fk);
    public void visit(Column_constraint_PK column_constraint_pk);
    public void visit(Column_def column_def);
    public void visit(column_default column_default);
    public void visit(Column_default_value column_default_value);
    public void visit(database_name1 database_name1);
    public void visit(existsselect existSelect);
    public void visit(expr expr);
    public void visit(fk_target_column_name fk_target_column_name);
    public void visit(foreign_key_clause foreign_key_clause);
    public void visit(function_name1 function_name1);
    public void visit(identy identy);
    public void visit(Index_column index_column);
    public void visit(Join join);
    public void visit(Join_Clause join_clause);
    public void visit(Join_Constraint join_constraint);
    public void visit(Join_Operator join_operator);
    public void visit(Literal_value literal_value);
    public void visit(match_name match_name);
    public void visit(kword kword);
    public void visit(Ordering_term ordering_term);
    public void visit(qualified_table qualified_table);
    public void visit(Result_Column result_column);
    public void visit(Select_Core select_core);
    public void visit(select_or_values select_or_values);
    public void visit(Signed_number signed_number);
    public void visit(Table_constraint table_constraint);
    public void visit(Table_constraint_foreign_key table_constraint_foreign_key);
    public void visit(Table_constraint_key table_constraint_key);
    public void visit(Table_constraint_PK table_constraint_pk);
    public void visit(Table_constraint_unique table_constraint_unique);
    public void visit(Table_Or_Subquery table_or_subquery);
    public void visit(Typename typename);
    public void visit(Type_name_real type_name_real);
    public void visit(unary_operator1 unary_operator);
    public  void visit (parameter param);
    public  void visit (variable variab);
    public  void visit (varable varab);
    public  void visit (list_var list_var1);
    public  void visit (oprint1 oprint1);
    public  void visit(oprint2 oprint2);
    public  void visit (oprint3 oprint3);
    public  void visit (literal_value literal_value1);
    public  void visit (select_expr select_expr1);
    public  void visit (opexp opexp1);
    public  void visit (exprselect exprselect1);
    public  void visit (rele_ifcond roleif);
    public  void visit (role_for role_for);
    public  void visit(rele_dowhile role_dowhile1);
    public  void visit (role_forach role_forach1);
    public  void visit (role_switch role_switch1);
    public  void visit (role_re_con role_re_con1);
    public  void visit(expr_or_rele_ifcond expr_or_rele_ifcond1);
    public  void visit (rele_case1 rele_case1);
    public  void visit (rolewhile rolewhile1);
    public  void visit (role_case role_case);
    public  void visit (fun_body fun_body1);
    public  void visit (print_content print_content);

    public  void visit (array_stmt array_stmt);
    public  void visit (state_stmt state_stmt);
    public  void visit (return_cont2 return_cont2);
    public  void visit (return_contunet return_contunet);

//    public  void visit ( );



    public  void visit (Roleif Roleif);

    public  void visit (role_dowhile role_dowhile1);

public void visit(else_stmt else_stmt);



    public  void visit (rele_onecond rele_onecond);


    public  void visit (value value1);
    public  void visit (json_call3 json_call3);
    public  void visit (json_call json_call);
    public  void visit (var_stmt var_stmtr);


    void visit(array array);

    void visit(argument_stmt argument_stmt);

    void visit(ex_list ex_list);

    void visit(ex_op ex_op);

    void visit(exp2 exp2);

    void visit(expright expright);

    void visit(higher_stmt higher_stmt);

    void visit(higher_stmt1 higher_stmt1);

    void visit(json_stmt json_stmt);

    void visit(listopertion listopertion);

    void visit(numeric_literal numeric_literal);

    void visit(object1 object1);

    void visit(op op);

    void visit(operations operations);

    void visit(pair pair);

    void visit(pair_T pair_t);

    void visit(property property);


}
