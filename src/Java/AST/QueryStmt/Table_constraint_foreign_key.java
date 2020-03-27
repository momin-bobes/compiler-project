package Java.AST.QueryStmt;

import java.util.ArrayList;

public class Table_constraint_foreign_key {
    ArrayList<String> fk_origin_column_names=new ArrayList<>();
    Java.AST.QueryStmt.foreign_key_clause foreign_key_clause;

    public ArrayList<String> getFk_origin_column_names() {
        return fk_origin_column_names;
    }

    public void setFk_origin_column_names(ArrayList<String> fk_origin_column_names) {
        this.fk_origin_column_names = fk_origin_column_names;
    }

    public Java.AST.QueryStmt.foreign_key_clause getForeign_key_clause() {
        return foreign_key_clause;
    }

    public void setForeign_key_clause(Java.AST.QueryStmt.foreign_key_clause foreign_key_clause) {
        this.foreign_key_clause = foreign_key_clause;
    }
}
