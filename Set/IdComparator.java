package Set;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getId(), b2.getId());
    }
}




