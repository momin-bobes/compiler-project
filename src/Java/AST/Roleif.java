package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class Roleif extends Node {
    Java.AST.expr expr;
    ArrayList<expr> ex1 ;
    ArrayList <state_stmt> state_stmt;
    ArrayList <else_stmt> else_state_stmt;
    boolean else1;
    String else2;

    public ArrayList<else_stmt> getElse_state_stmt() {
        return else_state_stmt;
    }

    public void setElse_state_stmt(ArrayList<else_stmt> else_state_stmt) {
        this.else_state_stmt = else_state_stmt;
    }

    public boolean isElse1() {
        return else1;
    }

    public String getElse2() {
        return else2;
    }

    public void setElse2(String else2) {
        this.else2 = else2;
    }

    public boolean getElse1() {
        return else1;
    }

    public void setElse1(boolean else1) {
        this.else1 = else1;
    }

    public ArrayList<Java.AST.expr> getEx1() {
        return ex1;
    }

    public void setEx1(ArrayList<Java.AST.expr> ex1) {
        this.ex1 = ex1;
    }

    public ArrayList<Java.AST.state_stmt> getState_stmt() {
        return state_stmt;
    }

    public void setState_stmt(ArrayList<Java.AST.state_stmt> state_stmt) {
        this.state_stmt = state_stmt;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }
}
