package lvn_5_2307.btvn;

public class Crame {
    public static double tinhDinhThuc(double[][] D, int n){
        double tyso;
        double dt;
        if(D[0][0] == 0){
            dt = -1.0;
        }
        else {
            dt = 1.0;
        }

        if(D[0][0] == 0){
            double temp;
            for(int i=1; i<n; i++){
                if(D[i][0] != 0){
                    for(int j=0; j<n; j++){
                        temp = D[0][j];
                        D[0][j] = D[i][j];
                        D[i][j] = temp;
                    }
                    break;
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int k=i; k<n; k++){
                tyso = -  D[k][i-1] / D[i-1][i-1];
                for(int j=0; j<n; j++){
                    D[k][j] = D[k][j] + (D[i-1][j] * tyso);
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    dt *= D[i][j];
                }
            }
        }
        return dt;
    }

    public static void thayDoiMang(double[][] arr, int n, double[] A, int vt){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j == vt){
                    arr[i][j] = A[i];
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        double[][]D = {
                {1, -1, 2},
                {2, 1, -3},
                {3, -2, 1},
        };
        int n = 3;
        double[] A = {1, 5, 1};

        //thay đổi ma trân
        double[][] D1 = {
                {1, -1, 2},
                {2, 1, -3},
                {3, -2, 1},
        };
        thayDoiMang(D1, n, A, 0);
        double[][] D2 ={
                {1, -1, 2},
                {2, 1, -3},
                {3, -2, 1},
        };
        thayDoiMang(D2, n, A, 1);
        double[][] D3 = {
                {1, -1, 2},
                {2, 1, -3},
                {3, -2, 1},
        };
        thayDoiMang(D3, n, A, 2);

        //tính định thức ma trận
        double d = tinhDinhThuc(D, n);
        double d1 = tinhDinhThuc(D1, n);
        double d2 = tinhDinhThuc(D2, n);
        double d3 = tinhDinhThuc(D3, n);

        System.out.println("x1 = " + (d1/d));
        System.out.println("x2 = " + (d2/d));
        System.out.println("x3 = " + (d3/d));
    }
}
