package Composition;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public void displayDetailsVehicle() {
		System.out.println(this.vehicleNumber);
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.rentalPricePerDay);
		System.out.println(this.isAvailable);
	}

		public void rentVehicle() {
			if(this.isAvailable) {
				System.out.println("Car is available");
				System.out.println("Price for the avaialable car is:"+this.rentalPricePerDay);
			}
			
			
		}
		Vehicle(String vehicleNumber, String brand, String model,double rentalPricePerDay,boolean isAvailable){
			this.vehicleNumber=vehicleNumber;
			this.brand=brand;
			this.model=model;
			this.rentalPricePerDay=rentalPricePerDay;
			this.isAvailable=isAvailable;
		}
		
	
		public void rentVhicle() {
			if(this.isAvailable) {
				System.out.println("Car is available");
				System.out.println("Rental price of car is: "+rentalPricePerDay);
			}
		}


		
	}


