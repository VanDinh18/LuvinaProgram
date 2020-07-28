package lvn_5_2307.btvn;

public class tinhdinhthuc {
    public static void main(String[] args) {
        double[][] D = {
                {1, -3, 0, 2},
                {-2, 5, 3, -1},
                {2, -4, -1, 5},
                {3, -7, 4, 2}
        };
        int n = 4;
        double tyso;
        double dt = 1.0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

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

        System.out.println("dinh thuc = " + dt);

        for(int i=0; i<n; i++){
            for(int k=0; k<n; k++){
                System.out.print(D[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
