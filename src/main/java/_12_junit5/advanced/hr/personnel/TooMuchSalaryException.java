package _12_junit5.advanced.hr.personnel;

public class TooMuchSalaryException extends RuntimeException {

    public TooMuchSalaryException(String message) {
        super(message);
    }
}
