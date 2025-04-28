package Inheritance;

public class Parent {

	private String name;
	private int age;
	public void displayParentDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge(int age) {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	Parent(String name,int age){
		this.name=name;
		this.age=age;
	}
		
	
	

		
	
}
