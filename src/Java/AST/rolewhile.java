package Java.AST;

import Java.Visitor.ASTVisitor;

import java.util.List;

public class rolewhile extends Node {
    expr expe;
    List<state_stmt> s;

    public expr getExpe() {
        return expe;
    }

    public void setExpe(expr expe) {
        this.expe = expe;
    }

    public List<state_stmt> getS() {
        return s;
    }

    public void setS(List<state_stmt> s) {
        this.s = s;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
