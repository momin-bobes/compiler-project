package Java.AST.QueryStmt;

import java.util.ArrayList;

public class Typename {
    private String Name;
    ArrayList<Type_name_real> type_name_reals;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Type_name_real> getType_name_reals() {
        return type_name_reals;
    }

    public void setType_name_reals(ArrayList<Type_name_real> type_name_reals) {
        this.type_name_reals = type_name_reals;
    }
}
