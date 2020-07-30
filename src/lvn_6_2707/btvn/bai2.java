package lvn_6_2707.btvn;

import java.io.*;

public class bai2 {
    public static final String dirname = "src/lvn_6_2707/btvn/test";
    public static boolean checkFileExist(String filename){
        boolean check = false;
        File f = new File(filename);
        check = f.exists();
        return check;
    }

    public static boolean checkDirExist(String foldername){
        boolean check = false;
        File f = new File(foldername);
        check = f.isDirectory();
        return check;
    }
    public static void main(String[] args) {
        //a,
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file;

        try{
            System.out.print("filename: ");
            String filename = bufferedReader.readLine();
            if(checkFileExist(filename)){
                if(checkDirExist(dirname)){
                    FileInputStream fileSource = new FileInputStream(filename);
                    FileOutputStream fileDict = new FileOutputStream(dirname + "/text2.txt");
                    int i = fileSource.read();
                    while (i != -1){
                        i = fileSource.read();
                        fileDict.write(i);
                    }
                    fileSource.close();
                    fileDict.close();
                }
                else {
                    file = new File(dirname);
                    if(file.mkdir()){
                        System.out.println("create dir successfully");
                    }
                    else {
                        System.out.println("error create dir");
                    }
                }
            }
            else {
                System.out.println("file not exist");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
