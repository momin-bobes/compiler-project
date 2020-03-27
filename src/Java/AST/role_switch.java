package Java.AST;

import java.util.List;

public class role_switch extends Node{
    expr expe=new expr ();
    role_case role_case;
    List<expr> e;
    String def;
    String dot;
    boolean b;
    List<state_stmt>s;

    List <rele_case1> rele_case1;

    public List<state_stmt> getS() {
        return s;
    }

    public void setS(List<state_stmt> s) {
        this.s = s;
    }

    public List<Java.AST.rele_case1> getRele_case1() {
        return rele_case1;
    }

    public void setRele_case1(List<Java.AST.rele_case1> rele_case1) {
        this.rele_case1 = rele_case1;
    }

    public expr getExpe() {
        return expe;
    }

    public void setExpe(expr expe) {
        this.expe = expe;
    }

    public Java.AST.role_case getRole_case() {
        return role_case;
    }

    public void setRole_case(Java.AST.role_case role_case) {
        this.role_case = role_case;
    }

    public List<expr> getE() {
        return e;
    }

    public void setE(List<expr> e) {
        this.e = e;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
