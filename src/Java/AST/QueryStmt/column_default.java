package Java.AST.QueryStmt;

import Java.AST.expr;

import java.util.ArrayList;

public class column_default {

    //exp
    String anyname;
    ArrayList<String> anynames;
    boolean K_NEXTVAL;
    Column_default_value column_default_value;
    String K_DEFAULT ;
    Java.AST.expr expr= new expr ();
    boolean TOWPOINT;

    public boolean isTOWPOINT() {
        return TOWPOINT;
    }

    public void setTOWPOINT(boolean TOWPOINT) {
        this.TOWPOINT = TOWPOINT;
    }

    public boolean isK_NEXTVAL() {
        return K_NEXTVAL;
    }

    boolean Kdef;

    public boolean isKdef() {
        return Kdef;
    }

    public void setKdef(boolean kdef) {
        Kdef = kdef;
    }

    public String getName() {
        return anyname;
    }

    public void setName(String name) {
        this.anyname = name;
    }

    public ArrayList<String> getAnynames() {
        return anynames;
    }

    public void setAnynames(ArrayList<String> anynames) {
        this.anynames = anynames;
    }

    public String getAnyname() {
        return anyname;
    }

    public void setAnyname(String anyname) {
        this.anyname = anyname;
    }

    public boolean getK_NEXTVAL() {
        return K_NEXTVAL;
    }

    public void setK_NEXTVAL(boolean k_NEXTVAL) {
        K_NEXTVAL = k_NEXTVAL;
    }

    public String getK_DEFAULT() {
        return K_DEFAULT;
    }

    public void setK_DEFAULT(String k_DEFAULT) {
        K_DEFAULT = k_DEFAULT;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Column_default_value getColumn_default_value() {
        return column_default_value;
    }

    public void setColumn_default_value(Column_default_value column_default_value) {
        this.column_default_value = column_default_value;
    }
}
