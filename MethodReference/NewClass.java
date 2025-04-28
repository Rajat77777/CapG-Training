package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewClass {
	public static void main(String[] args) {
		List<String> list2 = Arrays.asList("kaka","ok","fifteen","days","training");
//		List<String>res=list2.stream().map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(res);
		
		String res = list2.stream().filter(s->s.charAt(0)=='A').findFirst().get());
	}

}
