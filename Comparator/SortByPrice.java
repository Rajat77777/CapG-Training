package Comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book> {
	public int compare(Book b1,Book b2) {
		return Double.compare(b1.price, b2.price);
	}

}
