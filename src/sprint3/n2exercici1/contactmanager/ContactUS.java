package sprint3.n2exercici1.contactmanager;

import sprint3.n2exercici1.address.Address;
import sprint3.n2exercici1.address.AddressUS;
import sprint3.n2exercici1.telephone.Telephone;
import sprint3.n2exercici1.telephone.TelephoneUS;

public class ContactUS implements ContactFactory {
    @Override
    public Address createAddress(String street, String town, String provinceCountyState, String postCode) {
        return new AddressUS(street, town, provinceCountyState, postCode);
    }

    @Override
    public Telephone createTelephone(String number) {
        return new TelephoneUS(number);
    }
}
