package example;

public class GFG{
    public static void nhanDaThuc(int[] A, int[] B){
        int m = A.length;
        int n = B.length;
        int k = m + n - 1;
        int[] C = new int[k];
        for(int i=0; i<k; i++){
            C[i] = 0;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                C[i+j] += A[i]*B[j];
            }
        }
        printArray(C);
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 5, 3};
        int[] B = {2, 4, 1};
        nhanDaThuc(A, B);
    }
}
