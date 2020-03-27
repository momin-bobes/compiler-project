package Java.AST.QueryStmt;

import java.util.ArrayList;

public class foreign_key_clause {
    String Databasename;
    String Foreign_table;
    ArrayList<String> Fk_target_column_names;
    String Name;
    private ArrayList<match_name>match_names;


    public ArrayList<match_name> getMatch_names() {
        return match_names;
    }

    public void setMatch_names(ArrayList<match_name> match_names) {
        this.match_names = match_names;
    }

    public String getDatabasename() {
        return Databasename;
    }

    public void setDatabasename(String databasename) {
        Databasename = databasename;
    }

    public String getForeign_table() {
        return Foreign_table;
    }

    public void setForeign_table(String foreign_table) {
        Foreign_table = foreign_table;
    }

    public ArrayList<String> getFk_target_column_names() {
        return Fk_target_column_names;
    }

    public void setFk_target_column_names(ArrayList<String> fk_target_column_names) {
        Fk_target_column_names = fk_target_column_names;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
