package lvn_6_2707.bttl;

public class Parent {
    public String A() {
        return null;
    }
    protected String B(String a) {
        return null;
    }
}
class Child extends Parent {
    public String A() {
        return null;
    }
    protected String A(String a) {
        return null;
    }
    public String B(String a) {
        return null;
    }
    public String B() {
        return null;
    }
}