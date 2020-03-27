package Java.AST;

public class higher_stmt {
    String function_name;
    String arry_name ;
    boolean K_FUNCTION;
    higher_stmt1 higherStmt1s= new higher_stmt1 (  );
    fun_body fun_body = new fun_body ();

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public String getArry_name() {
        return arry_name;
    }

    public void setArry_name(String arry_name) {
        this.arry_name = arry_name;
    }

    public boolean isK_FUNCTION() {
        return K_FUNCTION;
    }

    public void setK_FUNCTION(boolean k_FUNCTION) {
        K_FUNCTION = k_FUNCTION;
    }

    public higher_stmt1 getHigherStmt1s() {
        return higherStmt1s;
    }

    public void setHigherStmt1s(higher_stmt1 higherStmt1s) {
        this.higherStmt1s = higherStmt1s;
    }

    public Java.AST.fun_body getFun_body() {
        return fun_body;
    }

    public void setFun_body(Java.AST.fun_body fun_body) {
        this.fun_body = fun_body;
    }
}
