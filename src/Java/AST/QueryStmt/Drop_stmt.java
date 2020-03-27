package Java.AST.QueryStmt;

import Java.Visitor.ASTVisitor;

public class Drop_stmt extends Statement {
    private String Tablname;
    private String Databasename;
    private  boolean  K_EXISTS;
    private  boolean K_IF;

    public String getTablname() {
        return Tablname;
    }

    public void setTablname(String tablname) {
        Tablname = tablname;
    }

    public String getDatabasename() {
        return Databasename;
    }

    public void setDatabasename(String databasename) {
        Databasename = databasename;
    }

    public boolean isK_EXISTS() {
        return K_EXISTS;
    }

    public void setK_EXISTS(boolean k_EXISTS) {
        K_EXISTS = k_EXISTS;
    }

    public boolean isK_IF() {
        return K_IF;
    }

    public void setK_IF(boolean k_IF) {
        K_IF = k_IF;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
