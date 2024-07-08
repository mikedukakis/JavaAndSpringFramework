package sprint3.tasca1.n2exercici1.contactmanager;

import sprint3.tasca1.n2exercici1.address.Address;
import sprint3.tasca1.n2exercici1.telephone.Telephone;

public interface ContactFactory {
    Address createAddress(String street, String town, String provinceCountyState, String postCode);

    Telephone createTelephone(String number);
}
