package Reflection;

import java.lang.reflect.Method;

public class Driver4 {
	public static void main(String[] args) {
		Class<Person> c = Person.class;
		Method[] all_methods = c.getMethods();

		Method[] same_class_methods= c.getDeclaredMethods();
//		for(Method method:same_class_methods)
//		{
//			System.out.println(method);
//		}
		
		Class<Object> c2 = (Class<Object>) c.getSuperclass();
		Method[] object_class_all_methods=c2.getDeclaredMethods();
		for(Method method : object_class_all_methods) {
			System.out.println(method);
		}

	}
}




