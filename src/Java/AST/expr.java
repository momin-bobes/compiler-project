package Java.AST;

import Java.Visitor.ASTVisitor;

import java.util.List;

public class expr  extends  Node{
    private String literlvalue;
    protected String liter2;
    private String identy;
    private Java.AST.existsselect existsselect;
    private String operator;
    private unary_operator1 unary_operator;
    private opexp o;
    private String MINUS_MINUS;
    private String plus_plus;
    private Java.AST.exprselect exprselect;
    private function_name1 f;
    private database_name1 d;
    private kword kword;

//    public Java.AST.opexp getOpexp() {
//        return opexp;
//    }
//
//    public void setOpexp(Java.AST.opexp opexp) {
//        this.opexp = opexp;
//    }
//
//    opexp opexp;

    listopertion listopertion;
   expr exprleft;
    expr expright;
    List<op> opj;

    public expr() {
    }

    public expr getExprleft() {
        return exprleft;
    }

    public void setExprleft(expr exprleft) {
        this.exprleft = exprleft;
    }

    public Java.AST.listopertion getListopertion() {
        return listopertion;
    }

    public void setListopertion(Java.AST.listopertion listopertion) {
        this.listopertion = listopertion;
    }


    public expr getExpright() {
        return expright;
    }

    public void setExpright(expr expright) {
        this.expright = expright;
    }

    public List<op> getOpj() {
        return opj;
    }

    public void setOpj(List<op> opj) {
        this.opj = opj;
    }

    public String getLiter2() {
        return liter2;
    }

    public void setLiter2(String liter2) {
        this.liter2 = liter2;
    }

    public Java.AST.kword getKword() {
        return kword;
    }

    public void setKword(Java.AST.kword kword) {
        this.kword = kword;
    }

    public database_name1 getD() {
        return d;
    }

    public void setD(database_name1 d) {
        this.d = d;
    }

    public function_name1 getF() {
        return f;
    }

    public void setF(function_name1 f) {
        this.f = f;
    }

    public String getLiterlvalue() {
        return literlvalue;
    }

    public String getIdenty() {
        return identy;
    }

    public void setIdenty(String identy) {
        this.identy = identy;
    }

    public void setLiterlvalue(String literlvalue) {
        this.literlvalue = literlvalue;
    }

    public Java.AST.exprselect getExprselect() {
        return exprselect;
    }

    public void setExprselect(Java.AST.exprselect exprselect) {
        this.exprselect = exprselect;
    }

    public String getPlus_plus() {
        return plus_plus;
    }

    public void setPlus_plus(String plus_plus) {
        this.plus_plus = plus_plus;
    }

    public String getMINUS_MINUS() {
        return MINUS_MINUS;
    }

    public void setMINUS_MINUS(String MINUS_MINUS) {
        this.MINUS_MINUS = MINUS_MINUS;
    }

    public opexp getO() {
        return o;
    }

    public void setO(opexp o) {
        this.o = o;
    }

    public unary_operator1 getUnary_operator() {
        return unary_operator;
    }

    public void setUnary_operator(unary_operator1 unary_operator) {
        this.unary_operator = unary_operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Java.AST.existsselect getExistsselect() {
        return existsselect;
    }

    public void setExistsselect(Java.AST.existsselect existsselect) {
        this.existsselect = existsselect;
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//
    }
}
