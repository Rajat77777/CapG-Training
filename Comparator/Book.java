package Comparator;

import java.util.Comparator;

public class Book implements Comparator {
	int id;
	String title;
	double price;
	
	public Book(int id,String title,double price) {
		this.id=id;
		this.title=title;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return id+ "\t"+title+ "\t"+price;
	}
	
	
	

	
}

