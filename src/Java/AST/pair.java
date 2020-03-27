package Java.AST;

public class pair {
    String property;
    value value = new value ();

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Java.AST.value getValue() {
        return value;
    }

    public void setValue(Java.AST.value value) {
        this.value = value;
    }
}
