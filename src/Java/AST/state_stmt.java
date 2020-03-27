package Java.AST;

import Java.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class state_stmt extends  Node{
    private role_for role_for ;
    private Roleif roleif;
    private rolewhile rolewhile;
    private Java.AST.expr expr;
  private Java.AST.role_switch role_switch;
private role_dowhile role_dowhile;
private Java.AST.role_forach role_forach;
    private Java.AST.rele_onecond rele_onecond;
    private rele_ifcond rele_ifcond;
   private ArrayList <Java.AST.print_content> print_content;
    private Java.AST.role_re_con role_re_con;
  private Java.AST.json_call json_call;
private Java.AST.var_stmt var_stmt;
 private Java.AST.array_stmt array_stmt;

    public Java.AST.array_stmt getArray_stmt() {
        return array_stmt;
    }

    public void setArray_stmt(Java.AST.array_stmt array_stmt) {
        this.array_stmt = array_stmt;
    }

    public Java.AST.var_stmt getVar_stmt() {
        return var_stmt;
    }

    public void setVar_stmt(Java.AST.var_stmt var_stmt) {
        this.var_stmt = var_stmt;
    }

    public Java.AST.json_call getJson_call() {
        return json_call;
    }

    public void setJson_call(Java.AST.json_call json_call) {
        this.json_call = json_call;
    }

    public Java.AST.role_re_con getRole_re_con() {
        return role_re_con;
    }

    public void setRole_re_con(Java.AST.role_re_con role_re_con) {
        this.role_re_con = role_re_con;
    }

    String s;
    boolean for_1;
    boolean if_1;
    boolean while_1;
    boolean  switch_1;
    boolean do_while_1;
    boolean forach_1;
    boolean rele_onco_1;
    boolean print_1;
    boolean ro_re_con;
    boolean jsoncal_1;
    boolean  array_stmt_1;
    boolean exp_1;
    boolean var_1;


    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public ArrayList<Java.AST.print_content> getPrint_content() {
        return print_content;
    }

    public void setPrint_content(ArrayList<Java.AST.print_content> print_content) {
        this.print_content = print_content;
    }

    public Java.AST.rele_ifcond getRele_ifcond() {
        return rele_ifcond;
    }

    public void setRele_ifcond(Java.AST.rele_ifcond rele_ifcond) {
        this.rele_ifcond = rele_ifcond;
    }

    public Java.AST.rele_onecond getRele_onecond() {
        return rele_onecond;
    }

    public void setRele_onecond(Java.AST.rele_onecond rele_onecond) {
        this.rele_onecond = rele_onecond;
    }

    public Java.AST.role_forach getRole_forach() {
        return role_forach;
    }

    public void setRole_forach(Java.AST.role_forach role_forach) {
        this.role_forach = role_forach;
    }

    public Java.AST.role_dowhile getRole_dowhile() {
        return role_dowhile;
    }

    public void setRole_dowhile(Java.AST.role_dowhile role_dowhile) {
        this.role_dowhile = role_dowhile;
    }

    public Java.AST.role_switch getRole_switch() {
        return role_switch;
    }

    public void setRole_switch(Java.AST.role_switch role_switch) {
        this.role_switch = role_switch;
    }

    public Java.AST.expr getExpr() {
        return expr;
    }

    public void setExpr(Java.AST.expr expr) {
        this.expr = expr;
    }

    public Java.AST.rolewhile getRolewhile() {
        return rolewhile;
    }

    public void setRolewhile(Java.AST.rolewhile rolewhile) {
        this.rolewhile = rolewhile;
    }

    public Roleif getRoleif() {
        return roleif;
    }

    public void setRoleif(Roleif roleif) {
        this.roleif = roleif;
    }

    public role_for getRole_for() {
        return role_for;
    }

    public void setRole_for(role_for role_for) {
        this.role_for = role_for;
    }

    public boolean isFor_1() {
        return for_1;
    }

    public void setFor_1(boolean for_1) {
        this.for_1 = for_1;
    }

    public boolean isIf_1() {
        return if_1;
    }

    public void setIf_1(boolean if_1) {
        this.if_1 = if_1;
    }

    public boolean isWhile_1() {
        return while_1;
    }

    public void setWhile_1(boolean while_1) {
        this.while_1 = while_1;
    }

    public boolean isSwitch_1() {
        return switch_1;
    }

    public void setSwitch_1(boolean switch_1) {
        this.switch_1 = switch_1;
    }

    public boolean isDo_while_1() {
        return do_while_1;
    }

    public void setDo_while_1(boolean do_while_1) {
        this.do_while_1 = do_while_1;
    }

    public boolean isForach_1() {
        return forach_1;
    }

    public void setForach_1(boolean forach_1) {
        this.forach_1 = forach_1;
    }

    public boolean isRele_onco_1() {
        return rele_onco_1;
    }

    public void setRele_onco_1(boolean rele_onco_1) {
        this.rele_onco_1 = rele_onco_1;
    }

    public boolean isPrint_1() {
        return print_1;
    }

    public void setPrint_1(boolean print_1) {
        this.print_1 = print_1;
    }

    public boolean isRo_re_con() {
        return ro_re_con;
    }

    public void setRo_re_con(boolean ro_re_con) {
        this.ro_re_con = ro_re_con;
    }

    public boolean isJsoncal_1() {
        return jsoncal_1;
    }

    public void setJsoncal_1(boolean jsoncal_1) {
        this.jsoncal_1 = jsoncal_1;
    }

    public boolean isArray_stmt_1() {
        return array_stmt_1;
    }

    public void setArray_stmt_1(boolean array_stmt_1) {
        this.array_stmt_1 = array_stmt_1;
    }

    public boolean isExp_1() {
        return exp_1;
    }

    public void setExp_1(boolean exp_1) {
        this.exp_1 = exp_1;
    }

    public boolean isVar_1() {
        return var_1;
    }

    public void setVar_1(boolean var_1) {
        this.var_1 = var_1;
    }

    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
//        for(int i = 0 ; i < this.state_stmt.size() ; i++){
//            this.state_stmt.get(i).accept(astVisitor);
//        }
    }
}
