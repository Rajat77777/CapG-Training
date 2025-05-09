package CaseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
	
		empList.forEach(System.out::println);
		Map<String, List<Employee>> emp = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(empList);
//		for(String city : empList.keySet()) {
//			System.out.println(city +"\n"+empList.get(city));
//			
//		}
//		List<String> allDepartments = empList.stream()
//                .map(e->e.getDeptName()).distinct.toList();
//		System.out.println(deptName);
		empList.stream()
        .filter(employee -> employee.getAge() > 28)
        .forEach(System.out::println);
		
		Employee list= empList.stream().max((e1,e2)->e1.getAge()-e2.getAge()).get();
		  Optional<Employee> youngestFemale = empList.stream()
	                .filter(employee -> employee.getGender().equals("F"))
	                .min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

		
		
		       
	}
	

}
