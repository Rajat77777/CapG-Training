package EmployeeManageSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Employees {
	static ArrayList<Employee>list_of_emp= new ArrayList<Employee>();
	public static void addEmployee(Employee emp) {
		list_of_emp.add(emp);
		System.out.println("Employee Added Successfully");
	}
	
	public static void printAllEmployees() {
		for(Employee emp:list_of_emp){
			System.out.println(emp);
		//using iterator
//		Iterator<Employee> itr = list_of_emp.iterator();
//		while(itr.hasNext()) {
//			Employee emp = itr.next();
//			System.out.println(emp);
		}
		
//		ListIterator<Employee>list_itr= list_of_emp.listIterator(list_of_emp.size());
//		while(list_itr.hasPrevious()) {
//			Employee emp = list_itr.previous();
			
			
		}
	
	public static boolean searchObject(Employee emp) {
		if(list_of_emp.contains(emp)) {
		
			return true;
		
		}
		return false;
		}

	public static boolean searchById(int id) {
		for(Employee emp: list_of_emp) {
			if(emp.getId()==id) {
				return true;
			}
		}
		return false;
	}

	public static void removeObject(Employee emp) {

		list_of_emp.remove(emp);
		System.out.println("Deleted");
	}

	public static boolean  removeById(int id) {

//		Iterator<Employee>itr=list_of_emp.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().getId()==id) {
//				itr.remove();
//				return true;
//			}
//		}
//		return false;
		Employee e = null;

		
		for(Employee emp:list_of_emp) {
			if(emp.getId()==id)
				list_of_emp.remove(id);
		}
		return list_of_emp.remove(e);

		
	}
	
	public static void updateById(int id,Scanner sc) {
		Employee old = null;
		for(Employee emp:list_of_emp) {
			if(emp.getId()==id) {
				old=emp;
			}
			System.out.println("Enter name,salary tro update");
			old.setName(sc.next());
			old.setSalary(sc.nextDouble());
			System.out.println("UPDATED");
		}
	}

	public static void sort() {

		Collections.sort(list_of_emp,Collections.reverseOrder());
		System.out.println("Employees are sorted");
	}
		
		
		
		
		
	}

	


