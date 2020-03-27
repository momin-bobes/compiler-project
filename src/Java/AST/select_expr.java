package Java.AST;

import Java.AST.QueryStmt.SelectStmt;

import java.util.ArrayList;
import java.util.List;

public class select_expr {
    SelectStmt selectStmt= new SelectStmt ();
    List<expr> exprs= new ArrayList<>();
    String database_name;
    String table_name;
 String dot;

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public List<expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<expr> exprs) {
        this.exprs = exprs;
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
}
