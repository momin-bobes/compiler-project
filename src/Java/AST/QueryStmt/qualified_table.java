package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.Visitor.ASTVisitor;

public class qualified_table extends Node{
    private String Databasename;
    private String Tablename;
    private String Indexname;
    public void setDatabasename(String databasename) {this.Databasename = databasename;}
    public void setTablename(String tablename) {
        this.Tablename = tablename;
    }
    public void setIndexname(String indexname) {
        this.Indexname = indexname;
    }
    public String getDatabasename() {
        return Databasename;
    }
    public String getTablename() {
        return Tablename;
    }
    public String getIndexname() {
        return Indexname;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
