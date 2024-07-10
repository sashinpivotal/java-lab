package _16_exception_handling;

public class TrafficIsHeavyRuntimeException extends RuntimeException {
    public TrafficIsHeavyRuntimeException(String message) {
        super(message);
    }
}
