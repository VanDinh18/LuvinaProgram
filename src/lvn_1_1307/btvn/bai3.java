package lvn_1_1307.btvn;

public class bai3 {
//    public static void max(int[] A){
//        int max = A[0];
//        int count = 0;
//        int[] pos = new int[A.length];
//        for(int i=0; i<A.length; i++){
//            if(A[i] > max){
//                max = A[i];
//                count = 1;
//                pos[0] = i;
//            }
//            else if(A[i] == max){
//                count+=1;
//                pos[count-1] = i;
//            }
//        }
//        if(count == 1){
//            System.out.print("Max="+max);
//        }
//        else{
//            System.out.print("Max="+max+"; Soluong="+count+"; Cac vi tri= ");
//            for (int j=0;j<count-1;j++){
//                System.out.print(pos[j] +", ");
//            }
//            System.out.println(pos[count-1] + ".");
//        }
//    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1};
        max(A);
    }

    private static void max(int[] A) {
        int max = A[A.length-1];
        int[] vt = new int[A.length];
        int soluong = 1;
        vt[0] = A.length - 1;
        int i=0;
        while (i < A.length-1){
            if(max < A[i]){
                max = A[i];
                soluong = 1;
                vt[0] = i;
            }
            else if(max == A[i]){
                soluong++;
                vt[soluong-1] = i;
            }
            i++;
        }
        System.out.println(soluong);
        for(int j=0; j<soluong; j++){
            System.out.print(vt[j]);
        }
    }
}
