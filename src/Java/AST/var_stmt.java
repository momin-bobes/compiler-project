package Java.AST;

public class var_stmt extends  Node {
    String  K_VAR;
    String name_x;
    boolean ASSIGN ;
  Java.AST.json_stmt json_stmt;
  argument_stmt argument_stmt;
 Java.AST.higher_stmt higher_stmt ;
Java.AST.QueryStmt.Select_Core select_core ;
  Java.AST.expr expr = new expr ();
    boolean higher_stmt1;
    boolean argument_stmt1;
    boolean json_stmt1;
    boolean  Select_Core;
    boolean  expr1;

    public boolean isHigher_stmt1() {
        return higher_stmt1;
    }

    public void setHigher_stmt1(boolean higher_stmt1) {
        this.higher_stmt1 = higher_stmt1;
    }

    public boolean isArgument_stmt1() {
        return argument_stmt1;
    }

    public void setArgument_stmt1(boolean argument_stmt1) {
        this.argument_stmt1 = argument_stmt1;
    }

    public boolean isJson_stmt1() {
        return json_stmt1;
    }

    public void setJson_stmt1(boolean json_stmt1) {
        this.json_stmt1 = json_stmt1;
    }

    public boolean isSelect_Core() {
        return Select_Core;
    }

    public void setSelect_Core(boolean select_Core) {
        Select_Core = select_Core;
    }

    public boolean isExpr1() {
        return expr1;
    }

    public void setExpr1(boolean expr1) {
        this.expr1 = expr1;
    }

    public Java.AST.QueryStmt.Select_Core getSelect_core() {
        return select_core;
    }

    public void setSelect_core(Java.AST.QueryStmt.Select_Core select_core) {
        this.select_core = select_core;
    }

    public Java.AST.higher_stmt getHigher_stmt() {
        return higher_stmt;
    }

    public void setHigher_stmt(Java.AST.higher_stmt higher_stmt) {
        this.higher_stmt = higher_stmt;
    }

    public Java.AST.argument_stmt getArgument_stmt() {
        return argument_stmt;
    }

    public void setArgument_stmt(Java.AST.argument_stmt argument_stmt) {
        this.argument_stmt = argument_stmt;
    }

    public Java.AST.json_stmt getJson_stmt() {
        return json_stmt;
    }

    public void setJson_stmt(Java.AST.json_stmt json_stmt) {
        this.json_stmt = json_stmt;
    }

    public boolean isASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(boolean ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public String getK_VAR(String text) {
        return K_VAR;
    }

    public void setK_VAR(String k_VAR) {
        K_VAR = k_VAR;
    }

    public String getK_VAR() {
        return K_VAR;
    }


    public String getName_x() {
        return name_x;
    }

    public void setName_x(String name_x) {
        this.name_x = name_x;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }


}
