package domain;

public class Address {

    private String street;
    private String city;

    public Address() {
        street = "";
        city = "";
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        if (street.isEmpty() || city.isEmpty()) {
            return "address unknown";
        }
        return String.format("address: %s %s", getStreet(), getCity());
    }
}
