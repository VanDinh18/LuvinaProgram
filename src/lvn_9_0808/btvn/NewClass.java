package lvn_9_0808.btvn;

import java.util.Arrays;

public class NewClass {
    public static void func1(int[] A, int m, int n){
        int temp;
        for(int i=m; i<=n-1; i++){
            int max = i;
            for(int j=i+1; j<=n; j++){
                if(A[max] < A[j]){
                    max = j;
                }
            }
            temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        System.out.println(Arrays.toString(A));
    }
    public static void func2(int[] A, int m, int n){
        int temp;
        int i=m;
        while (i <= n-1){
            int max = i;
            int j=i+1;
            while (j <= n){
                if(A[max] < A[j]){
                    max = j;
                }
                j++;
            }
            temp = A[i];
            A[i] = A[max];
            A[max] = temp;
            i++;
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[] A = {2, -1, 4, 9, 0, 1, -4, 5, 8, 3, 6, 7};
        System.out.println(Arrays.toString(A));
        //func1(A, 1, 10);
        func2(A, 1, 10);
    }
}
