package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class function_name1 {
    String name;
    List<expr> exprs =new ArrayList <expr>();
    boolean star;
     boolean K_DISTINCT;

    public boolean isK_DISTINCT() {
        return K_DISTINCT;
    }

    public void setK_DISTINCT(boolean k_DISTINCT) {
        K_DISTINCT = k_DISTINCT;
    }

    public boolean getStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public List<expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<expr> exprs) {
        this.exprs = exprs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
