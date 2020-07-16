package lvn_1_1307.btvn;

public class bai1 {
    public static boolean kiemTraSoNguyenTo(int n){
        if(n == 2){
            return true;
        }
        else if(n>=2){
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
        int n=97;
        if(kiemTraSoNguyenTo(n)){
            System.out.println(n+" la so nguyen to");
        }
        else
            System.out.println(n+ " khong la so nguyen to");
    }
}
