package _12_junit_examples.simple;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public double squareRoot(double input) {
        if (input < 0) {
            throw new IllegalArgumentException("no negative value allowed "
                    + input);
        }
        return Math.sqrt(input);
    }

    public double multiplyBy2(double input) throws Exception {
        if (input < 0) {
            throw new IllegalArgumentException("no negative value allowed " + input);
        }
        return input * 2;
    }
}
