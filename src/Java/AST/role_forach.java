package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class role_forach {
    expr e1;
    expr e2;
    String op;
    List<state_stmt> s=new ArrayList<>();

    public expr getE1() {
        return e1;
    }

    public void setE1(expr e1) {
        this.e1 = e1;
    }

    public expr getE2() {
        return e2;
    }

    public void setE2(expr e2) {
        this.e2 = e2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public List<state_stmt> getS() {
        return s;
    }

    public void setS(List<state_stmt> s) {
        this.s = s;
    }
}
