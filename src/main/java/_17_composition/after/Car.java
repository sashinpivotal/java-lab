package _17_composition.after;

public class Car {

    private IEngine engine;
    private Transmission transmission;

    public Car(IEngine engine, Transmission transmission) {
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
