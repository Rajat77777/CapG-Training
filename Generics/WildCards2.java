package Generics;

import java.util.*;
public class WildCards2 {
	public static<T>void printLinkedList(LinkedList<?>list){
		for(Object i:list) {
			System.out.println(i+"\t");
		}
		
		Object i = list.get(0);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		printLinkedList(list);


	}

}
