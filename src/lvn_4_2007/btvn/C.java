package lvn_4_2007.btvn;

import java.util.Arrays;

public class C {
    public static void bai1(){
        String str = " nguyen    van a   ";
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
    }
    public static void bai2(){
        String str = " nguyen    van a   ";
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split("\\s");
        System.out.println(Arrays.toString(words));
    }
    public static void bai3(){
        String str = " nguyen    van ngoan   a nghich ngom";
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split("\\s");

        int maxleng = words[0].length();
        int[] pos = new int [words.length];
        pos[0] = 0;
        int count = 1;
        for(int i=1; i<words.length; i++){
            if(words[i].length() > maxleng){
                maxleng = words[i].length();
                pos[0] = i;
                count = 1;
            }
            else if(words[i].length() == maxleng){
                count++;
                pos[count-1] = i;
            }
        }
        for(int j=0; j<count; j++){
            System.out.println(words[pos[j]]);
        }
    }
    public static void bai4(){
        String[] A = {
                "nguyen van a",
                "nguyen van Binh",
                "tran thi Binh",
                "vu thi lan phuong",
                "ha Binh",
                "Binh",
        };
        int N = A.length;
        int count = 0;
        for(int i=0; i<N; i++){
            String str = A[i];
            str = str.trim();
            str = str.replaceAll("\\s+", " ");
            String[] words = str.split("\\s");
            int n = words.length;
            if(words[n-1].equals("Binh")){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void bai5(){
        String[] A = {
                "nguyen van A",
                "nguyen van Binh",
                "tran thi Binh",
                "vu thi lan Phuong",
                "ha Binh",
                "Binh",
        };
        int N = A.length;
        String temp = "";
        int min = 0;
        for(int i=0; i<N-1; i++){
            min = i;
            String[] words1 = A[i].split("\\s");
            int n1 = words1.length;
            for(int j=i+1; j<N; j++){
                String[] words2 = A[j].split("\\s");
                int n2 = words2.length;
                if((words2[n2-1]).compareTo(words1[n1-1]) < 0){
                    min = j;
                }
                else if((words2[n2-1]).compareTo(words1[n1-1]) == 0){
                    if(n1 > n2){
                        min = j;
                    }
                    else if(n1 == n2){
                        if((words2[n2-2]).compareTo(words1[n1-2]) < 0){
                            min = j;
                        }
                    }
                }
                temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        //bai1();
        //bai2();
        //bai3();
        //bai4();
        bai5();
    }
}
