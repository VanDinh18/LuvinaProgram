package lvn_4_2007.btvn;

import java.util.Arrays;

public class B {
    public static void bai0(){
        int count;
        char[][] A = {
                {'a', 'c', 'd', 'b'},
                {'a', 'a', 'd', 'b'},
                {'a', 'c', 'c', 'c'},
                {'d', 'd', 'd', 'b'},
                {'c', 'c', 'd', 'a'},
        };
        char[] key = {'a', 'b', 'c', 'd'};
        for(int i=0; i<A.length; i++){
            count = 0;
            for(int j=0; j<A[i].length; j++){
                if(key[j] == A[i][j]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void bai1(){
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] B = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] C = new int [A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void bai2(){
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] B = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int n = 3;
        int[][] C = new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                C[i][j] = 0;
                for(int k=0; k<n; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void bai3(){

    }
    public static void main(String[] args) {
        //bai0();
        //bai1();
        //bai2();
        bai3();
    }
}
