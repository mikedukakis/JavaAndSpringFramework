package sprint3.tasca1.n2exercici1.contactmanager;

import sprint3.tasca1.n2exercici1.address.Address;
import sprint3.tasca1.n2exercici1.address.AddressUK;
import sprint3.tasca1.n2exercici1.telephone.Telephone;
import sprint3.tasca1.n2exercici1.telephone.TelephoneUK;

public class ContactUK implements ContactFactory {
    @Override
    public Address createAddress(String street, String town, String provinceCountyState, String postCode) {
        return new AddressUK(street, town, provinceCountyState, postCode);
    }

    @Override
    public Telephone createTelephone(String number) {
        return new TelephoneUK(number);
    }
}
