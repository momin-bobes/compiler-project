package Java.AST.QueryStmt;

import Java.AST.expr;
import Java.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SelectStmt extends Statement {

//    private Distinct distinct;
//    private List<SelectItem> selectItems;
//    private List<Table> intoTables;
    private String fromItem;
    select_or_values select_or_values = new select_or_values ();
     String K_ORDER ;
      String K_BY;
      boolean K_LIMIT;
      expr limit;
      expr expr1= new expr ();
      expr expr2;
      boolean K_OFFSET;
      expr offer;

      List<Ordering_term> ordering_terms = new ArrayList<Ordering_term> ();

    public expr getOffer() {
        return offer;
    }

    public void setOffer(expr offer) {
        this.offer = offer;
    }

    public expr getLimit() {
        return limit;
    }

    public void setLimit(expr limit) {
        this.limit = limit;
    }

    public Java.AST.QueryStmt.select_or_values getSelect_or_values() {
        return select_or_values;
    }

    public void setSelect_or_values(Java.AST.QueryStmt.select_or_values select_or_values) {
        this.select_or_values = select_or_values;
    }

    public String getK_ORDER() {
        return K_ORDER;
    }

    public void setK_ORDER(String k_ORDER) {
        K_ORDER = k_ORDER;
    }

    public String getK_BY() {
        return K_BY;
    }

    public void setK_BY(String k_BY) {
        K_BY = k_BY;
    }

    public boolean isK_LIMIT() {
        return K_LIMIT;
    }

    public void setK_LIMIT(boolean k_LIMIT) {
        K_LIMIT = k_LIMIT;
    }

    public expr getExpr1() {
        return expr1;
    }

    public void setExpr1(expr expr1) {
        this.expr1 = expr1;
    }

    public expr getExpr2() {
        return expr2;
    }

    public void setExpr2(expr expr2) {
        this.expr2 = expr2;
    }

    public boolean isK_OFFSET() {
        return K_OFFSET;
    }

    public void setK_OFFSET(boolean k_OFFSET) {
        K_OFFSET = k_OFFSET;
    }

    public List<Ordering_term> getOrdering_terms() {
        return ordering_terms;
    }

    public void setOrdering_terms(List<Ordering_term> ordering_terms) {
        this.ordering_terms = ordering_terms;
    }

    //    private List<Join> joins;
//    private Expression where;
//    private GroupByElement groupBy;
//    private List<OrderByElement> orderByElements;
//    private Expression having;
//    private Limit limit;
//    private Offset offset;

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }

    public String getFromItem() {
        return fromItem;
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
