package sprint3.n2exercici1.contactmanager;

import sprint3.n2exercici1.address.Address;
import sprint3.n2exercici1.address.AddressES;
import sprint3.n2exercici1.telephone.Telephone;
import sprint3.n2exercici1.telephone.TelephoneES;

public class ContactES implements ContactFactory {
    @Override
    public Address createAddress(String street, String town, String provinceCountyState, String postCode) {
        return new AddressES(street, town, provinceCountyState, postCode);
    }

    @Override
    public Telephone createTelephone(String number) {
        return new TelephoneES(number);
    }
}
