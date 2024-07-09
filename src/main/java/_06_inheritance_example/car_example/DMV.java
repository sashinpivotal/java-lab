package _06_inheritance_example.car_example;

public class DMV {

    private Vehicle[] vehicles = new Vehicle[100];
    private int currentIndex = 0;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void register(Vehicle vehicle) {
        vehicles[currentIndex++] = vehicle;
    }
}
