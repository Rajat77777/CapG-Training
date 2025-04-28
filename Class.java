package variables;

public class Class {

	private int grade;
	private Student[] students = new Student[10];
	
	Class(int grade){
		this.grade= grade;
	}
	public int getGrade() {
		return grade;
	}
	public Student[] getStudents() {
		return students;
	}
	int i =0;
	void addStudents(String name) {
		students[i]= new Student(name);
		i++;
	}
	void display() {
		System.out.println("Class has ");
		for(Student s:students) {
			if(s!=null) {
				System.out.println(s.getName());
			}
		}
	}
}
