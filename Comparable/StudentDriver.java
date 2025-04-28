package Comparable;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] students= {
				new Student(1,"Sam",99.99),
				new Student(4,"Ram",98.99),
				new Student(5,"Jam",95.96),
				new Student(2,"Shyam",97.92),



				
		};
		Arrays.sort(students);
		
		for(Student student: students) {
			System.out.println(student);
		}
	}

}
