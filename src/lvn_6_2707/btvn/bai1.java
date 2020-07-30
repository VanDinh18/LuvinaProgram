package lvn_6_2707.btvn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class bai1 {
    public static final String filename = "src/lvn_6_2707/btvn/text1.txt";

    public static void main(String[] args){
        FileInputStream fileInputStream;
        int  i;
        int cLine = 1;
        int cChar = 0;
        int cWord = 1;
        int count = 0;
        try{
            fileInputStream = new FileInputStream(filename);
           do{
               i = fileInputStream.read();
               if((char) i == '\n'){
                   cLine++;
               }
               if((char) i != '\n' && (char) i != ' ' && i != -1){
                   cChar++;
               }
               if(((char) i == ' ' && count == 0) || (char) i == '\n'){
                   cWord++;
                   count++;
               }
               else if((char) i != ' '){
                   count = 0;
               }
               System.out.print((char) i);
           }while (i != -1);
            System.out.println();
            System.out.println("line = " + (cLine) );
            System.out.println("char = " + cChar);
            System.out.println("word = " + cWord);
           fileInputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
