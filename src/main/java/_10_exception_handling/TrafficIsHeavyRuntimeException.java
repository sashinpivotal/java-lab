package _10_exception_handling;

public class TrafficIsHeavyRuntimeException extends RuntimeException {
    public TrafficIsHeavyRuntimeException(String message) {
        super(message);
    }
}
