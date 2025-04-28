package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Integer> h = new LinkedHashSet<>();
		h.add(10); 
		h.add(40); 
		h.add(70); 
		h.add(60); 
		System.out.println(h);
		
	}

}
