package Java.AST.QueryStmt;

import Java.AST.expr;
import Java.Visitor.ASTVisitor;

public class DeleteStmt  extends Statement {
    qualified_table qualified_table=new qualified_table();
    boolean K_WHERE;
    Java.AST.expr expr= new expr ();

    public boolean getK_WHERE() {
        return K_WHERE;
    }

    public void setK_WHERE(boolean k_WHERE) {
        K_WHERE = k_WHERE;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Java.AST.QueryStmt.qualified_table getQualified_table() {
        return qualified_table;
    }

    public void setQualified_table(Java.AST.QueryStmt.qualified_table qualified_table) {
        this.qualified_table = qualified_table;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
