package Objects;

public class StudentDriver {
	 public static void main(String[] args) {
	        Student student1 = new Student(1, "Rahim", 85.5);
	        Student student2 = new Student(2, "Ram", 92.0);
	        Student student3 = new Student(1, "Sam", 78.9);

	        System.out.println(student1);
	        System.out.println(student2);
	        System.out.println(student3);

	        System.out.println("student1 equals student2: " + student1.equals(student2));
	        System.out.println("student1 equals student3: " + student1.equals(student3));

	        System.out.println("student1 hashcode: " + student1.hashCode());
	        System.out.println("student2 hashcode: " + student2.hashCode());
	        System.out.println("student3 hashcode: " + student3.hashCode());
	    }
}
