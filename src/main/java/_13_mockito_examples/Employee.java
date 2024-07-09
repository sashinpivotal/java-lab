package _13_mockito_examples;

public class Employee {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getUpperCasedPersonInfo() {
        String info = getName() + " lives in " + address.getInfo();
        return info.toUpperCase();
    }
}
