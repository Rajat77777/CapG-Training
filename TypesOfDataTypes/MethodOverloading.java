package TypesOfDataTypes;

public class MethodOverloading {
	public static void add(int a,int b ) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void add(int a,char c) {
		System.out.println(a+c);
	}
	public static void main(String[] args) {
		add(10,5);
		add(5,'a');
	}

}
