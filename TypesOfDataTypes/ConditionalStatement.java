package TypesOfDataTypes;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		System.out.println("Enter amount of money Chinchan has:");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int price = 40;
		if(money>=price) {
			System.out.println("Chinchan will have ice-cream");
		}
		
		
	}

}
