package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Random {
	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(1,4,6,8,2,7);
//	List<Integer> res = new ArrayList<Integer>();
//	for(Integer i :list) {
//		if(i %2==0) {
//			res.add(i);
//		}
//		
//	}
//	System.out.println(res);
	
	List<Integer> res = list.stream().filter(i-> i%2==0).toList();
	System.out.println(res);
	
	List<Integer> result= list.stream().map(i->i*2).toList();
	System.out.println(result);
	}
	
	

}
