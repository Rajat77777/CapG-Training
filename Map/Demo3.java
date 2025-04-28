package Map;

import java.util.Set;
import java.util.TreeMap;

public class Demo3 {
	public static void main(String[] args) {
		TreeMap<Integer,String> h = new TreeMap<Integer, String>();
		h.put(5,"Anit");
		h.put(2,"Oritra");
		h.put(4,"Gaurav");
		System.out.println(h);
        Set<Integer> key_set=h.keySet();
		
		for(int key: key_set) {
			System.out.println(key+"\t"+h.get(key));
			
		}

	}

}
