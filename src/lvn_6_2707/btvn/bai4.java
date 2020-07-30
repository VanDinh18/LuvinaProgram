package lvn_6_2707.btvn;

import java.io.*;

public class bai4 {
    public static final String path = "src/lvn_6_2707/btvn/BangDiem.txt";
    public static final String path1 = "src/lvn_6_2707/btvn/BangDiem1.txt";

    public static void main(String args[]) throws IOException {
        String str;
        FileWriter fw;
        FileWriter fw1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            fw = new FileWriter(path);
        }
        catch(IOException exc){
            System.out.println("Khong the mo file.");
            return;
        }

        do
        {	System.out.print(": ");
            str = br.readLine();
            if(str.compareTo(".") == 0)
                break;
            str = str + "\n";
            fw.write(str);
        } while(str.compareTo(".") != 0);
        fw.close();

        try{
            fw1 = new FileWriter(path1);
        }
        catch(IOException exc){
            System.out.println("Khong the mo file.");
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s;
        String st = "";
        while((s = bufferedReader.readLine()) != null)
        {
            st += s + " ";
            fw1.write(s+"\n");
        }


        String[] arr = st.split(" ");

        String[] arrLengMax = new String[arr.length];
        int lengmax = arr[0].length();
        arrLengMax[0] = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i].length() > lengmax){
                lengmax = arr[i].length();
                arrLengMax[0] = arr[i];
                count = 1;
            }
            else if(arr[i].length() == lengmax) {
                count++;
                arrLengMax[count-1] = arr[i];
            }
        }
        System.out.println("cac tu dai nhat: ");
        for(int i=0; i<count; i++){
            System.out.println(arrLengMax[i]);
        }
        bufferedReader.close();
        fw1.close();
    }
}
