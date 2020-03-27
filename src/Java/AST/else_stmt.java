package Java.AST;

import java.util.ArrayList;

public class else_stmt {
    private boolean K_else;
    ArrayList<state_stmt>arrayList;

    public boolean isK_else() {
        return K_else;
    }

    public void setK_else(boolean k_else) {
        K_else = k_else;
    }

    public ArrayList<state_stmt> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<state_stmt> arrayList) {
        this.arrayList = arrayList;
    }
}
