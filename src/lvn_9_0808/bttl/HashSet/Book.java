package lvn_9_0808.bttl.HashSet;

public class Book {
    private String title;
    private String author;
    private Integer year;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return title + "\t" + author + "\t" + year;
    }

    @Override
    public int hashCode(){
        int hash = (int)(author.charAt(0) + author.charAt(1));
        //System.out.println("key of " + author + ": " + hash);
        return hash;
    }

    @Override
    public boolean equals(Object object){
        return this.author.equals(((Book) object).author);
    }
}
