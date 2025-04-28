package MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,6,8,2,7);

		Collections.sort(list,Integer::compareTo);
		list.forEach(System.out::print);
	}

}
