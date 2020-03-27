package Java.AST;

public class exprselect {
     String K_NOT;
     String K_IN;
     select_expr select_expr = new select_expr();
   expr expr = new expr();

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public String getK_NOT() {
        return K_NOT;
    }

    public void setK_NOT(String k_NOT) {
        K_NOT = k_NOT;
    }

    public String getK_IN() {
        return K_IN;
    }

    public void setK_IN(String k_IN) {
        K_IN = k_IN;
    }

    public Java.AST.select_expr getSelect_expr() {
        return select_expr;
    }

    public void setSelect_expr(Java.AST.select_expr select_expr) {
        this.select_expr = select_expr;
    }
}
