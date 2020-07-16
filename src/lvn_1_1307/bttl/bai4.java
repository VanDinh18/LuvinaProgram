package bttl;

public class bai4 {
    public static void gtln(int[] A){
        int max=A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] >= max){
                max = A[i];
            }
        }
        int dem=0;
        for(int i=0; i<A.length; i++){
            if(A[i] == max){
                dem+=1;
            }
        }
        if(dem == 1){
            System.out.println("max: " + max);
        }
        else {
            System.out.println("max: " + max);
            System.out.println("so luong " + dem);
            System.out.print("vi tri: ");
            for(int i=0; i<A.length; i++){
                if(A[i] == max){
                    System.out.print(i + 1 +  " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]A={6, 1, 2, 5, 1, 2, 2, 3, 6, 4, 6};
        gtln(A);
    }
}
