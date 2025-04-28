package Inheritance;

public class Child extends Parent {


	int studentID;
	
	public void displayStudentDetails(int studentID) {
		System.out.println(this.studentID);
	}
	public int getID(int studentID) {
		return studentID;
	}
	public void setID(int studentID) {
		this.studentID=studentID;
	}

	
}
