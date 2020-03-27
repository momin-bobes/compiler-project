package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class role_for {
     Java.AST.oprint1 oprint1 = new oprint1();
      oprint2 oprint2 = new oprint2 () ;
       Java.AST.oprint3 oprint3 = new oprint3 ();
       List<Java.AST.state_stmt> state_stmt=new ArrayList<Java.AST.state_stmt>();

    public List<Java.AST.state_stmt> getState_stmt() {
        return state_stmt;
    }

    public void setState_stmt(List<Java.AST.state_stmt> state_stmt) {
        this.state_stmt = state_stmt;
    }

    public void setOprint1(Java.AST.oprint1 oprint1) {
        this.oprint1 = oprint1;
    }

    public Java.AST.oprint1 getOprint1() {
        return oprint1;
    }

    public void setOprint2(Java.AST.oprint2 oprint2) {
        this.oprint2 = oprint2;
    }

    public Java.AST.oprint2 getOprint2() {
        return oprint2;
    }

    public void setOprint3(Java.AST.oprint3 oprint3) {
        this.oprint3 = oprint3;
    }

    public Java.AST.oprint3 getOprint3() {
        return oprint3;
    }
}
