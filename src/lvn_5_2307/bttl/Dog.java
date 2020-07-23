package lvn_5_2307.bttl;

public class Dog extends Animals{
    private int brank;
    Dog(String name, int age) {
        super(name, age);
    }
    Dog(String name, int age, int brank){
        super(name, age);
        this.brank = brank;
    }

    public static void main(String[] args) {
        display();
    }
}
