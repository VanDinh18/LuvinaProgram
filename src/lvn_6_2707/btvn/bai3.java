package lvn_6_2707.btvn;

import java.io.*;
import java.util.ArrayList;

public class bai3 {

    public static final String fileoutput = "src/lvn_6_2707/btvn/fileoutput.txt";

    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileoutput));
           do {
               System.out.print("username: ");
               String username = bufferedReader.readLine();
               System.out.print("age: ");
               int age = Integer.parseInt(bufferedReader.readLine());
               System.out.print("address: ");
               String address = bufferedReader.readLine();
               System.out.print("score: ");
               int score = Integer.parseInt(bufferedReader.readLine());
               User user = new User(username, age, address, score);
               objectOutputStream.writeObject(user);
           }
           while ( ! bufferedReader.readLine().equals(".") );
            objectOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileoutput));
            ArrayList<User> result = new ArrayList<>();
            try {
                for (;;) {
                    result.add((User) objectInputStream.readObject());
                }
            } catch (EOFException e) {
                objectInputStream.close();
            }
            int min = 0;
            for(int i=0; i<result.size()-1; i++){
                min = i;
                for(int j=i+1; j<result.size(); j++){
                    if(result.get(j).getUsername().compareTo(result.get(i).getUsername()) < 0){
                        min = j;
                    }
                }
                User temp = result.get(i);
                result.set(i, result.get(min));
                result.set(min, temp);
            }
            int sumScore = 0;
            for(int i=0; i<result.size(); i++){
                sumScore += result.get(i).getScore();
                System.out.println(result.get(i).getUsername() + " " + result.get(i).getAge() + " " + result.get(i).getAddress() + " " + result.get(i).getScore() );
            }
            System.out.println("sum score: " + sumScore);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

