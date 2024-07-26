package _12_lambda._04_lambda_refactored_examples._02_using_function;

public class Sport {
    private String name;

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
