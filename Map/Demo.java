package Map;

import java.util.HashMap;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(1, "Bhargab");
		h.put(4, "Oblas");
		h.put(9, "Rajat");
		h.put(6, "Sam");
		h.put(4, "Oritra");
		h.remove(1,"Zoo");
		System.out.println(h);
		
//		Set<Map.Entry<Integer,String>>entry_set=h.entrySet();
//		
//		for(Map.Entry<Integer,String>entry:entry_set) {
//			
//		}
		
		Set<Integer> key_set=h.keySet();
	
		for(int key: key_set) {
			System.out.println(key+"\t"+h.get(key));
			
		}
	
	}

}
