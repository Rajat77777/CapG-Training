package variables;

import java.util.Scanner;

public class Sample22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name=new String[4];
		for(int i=0;i<4;i++) {
			name[i]=sc.next();
		}
		for(String s:name) {
			System.out.println(s+"");
		}
	}

}
