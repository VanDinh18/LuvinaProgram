package bttl;

public class bai1 {
    public static void main(String[] args) {
        int a=0, b=5, c=2;
        int max=0;
        if(a >= b && a >= c){
            System.out.println("max="+a);
        }
        else if(b >= a && b >= c){
            System.out.println("max="+b);
        }
        else {
            System.out.println("max="+c);
        }

        if(a >= b && a >= c){
            max=a;
        }
        else if(b >= a && b >= c){
            max=b;
        }
        else {
            max=c;
        }
        System.out.println("max="+max);
    }
}
