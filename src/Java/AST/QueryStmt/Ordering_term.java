package Java.AST.QueryStmt;

import Java.AST.expr;

public class Ordering_term {
    private boolean K_COLLATE;
    private boolean K_ASC;
    private boolean K_DESC;
    private String collation_name;
    private expr exp;

    public boolean isK_COLLATE() {
        return K_COLLATE;
    }

    public void setK_COLLATE(boolean k_COLLATE) {
        K_COLLATE = k_COLLATE;
    }

    public boolean isK_ASC() {
        return K_ASC;
    }

    public void setK_ASC(boolean k_ASC) {
        K_ASC = k_ASC;
    }

    public boolean isK_DESC() {
        return K_DESC;
    }

    public void setK_DESC(boolean k_DESC) {
        K_DESC = k_DESC;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name;
    }

    public expr getExp() {
        return exp;
    }

    public void setExp(expr exp) {
        this.exp = exp;
    }
}
