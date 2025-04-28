package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Driver3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c = Person.class;
		Constructor<Person>cons=c.getConstructor(String.class, int.class);
		
		Person p = cons.newInstance("rajat",22);
		System.out.println(p);
		
	}
}
