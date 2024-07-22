package _10_inheritance.car_example;

class Main {

    public static void main(String[] args) {

        // Create DMV (Department of Motor Vehicles)
        // object, to which vehicle objects are registered
        DMV dmv = new DMV();

        Car car = new Car("ABC123");
        dmv.register(car);

        Vehicle boat = new Boat("BNW234");
        dmv.register(boat);

        Vehicle vehicle = new Car("XYZ234");
        dmv.register(vehicle);

        Vehicle[] vehicles = dmv.getVehicles();
        int currentIndex = dmv.getCurrentIndex();
        for (int i = 0; i < currentIndex ; i++) {
            System.out.println("vin number = " + vehicles[i].getVin());
            vehicles[i].moveTo("somewhere");
        }

        // TODO-inheritance-02
        // - Write Truck class which extends
        //   Vehicle parent class
        //   - override the moveTo(..) method of the parent class
        // - Create a Truck object and register
        //   it with the DMV
        // - Run this code again and verify
        //   the moveTo() method of the
        //   subclass is being invoked

    }
}