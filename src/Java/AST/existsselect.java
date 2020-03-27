package Java.AST;

import Java.AST.QueryStmt.SelectStmt;

public class existsselect {
    boolean var1;
    boolean var2;
    SelectStmt selectStmt=new SelectStmt();

    public boolean isVar1() {
        return var1;
    }

    public void setVar1(boolean var1) {
        this.var1 = var1;
    }

    public boolean isVar2() {
        return var2;
    }

    public void setVar2(boolean var2) {
        this.var2 = var2;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }
}
