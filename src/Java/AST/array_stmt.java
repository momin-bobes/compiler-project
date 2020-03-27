package Java.AST;

import Java.AST.QueryStmt.Select_Core;

import java.util.List;

public class array_stmt {
    Boolean K_VAR;
    String name_x;
    boolean ASSIGN;
    boolean expr1;
    boolean select_core1;
    boolean function_name2;
    boolean exprlist;
    List<Java.AST.expr> exprs ;
    Java.AST.expr expr ;
    Select_Core select_core ;
    Java.AST.function_name1 function_name1;
    String string="[";
    String string2="]";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public boolean isExpr1() {
        return expr1;
    }

    public void setExpr1(boolean expr1) {
        this.expr1 = expr1;
    }

    public boolean isSelect_core1() {
        return select_core1;
    }

    public void setSelect_core1(boolean select_core1) {
        this.select_core1 = select_core1;
    }

    public boolean isFunction_name2() {
        return function_name2;
    }

    public void setFunction_name2(boolean function_name2) {
        this.function_name2 = function_name2;
    }

    public boolean isExprlist() {
        return exprlist;
    }

    public void setExprlist(boolean exprlist) {
        this.exprlist = exprlist;
    }

    public Boolean getK_VAR() {
        return K_VAR;
    }

    public void setK_VAR(Boolean k_VAR) {
        K_VAR = k_VAR;
    }

    public String getName_x() {
        return name_x;
    }

    public void setName_x(String name_x) {
        this.name_x = name_x;
    }

    public boolean isASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(boolean ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public List<Java.AST.expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Java.AST.expr> exprs) {
        this.exprs = exprs;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Select_Core getSelect_core() {
        return select_core;
    }

    public void setSelect_core(Select_Core select_core) {
        this.select_core = select_core;
    }

    public Java.AST.function_name1 getFunction_name1() {
        return function_name1;
    }

    public void setFunction_name1(Java.AST.function_name1 function_name1) {
        this.function_name1 = function_name1;
    }
}
