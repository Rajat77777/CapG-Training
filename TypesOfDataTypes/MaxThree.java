package TypesOfDataTypes;

import java.util.Scanner;

public class MaxThree {
	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		if( a >= b && a >= c)
            System.out.println(a + " is the largest number.");

        else if (b >= a && b >= c)
            System.out.println(b + " is the largest number.");

        else
            System.out.println(c + " is the largest number.");
	}

}
