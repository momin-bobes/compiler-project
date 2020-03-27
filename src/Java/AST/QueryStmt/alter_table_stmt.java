package Java.AST.QueryStmt;

import Java.Visitor.ASTVisitor;

public class alter_table_stmt extends Statement {
    String source_name ;
    String databease_name;
    String rename;
    String to;
    String new_table_name;
    Column_def columDef ;
    Typename typeName ;
    boolean column;

     alter_table_add alter_table_add;
     Java.AST.QueryStmt.alter_table_add_costraint alter_table_add_costraint ;

    public boolean isColumn() {
        return column;
    }

    public void setColumn(boolean column) {
        this.column = column;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getDatabease_name() {
        return databease_name;
    }

    public void setDatabease_name(String databease_name) {
        this.databease_name = databease_name;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getNew_table_name() {
        return new_table_name;
    }

    public void setNew_table_name(String new_table_name) {
        this.new_table_name = new_table_name;
    }

    public Column_def getColumDef() {
        return columDef;
    }

    public void setColumDef(Column_def columDef) {
        this.columDef = columDef;
    }

    public Typename getTypeName() {
        return typeName;
    }

    public void setTypeName(Typename typeName) {
        this.typeName = typeName;
    }

    public Java.AST.QueryStmt.alter_table_add getAlter_table_add() {
        return alter_table_add;
    }

    public void setAlter_table_add(Java.AST.QueryStmt.alter_table_add alter_table_add) {
        this.alter_table_add = alter_table_add;
    }

    public Java.AST.QueryStmt.alter_table_add_costraint getAlter_table_add_costraint() {
        return alter_table_add_costraint;
    }

    public void setAlter_table_add_costraint(Java.AST.QueryStmt.alter_table_add_costraint alter_table_add_costraint) {
        this.alter_table_add_costraint = alter_table_add_costraint;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
