package domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person> {

    private final String name;
    private final Set<String> phoneNumbers;
    private Address address;

    public Person(String name) {
        this.name = name;
        this.phoneNumbers = new HashSet<String>();
        this.address = new Address();
    }

    public void addNumber(String number) {
        this.phoneNumbers.add(number);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Set<String> getPhoneNumbers() {
        return Collections.unmodifiableSet(phoneNumbers);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
