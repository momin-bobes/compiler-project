package Java.AST;

public class value {
     Java.AST.expr expr;
     Java.AST.array array ;
     object1 object ;
    boolean exp1;
    boolean array1;
    boolean object2;

    public boolean isArray1() {
        return array1;
    }

    public void setArray1(boolean array1) {
        this.array1 = array1;
    }

    public boolean isObject2() {
        return object2;
    }

    public void setObject2(boolean object2) {
        this.object2 = object2;
    }

    public boolean isExp1() {
        return exp1;
    }

    public void setExp1(boolean exp1) {
        this.exp1 = exp1;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Java.AST.array getArray() {
        return array;
    }

    public void setArray(Java.AST.array array) {
        this.array = array;
    }

    public object1 getObject() {
        return object;
    }

    public void setObject(object1 object) {
        this.object = object;
    }
}
