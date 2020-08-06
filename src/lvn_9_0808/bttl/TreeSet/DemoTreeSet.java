package lvn_9_0808.bttl.TreeSet;

import java.util.*;

public class DemoTreeSet {
    public static void main(String[] args) {
        Set<Student> stu = new TreeSet<Student>();
        stu.add(new Student("A05726-1","AA", 8));
        stu.add(new Student("A06338","AB", 7));
        stu.add(new Student("A05379", "AC",6));
        stu.add(new Student("A05726-2", "AD",9));

        Student st1=new Student("A063381","AD", 6); // code, name, score
        boolean kt = stu.contains(st1);// tim kiem tren cay
        if (kt)
            System.out.println("Found ");
        else
            System.out.println("Not Found");

        List<Student> lst = new ArrayList<>();
        lst.addAll( stu);
        // Tim kiem theo dieu kien nhu khi xay dung lop Student (theo code)
        int i = Collections.binarySearch(lst, st1);
        if (i>=0) {
            System.out.println("Found by code:"+ lst.get(i).toString() );
        }
        else
            System.out.println("Not Found by code");

        //// Tim kiem theo score
        i = Collections.binarySearch( lst, st1,new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b) {
                return a.getScore().compareTo(b.getScore());
            }
        });
        // tim theo score
        if (i>=0) {
            System.out.println("Found by score:"+ lst.get(i) ); }
        else
            System.out.println("Not Found by score");
    }
}
