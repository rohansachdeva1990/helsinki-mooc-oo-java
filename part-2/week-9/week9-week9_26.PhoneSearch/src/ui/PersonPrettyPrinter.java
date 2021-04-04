package ui;

import domain.Person;

import java.util.List;
import java.util.Set;

/**
 * Printing logic could have been done in the Person class. Also some duplication could be avoided
 */
public class PersonPrettyPrinter {

    static void printPhoneNumbers(final Person person) {
        if (null == person) {
            System.out.println("  not found");
            return;
        }

        Set<String> phoneNumbers = person.getPhoneNumbers();
        if (phoneNumbers.isEmpty()) {
            System.out.println(" phone number not found");
        } else {
            for (String phoneNumber : phoneNumbers) {
                System.out.println(" " + phoneNumber);
            }
        }
    }

    static void printName(final Person person) {
        if (null == person) {
            System.out.println("  not found");
            return;
        }

        System.out.println(" " + person.getName());
    }

    static void printPersonalInformation(final Person person) {
        if (null == person) {
            System.out.println("  not found");
            return;
        }

        System.out.println(String.format("  %s", person.getAddress()));
        Set<String> phoneNumbers = person.getPhoneNumbers();
        StringBuilder builder = new StringBuilder();
        if (phoneNumbers.isEmpty()) {
            builder.append("  phone number not found");
        } else {
            builder.append("  phone numbers:");
            for (String phoneNumber : phoneNumbers) {
                builder.append("\n   ").append(phoneNumber);
            }
        }
        System.out.println(builder.toString());
    }

    static void printPeople(final List<Person> people) {
        if (people.isEmpty()) {
            System.out.println(" keyword not found");
        } else {
            for (Person person : people) {
                System.out.println();
                printPerson(person);
            }
        }
    }

    private static void printPerson(final Person person) {

        if (null == person) {
            System.out.println(" not found");
            return;
        }

        System.out.println(" " + person.getName());
        System.out.println(String.format("  %s", person.getAddress()));
        Set<String> phoneNumbers = person.getPhoneNumbers();
        StringBuilder builder = new StringBuilder();
        if (phoneNumbers.isEmpty()) {
            builder.append("  phone number not found");
        } else {
            builder.append("  phone numbers:");
            for (String phoneNumber : phoneNumbers) {
                builder.append("\n   ").append(phoneNumber);
            }
        }
        System.out.println(builder.toString());
    }
}
