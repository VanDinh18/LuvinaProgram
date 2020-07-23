package lvn_5_2307.bttl;

public class Animals {
    private String name;
    protected int age;

    Animals(String name, int age){
        this.name = name;
        this.age = age;
    }

    static void display(){
        System.out.println("go go go");
    }

    public static void main(String[] args) {
        display();
    }
}
