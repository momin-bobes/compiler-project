package Java.AST.QueryStmt;

import java.util.ArrayList;
import java.util.List;

public class Table_constraint_unique {
    String name;
    List<Index_column> index_columns = new ArrayList<> ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Index_column> getIndex_columns() {
        return index_columns;
    }

    public void setIndex_columns(List<Index_column> index_columns) {
        this.index_columns = index_columns;
    }
}
