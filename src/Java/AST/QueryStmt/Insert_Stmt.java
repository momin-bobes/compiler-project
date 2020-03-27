package Java.AST.QueryStmt;

import Java.AST.expr;
import Java.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Insert_Stmt extends  Statement {
    private String Databasename;
    private String Tablename;
    private boolean COMMA;
    private boolean K_DEFAULT;
    private boolean K_VALUES;
    ArrayList<String> Colomname=new ArrayList<>();
    ArrayList<expr>  exps=new ArrayList<>();

    public ArrayList<String> getColomname() {
        return Colomname;
    }

    public void setColomname(ArrayList<String> colomname) {
        Colomname = colomname;
    }

    public ArrayList<expr> getExps() {
        return exps;
    }

    public void setExps(ArrayList<expr> exps) {
        this.exps = exps;
    }

    public boolean isK_DEFAULT() {
        return K_DEFAULT;
    }

    public void setK_DEFAULT(boolean k_DEFAULT) {
        K_DEFAULT = k_DEFAULT;
    }

    public boolean isK_VALUES() {
        return K_VALUES;
    }

    public void setK_VALUES(boolean k_VALUES) {
        K_VALUES = k_VALUES;
    }

    public boolean isCOMMA() {
        return COMMA;
    }

    public void setCOMMA(boolean COMMA) {
        this.COMMA = COMMA;
    }

    public String getDatabasename() {
        return Databasename;
    }

    public void setDatabasename(String databasename) {
        Databasename = databasename;
    }

    public String getTablename() {
        return Tablename;
    }

    public void setTablename(String tablename) {
        Tablename = tablename;
    }



    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    //exp arraylist
    SelectStmt selectStmt;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
