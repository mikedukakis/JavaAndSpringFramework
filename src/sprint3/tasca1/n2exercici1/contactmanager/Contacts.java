package sprint3.tasca1.n2exercici1.contactmanager;

import sprint3.tasca1.n2exercici1.address.Address;
import sprint3.tasca1.n2exercici1.telephone.Telephone;

public class Contacts {
    private String fname;
    private String lname;
    private Address address;
    private Telephone telephone;

    public Contacts(String fname, String lname, Address address, Telephone telephone) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Full Name: " + fname + " " + lname + '\n' +
                "Address: " + address.getFullAddress() + '\n' +
                "Telephone: " + telephone.getTelephone() + '\n';
    }
}
