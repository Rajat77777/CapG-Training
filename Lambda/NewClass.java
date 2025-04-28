package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewClass {
	public static void main(String[] args) {
		List<Double> a = Arrays.asList(14.5,12.6,45.8,27.7,26.3);
		Collections.sort(a,(s1,s2)->s2.compareTo(s1));
		
		a.forEach(s ->System.out.println(s));
	}

}
