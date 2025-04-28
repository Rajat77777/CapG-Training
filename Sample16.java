package variables;

import java.util.Scanner;

public class Sample16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int odd=0;
		int even=0;
		int d=0;
		while(num>0) {
			d=num%10;
			if(d%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		int result=even*odd;
		System.out.println(result);
	}

}
