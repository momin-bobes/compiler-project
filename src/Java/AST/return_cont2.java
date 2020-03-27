package Java.AST;

import Java.AST.QueryStmt.Select_Core;

public class return_cont2 {
    Java.AST.expr expr=new expr ();
        Select_Core select_core=new Select_Core();

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Select_Core getSelect_core() {
        return select_core;
    }

    public void setSelect_core(Select_Core select_core) {
        this.select_core = select_core;
    }
}
