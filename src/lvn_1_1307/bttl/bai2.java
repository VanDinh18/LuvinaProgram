package bttl;

public class bai2 {
    public static boolean kiemTraSoNguyenTo(int n){
       if(n>=2){
           for(int i=2; i<=(int)Math.sqrt(n); i++){
               if(n%i==0){
                   return false;
               }
           }
       }
       else
           return false;
       return true;
    }
    public static void main(String[] args) {
        int n=25;
        if(kiemTraSoNguyenTo(n)){
            System.out.println(n+" la so nguyen to");
        }
        else
            System.out.println(n+ " khong la so nguyen to");
    }
}
