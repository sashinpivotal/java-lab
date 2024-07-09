package _06_inheritance_example.car_example;

import _06_inheritance_example.car_example.Boat;
import _06_inheritance_example.car_example.Car;
import _06_inheritance_example.car_example.DMV;
import _06_inheritance_example.car_example.Vehicle;

class Main {

    public static void main(String[] args) {

        DMV dmv = new DMV();

        Car car = new Car("ABC123");
        String vin = car.getVin();
        System.out.println(vin);
        dmv.register(car);

        Vehicle boat = new Boat("BNW234");
        dmv.register(boat);

        Vehicle vehicle = new Car("XYZ234");
        vehicle.moveTo("boston");
        dmv.register(vehicle);

        Vehicle[] vehicles = dmv.getVehicles();
        int currentIndex = dmv.getCurrentIndex();
        for (int i = 0; i < currentIndex ; i++) {
            System.out.println("vin number = " + vehicles[i].getVin());
        }

    }
}