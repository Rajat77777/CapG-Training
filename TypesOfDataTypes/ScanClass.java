package TypesOfDataTypes;

import java.util.Scanner;

public class ScanClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("Enter a string");
		sc.nextLine();
		String s = sc.nextLine();
		
		System.out.print(s+num);
	}

}
