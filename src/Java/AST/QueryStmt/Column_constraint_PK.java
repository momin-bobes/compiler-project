package Java.AST.QueryStmt;

public class Column_constraint_PK {
    boolean ASC;
    boolean desc;
    boolean   AUTOINCREMENT;

    public boolean isAUTOINCREMENT() {
        return AUTOINCREMENT;
    }

    public void setAUTOINCREMENT(boolean AUTOINCREMENT) {
        this.AUTOINCREMENT = AUTOINCREMENT;
    }

    public boolean isASC() {
        return ASC;
    }

    public void setASC(boolean ASC) {
        this.ASC = ASC;
    }

    public boolean isDesc() {
        return desc;
    }

    public void setDesc(boolean desc) {
        this.desc = desc;
    }
}
