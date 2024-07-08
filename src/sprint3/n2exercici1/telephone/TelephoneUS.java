package sprint3.n2exercici1.telephone;

public class TelephoneUS implements Telephone {
    private static final String INTERNATIONAL_CODE = "+1";
    private String telephoneNumber;

    public TelephoneUS(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String getTelephone() {
        return INTERNATIONAL_CODE + " " + this.telephoneNumber;
    }
}
