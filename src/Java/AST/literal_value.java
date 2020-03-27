package Java.AST;

public class literal_value {

    String identy;
    private String NUMERIC_LITERAL;
    private String STRING_LITERAL;
    private String BLOB_LITERAL;
    private boolean K_NULL;
    private  boolean K_CURRENT_TIME;
    private boolean K_CURRENT_DATE;
    private boolean K_CURRENT_TIMESTAMP;

    public String getNUMERIC_LITERAL() {
        return NUMERIC_LITERAL;
    }

    public void setNUMERIC_LITERAL(String NUMERIC_LITERAL) {
        this.NUMERIC_LITERAL = NUMERIC_LITERAL;
    }

    public String getSTRING_LITERAL() {
        return STRING_LITERAL;
    }

    public void setSTRING_LITERAL(String STRING_LITERAL) {
        this.STRING_LITERAL = STRING_LITERAL;
    }

    public String getBLOB_LITERAL() {
        return BLOB_LITERAL;
    }

    public void setBLOB_LITERAL(String BLOB_LITERAL) {
        this.BLOB_LITERAL = BLOB_LITERAL;
    }

    public boolean isK_NULL() {
        return K_NULL;
    }

    public void setK_NULL(boolean k_NULL) {
        K_NULL = k_NULL;
    }

    public boolean isK_CURRENT_TIME() {
        return K_CURRENT_TIME;
    }

    public void setK_CURRENT_TIME(boolean k_CURRENT_TIME) {
        K_CURRENT_TIME = k_CURRENT_TIME;
    }

    public boolean isK_CURRENT_DATE() {
        return K_CURRENT_DATE;
    }

    public void setK_CURRENT_DATE(boolean k_CURRENT_DATE) {
        K_CURRENT_DATE = k_CURRENT_DATE;
    }

    public boolean isK_CURRENT_TIMESTAMP() {
        return K_CURRENT_TIMESTAMP;
    }

    public void setK_CURRENT_TIMESTAMP(boolean k_CURRENT_TIMESTAMP) {
        K_CURRENT_TIMESTAMP = k_CURRENT_TIMESTAMP;
    }


    public String getIdenty() {
        return identy;
    }

    public void setIdenty(String identy) {
        this.identy = identy;
    }
}
