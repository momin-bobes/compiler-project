package Java.AST;

import Java.Visitor.ASTVisitor;

public class variable extends  Node{
    String varible;

    public void setvarible(String varible) {
        this.varible = varible;
    }

    public String getvarible() {
        return varible;
    }
    @Override
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