package repository;

import domain.Address;
import domain.Person;

import java.util.List;

public interface PhoneRepository {
    void add(String name, String number);

    Person searchByName(String name);

    Person searchByNumber(String number);

    void updateAddress(String name, Address address);

    void remove(String name);

    List<Person> getAllSortedByName(String keyword);
}
