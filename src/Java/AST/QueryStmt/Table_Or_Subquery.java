package Java.AST.QueryStmt;

import java.util.ArrayList;

public class Table_Or_Subquery {
    private boolean K_AS;
    private String database_name;
    private String table_name;
    private String table_alias;
    private boolean K_INDEXED;
    private boolean K_NOT;
    private boolean k_BY;
    private String index_name;
    private ArrayList<Table_Or_Subquery> table_or_subqueries;
    private Join_Clause join_clause;
    private SelectStmt selectStmt;

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public Join_Clause getJoin_clause() {
        return join_clause;
    }

    public void setJoin_clause(Join_Clause join_clause) {
        this.join_clause = join_clause;
    }

    public boolean isK_AS() {
        return K_AS;
    }

    public void setK_AS(boolean k_AS) {
        K_AS = k_AS;
    }

    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getTable_alias() {
        return table_alias;
    }

    public void setTable_alias(String table_alias) {
        this.table_alias = table_alias;
    }

    public boolean isK_INDEXED() {
        return K_INDEXED;
    }

    public void setK_INDEXED(boolean k_INDEXED) {
        K_INDEXED = k_INDEXED;
    }

    public boolean isK_NOT() {
        return K_NOT;
    }

    public void setK_NOT(boolean k_NOT) {
        K_NOT = k_NOT;
    }

    public boolean isK_BY() {
        return k_BY;
    }

    public void setK_BY(boolean k_BY) {
        this.k_BY = k_BY;
    }

    public String getIndex_name() {
        return index_name;
    }

    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }

    public ArrayList<Table_Or_Subquery> getTable_or_subqueries() {
        return table_or_subqueries;
    }

    public void setTable_or_subqueries(ArrayList<Table_Or_Subquery> table_or_subqueries) {
        this.table_or_subqueries = table_or_subqueries;
    }
}
