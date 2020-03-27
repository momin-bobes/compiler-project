package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class higher_stmt1 {
    boolean K_var;
     expr expr= new expr ();
    List<expr> exprs= new ArrayList<> (  );

    public List<Java.AST.expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Java.AST.expr> exprs) {
        this.exprs = exprs;
    }

    public boolean isK_var() {
        return K_var;
    }

    public void setK_var(boolean k_var) {
        K_var = k_var;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }
}
