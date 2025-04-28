package TypesOfDataTypes;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		System.out.println("Enter upper number");
		Scanner sc = new Scanner(System.in);
		int upper = sc.nextInt();
		System.out.println("Enter lower number");
		int lower = sc.nextInt();
		for(int i=lower;i<=upper;i++) {
			System.out.println(i);
		}
	}

}
