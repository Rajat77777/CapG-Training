package Comparator;

import java.util.Arrays;

import java.util.Comparator;

public class BookDriver {
	public static void main(String[] args) {
		Book[] books= {
		 new Book(5,"48 laws of power",499),
		 new Book(3,"The art of war",299),
		 new Book(1,"Laws of Human Nature",899),
		};

		SortById sortid=new SortById();
		SortByTitle sorttitle= new SortByTitle();
		SortByPrice sortprice = new SortByPrice();
		Arrays.sort(books,sortprice);
		for(Book book:books) {
			System.out.println(book);
		}


	}

}
