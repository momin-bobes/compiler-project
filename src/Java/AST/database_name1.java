package Java.AST;

import java.util.ArrayList;

public class database_name1 {
    ArrayList<String> Tablenames;
    ArrayList<String> databasename;
    String Columnname;



    public ArrayList<String> getTablenames() {
        return Tablenames;
    }

    public void setTablenames(ArrayList<String> tablenames) {
        Tablenames = tablenames;
    }

    public ArrayList<String> getDatabasename() {
        return databasename;
    }

    public void setDatabasename(ArrayList<String> databasename) {
        this.databasename = databasename;
    }

    public String getColumnname() {
        return Columnname;
    }

    public void setColumnname(String columnname) {
        Columnname = columnname;
    }
}
