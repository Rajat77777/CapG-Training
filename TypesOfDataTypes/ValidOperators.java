package TypesOfDataTypes;

import java.util.Scanner;

public class ValidOperators {
	public static void main(String[] args) {
		System.out.println("Enter the character:");
		Scanner sc = new Scanner(System.in);
		char k = sc.next().charAt(0);
		System.out.println("Enter first nuymber a:");
		int a = sc.nextInt();
		System.out.println("Enter second number b:");
		int b = sc.nextInt();
		if(k=='+') {
			System.out.println(a+b);
		}
		else if(k=='-') {
			System.out.println(a-b);
		}
		else if(k=='*') {
			System.out.println(a*b);
		}
		else if(k=='/') {
			System.out.println(a/b);
		}else {
			System.out.println("Not valid");
		}
		

	}

}
