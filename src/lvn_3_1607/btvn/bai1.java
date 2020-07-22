package lvn_3_1607.btvn;
import java.util.Arrays;

public class bai1 {
    public static void sapxep1(int[] A){
        int n = A.length;
        int temp = 0;
        int min;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if(A[min] > A[j]){
                    min = j;
                }
            }
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
        System.out.println(Arrays.toString(A));
    }
    public static void sapxep2(int[] A){
        int n = A.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                if(A[j] < A[j-1]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
//        for(int i=n-1; i>=1; i--){
//            for(int j=n-1; j >= n-i; j--){
//                if(A[j] <= A[j-1]){
//                    temp = A[j-1];
//                    A[j-1] = A[j];
//                    A[j] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(A));
    }

    public static void sapxep3(int[] A){
        int n = A.length;
        int temp;
        int j;
        for(int i=1; i<n; i++){
            temp = A[i];
            j = i-1;
            while (j >= 0 && temp < A[j]){
                A[j+1] = A[j];
                A[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[] A = {17, 21, 9, 12, 6, 18, 4, 20, 7, 14};
        //sapxep1(A);
        sapxep2(A);
        //sapxep3(A);
    }
}
