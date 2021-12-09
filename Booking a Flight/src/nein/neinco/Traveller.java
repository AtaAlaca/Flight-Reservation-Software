package nein.neinco;

public class Traveller {

    private String fullName ;
    private String email ;
    private String phoneNumber ;
    private String creditCardNumber ;
    private String CVV ;

    //Constructor.
    public Traveller(String fullName, String email, String phoneNumber, String creditCardNumber, String CVV) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.CVV = CVV;
    }


    //Methods.
    public void validatePersonalInformation() {
        if (this.fullName != fullName && this.email != email) {
            System.out.println("INVALID PASSENGER INFORMATION !");
        }

        else if (this.phoneNumber != phoneNumber) {
            System.out.println("INVALID PASSENGER INFORMATION !");
        }

        else
            System.out.println("VALID PASSENGER INFORMATION.");
    }

    public void validateCreditCardInformation() {


        if (this.creditCardNumber != creditCardNumber && this.CVV != CVV){
            System.out.println("INVALID CREDIT CARD INFORMATION !");
        }

        else
            System.out.println("VALID CREDIT CARD INFORMATION.");
    }

    //Getters And Setters.
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
}
