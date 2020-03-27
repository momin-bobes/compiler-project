package Java.AST;

import Java.Visitor.ASTVisitor;

public class FunctionDeclaration extends Node {

    private Java.AST.parameter parameter=new parameter ();
    fun_body fun_body=new fun_body();
    public void setParameter(Java.AST.parameter p){
        this.parameter = p;
    }

    public void setFun_body(fun_body f){
        this.fun_body = f;
    }
    public Java.AST.parameter getParameter() {
        return parameter;
    }
    public fun_body getFun_body() {
        return fun_body;
    }
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

        this.fun_body.accept(astVisitor);
//        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
//            this.sqlStmts.get(i).accept(astVisitor);
//        }   for(int i = 0 ; i < this.functions.size() ; i++){
//            this.functions.get(i).accept(astVisitor);
//        }
    }
}
