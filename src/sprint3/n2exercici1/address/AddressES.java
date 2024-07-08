package sprint3.n2exercici1.address;

public class AddressES implements Address {
    private String street;
    private String town;
    private String provinceCountyState;
    private String postcode;
    private static final String COUNTRY = "España";

    public AddressES(String street, String town, String provinceCountyState, String postcode) {
        this.street = street;
        this.town = town;
        this.provinceCountyState = provinceCountyState;
        this.postcode = postcode;
    }

    @Override
    public String getFullAddress() {
        return this.street + " " + this.town + ", " + this.provinceCountyState +
                ", " + this.postcode + ". " + COUNTRY;
    }
}
