package Set;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriceComparator price = new PriceComparator();
		PriorityQueue<Book> p= new PriorityQueue<>(price);

		Book b1 = new Book(27,"Harry Potter",750);
		Book b2 = new Book(57,"Harry Potter and Deathly Hallows",450);
		Book b3 = new Book(77,"Harry Potter and Goblet of Fire",1350);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
		
		
	}

	
}
