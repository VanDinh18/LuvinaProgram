package lvn_3_1607.bttl;
//tim day dai nhat
public class bai2 {
    public static void main(String[] args) {
        int[] A = {9, 2, 5, 8, 3, 10, 14, 17, 7, 20}; //n=10
        int i = A.length-1;
        int max = 1;
        int d=A.length-1;
        int c=A.length-1;
        int vtd = A.length-1;
        int vtc = A.length-1;
        while (i >= 1){
            if(A[i] < A[i-1]){
                if(c - i > max){
                    max = vtc - i;
                    vtd = i;
                    vtc = c;
                }
                d=i;
                c=i;
            }
            i--;
        }

        System.out.println(max);
        System.out.println(vtd + "-" + vtc);
    }
}
