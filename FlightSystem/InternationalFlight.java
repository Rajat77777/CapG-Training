package FlightSystem;

public class InternationalFlight extends Flight {
	    private String CountryCode;

	    public InternationalFlight(String flightId, String departureTime, String arrivalTime, 
	                          int availableSeats, String CountryCode) {
	        super(flightId, departureTime, arrivalTime, availableSeats);
	        this.CountryCode = CountryCode;
	    }

	    @Override
	    public String getFlightInfo() {
	        return super.getFlightInfo() + ", Country Code: " + CountryCode;
	    }

	    public String getCountryCode() {
	        return CountryCode;
	    }
	}

}
