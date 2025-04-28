package Reflection;

import java.lang.reflect.Method;

public class Driver5 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<Person> c= Person.class;
		
		Method m1=c.getMethod("getDetails");
		System.out.println(m1);
	}

}
