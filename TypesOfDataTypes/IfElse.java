package TypesOfDataTypes;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=0) {
			System.out.println("The number is positive");
		}else {
			System.out.println("The number is negative");
		}
	}

}
