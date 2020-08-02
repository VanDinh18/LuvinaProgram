package lvn_6_2707.btvn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai5 {

    public static double tinhDinhThuc(double[][] D, int n){
        double dt = 1;
        double tyso;
        double temp;
        int count;
        for(int i=0; i<n; i++){
            if(D[i][i] == 0){
                count = 0;
                for(int j=i+1; j<n; j++){
                    if(D[j][i] != 0){
                        for(int k=i; k<n; k++){
                            temp = D[j][k];
                            D[j][k] = D[i][k];
                            D[i][k] = temp;
                            break;
                        }
                    }
                    else {
                        count++;
                    }
                }
                if(count == n-i-1){
                    return 0.0;
                }
                dt = -dt;
            }
            for(int j=i+1; j<n; j++){
                tyso = - D[j][i] / D[i][i];
                for(int k=i+1; k<n; k++){     //k=i+1
                    D[j][k] = D[j][k] + (D[i][k] * tyso);
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(D[i][j] + " ");
                if(i == j){
                    dt *= D[i][j];
                }
            }
            System.out.println();
        }

        return dt;
    }

    public static final String pathname = "src/lvn_6_2707/btvn/matrix.txt";

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(pathname);
            bufferedReader = new BufferedReader(fileReader);
            String s = bufferedReader.readLine();
            String[] A = s.split(" ");
            int n = A.length;
            double[][] D = new double[n][n];
            int i=0;
            while (s != null){
                String[] arr = s.split(" ");
                for(int j=0; j<n; j++){
                    D[i][j] = Double.parseDouble(arr[j]);
                }
                i++;
                s = bufferedReader.readLine();
            }
            System.out.println("dinh thuc = " + tinhDinhThuc(D, n));
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
