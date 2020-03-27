package Java.AST;

import java.util.List;

public class list_var {
    String var;
    String name_x;
    String ASSIGN;
    Java.AST.expr expr;
    List<Java.AST.list_var> list_var;

    public void setName_x(String name_x) {
        this.name_x = name_x;
    }

    public List<Java.AST.list_var> getList_var() {
        return list_var;
    }

    public void setList_var(List<Java.AST.list_var> list_var) {
        this.list_var = list_var;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getName_x() {
        return name_x;
    }

    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }
}
