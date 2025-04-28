package Reflection;

public class Driver1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<Person> c = Person.class;
		Class<Person>c2= (Class<Person>) new Person("Rajat",22).getClass();
		Class<Person> c3 =(Class<Person>) Class.forName("Reflection.Person");
	}

}
