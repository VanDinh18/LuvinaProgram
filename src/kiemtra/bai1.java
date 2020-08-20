package kiemtra;

import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        int[] A = { 20, 40, 50, 60, 1, 40, 20, 70, 80, 30, 20, 40, 50, 60};
        int vtd = 0;
        int vtc = 0;
        int[] start = new int[A.length];
        int[] end = new int[A.length];
        int max = 1;
        int count = 1;
        int pos = 0;
        for(int i=1; i<A.length; i++){
            if(A[i] >= A[i-1]){
                vtc = i;
                count++;
            }
            else {
                vtd = vtc - count + 1;
                if(count > max){
                    int sum=0;
                    for(int j=vtd; j<=vtc; j++){
                        sum += A[j];
                    }
                    if(sum > 100){
                        start[pos] = vtd;
                        end[pos] = vtc;
                        max = count;
                        pos++;
                    }
                }
                count = 1;
            }
        }
        vtd = vtc - count + 1;
        if(count >= max){
            int sum=0;
            for(int j=vtd; j<=vtc; j++){
                sum += A[j];
            }
            if(sum > 100){
                start[pos] = vtd;
                end[pos] = vtc;
                max = count;
                pos++;
            }
        }
        System.out.println("max = " + max);
        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(end));
    }
}
