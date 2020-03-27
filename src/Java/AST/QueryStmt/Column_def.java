package Java.AST.QueryStmt;

import java.util.ArrayList;

public class Column_def {
    String Columnname;
    ArrayList<Typename> typenames;
    ArrayList<Column_constraint> column_constraints ;

    public String getColumnname() {
        return Columnname;
    }

    public void setColumnname(String columnname) {
        Columnname = columnname;
    }

    public ArrayList<Typename> getTypenames() {
        return typenames;
    }

    public void setTypenames(ArrayList<Typename> typenames) {
        this.typenames = typenames;
    }

    public ArrayList<Column_constraint> getColumn_constraints() {
        return column_constraints;
    }

    public void setColumn_constraints(ArrayList<Column_constraint> column_constraints) {
        this.column_constraints = column_constraints;
    }
}
