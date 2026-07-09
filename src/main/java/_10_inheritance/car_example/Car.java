package _10_inheritance.car_example;

public class Car extends Vehicle {

    private String make;
    private String model;

    public Car(String vin) {
        super(vin);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + getVin() + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void moveTo(String destination) {
        System.out.println("moveTo by Car to " + destination);
    }

    public void onlyInCarClassMethod() {

    }
}




