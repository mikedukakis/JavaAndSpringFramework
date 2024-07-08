package sprint3.n2exercici1.address;

public class AddressUS implements Address {
    private String street;
    private String city;
    private String provinceCountyState;
    private String postcode;
    private static final String COUNTRY = "USA";

    public AddressUS(String street, String city, String provinceCountyState, String postcode) {
        this.street = street;
        this.city = city;
        this.provinceCountyState = provinceCountyState;
        this.postcode = postcode;
    }

    @Override
    public String getFullAddress() {
        return this.street + ", " + this.city + ". " + this.provinceCountyState +
                ", " + this.postcode + ". " + COUNTRY;
    }
}
