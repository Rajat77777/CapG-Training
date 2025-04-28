package variables;

public class DriverClass {
	

		public static void main(String[] args) {
			Employee e1 = new Employee("Bhargab",85000,9876543210l);
			Employee e2 = new Employee("Oblas",5000,8469751234l);
			Employee e3 = new Employee("AnitBhai",80000,7469851342l);

			System.out.println(e1.name+"\t"+e1.salary+"\t"+e1.mob);
			System.out.println(e2.name+"\t"+e2.salary+"\t"+e2.mob);

			System.out.println(e3.name+"\t"+e3.salary+"\t"+e3.mob);


		}
	}


