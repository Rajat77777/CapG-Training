package variables;

public class StudentDriver {
	public static void main(String[] args) {
		Class clazz = new Class(10);
		clazz.addStudents("Rajat");
		clazz.addStudents("Aritra");
		clazz.addStudents("Rahul");

		clazz.display();

		
	}

}
