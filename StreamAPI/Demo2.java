package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,6,7,8,2,1,6,9);
		List<Integer>res = list.stream().filter(n->n%2==0).toList();
		System.out.println(res);
		int max= list.stream().max(Integer::compare).get();
		System.out.println(max);
		List<String> list2 = Arrays.asList("kaka","ok","fifteen","days","training");
//		Map<Integer,List<String>>map =list2.stream().collect(Collectors.groupingBy(String::length));
//		System.out.println(map);
		
	}

}
