package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class role_dowhile {
    List<state_stmt>state_stmts=new ArrayList<state_stmt>();
    expr e=new expr ();
    String do1;
    String while1;

    public String getDo1() {
        return do1;
    }

    public void setDo1(String do1) {
        this.do1 = do1;
    }

    public String getWhile1() {
        return while1;
    }

    public void setWhile1(String while1) {
        this.while1 = while1;
    }

    public expr getE() {
        return e;
    }

    public void setE(expr e) {
        this.e = e;
    }

    public List<state_stmt> getState_stmts() {
        return state_stmts;
    }

    public void setState_stmts(List<state_stmt> state_stmts) {
        this.state_stmts = state_stmts;
    }
}
