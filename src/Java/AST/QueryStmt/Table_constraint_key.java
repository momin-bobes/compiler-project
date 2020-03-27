package Java.AST.QueryStmt;

import java.util.ArrayList;

public class Table_constraint_key {
    String name;
    ArrayList<Index_column> index_columns=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Index_column> getIndex_columns() {
        return index_columns;
    }

    public void setIndex_columns(ArrayList<Index_column> index_columns) {
        this.index_columns = index_columns;
    }
}
