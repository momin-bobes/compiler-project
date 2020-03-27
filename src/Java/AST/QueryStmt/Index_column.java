package Java.AST.QueryStmt;

public class Index_column {
    String columnname;
    String collation_name;
    boolean K_COLLATE;
    boolean Asc;
    boolean Desc;

    public boolean isK_COLLATE() {
        return K_COLLATE;
    }

    public void setK_COLLATE(boolean k_COLLATE) {
        K_COLLATE = k_COLLATE;
    }

    public boolean isAsc() {
        return Asc;
    }

    public void setAsc(boolean asc) {
        Asc = asc;
    }

    public boolean isDesc() {
        return Desc;
    }

    public void setDesc(boolean desc) {
        Desc = desc;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name;
    }
}
