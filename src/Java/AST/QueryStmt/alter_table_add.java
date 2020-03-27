package Java.AST.QueryStmt;

public class alter_table_add {
     String add;
    Table_constraint table_constraint ;

    public void setAdd(String add) {
        this.add = add;
    }
  public String getAdd(){return  add;}

    public Table_constraint getTable_constraint() {
        return table_constraint;
    }

    public void setTable_constraint(Table_constraint table_constraint) {
        this.table_constraint = table_constraint;
    }
}
