package Java.AST.QueryStmt;

public class match_name {
    private boolean k_SET;
    private boolean K_NULL;
    private boolean K_DEFAULT;
    private boolean K_CASCADE;
    private boolean K_RESTRICT;
    private boolean K_NO;
    private boolean K_ACTION;
    private boolean k_MATCH;
    private String name;
    private boolean K_ON;
    private boolean K_UPDATE;
    private  boolean k_DELETE;

    public boolean isK_ON() {
        return K_ON;
    }

    public void setK_ON(boolean k_ON) {
        K_ON = k_ON;
    }

    public boolean isK_UPDATE() {
        return K_UPDATE;
    }

    public void setK_UPDATE(boolean k_UPDATE) {
        K_UPDATE = k_UPDATE;
    }

    public boolean isK_DELETE() {
        return k_DELETE;
    }

    public void setK_DELETE(boolean k_DELETE) {
        this.k_DELETE = k_DELETE;
    }

    public boolean isK_SET() {
        return k_SET;
    }

    public void setK_SET(boolean k_SET) {
        this.k_SET = k_SET;
    }

    public boolean isK_NULL() {
        return K_NULL;
    }

    public void setK_NULL(boolean k_NULL) {
        K_NULL = k_NULL;
    }

    public boolean isK_DEFAULT() {
        return K_DEFAULT;
    }

    public void setK_DEFAULT(boolean k_DEFAULT) {
        K_DEFAULT = k_DEFAULT;
    }

    public boolean isK_CASCADE() {
        return K_CASCADE;
    }

    public void setK_CASCADE(boolean k_CASCADE) {
        K_CASCADE = k_CASCADE;
    }

    public boolean isK_RESTRICT() {
        return K_RESTRICT;
    }

    public void setK_RESTRICT(boolean k_RESTRICT) {
        K_RESTRICT = k_RESTRICT;
    }

    public boolean isK_NO() {
        return K_NO;
    }

    public void setK_NO(boolean k_NO) {
        K_NO = k_NO;
    }

    public boolean isK_ACTION() {
        return K_ACTION;
    }

    public void setK_ACTION(boolean k_ACTION) {
        K_ACTION = k_ACTION;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isK_MATCH() {
        return k_MATCH;
    }

    public void setK_MATCH(boolean k_MATCH) {
        this.k_MATCH = k_MATCH;
    }
}
