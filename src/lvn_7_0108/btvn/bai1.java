package lvn_7_0108.btvn;

public class bai1 {
    //dưới đường chéo chinh bằng 0 dùng for
    public static void bai1(double[][] D, int n){
        double tyso;
        double temp;
        for(int i=0; i<n; i++){
            if(D[i][i] == 0){
                for(int j=i+1; j<n; j++){
                    if(D[j][i] != 0){
                        for(int k=i; k<n; k++){
                            temp = D[j][k];
                            D[j][k] = D[i][k];
                            D[i][k] = temp;
                        }
                        break;
                    }
                }
            }
            for(int j=i+1; j<n; j++){
                tyso = - D[j][i] / D[i][i];
                for(int k=i; k<n; k++){     //k=i+1
                    D[j][k] = D[j][k] + (D[i][k] * tyso);
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
    //dưới đường chéo chinh bằng 0 dùng while
    public static void bai2(double[][] D, int n){
        double tyso;
        double temp;
        int i = 0;
        while (i < n){
            if(D[i][i] == 0){
                for(int j=i+1; j<n; j++){
                    if(D[j][i] != 0){
                        for(int k=i; k<n; k++){
                            temp = D[j][k];
                            D[j][k] = D[i][k];
                            D[i][k] = temp;
                        }
                        break;
                    }
                }
            }
            for(int j=i+1; j<n; j++){
                tyso = - D[j][i] / D[i][i];
                for(int k=i; k<n; k++){     //k=i+1
                    D[j][k] = D[j][k] + (D[i][k] * tyso);
                }
            }
            i++;
        }

        for(int m=0; m<n; m++){
            for(int j=0; j<n; j++){
                System.out.print(D[m][j] + " ");
            }
            System.out.println();
        }
    }
    //trên đường chéo chính bằng 0 dùng for
    public static void bai3(double[][] D, int n){
        double tyso;
        double temp;
        for(int i=n-1; i>=0; i--){
            if(D[i][i] == 0){
                for(int j=i-1; j>=0; j--){
                    if(D[j][i] != 0){
                        for(int k=i; k>=0; k--){
                            temp = D[j][k];
                            D[j][k] = D[i][k];
                            D[i][k] = temp;
                        }
                        break;
                    }
                }
            }
            for(int j=i-1; j>=0; j--){
                tyso = - D[j][i] / D[i][i];
                for(int k=i; k>=0; k--){
                    D[j][k] = D[j][k] + (tyso * D[i][k]);
                }
            }
        }
        for(int m=0; m<n; m++){
            for(int j=0; j<n; j++){
                System.out.print(D[m][j] + " ");
            }
            System.out.println();
        }
    }
    //dưới đường chéo phụ dưới bằng 0
    public static void bai5(double[][] D, int n){
        double tyso;
        double temp;
        for(int i=0; i<n; i++){
            if(D[i][n-i-1] == 0){
                for(int j=i+1; j<n; j++){
                    if(D[j][i] != 0){
                        for(int k=n-i-1; k>=0; k--){
                            temp = D[j][k];
                            D[j][k] = D[i][k];
                            D[i][k] = temp;
                        }
                        break;
                    }
                }
            }
            for(int j=i+1; j<n; j++){
                tyso = - D[j][n-i-1] / D[i][n-i-1];
                for(int k=n-i-1; k>=0; k--){
                    D[j][k] = D[j][k] + (tyso * D[i][k]);
                }
            }
        }
        for(int m=0; m<n; m++){
            for(int j=0; j<n; j++){
                System.out.print(D[m][j] + " ");
            }
            System.out.println();
        }
    }
    //Đường chéo phụ trên bằng 0
    public static void bai7(double[][] D, int n){
        double tyso;
        double temp;
        for(int i=n-1; i>=0; i--){
            if(D[i][n-i-1] == 0){
                for(int j=i-1; j>=0; j--){
                    if(D[j][n-i-1] != 0){
                        for(int k=n-i-1; k<n; k++){
                            temp = D[j][k];
                            D[j][k] = D[i][k];
                            D[i][k] = temp;
                        }
                        break;
                    }
                }
            }
            for(int j=i-1; j>=0; j--){
                tyso = - D[j][n-i-1] / D[i][n-i-1];
                for(int k=n-i-1; k<n; k++){
                    D[j][k] = D[j][k] + (tyso * D[i][k]);
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] D = {
                {1, -3, 0, 2},
                {-2, 5, 3, -1},
                {2, -4, -1, 5},
                {3, -7, 4, 2},
        };
        int n = D.length;
        //bai1(D, n);
        //bai2(D, n);
        //bai3(D, n);
        //bai5(D, n);
        //bai7(D, n);
    }
}
