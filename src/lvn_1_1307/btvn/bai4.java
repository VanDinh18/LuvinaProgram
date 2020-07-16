package lvn_1_1307.btvn;

public class bai4 {
    public static boolean kiemTraTangDan41(int[]A){
        for(int i=1; i<A.length; i++){
            if(A[i] < A[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void kiemTraTangDan42(int[] A){
        int start=0;
        int end=0;
        int max=1;
        int count=1;
        for(int i=1; i<A.length; i++){
            if(A[i] >= A[i-1]){
                count+=1;
                if(count >= max){
                    max=count;
                    end=i;
                    start=end-count+1;
                }
            }
            else
                count=1;
        }
        System.out.println("start: " + start);
        System.out.println("end: " + end);
    }
    public static void kiemTraTangDan43(int[] A){
        int start=0;
        int end=0;
        int count=1;
        int num=1;
        int length = A.length;
        if(length == 1){
            System.out.println("Do dai doan = " + length + "; [dau:" + start + ',' + "cuoi:" + end + "]");
        }
        else {
            for(int i=1; i<length; i++){
                if(A[i] >= A[i-1]){
                    count+=1;
                    end=i;
                    start=end-count+1;
                }
                else {
                    num++;
                    count=1;
                }
                if(count == 1 || i == length-1) {
                    System.out.println("Do dai doan = " + (end - start + 1) + "; [dau:" + start + ',' + "cuoi:" + end + "]");
                }
                if(i == length-1 && A[i] < A[i-1]){
                    System.out.println("Do dai doan = " + 1 + "; [dau:" + i + ',' + "cuoi:" + i + "]");
                }
            }
            System.out.println("So doan = " + num);
        }
    }
//    public static void main(String[] args) {
//        int[] A = {1, 2, 1, 2, 3, 1};
//        System.out.println("b1: ");
//        if(kiemTraTangDan41(A)){
//            System.out.println("day tang dan");
//        }
//        else
//            System.out.println("khong phai day tang dan");
//        System.out.println("b2: ");
//        kiemTraTangDan42(A);
//        System.out.println("b3: ");
//        kiemTraTangDan43(A);
//    }
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 8, 0, 1, 3, 7, 1, 2};
        int[] vtdau, vtcuoi;
        int dodai, d = 0, c = 0;
        vtdau = new int[a.length];
        vtcuoi = new int[a.length];
        dodai = 1;
        vtdau[0]=vtcuoi[0]=0; //
        int dem = 1;
        int i=1;
        while (i <= a.length - 1) {
            if (a[i] >= a[i-1]) {
                c = i;
            } else {
                if (dodai == c - d + 1) {
                    dem++;
                    vtdau[dem-1]=d; vtcuoi[dem-1]=c; //
                }
                if (dodai < c - d + 1) {
                    dodai = c - d + 1;
                    dem = 1;
                    vtdau[dem-1]=d; vtcuoi[dem-1]=c;
                }
                d = i ; c = i ;
            }
            i++;
        }
        if (dodai == c - d + 1) {
            dem++;
            vtdau[dem-1]=d; vtcuoi[dem-1]=c; //
        }
        else
        if (dodai < c - d + 1) {
            dodai = c - d + 1;
            dem = 1;
            vtdau[dem-1]=d; vtcuoi[dem-1]=c;
        }
        if (dem==1)
            System.out.println("Độ dài: "+ dodai
                    +"; ["+ vtdau[0]+","+ vtcuoi[0]+"]" );
        else {
            for(int j=0; j<dem; j++){
                System.out.println(vtdau[j] + "-" + vtcuoi[j]);
            }
        }

    }
}
