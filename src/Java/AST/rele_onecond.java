package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class rele_onecond {
    boolean var;
    Java.AST.expr expr=new expr ();
    String op1;
    Java.AST.expr expr1=new expr ();
    String op2;
    expr_or_rele_ifcond expr_or_rele_ifcond=new expr_or_rele_ifcond();
    String op3;
    List<expr_or_rele_ifcond> expr_or_rele_ifconds=new ArrayList<expr_or_rele_ifcond>();

    public boolean isVar() {
        return var;
    }

    public void setVar(boolean var) {
        this.var = var;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public Java.AST.expr getExpr1() {
        return expr1;
    }

    public void setExpr1(Java.AST.expr expr1) {
        this.expr1 = expr1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public Java.AST.expr_or_rele_ifcond getExpr_or_rele_ifcond() {
        return expr_or_rele_ifcond;
    }

    public void setExpr_or_rele_ifcond(Java.AST.expr_or_rele_ifcond expr_or_rele_ifcond) {
        this.expr_or_rele_ifcond = expr_or_rele_ifcond;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public List<Java.AST.expr_or_rele_ifcond> getExpr_or_rele_ifconds() {
        return expr_or_rele_ifconds;
    }

    public void setExpr_or_rele_ifconds(List<Java.AST.expr_or_rele_ifcond> expr_or_rele_ifconds) {
        this.expr_or_rele_ifconds = expr_or_rele_ifconds;
    }
}
