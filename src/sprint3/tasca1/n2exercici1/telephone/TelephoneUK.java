package sprint3.tasca1.n2exercici1.telephone;

public class TelephoneUK implements Telephone {
    private static final String INTERNATIONAL_CODE = "+44";
    private String telephoneNumber;

    public TelephoneUK(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String getTelephone() {
        return INTERNATIONAL_CODE + " " + this.telephoneNumber;
    }

}
