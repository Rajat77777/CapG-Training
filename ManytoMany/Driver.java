package ManytoMany;

public class Driver {

	
		 public static void main(String[] args) {
		        Subject math = new Subject("Mathematics");
		        Subject science = new Subject("Science");
		        Subject history = new Subject("History");

		        Student student1 = new Student("Deepon", "deepon@example.com", 3);
		        Student student2 = new Student("Biswas", "bobbiswas@example.com", 2);

		        student1.addSubject(math);
		        student1.addSubject(science);
		        student2.addSubject(science);
		        student2.addSubject(history);

		        System.out.println("Student 1 Subjects: " + java.util.Arrays.toString(student1.getSubjects()));
		        System.out.println("Student 2 Subjects: " + java.util.Arrays.toString(student2.getSubjects()));

		        student1.removeSubject(science);
		        System.out.println("Student 1 Subjects after removal: " + java.util.Arrays.toString(student1.getSubjects()));
		    }
}
