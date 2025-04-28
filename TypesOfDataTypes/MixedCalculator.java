package TypesOfDataTypes;

public class MixedCalculator {
	public static void sub(int a,char b ) {
		System.out.println(a-b);
	}
	public static void sub(int a,char b,int c ) {
		System.out.println(a-b-c);
	}
	public static void prod(int a,char b ) {
		System.out.println(a*b);
	}
	public static void prod(int a,char b,int c ) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		sub(200,'a');
		sub(100,'a',1);
		prod(5,'a');
		prod(7,'r',4);
		
	}

}
