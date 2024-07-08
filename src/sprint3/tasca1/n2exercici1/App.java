package sprint3.tasca1.n2exercici1;

import sprint3.tasca1.n2exercici1.address.Address;
import sprint3.tasca1.n2exercici1.contactmanager.*;
import sprint3.tasca1.n2exercici1.telephone.Telephone;

import java.util.ArrayList;

public class App {
    private ContactFactory factory;
    private ArrayList<Contacts> contacts;

    public App() {
        this.contacts = new ArrayList<>();
    }

    public int userOption() {
        int option;
        option = KeyboardInputHandling.readInt("Please, choose an option:");
        return option;
    }

    public String menu() {
        return "Contact Manager. Please choose an option:\n" +
                "0. Exit\n" +
                "1. Enter new contact\n" +
                "2. View contacts";
    }

    public String countryMenu() {
        return "Please choose a country for the new contact:\n" +
                "1. Spain\n" +
                "2. UK\n" +
                "3. US";
    }

    public boolean optionManger() {
        boolean exit = false;
        int country;
        do {
            System.out.println(menu());
            switch (userOption()) {
                case 0:
                    System.out.println("Thanks for using the Contact Manager");
                    exit = true;
                    break;
                case 1:
                    country = selectCountry();
                    if (country == 1) {
                        factory = new ContactES();
                    } else if (country == 2) {
                        factory = new ContactUK();
                    } else if (country == 3) {
                        factory = new ContactUS();
                    }
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                default:
                    System.out.println("Choose an option from 0 to 2");
            }
        } while (!exit);
        return exit;
    }

    public int selectCountry() {
        int countryCode = 0;
        boolean exit = false;
        do {
            System.out.println(countryMenu());
            switch (userOption()) {
                case 1:
                    countryCode = 1;
                    exit = true;
                    break;
                case 2:
                    countryCode = 2;
                    exit = true;
                    break;
                case 3:
                    countryCode = 3;
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong option, please choose 1 to 3");
            }
        } while (!exit);

        return countryCode;
    }

    public void run() {
        boolean exit;
        do {
            exit = optionManger();
        } while (!exit);
    }

    public void addContact() {
        System.out.println("Please enter the contact's first name:");
        String fname = KeyboardInputHandling.readString("Enter the contact's first name:");
        System.out.println("Please enter the contact's last name:");
        String lname = KeyboardInputHandling.readString("Enter the contact's first name:");
        System.out.println("Please enter street, number, floor, etc., details:");
        String street = KeyboardInputHandling.readString("Enter the street details:");
        System.out.println("Please enter your town/city:");
        String town = KeyboardInputHandling.readString("Enter the town/city:");
        System.out.println("Please enter your province/county/state:");
        String provinceCountyState = KeyboardInputHandling.readString("Enter the province/county/state:");
        System.out.println("Please enter your postcode/zipcode:");
        String postcode = KeyboardInputHandling.readString("Enter the postcode/zipcode:");
        System.out.println("Please enter your telephone number:");
        String telephone = KeyboardInputHandling.readString("Enter the telephone number:");

        Address address = factory.createAddress(street, town, provinceCountyState, postcode);
        Telephone tel = factory.createTelephone(telephone);
        Contacts contact = new Contacts(fname, lname, address, tel);
        contacts.add(contact);
        System.out.println("Contact added");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts could be found");
        } else {
            for (Contacts element : contacts) {
                System.out.println(element.toString());
            }
        }

    }
}
