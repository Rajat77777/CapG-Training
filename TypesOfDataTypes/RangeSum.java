package TypesOfDataTypes;

import java.util.Scanner;

public class RangeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int lower = sc.nextInt();
		System.out.println("Enter upper limit");
		int upper = sc.nextInt();
		if(upper<lower) {
			System.out.println("Range entered is invalid");
		}else {
			int sum=0;
			for(int i=lower;i<=upper;i++) {
				
				sum = sum+i;
				
				
			}
			System.out.println(sum);
		}
		
		
		
	}

}
