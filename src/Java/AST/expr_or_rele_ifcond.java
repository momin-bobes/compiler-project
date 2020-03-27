package Java.AST;

public class expr_or_rele_ifcond {
    expr e=new expr ();
    Java.AST.rele_ifcond rele_ifcond;

    public expr getE() {
        return e;
    }

    public void setE(expr e) {
        this.e = e;
    }

    public Java.AST.rele_ifcond getRele_ifcond() {
        return rele_ifcond;
    }

    public void setRele_ifcond(Java.AST.rele_ifcond rele_ifcond) {
        this.rele_ifcond = rele_ifcond;
    }
}
