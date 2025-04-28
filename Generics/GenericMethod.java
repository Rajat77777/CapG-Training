package Generics;

public class GenericMethod {
	static public<T> void printArray(T[] arr) {
		for(T i:arr) {
			System.out.println(i+ "\t");
		}
	}
	
	public static void main(String[] args) {
		Double[] arr = {1.2,2.3,4.8,5.9};
		printArray(arr);
	}

}
