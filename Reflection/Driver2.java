package Reflection;

import java.lang.reflect.Constructor;

public class Driver2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<Person> c= Person.class;

		Constructor<?> con1 = c.getDeclaredConstructor();
		System.out.println(con1);
		Constructor<?> con2 = c.getConstructor(String.class,int.class);
		System.out.println(con2);
		
		Constructor<?>[] all_con = c.getDeclaredConstructors();
		for(Constructor<?>constructor: all_con) {
			System.out.println(constructor);
			
		}
		
	
	}

}
