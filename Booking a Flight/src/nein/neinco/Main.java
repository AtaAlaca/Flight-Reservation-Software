package nein.neinco;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ");

        Traveller bob = new Traveller("Bob","bob@lfsk.com","767824898","98248923489289253852","832") ;

        System.out.println("Passenger Name: " + bob.getFullName());
        System.out.println("Passenger phone number: " + bob.getPhoneNumber());
        System.out.println("Passenger email: " + bob.getEmail());

        System.out.println(" ");

        bob.validatePersonalInformation();
        bob.validateCreditCardInformation();
        
        System.out.println(" ");

        Ticket ticketToMunchen = new Ticket("10.05.22", "37", "12", "Atlantic") ;

        System.out.println(" ");
        System.out.println("Date of Flight: " + ticketToMunchen.getDateOfFlight());
        System.out.println("Flight Number: " + ticketToMunchen.getFlightNumber());
        System.out.println("Flight Route: " + ticketToMunchen.getFlightRoute());
        System.out.println("Seat Number: " + ticketToMunchen.getSeatNumber());
        System.out.println(" ");

        ticketToMunchen.validateFlightInformation();




    }
}
