package EmployeeManageSystem;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome------");
		while(true) {
		System.out.println("1.Add Employee. \n 2.Print all Employees. \n 3.Search Employee \n 4. Search Employee by ID \n 5. Delete Employee \n 6. Delete Employee by ID \n 7.Update Employee by ID \n 8. Sort Employee");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			Employee emp=createEmployeeObject(sc);
			Employees.addEmployee(emp);
			break;
		}
		
		case 2:{
			Employees.printAllEmployees();
			break;
		}
		case 3:{
			Employee emp= createEmployeeObject(sc);
			boolean result=Employees.searchObject(emp);
			System.out.println(result);
		}
		case 4:{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			boolean res= Employees.searchById(id);
			if(res ==true) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}
			break;
		}
		case 5:{
			Employee emp= createEmployeeObject(sc);
			Employees.removeObject(emp);
			System.out.println();

			
		}
		
		case 6:{
			 System.out.println("Enter id:");
             int id = sc.nextInt();
             boolean res =Employees.removeById(id);
             break;
			
		}
		case 7:{
			System.out.println("Enter id");
			int id=sc.nextInt();
			boolean res=Employees.searchById(id);
			if(res) {
				Employees.updateById(id, sc);
			}else {
				System.out.println("Employees not found");
				break;
			}
			
		}
		case 8:{
			Employees.sort();
			break;
		}
			default:System.exit(0);
			break;
		}
		
		}
		}
		




	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("Enter Id, Name and salary");
		Employee emp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		return emp;
		

		
	}
	
	
}
