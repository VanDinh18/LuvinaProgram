package lvn_3_1607.bttl;

public class bai1 {
    //chen x vao mang tang dan
    public static void main(String[] args) {
        int[]A = {2, 3, 4, 6, 9, 10, 14, 19, 20};
        int x=10;
        for(int i=A.length-2; i>=0; i--){
            if(A[i] > x){
               A[i+1] = A[i];
               A[i] = x;
            }
            else {
                A[i+1] = x;
                break;
            }
        }
        for(int j=0; j<A.length; j++){
            System.out.print(A[j] + "-");
        }
    }
}
