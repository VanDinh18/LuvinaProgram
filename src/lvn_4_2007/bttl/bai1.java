package lvn_4_2007.bttl;

import java.util.Arrays;

public class bai1 {
    //select sort
    public static void sapxep1(int[] A){
        int n = A.length;
        int i = 0;
        int min, j, temp;
        while (i < n-1){
            min = i+1;
            j = i+1;
            while (j < n){
                if(A[j] < A[min]){
                    min = j;
                }
                j++;
            }
            temp = A[i];
            A[i] = A[min];
            A[min] = temp;
            i++;
        }
        System.out.println(Arrays.toString(A));
    }
    //buble sort
    public static void sapxep2(int[] A){
        int n = A.length;
        int i = 1;
        int j = n-1;
        int temp;
        while (i < n){
            while (j >= i){
                if(A[j] < A[j-1]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j--;
            }
            i++;
        }
        System.out.println(Arrays.toString(A));
    }
    //insert sort
    public static void sapxep3(int[] A){
        int n = A.length;
        int temp;

        for(int i=1; i<n; i++) {
            temp = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < A[j]) {
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
                else {
                    break;
                }
            }
        }

//        for(int i=n-2; i>=0; i--) {
//            temp = A[i];
//            for (int j = i + 1; j < n; j++) {
//                if (temp > A[j]) {
//                    A[j - 1] = A[j];
//                    A[j] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[]A = {17, 21, 9, 12, 6, 18, 4, 20, 7, 14};
//        sapxep1(A);
//        sapxep2(A);
        sapxep3(A);
    }
}
