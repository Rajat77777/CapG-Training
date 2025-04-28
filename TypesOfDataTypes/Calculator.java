package TypesOfDataTypes;

public class Calculator {
	public static void sub(int a,int b ) {
		System.out.println(a-b);
	}
	public static void sub(int a,int b,int c ) {
		System.out.println(a-b-c);
	}
	public static void prod(int a,int b ) {
		System.out.println(a*b);
	}
	public static void prod(int a,int b,int c ) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		sub(10,5);
		sub(50,10,20);
		prod(5,7);
		prod(7,9,5);
	}

}
