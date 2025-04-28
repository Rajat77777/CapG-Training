package Map;

import java.util.HashMap;

public class StudentDriver {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(1, "Bhargab");
		h.put(4, "Oblas");
		h.put(9, "Rajat");
		h.put(6, "Sam");
		h.put(4, "Oritra");
		h.remove(1,"Zoo");
		System.out.println(h);
	}

}
