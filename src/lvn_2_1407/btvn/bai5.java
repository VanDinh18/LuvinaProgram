package lvn_2_1407.btvn;

public class bai5 {
    public static void selectSort(int [] A){
        int sw = 0;
        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i] > A[j]){
                   sw = A[i];
                   A[i] = A[j];
                   A[j] = sw;
                }
            }
        }
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + "-");
        }
    }
    public static void main(String[] args) {
        int[] A = {1, 4, 2, 7, 10, 5, 8, 3};
        selectSort(A);
    }
}
