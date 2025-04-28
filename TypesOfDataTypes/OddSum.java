package TypesOfDataTypes;

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int lower = sc.nextInt();
		System.out.println("Enter upper limit");
		int upper = sc.nextInt();
		int sum =0;
		for(int i=lower;i<=upper;i++) {
			if(i%2 !=0)
				sum += i;
		}
		System.out.println(sum);
	}

}
