package _10_inheritance.car_example;

public class Truck extends Vehicle{
    public Truck(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String destination) {
        System.out.println("moveTo by Truck to " + destination);
    }

}
