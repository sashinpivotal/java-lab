package _07_abstract_examples.car_example;

public abstract class Vehicle {

    private String vin;

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public abstract void moveTo(String location);
}


