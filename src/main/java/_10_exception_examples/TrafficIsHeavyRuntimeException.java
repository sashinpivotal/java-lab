package _10_exception_examples;

public class TrafficIsHeavyRuntimeException extends RuntimeException {
    public TrafficIsHeavyRuntimeException(String message) {
        super(message);
    }
}
