package lvn_5_2307.bttl;

public class NewClass implements interface1, interface2{

    public static void main(String[] args) {
        System.out.println(interface1.x);

    }

    @Override
    public int method() {
        return 0;
    }
}

interface interface1{
    int x = 10;
    int method();
}
interface interface2{
    int x = 100;
    int method();
}
