package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Join_Clause extends Node{
    ArrayList<Table_Or_Subquery> table_or_subquery;
    ArrayList<Join_Constraint>join_constraints;
    ArrayList<Join_Operator>join_operators;

    public ArrayList<Table_Or_Subquery> getTable_or_subquery() {
        return table_or_subquery;
    }

    public void setTable_or_subquery(ArrayList<Table_Or_Subquery> table_or_subquery) {
        this.table_or_subquery = table_or_subquery;
    }

    public ArrayList<Join_Constraint> getJoin_constraints() {
        return join_constraints;
    }

    public void setJoin_constraints(ArrayList<Join_Constraint> join_constraints) {
        this.join_constraints = join_constraints;
    }

    public ArrayList<Join_Operator> getJoin_operators() {
        return join_operators;
    }

    public void setJoin_operators(ArrayList<Join_Operator> join_operators) {
        this.join_operators = join_operators;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
