package Composition;

public class Bike extends Vehicle{

	Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);

	}
		private boolean hasGear;
		public void displayDetails() {
			System.out.println(this.hasGear);
		}
		public void getHasGear() {
			this.hasGear=hasGear;
			
		}
		public boolean setHasGear() {
			return hasGear;
		}
}		
		
		
	
	


