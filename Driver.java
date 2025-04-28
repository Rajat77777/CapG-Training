package variables;


	public class Driver{
		
		public static void main(String[] args) {
			Laptop lap = new Laptop("Dell",67000,8);
	
			
			System.out.println(lap.brand+"\t"+lap.price+"\t"+lap.ram);
			Laptop lap2 = new Laptop("HP",57000,12);
			System.out.println(lap2.brand+"\t"+lap2.price+"\t"+lap2.ram);

		
			
		}
	}


