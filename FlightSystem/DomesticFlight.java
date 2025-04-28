package FlightSystem;


	public class DomesticFlight extends Flight {
	    private String stateCode;

	    public DomesticFlight(String flightId, String departureTime, String arrivalTime, 
	                          int availableSeats, String stateCode) {
	        super(flightId, departureTime, arrivalTime, availableSeats);
	        this.stateCode = stateCode;
	    }

	    @Override
	    public String getFlightInfo() {
	        return super.getFlightInfo() + ", State Code: " + stateCode;
	    }

	    public String getStateCode() {
	        return stateCode;
	    }
	}



