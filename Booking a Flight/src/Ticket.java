public class Ticket {

    //Fields.
    private String dateOfFlight ;
    private int flightNumber ;
    private int seatNumber ;
    private String flightRoute ;


    //Constructor.
    public Ticket(String dateOfFlight, int flightNumber, int seatNumber, String flightRoute) {
        this.dateOfFlight = dateOfFlight;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.flightRoute = flightRoute ;
    }


    //Methods.


    //Getters & Setters.
    public String getDateOfFlight() {
        return dateOfFlight;
    }


    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }


    public int getFlightNumber() {
        return flightNumber;
    }


    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }


    public int getSeatNumber() {
        return seatNumber;
    }


    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public String getFlightRoute() {
        return flightRoute;
    }


    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }
}
