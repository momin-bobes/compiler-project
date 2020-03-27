package Java.AST.QueryStmt;

import Java.AST.expr;

public class Result_Column {
    private boolean K_AS;
    private boolean DOT;
    private boolean STAR;
    private String table_name;
    private expr exp;
    private Column_Alias column_alias;

    public boolean isK_AS() {
        return K_AS;
    }

    public void setK_AS(boolean k_AS) {
        K_AS = k_AS;
    }

    public boolean isDOT() {
        return DOT;
    }

    public void setDOT(boolean DOT) {
        this.DOT = DOT;
    }

    public boolean isSTAR() {
        return STAR;
    }

    public void setSTAR(boolean STAR) {
        this.STAR = STAR;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public expr getExp() {
        return exp;
    }

    public void setExp(expr exp) {
        this.exp = exp;
    }

    public Column_Alias getColumn_alias() {
        return column_alias;
    }

    public void setColumn_alias(Column_Alias column_alias) {
        this.column_alias = column_alias;
    }
}
