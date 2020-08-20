package example;

import java.util.Arrays;

//in ra tất cả các gía trị lớn nhất của mảng
public class bai1 {
    public static void main(String[] args) {
        int[] A = {8, 1, 8, 3, 6, 2, 4, 8, 5, 8, 0, 8};
        int max = A[0];
        int[]pos = new int[A.length];
        int count = 1;
        for(int i=1; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
                pos[0] = i;
            }
            else if(A[i] == max){
                count++;
                pos[count-1] = i;
            }
        }
        System.out.println(Arrays.toString(pos));
    }
}
