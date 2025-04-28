package AnnotationReflect;

public class Task {

	@Role("user")
	public void userTask() {
		System.out.println("User Task");
	}
	
	@Role("admin")
	public void adminTask() {
		System.out.println("Admin Task");
	}
}
