package lvn_6_2707.btvn;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private int age;
    private String address;
    private int score;

    public User(){};
    public User(String username, int age, String address, int score) {
        this.username = username;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
