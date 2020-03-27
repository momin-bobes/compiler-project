package Java.AST.QueryStmt;

import Java.AST.expr;

public class Column_constraint {
    private String Name;
    private Column_constraint_PK column_constraint_pk;
    private boolean column_constraint_not_null;
    private boolean column_constraint_null;
    private Column_constraint_FK column_constraint_fk;
    private Java.AST.QueryStmt.column_default column_default;
    private String collation_name;
    boolean constrant;
    boolean ischeck;
    expr check;

    public expr getCheck() {
        return check;
    }

    public void setCheck(expr check) {
        this.check = check;
    }

    public boolean isIscheck() {
        return ischeck;
    }

    public void setIscheck(boolean ischeck) {
        this.ischeck = ischeck;
    }

    public boolean isConstrant() {
        return constrant;
    }

    public void setConstrant(boolean constrant) {
        this.constrant = constrant;
    }

    public Column_constraint_PK getColumn_constraint_pk() {
        return column_constraint_pk;
    }

    public void setColumn_constraint_pk(Column_constraint_PK column_constraint_pk) {
        this.column_constraint_pk = column_constraint_pk;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isColumn_constraint_not_null() {
        return column_constraint_not_null;
    }

    public void setColumn_constraint_not_null(boolean column_constraint_not_null) {
        this.column_constraint_not_null = column_constraint_not_null;
    }

    public boolean isColumn_constraint_null() {
        return column_constraint_null;
    }

    public void setColumn_constraint_null(boolean column_constraint_null) {
        this.column_constraint_null = column_constraint_null;
    }

    public Column_constraint_FK getColumn_constraint_fk() {
        return column_constraint_fk;
    }

    public void setColumn_constraint_fk(Column_constraint_FK column_constraint_fk) {
        this.column_constraint_fk = column_constraint_fk;
    }

    public Java.AST.QueryStmt.column_default getColumn_default() {
        return column_default;
    }

    public void setColumn_default(Java.AST.QueryStmt.column_default column_default) {
        this.column_default = column_default;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name;
    }
}
