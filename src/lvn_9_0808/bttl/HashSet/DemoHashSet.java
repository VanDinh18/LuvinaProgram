package lvn_9_0808.bttl.HashSet;

import lvn_4_2007.btvn.B;

import java.util.*;

public class DemoHashSet {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("aa", "nam", 1990));
        books.add(new Book("cc", "an", 1999));
        books.add(new Book("ab", "linh", 2000));
        books.add(new Book("abc", "namm", 1890));
        books.add(new Book("df", "hang", 2010));
        books.add(new Book("ed", "bao", 2005));
        books.add(new Book("bc", "phuong", 2020));

        boolean check = books.contains(new Book("aa", "nam", 1990));
        if(check){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }

        List list = new ArrayList();
        list.addAll(books);
        //sap xep theo nam.
        Collections.sort(list, new comparatorYear());
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
