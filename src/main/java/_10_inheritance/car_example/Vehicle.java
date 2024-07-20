package _10_inheritance.car_example;

// TODO-inheritance-01
// - Observe that Vehicle is a concrete class
//   that has a concrete method called
//   moveTo(..)
public class Vehicle {

    private String vin;

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void moveTo(String destination){
        System.out.println("moved by Vehicle to " + destination);
    };
}


