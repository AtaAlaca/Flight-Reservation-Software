package nein.neinco;

public class Main {

    public static void main(String[] args) {


        Ticket ticketToMunchen = new Ticket("10.05.22", "37", "12", "Atlantic") ;

        ticketToMunchen.validatePersonalInformation();
        ticketToMunchen.validateCreditCardInformation();

        System.out.println(" ");
        System.out.println("Passenger Name: " + ticketToMunchen.getFullName());
        System.out.println("Passenger phone number: " + ticketToMunchen.getPhoneNumber());
        System.out.println("Passenger email: " + ticketToMunchen.getEmail());

        System.out.println(" ");

        System.out.println("Date of Flight: " + ticketToMunchen.getDateOfFlight());
        System.out.println("Flight Number: " + ticketToMunchen.getFlightNumber());
        System.out.println("Flight Route: " + ticketToMunchen.getFlightRoute());
        System.out.println("Seat Number: " + ticketToMunchen.getSeatNumber());
        System.out.println(" ");

        ticketToMunchen.validateFlightInformation();




    }
}
