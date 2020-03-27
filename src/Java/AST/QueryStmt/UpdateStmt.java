package Java.AST.QueryStmt;

import Java.AST.expr;
import Java.Visitor.ASTVisitor;

import java.util.ArrayList;

public class UpdateStmt extends  Statement {
    Java.AST.QueryStmt.qualified_table qualified_table;
    String Columnname;
    ArrayList<String> Columnnames;
    ArrayList<expr> exprs;
    //    private Expression where;


    public ArrayList<expr> getExprs() {
        return exprs;
    }

    public void setExprs(ArrayList<expr> exprs) {
        this.exprs = exprs;
    }

    public Java.AST.QueryStmt.qualified_table getQualified_table() {
        return qualified_table;
    }

    public void setQualified_table(Java.AST.QueryStmt.qualified_table qualified_table) {
        this.qualified_table = qualified_table;
    }

    public String getColumnname() {
        return Columnname;
    }

    public void setColumnname(String columnname) {
        Columnname = columnname;
    }

    public ArrayList<String> getColumnnames() {
        return Columnnames;
    }

    public void setColumnnames(ArrayList<String> columnnames) {
        Columnnames = columnnames;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
