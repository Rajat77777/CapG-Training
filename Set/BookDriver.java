package Set;

import java.util.TreeSet;

public class BookDriver {
	public static void main(String[] args) {
		PriceComparator p = new PriceComparator();
		IdComparator i = new IdComparator();
		TreeSet<Book> t = new TreeSet<Book>(p);
		Book b1 = new Book(25,"12 laws",750);
		Book b2 = new Book(15,"14 laws",7500);
		Book b3 = new Book(5,"32 laws",150);
		t.add(b1);
		t.add(b2);
		t.add(b3);
		System.out.println(t);
	}

}
