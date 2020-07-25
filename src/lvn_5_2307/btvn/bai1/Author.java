package lvn_5_2307.btvn.bai1;

public class Author {
    String name;
    String email;
    String gender;
    int age;

    public Author(String name, String email, String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String toString(){
        return this.name + "-" + this.email + "-" + this.gender + "-" + this.age;
    }
}
