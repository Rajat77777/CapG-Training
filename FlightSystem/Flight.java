package FlightSystem;



public class Flight {
    private String flightId;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;

    public Flight(String flightId, String departureTime, String arrivalTime, int availableSeats) {
        this.flightId = flightId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
    }

    public boolean bookSeats(int numberOfSeats) {
        if (isAvailable(numberOfSeats)) {
            availableSeats -= numberOfSeats;
            return true;
        }
        return false;
    }

    public boolean isAvailable(int numberOfSeats) {
        return availableSeats >= numberOfSeats;
    }

    public String getFlightInfo() {
        return "Flight ID: " + flightId + 
               ", Departure: " + departureTime + 
               ", Arrival: " + arrivalTime + 
               ", Available Seats: " + availableSeats;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
	


