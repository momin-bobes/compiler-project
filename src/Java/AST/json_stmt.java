package Java.AST;

public class json_stmt {
     object1 object = new object1();
    boolean  array1;
    boolean  pair_T1;
    boolean  object2;

    public boolean isArray1() {
        return array1;
    }

    public void setArray1(boolean array1) {
        this.array1 = array1;
    }

    public boolean isPair_T1() {
        return pair_T1;
    }

    public void setPair_T1(boolean pair_T1) {
        this.pair_T1 = pair_T1;
    }

    public boolean isObject2() {
        return object2;
    }

    public void setObject2(boolean object2) {
        this.object2 = object2;
    }

    public object1 getObject() {
        return object;
    }

    public void setObject(object1 object) {
        this.object = object;
    }

    public Java.AST.array getArray() {
        return array;
    }

    public void setArray(Java.AST.array array) {
        this.array = array;
    }

    public pair_T getPair_t() {
        return pair_t;
    }

    public void setPair_t(pair_T pair_t) {
        this.pair_t = pair_t;
    }

    array array= new array ();
     pair_T pair_t = new pair_T ();
}
