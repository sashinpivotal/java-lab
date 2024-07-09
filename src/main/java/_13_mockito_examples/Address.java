package _13_mockito_examples;

public class Address {

    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getInfo() {
        return city + " " + country;
    }
}
