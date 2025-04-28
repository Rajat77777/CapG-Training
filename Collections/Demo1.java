package Collections;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);

		a.add(1, 101);
		System.out.println(a);

	}

}
