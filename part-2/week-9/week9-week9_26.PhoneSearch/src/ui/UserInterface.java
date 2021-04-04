package ui;

import domain.Address;
import domain.Person;
import repository.PhoneRepository;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private PhoneRepository phoneRepository;

    public UserInterface(Scanner reader,
                         PhoneRepository phoneRepository) {
        this.reader = reader;
        this.phoneRepository = phoneRepository;
    }

    public void start() {
        printMenu();
        while (true) {
            System.out.print("\ncommand: ");
            String command = reader.nextLine();
            if ("1".equals(command)) {
                addPhoneNumber();
            } else if ("2".equals(command)) {
                searchForAPhoneNumber();
            } else if ("3".equals(command)) {
                searchForAPersonByPhoneNumber();
            } else if ("4".equals(command)) {
                addAnAddress();
            } else if ("5".equals(command)) {
                searchForPersonalInformation();
            } else if ("6".equals(command)) {
                deletePersonalInformation();
            } else if ("7".equals(command)) {
                filteredListing();
            } else if ("x".equals(command)) {
                break;
            }
        }
    }

    private void printMenu() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number ");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

    private void addPhoneNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();

        phoneRepository.add(name, number);
    }

    private void searchForAPhoneNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();

        Person person = phoneRepository.searchByName(name);
        PersonPrettyPrinter.printPhoneNumbers(person);
    }

    private void searchForAPersonByPhoneNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();

        Person person = phoneRepository.searchByNumber(number);
        PersonPrettyPrinter.printName(person);
    }

    private void addAnAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();

        System.out.print("street: ");
        String street = reader.nextLine();

        System.out.print("city: ");
        String city = reader.nextLine();

        phoneRepository.updateAddress(name, new Address(street, city));
    }

    private void searchForPersonalInformation() {
        System.out.print("whose number: ");
        String name = reader.nextLine();

        Person person = phoneRepository.searchByName(name);
        PersonPrettyPrinter.printPersonalInformation(person);
    }

    private void deletePersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        phoneRepository.remove(name);
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        List<Person> filtered = phoneRepository.getAllSortedByName(keyword);
        PersonPrettyPrinter.printPeople(filtered);
    }
}
