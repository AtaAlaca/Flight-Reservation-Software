package nein.neinco;

public class Ticket  {

    //Fields.
    private String dateOfFlight ;
    private String flightNumber ;
    private String seatNumber ;
    private String flightRoute ;


    //Constructor.
    public Ticket(String dateOfFlight, String flightNumber, String seatNumber, String flightRoute) {
        this.dateOfFlight = dateOfFlight;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.flightRoute = flightRoute ;
    }


    //Methods.
    public void validateFlightInformation(){

        if (this.dateOfFlight != dateOfFlight && this.flightNumber != flightNumber) {
            System.out.println("INVALID FLIGHT INFORMATION !");
            }

        else if (this.seatNumber != seatNumber && this.flightRoute != flightRoute){
            System.out.println("INVALID FLIGHT INFORMATION !");
            }

        else
            System.out.println("VALID FLIGHT INFORMATION.");
    }



    //Getters & Setters.
    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getFlightRoute() {
        return flightRoute;
    }


}
