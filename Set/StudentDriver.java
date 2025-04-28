package Set;

import java.util.HashSet;
import java.util.Set;

public class StudentDriver {
	public static void main(String[] args) {
		Set<Student> h = new HashSet<Student>();
		Student s1 = new Student(77, "Rajat", 98.7);
		Student s2 = new Student(87, "Oblas", 88.7);
		h.add(s1);
		h.add(s2);
		System.out.println(h);
		h.add(s2);
		System.out.println(h);
		
	}

}
