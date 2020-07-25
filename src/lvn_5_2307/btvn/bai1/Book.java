package lvn_5_2307.btvn.bai1;

public class Book {
    String name;
    Author author;
    double price;
    int count;

    public Book(String name, Author author, double price, int count) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int count(){
        return count;
    }

    public String toString(){
        return name + " " + author + " " + price + " " + count;
    }
}
