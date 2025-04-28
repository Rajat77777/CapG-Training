package Composition;

public class Car extends Vehicle{

	Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
	
	}
	private int numberOfDoors;
	public void displayDetails() {
		displayDetailsVehicle();
		System.out.println(this.numberOfDoors);
	}

	
}
