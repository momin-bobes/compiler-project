package Java.AST.QueryStmt;

import Java.AST.expr;

import java.util.ArrayList;

public class Select_Core {
    private boolean K_DISTINCT;
    private boolean K_ALL;
    private boolean K_WHERE;
    private boolean K_VALUES;
    private expr WHERE;
    private ArrayList<expr> groupby;
    private ArrayList<expr> VALUES;
    private boolean k_GROUPBY;
    private expr Having;
    private ArrayList<Result_Column>result_columns;
    private ArrayList<Table_Or_Subquery> table_or_subqueries;
    private Join_Clause join_clause;

    public expr getWHERE() {
        return WHERE;
    }

    public void setWHERE(expr WHERE) {
        this.WHERE = WHERE;
    }

    public ArrayList<expr> getVALUES() {
        return VALUES;
    }

    public void setVALUES(ArrayList<expr> VALUES) {
        this.VALUES = VALUES;
    }

    public ArrayList<expr> getGroupby() {
        return groupby;
    }

    public void setGroupby(ArrayList<expr> groupby) {
        this.groupby = groupby;
    }

    public boolean isK_VALUES() {
        return K_VALUES;
    }

    public void setK_VALUES(boolean k_VALUES) {
        K_VALUES = k_VALUES;
    }

    public expr getHaving() {
        return Having;
    }

    public void setHaving(expr having) {
        Having = having;
    }


    public boolean isK_GROUPBY() {
        return k_GROUPBY;
    }

    public void setK_GROUPBY(boolean k_GROUPBY) {
        this.k_GROUPBY = k_GROUPBY;
    }

    public boolean isK_WHERE() {
        return K_WHERE;
    }

    public void setK_WHERE(boolean k_WHERE) {
        K_WHERE = k_WHERE;
    }



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

    public ArrayList<Result_Column> getResult_columns() {
        return result_columns;
    }

    public void setResult_columns(ArrayList<Result_Column> result_columns) {
        this.result_columns = result_columns;
    }

    public ArrayList<Table_Or_Subquery> getTable_or_subqueries() {
        return table_or_subqueries;
    }

    public void setTable_or_subqueries(ArrayList<Table_Or_Subquery> table_or_subqueries) {
        this.table_or_subqueries = table_or_subqueries;
    }

    public Join_Clause getJoin_clause() {
        return join_clause;
    }

    public void setJoin_clause(Join_Clause join_clause) {
        this.join_clause = join_clause;
    }
}
