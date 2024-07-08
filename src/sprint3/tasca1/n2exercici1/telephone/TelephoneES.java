package sprint3.tasca1.n2exercici1.telephone;

public class TelephoneES implements Telephone {
    private static final String INTERNATIONAL_CODE = "+34";
    private String telephoneNumber;

    public TelephoneES(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String getTelephone() {
        return INTERNATIONAL_CODE + " " + this.telephoneNumber;
    }


}
