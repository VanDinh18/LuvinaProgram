package lvn_2_1407.btvn;

public class bai1 {
    public static void max(int[] A){
        int[] pos = new int[A.length];
        pos[0] = 0;
        int max = A[0];
        int count = 1;
        int i = 1;
        while(i < A.length){
            if(max < A[i]){
                max = A[i];
                count = 1;
                pos[0] = i;
            }
            else if(max == A[i]) {
                count++;
                pos[count-1] = i;
            }
            i++;
        }
        if(count == 1){
            System.out.println("Max=" + max);
        }
        else {
            System.out.print("Max="+ max + ";" + " Soluong=" + count + "; Cacvitri= ");
            for (int j = 0; j < count-1; j++) {
                System.out.print(pos[j] + ",");
            }
            System.out.print(pos[count-1] + ".");
        }
    }
    public static void main(String[] args) {
        int[]A={1, 1, 2, 2, 2};
        max(A);
    }
}
