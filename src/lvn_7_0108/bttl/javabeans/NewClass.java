package lvn_7_0108.bttl.javabeans;

public class NewClass {
    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.addPropertyChangeListener(new ListenEvent());
        bean.setProperty1("change 01 property1");
        bean.setProperty1("change 02 property1");
    }
}
