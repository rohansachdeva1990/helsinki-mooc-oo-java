package repository;

import domain.Address;
import domain.Person;

import java.util.*;

public class FinnishPhoneRepository implements PhoneRepository {

    private Map<String, Person> phoneDataStore = new HashMap<String, Person>();

    @Override
    public void add(String name, String number) {
        if (!phoneDataStore.containsKey(name)) {
            phoneDataStore.put(name, new Person(name));
        }
        phoneDataStore.get(name).addNumber(number);
    }

    @Override
    public Person searchByName(String name) {
        return phoneDataStore.get(name);
    }

    @Override
    public Person searchByNumber(String number) {
        for (Map.Entry<String, Person> entry : phoneDataStore.entrySet()) {
            if (entry.getValue().getPhoneNumbers().contains(number)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void updateAddress(String name, Address address) {
        if (!phoneDataStore.containsKey(name)) {
            phoneDataStore.put(name, new Person(name));
        }
        phoneDataStore.get(name).setAddress(address);
    }

    @Override
    public void remove(String name) {
        phoneDataStore.remove(name);
    }

    @Override
    public List<Person> getAllSortedByName(String keyword) {
        List<Person> all = new ArrayList<Person>(phoneDataStore.values());
        Collections.sort(all);

        if (keyword == null || keyword.isEmpty()) {
            return all;
        }

        List<Person> filtered = new ArrayList<Person>();
        for (Person person : all) {
            Address address = person.getAddress();
            if (person.getName().contains(keyword) || addressContainsKeyword(keyword, address)) {
                filtered.add(person);
            }
        }

        return filtered;
    }

    private boolean addressContainsKeyword(String keyword, Address address) {
        return address != null && (address.getCity().contains(keyword) || address.getStreet().contains(keyword));
    }
}
