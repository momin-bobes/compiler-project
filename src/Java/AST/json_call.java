package Java.AST;

import java.util.ArrayList;
import java.util.List;

public class json_call {
    String property1;
    String property2;
    boolean ja;

    public boolean isJa() {
        return ja;
    }

    public void setJa(boolean ja) {
        this.ja = ja;
    }

    List<json_call3> json_call3s = new ArrayList<json_call3>();

    public List<json_call3> getJson_call3s() {
        return json_call3s;
    }

    public void setJson_call3s(List<json_call3> json_call3s) {
        this.json_call3s = json_call3s;
    }

    String ASSIGN;



    String name;




    public String getPoint1() {
        return Point1;
    }

    public void setPoint1(String point1) {
        Point1 = point1;
    }

    String Point1 ;

    public void setPoint(String point) {
        Point1 = point;
    }

    public String getPoint() {
        return Point1;
    }


    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public Java.AST.property getPropertys() {
        return propertys;
    }

    public void setPropertys(Java.AST.property propertys) {
        this.propertys = propertys;
    }

    property propertys= new property();
}
