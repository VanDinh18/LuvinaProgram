package kiemtra;

public class bai2 {
    public static boolean kiemTraCot(int[][] A, int k){
        int m = A.length;//5
        int n = A[0].length;//4
        for(int i=1; i<m; i++){
            if(A[i][k] < A[i-1][k]){
                return false;
            }
        }
        return true;
    }
    public static void sapXep(int[][] A, int k){
        int m = A.length;//5
        int n = A[0].length;//4

        if(kiemTraCot(A, k) == false){
            for(int i=0; i<m-1; i++){
                int min = i;
                for(int j=i+1; j<m; j++){
                    if(A[j][k] < A[min][k]){
                        min = j;
                    }
                }

                for(int h=0; h<n; h++){
                    int temp = A[i][h];
                    A[i][h] = A[min][h];
                    A[min][h] = temp;
                }
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.print(A[i][j] + "\t");
                }
            System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 3, 5, 2},
                {2, 4, 2, 4},
                {2, 5, 8, 6},
                {4, 8, 3, 0},
                {5, 9, 5, 9},
        };
        int k = 2;
        sapXep(A, k);
    }
}
