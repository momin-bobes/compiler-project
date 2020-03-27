package Java.AST.QueryStmt;

import Java.AST.expr;
import Java.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Factored_select_Stmt extends Statement {
    private Select_Core select_core;
    private ArrayList<Ordering_term>ordering_terms;
    private boolean K_OFFSET;
    private boolean K_LIMIT;
    private boolean DOT;
    private expr OFFSET;
    private expr LIMIT;

    public expr getOFFSET() {
        return OFFSET;
    }

    public void setOFFSET(expr OFFSET) {
        this.OFFSET = OFFSET;
    }

    public expr getLIMIT() {
        return LIMIT;
    }

    public void setLIMIT(expr LIMIT) {
        this.LIMIT = LIMIT;
    }

    public boolean isDOT() {
        return DOT;
    }

    public void setDOT(boolean DOT) {
        this.DOT = DOT;
    }

    public Select_Core getSelect_core() {
        return select_core;
    }

    public void setSelect_core(Select_Core select_core) {
        this.select_core = select_core;
    }

    public ArrayList<Ordering_term> getOrdering_terms() {
        return ordering_terms;
    }

    public void setOrdering_terms(ArrayList<Ordering_term> ordering_terms) {
        this.ordering_terms = ordering_terms;
    }

    public boolean isK_OFFSET() {
        return K_OFFSET;
    }

    public void setK_OFFSET(boolean k_OFFSET) {
        K_OFFSET = k_OFFSET;
    }

    public boolean isK_LIMIT() {
        return K_LIMIT;
    }

    public void setK_LIMIT(boolean k_LIMIT) {
        K_LIMIT = k_LIMIT;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
