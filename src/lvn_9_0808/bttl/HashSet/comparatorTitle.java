package lvn_9_0808.bttl.HashSet;

import java.util.Comparator;

public class comparatorTitle implements Comparator<Book> {
    @Override
    public int compare(Book t0, Book t1) {
        return t0.getTitle().compareTo(t1.getTitle());
    }

    @Override
    public Comparator<Book> reversed() {
        return null;
    }
}
