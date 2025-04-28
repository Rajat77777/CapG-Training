package Reflection;

 import java.lang.reflect.Field;

import Inheritance.Parent;

public class Driver6 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c = Person.class;
		Field[] all_var = c.getDeclaredFields();
		for(Field field: all_var) {
			System.out.println(field);
		}
		
		Field f = c.getDeclaredField("age");
		System.out.println(f);
		
 	}

}
