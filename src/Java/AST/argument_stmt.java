package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class argument_stmt {

    String function_name;
    List<expr> exprs = new ArrayList<> (  );

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public List<expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<expr> exprs) {
        this.exprs = exprs;
    }
}
