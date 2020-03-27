package Java.AST.QueryStmt;

import Java.AST.expr;

import java.util.ArrayList;
import java.util.List;

public class select_or_values {
   boolean  K_DISTINCT ;
   boolean K_ALL ;
   List<Result_Column> result_columns= new ArrayList<Result_Column> (  );
      String  K_FROM;
       List <Table_Or_Subquery> table_or_subqueries = new ArrayList<Table_Or_Subquery> ();

        Join_Clause join_clause = new Join_Clause ();
    boolean  K_WHERE;
    Java.AST.expr expr = new expr ();
    Java.AST.expr where;
    Java.AST.expr having;
     boolean K_GROUP ;
     boolean K_BY ;
     boolean K_groupby;

        ArrayList<Java.AST.expr> exprs = new ArrayList<Java.AST.expr> ( );
        ArrayList<Java.AST.expr>values;
        boolean K_HAVING ;
        boolean K_VALUES;

    public boolean isK_DISTINCT() {
        return K_DISTINCT;
    }

    public void setK_DISTINCT(boolean k_DISTINCT) {
        K_DISTINCT = k_DISTINCT;
    }

    public boolean isK_ALL() {
        return K_ALL;
    }

    public void setK_ALL(boolean k_ALL) {
        K_ALL = k_ALL;
    }

    public List<Result_Column> getResult_columns() {
        return result_columns;
    }

    public void setResult_columns(List<Result_Column> result_columns) {
        this.result_columns = result_columns;
    }

    public String getK_FROM() {
        return K_FROM;
    }

    public void setK_FROM(String k_FROM) {
        K_FROM = k_FROM;
    }

    public List<Table_Or_Subquery> getTable_or_subqueries() {
        return table_or_subqueries;
    }

    public void setTable_or_subqueries(List<Table_Or_Subquery> table_or_subqueries) {
        this.table_or_subqueries = table_or_subqueries;
    }

    public Join_Clause getJoin_clause() {
        return join_clause;
    }

    public void setJoin_clause(Join_Clause join_clause) {
        this.join_clause = join_clause;
    }

    public boolean isK_WHERE() {
        return K_WHERE;
    }

    public void setK_WHERE(boolean k_WHERE) {
        K_WHERE = k_WHERE;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Java.AST.expr getWhere() {
        return where;
    }

    public void setWhere(Java.AST.expr where) {
        this.where = where;
    }

    public Java.AST.expr getHaving() {
        return having;
    }

    public void setHaving(Java.AST.expr having) {
        this.having = having;
    }

    public boolean isK_GROUP() {
        return K_GROUP;
    }

    public void setK_GROUP(boolean k_GROUP) {
        K_GROUP = k_GROUP;
    }

    public boolean isK_BY() {
        return K_BY;
    }

    public void setK_BY(boolean k_BY) {
        K_BY = k_BY;
    }

    public boolean isK_groupby() {
        return K_groupby;
    }

    public void setK_groupby(boolean k_groupby) {
        K_groupby = k_groupby;
    }

    public ArrayList<Java.AST.expr> getExprs() {
        return exprs;
    }

    public void setExprs(ArrayList<Java.AST.expr> exprs) {
        this.exprs = exprs;
    }

    public ArrayList<Java.AST.expr> getValues() {
        return values;
    }

    public void setValues(ArrayList<Java.AST.expr> values) {
        this.values = values;
    }

    public boolean isK_HAVING() {
        return K_HAVING;
    }

    public void setK_HAVING(boolean k_HAVING) {
        K_HAVING = k_HAVING;
    }

    public boolean isK_VALUES() {
        return K_VALUES;
    }

    public void setK_VALUES(boolean k_VALUES) {
        K_VALUES = k_VALUES;
    }
}
