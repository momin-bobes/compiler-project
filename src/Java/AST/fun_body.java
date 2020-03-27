package Java.AST;

import Java.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class fun_body extends Node {
 List<Java.AST.state_stmt> state_stmt = new ArrayList<Java.AST.state_stmt>();


    public List<Java.AST.state_stmt> getState_stmt() {
        return state_stmt;
    }

    public void setState_stmt(List<Java.AST.state_stmt> state_stmt) {
        this.state_stmt = state_stmt;
    }
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        for(int i = 0 ; i < this.state_stmt.size() ; i++){
            this.state_stmt.get(i).accept(astVisitor);
        }
    }
}
