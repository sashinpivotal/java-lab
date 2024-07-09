package _06_inheritance.car_example;

public class Vehicle {

    private String vin;

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void moveTo(String location){
        System.out.println("moved by Vehicle");
    };
}


