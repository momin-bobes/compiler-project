package Java.AST.QueryStmt;

import Java.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Create_Stmt extends Statement {
    String Databasename;
    String Tablename;
    List<Table_constraint> table_constraints=new ArrayList<> ();
    List<Column_def>column_defs=new ArrayList<>();
    boolean AS;
    SelectStmt selectStmt;

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public boolean isAS() {
        return AS;
    }

    public void setAS(boolean AS) {
        this.AS = AS;
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


    public List<Table_constraint> getTable_constraints() {
        return table_constraints;
    }

    public void setTable_constraints(List<Table_constraint> table_constraints) {
        this.table_constraints = table_constraints;
    }

    public List<Column_def> getColumn_defs() {
        return column_defs;
    }

    public void setColumn_defs(List<Column_def> column_defs) {
        this.column_defs = column_defs;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
