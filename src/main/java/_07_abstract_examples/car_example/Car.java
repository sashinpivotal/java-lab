package _07_abstract_examples.car_example;

public class Car extends Vehicle{

    private String make;
    private String model;

    public Car(String vin) {
        super(vin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + getVin() + '\'' +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void moveTo(String destination) {
        System.out.println("moveTo by Car");
    }

    public void onlyInCarClassMethod() {

    }
}




