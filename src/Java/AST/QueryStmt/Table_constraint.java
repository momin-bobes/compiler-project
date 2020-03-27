package Java.AST.QueryStmt;

public class Table_constraint {
    private String Name;
    private Table_constraint_PK table_constraint_pk;
    private Table_constraint_key table_constraint_key;
    private Table_constraint_unique table_constraint_unique;
    private boolean K_CONSTRAINT;
    //exp for check
    private boolean check;
    Java.AST.expr expr;

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public boolean isK_CONSTRAINT() {
        return K_CONSTRAINT;
    }

    public void setK_CONSTRAINT(boolean k_CONSTRAINT) {
        K_CONSTRAINT = k_CONSTRAINT;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    Table_constraint_foreign_key table_constraint_foreign_key;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Table_constraint_PK getTable_constraint_pk() {
        return table_constraint_pk;
    }

    public void setTable_constraint_pk(Table_constraint_PK table_constraint_pk) {
        this.table_constraint_pk = table_constraint_pk;
    }

    public Table_constraint_key getTable_constraint_key() {
        return table_constraint_key;
    }

    public void setTable_constraint_key(Table_constraint_key table_constraint_key) {
        this.table_constraint_key = table_constraint_key;
    }

    public Table_constraint_unique getTable_constraint_unique() {
        return table_constraint_unique;
    }

    public void setTable_constraint_unique(Table_constraint_unique table_constraint_unique) {
        this.table_constraint_unique = table_constraint_unique;
    }

    public Table_constraint_foreign_key getTable_constraint_foreign_key() {
        return table_constraint_foreign_key;
    }

    public void setTable_constraint_foreign_key(Table_constraint_foreign_key table_constraint_foreign_key) {
        this.table_constraint_foreign_key = table_constraint_foreign_key;
    }
}
