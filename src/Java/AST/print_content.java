package Java.AST;

import java.util.List;

public class print_content {
    expr e1=new expr ();
    List<expr>exprs;
    boolean json;
    Java.AST.json_call json_call;
    List<String> opjs;
    List<String>s;
    List <Java.AST.ex_list> ex_list;

    public expr getE1() {
        return e1;
    }

    public void setE1(expr e1) {
        this.e1 = e1;
    }

    public Java.AST.json_call getJson_call() {
        return json_call;
    }

    public void setJson_call(Java.AST.json_call json_call) {
        this.json_call = json_call;
    }

    public boolean isJson() {
        return json;
    }

    public void setJson(boolean json) {
        this.json = json;
    }

    public List<expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<expr> exprs) {
        this.exprs = exprs;
    }

    public List<Java.AST.ex_list> getEx_list() {
        return ex_list;
    }

    public void setEx_list(List<Java.AST.ex_list> ex_list) {
        this.ex_list = ex_list;
    }

    public List<String> getOpjs() {
        return opjs;
    }

    public void setOpjs(List<String> opjs) {
        this.opjs = opjs;
    }

    public List<String> getS() {
        return s;
    }

    public void setS(List<String> s) {
        this.s = s;
    }

}
