package sprint3.n2exercici1.address;

public class AddressUK  implements Address {
    private String street;
    private String town;
    private String provinceCountyState;
    private String postcode;
    private static final String COUNTRY = "UK";

    public AddressUK(String street, String town, String provinceCountyState, String postcode) {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
        this.provinceCountyState = provinceCountyState;
    }

    @Override
    public String getFullAddress() {
        return this.street + ", " + this.town + ". " + this.provinceCountyState +
                ", " + this.postcode + ". " + COUNTRY;
    }
}
