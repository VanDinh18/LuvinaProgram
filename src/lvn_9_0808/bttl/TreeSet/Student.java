package lvn_9_0808.bttl.TreeSet;

public class Student implements Comparable<Student>{
    private String code;
    private String name;
    private Integer score;

    public Student(String code, String name, Integer score) {
        this.code = code;
        this.name = name;
        this.score = score;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return code + "\t" + name + "\t" + score;
    }

    @Override
    public int compareTo(Student student) {
        return this.score.compareTo(student.score);
    }
}
