package _17_composition.after;

public class Client {
    public static void main(String[] args) {
        IEngine engine = EngineFactory.createEngine(1);
        Car car1 = new Car(engine, new Transmission());
        car1.moveTo("Boston");

        Car car2 = new Car(new Engine2(), new Transmission());
        car2.moveTo("Boston");
    }
}

class EngineFactory {
    public static IEngine createEngine(int code) {
        if (code == 1) {
            return new Engine1();
        } else if (code == 2) {
            return new Engine2();
        } else {
            new IllegalArgumentException();
        }
        return null;
    }
}
