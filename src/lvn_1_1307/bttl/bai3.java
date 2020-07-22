package lvn_1_1307.bttl;

public class bai3 {
    public static void gtln(int[] A){
        int max=A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] >= max){
                max = A[i];
            }
        }
        System.out.println("Max: " + max);
    }
    public static void gtnn(int[] A){
        int min=A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] <= min){
                min = A[i];
            }
        }
        System.out.println("Min: " + min);
    }
    public static void main(String[] args) {
        int[]A = {1, 4, 5, 2, 8, 3};
        gtln(A);
        gtnn(A);
    }
}
