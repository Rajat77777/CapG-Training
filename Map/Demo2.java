package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo2 {


	public static void main(String[] args) {
		LinkedHashMap<Integer,String> h = new LinkedHashMap<Integer, String>();
		h.put(5,"Anit");
		h.put(2,"Oritra");
		h.put(4,"Gaurav");
		System.out.println(h);
		h.put(2,"Bhai");
		System.out.println(h);
		h.remove(4,"Gaurav");
		System.out.println(h);
		Set<Integer> key_set=h.keySet();
		
		for(int key: key_set) {
			System.out.println(key+"\t"+h.get(key));
			
		}
	}

}
