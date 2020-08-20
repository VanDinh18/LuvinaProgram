package kiemtra;

import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        String[][] A = {
                {"ab", "cde", "abcd"},
                {"acc", "ac", "d"},
                {"a", "abcd", "ef"},
                {"af", "a", "abc"},
                {"a", "abce", "ef"},
        };
        int k = 1;
        int m = A.length;//
        int n = A[0].length;//
        int max = A[0][k].length();
        int count = 1;
        int[] pos = new int[m];
        pos[0] = 0;
        for(int i=1; i<m; i++){
            if(A[i][k].length() > max){
                max = A[i][k].length();
                count = 1;
                pos[0] = i;
            }
            else if(A[i][k].length() == max){
                count++;
                pos[count-1] = i;
            }
        }
        System.out.println("vi tri: ");
        for(int i=0; i<count; i++){
            System.out.print(pos[i] + "\t");
        }
        System.out.println();
        //in ra tat ca cac tu dai nhat trong xau ky tu cot K mang A
        for(int i=0; i<count; i++){
            int temp = pos[i];
            System.out.println(A[temp][k]);
        }
    }
}
