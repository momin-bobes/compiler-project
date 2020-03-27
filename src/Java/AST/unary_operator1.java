package Java.AST;

public class unary_operator1 {
    String op;
    Java.AST.expr expr=new expr ();

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }
}
