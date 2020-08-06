package lvn_9_0808.bttl.HashSet;

import java.util.Comparator;

public class comparatorYear implements Comparator<Book> {
    @Override
    public int compare(Book t0, Book t1) {
        return t0.getYear().compareTo(t1.getYear());
    }

    @Override
    public Comparator<Book> reversed() {
        return null;
    }
}
