package EmployeeManageSystem;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	Employee(int id, String name,double salary){
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "Name:"+this.name+"\t"+"ID:"+this.id+"\t"+"Salary"+this.salary;
		
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

	@Override
	public int compareTo(Employee emp) {
		return this.id-emp.id;

		
	}

}

