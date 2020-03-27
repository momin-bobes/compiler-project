package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class role_case {
    List<Java.AST.state_stmt> state_stmt=new ArrayList<Java.AST.state_stmt>();

    public List<Java.AST.state_stmt> getState_stmt() {
        return state_stmt;
    }

    public void setState_stmt(List<Java.AST.state_stmt> state_stmt) {
        this.state_stmt = state_stmt;
    }
}
