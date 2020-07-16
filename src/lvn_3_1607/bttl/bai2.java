package lvn_3_1607.bttl;
//tim day dai nhat
public class bai2 {
    public static void main(String[] args) {
        int[] A = {9, 2, 5, 8, 3, 10, 14, 17, 7, 20, 22, 25, 40, 45};
        int i = 1;
        int max = 1;
        int d=0;
        int c=0;
        int vtd = 0;
        int vtc = 0;
        while (i < A.length){
            if(A[i] < A[i-1]){
                if(i-d > max){
                    max = i - d;
                    vtd = d;
                    vtc = i - 1;
                }
                d=i;
                c=i;
            }
            i++;
        }
        if(i-d > max){
            max = i - d;
            vtd = d;
            vtc = i - 1;
        }
        d=i;
        c=i;
        System.out.println(max);
        System.out.println(vtd + "-" + vtc);
    }
}
