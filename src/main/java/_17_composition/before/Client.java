package _17_composition.before;

public class Client {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new Transmission());
        car.moveTo("Boston");
    }
}
