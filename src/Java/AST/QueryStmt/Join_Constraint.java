package Java.AST.QueryStmt;

import Java.AST.expr;

public class Join_Constraint {
    private boolean k_ON;
    private expr exp;

    public boolean isK_ON() {
        return k_ON;
    }

    public void setK_ON(boolean k_ON) {
        this.k_ON = k_ON;
    }

    public expr getExp() {
        return exp;
    }

    public void setExp(expr exp) {
        this.exp = exp;
    }
}
