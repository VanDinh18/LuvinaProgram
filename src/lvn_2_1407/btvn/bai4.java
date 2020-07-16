package lvn_2_1407.btvn;

public class bai4 {
    public static int timKiemNhiPhan(int[] A, int L, int R, int x){
        int Mid=(L+R)/2;
        if(L>R){
            return -1;
        }
        if(x == A[Mid]){
            return Mid;
        }
        if(x > A[Mid]){
            return timKiemNhiPhan(A, Mid+1, R, x);
        }
        else
            return timKiemNhiPhan(A, L, Mid-1, x);
    }
    public static void main(String[] args) {
        int [] A = {1, 4, 6, 9, 11, 16, 19};
        int L=0;
        int R=A.length-1;
        int x=-19;
        System.out.println(timKiemNhiPhan(A, L, R, x));
    }
}
