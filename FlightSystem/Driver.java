package FlightSystem;

import java.util.List;

public class Driver {

	 public static void main(String[] args) {
	        FlightScheduleManager flightSystem = new FlightScheduleManager();
	        
	        flightSystem.addFlight(new Flight("INT123", "10:00", "12:30", 150));
	        flightSystem.addFlight(new DomesticFlight("DOM456", "08:00", "09:30", 100, "CA"));
	        flightSystem.addFlight(new DomesticFlight("DOM789", "14:00", "16:45", 200, "NY"));
	        
	        
	        boolean booked = flightSystem.bookFlight("DOM456", 2);
	        System.out.println("Booking status: " + (booked ? "Success" : "Failed"));
	        
	        List<Flight> available = flightSystem.getAvailableFlights("08:00", "20:00");
	        System.out.println("Available flights:");
	        for (Flight f : available) {
	            System.out.println(f.getFlightInfo());
	        }
	    }
	}

