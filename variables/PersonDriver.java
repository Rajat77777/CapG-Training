package variables;

public class PersonDriver {
	public static void main(String[] args) {
		Passport passport = new Passport("12345");
		Person person = new Person("Rajat",passport);
		
		System.out.println(person.getName());
		System.out.println(person.getPassport().getPassport_number());
	}

}
