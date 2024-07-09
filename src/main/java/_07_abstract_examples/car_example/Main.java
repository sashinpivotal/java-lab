package _07_abstract_examples.car_example;

import _07_abstract_examples.car_example.Boat;
import _07_abstract_examples.car_example.Car;
import _07_abstract_examples.car_example.DMV;
import _07_abstract_examples.car_example.Vehicle;

class Main {

    public static void main(String[] args) {

        Car car = new Car("ABC123");
        String vin = car.getVin();
        System.out.println(vin);

        Vehicle boat = new Boat("BNW234");
        DMV dmv = new DMV();
        dmv.register(boat);

        Vehicle vehicle = new Car("XYZ234");
        vehicle.moveTo("whatever");
    }
}