package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> h = new TreeSet<Integer>();
		h.add(10);
		h.add(90);
		h.add(50);
		h.add(70);
		System.out.println(h);
	}
}
