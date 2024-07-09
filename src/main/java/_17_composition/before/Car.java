package _17_composition.before;

public class Car {

    private Engine engine;
    private Transmission transmission;

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void moveTo(String destination) {
        engine.start();
        engine.rev();
        transmission.shiftTo(3);
        transmission.engage();
    }
}
