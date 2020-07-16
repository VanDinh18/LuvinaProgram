package lvn_2_1407.btvn;

public class bai2 {
    public static boolean bai21(int[]A){
        for(int i=1; i<A.length; i++){
            if(A[i] < A[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void bai22(int[]A){
        int s=0;
        int e=0;
        int start=0;
        int end=0;
        int dem=1;
        int max=1;
        int i=1;
        while(i < A.length){
            if(A[i] >= A[i-1]){
                end = i;
                dem++;
                start = end - dem + 1;
            }
            else {
                if(max <= dem){
                    max = dem;
                    s = start;
                    e = end;
                }
                dem = 1;
                end = 0;
            }
            i++;
        }
        System.out.println(max);
        System.out.println(s + "-" + e);
    }
    public static void bai23(int []A){
        int start = 0;
        int end = 0;
        int []s = new int[A.length];
        int []e = new int[A.length];
        s[0] = e[0] = 0;
        int pos = 0;
        int count = 1;
        int i = 1;
        while (i < A.length){
            if(A[i] >= A[i-1]){
               end = i;
               count++;
            }
            else {
                e[pos] = end;
                start = end - count + 1;
                s[pos] = start;
                count = 1;
                pos++;
            }
            i++;
        }
        e[pos] = end;
        start = end - count + 1;
        s[pos] = start;
        pos++;

        if(pos == 1){
            System.out.print("Dodaidoan = " + pos + "; [" + s[0] + "," + e[0] + "]");
        }
        else {
            System.out.print("So doan = " + pos + ";");
            for (int j = 0; j < pos - 1 ; j++) {
                System.out.print(" [" + s[j] + "," + e[j] + "], ");
            }
            System.out.print("[" + s[pos-1] + "," + e[pos-1] + "].");
        }
    }
    public static void main(String[] args) {
        int[]A = {1, 2, 3, 4, 5, 2, 3, 1, 2, 3, 4, 5, 6};
        //System.out.println(bai21(A));
        //bai22(A);
        bai23(A);
    }
}
