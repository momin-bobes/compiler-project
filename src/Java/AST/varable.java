package Java.AST;

import Java.Visitor.ASTVisitor;

import java.util.List;

public class varable extends Node {
    String var;
    String name_x;
    String ASSIGN;
    expr expr=new expr();
    List<list_var> list_var;


    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getName_x() {
        return name_x;
    }

    public void setName_x(String name_x) {
        this.name_x = name_x;
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

    public List<Java.AST.list_var> getList_var() {
        return list_var;
    }

    public void setList_var(List<Java.AST.list_var> list_var) {
        this.list_var = list_var;
    }

    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
//        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
//            this.sqlStmts.get(i).accept(astVisitor);
//        }   for(int i = 0 ; i < this.functions.size() ; i++){
//            this.functions.get(i).accept(astVisitor);
//        }
    }
}
