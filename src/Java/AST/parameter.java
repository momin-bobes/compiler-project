package Java.AST;

import Java.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class parameter extends  Node{
  String fun_name;
    Java.AST.varable varable;

    public Java.AST.varable getVarable() {
        return varable;
    }

    public void setVarable(Java.AST.varable varable) {
        this.varable = varable;
    }
    //  List<expr>expr;
//  List<String>s;

//    public List<String> getS() {
//        return s;
//    }
//
//    public void setS(List<String> s) {
//        this.s = s;
//    }

//    public List<Java.AST.expr> getExpr() {
//        return expr;
//    }
//
//    public void setExpr(List<Java.AST.expr> expr) {
//        this.expr = expr;
//    }

    public List<Java.AST.variable> getVariable() {
        return variable;
    }

    List<Java.AST.variable>   variable =new ArrayList<Java.AST.variable>();
    public void setFun_name (String fun_name){
        this.fun_name = fun_name;
    }
    public String getFun_name() {
        return fun_name;
    }

     public  void  setVariable(List<Java.AST.variable> variable){this.variable= variable;}
     public  List<Java.AST.variable> getVariable(List<Java.AST.variable> variables){return  variable;}
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
