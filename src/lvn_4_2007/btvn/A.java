package lvn_4_2007.btvn;

import java.util.Arrays;

/*Sắp xếp các số lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí*/
public class A {
    public static void bai1(int[] A){
        int n = A.length;
        int min = 0;
        int temp = 0;
        for(int i=0; i<n-1; i++){
            if(A[i] % 2 == 1){
                min = i;
                for(int j=i+1; j<n; j++){
                    if(A[j] % 2 == 1){
                        if(A[j] < A[min]){
                            min = j;
                        }
                    }
                }
                temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    /* Sắp xếp các số dương tăng dần, các số âm giữ nguyên vị trí */
    public static void bai2(int[] A){
        int n = A.length;
        int min = 0;
        int temp = 0;
        for(int i=0; i<n-1; i++){
            if(A[i] > 0){
                min = i;
                for(int j=i+1; j<n; j++){
                    if(A[j] > 0){
                        if(A[j] < A[min]){
                            min = j;
                        }
                    }
                }
                temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void bai3(int[] A){
        int n = A.length;
        int min = 0;
        int temp = 0;
        for(int i=0; i<n-1; i++){
            if(A[i] > 0){
                min = i;
                for(int j=i+1; j<n; j++){
                    if(A[j] > 0){
                        if(A[j] < A[min]){
                            min = j;
                        }
                    }
                }
                temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
            else {
                min = i;
                for(int j=i+1; j<n; j++){
                    if(A[j] < 0){
                        if(A[j] > A[min]){
                            min = j;
                        }
                    }
                }
                temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void bai4(int[] A){
        int n = A.length;
        int vtmax = 0;
        int vtmin = 0;
        int temp = 0;
        for(int i=1; i<n; i++){
            if(A[i] > A[vtmax]){
                vtmax = i;
            }
            if(A[i] < A[vtmin]){
                vtmin = i;
            }
        }
        temp = A[vtmax];
        A[vtmax] = A[vtmin];
        A[vtmin] = temp;
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[] A = {4,-2, 7, 1, 9, 6, -7, 3, 1, 8, 5, 2, -6};
        //bai1(A);
        //bai2(A);
        //bai3(A);
        bai4(A);
    }
}
