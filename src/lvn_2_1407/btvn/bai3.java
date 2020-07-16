package lvn_2_1407.btvn;

public class bai3 {
    public static void insertArray(int[] A, int x){
        int l=0;
        int r=A.length-1;
        int mid=0;
        while (l <= r){
            mid=(r+l)/2;
            if(x==A[mid]){
                break;
            }
            if(x>A[mid]){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        int[]B = A.clone();
        if(x >= A[mid]){
            for(int i=mid+2; i<A.length; i++){
                A[i]=B[i-1];
            }
            A[mid+1]=x;
        }
        else{
            for(int i=mid+1; i<A.length; i++){
                A[i]=B[i-1];
            }
            A[mid]=x;
        }
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + "-");
        }
    }
    public static void main(String[] args) {
        int [] A = {1, 4, 6, 9, 11, 16, 19, 24, 29, 31};
        int x=30;
        insertArray(A, x);
    }
}
