package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> h = new HashSet<Integer>();
		h.add(50); 
		h.add(40); 
		h.add(70); 
		h.add(30); 
		System.out.println(h);
	}

}
