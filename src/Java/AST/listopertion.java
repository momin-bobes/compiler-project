package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class listopertion {

    expr exprleft =new expr ();

   List<Java.AST.op> op=new ArrayList<>();

    public List<Java.AST.op> getOp() {
        return op;
    }

    public void setOp(List<Java.AST.op> op) {
        this.op = op;
    }

    public expr getExprleft() {
        return exprleft;
    }

    public void setExprleft(expr exprleft) {
        this.exprleft = exprleft;
    }
}
