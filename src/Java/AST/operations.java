package Java.AST;

public class operations {
  String opreation;
  expr exprleft =new expr ();
    public String getOpreation() {
        return opreation;
    }

    public void setOpreation(String opreation) {
        this.opreation = opreation;
    }

    public expr getExprleft() {
        return exprleft;
    }

    public void setExprleft(expr exprleft) {
        this.exprleft = exprleft;
    }
}
