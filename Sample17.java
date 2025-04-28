package variables;

import java.util.Scanner;

public class Sample17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int o = n;
		int count =0;
		int sum =0;
		while(n>0) {
			n=n/10;
			count++;
		}
		n=o;
		while(n>0) {
			int digit = n%10;
			sum+=Math.pow(digit,count);
			n=n/10;
			
		}
		if (sum==o){
			System.out.println("The number is armstrong");
		}
		else {
			System.out.println("The number is not armstrong");
		}
			
	}

}
