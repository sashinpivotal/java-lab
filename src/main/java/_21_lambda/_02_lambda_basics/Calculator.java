package _21_lambda._02_lambda_basics;

@FunctionalInterface
public interface Calculator {
    int calculate(int x, int y);
}

class Main {

    public static void main(String[] args) {

        // Example of assigning lambda's into variables
        Calculator multiplier = (x, y) -> x * y;
        Calculator divider = (x, y) -> x / y;

        int result1 = multiplier.calculate(20, 30);
        System.out.println("multiply result = " + result1);
        int result2 = divider.calculate(30, 10);
        System.out.println("divide result = " + result2);

        // TODO-01:
        // - Create Calculator object that adds two numbers
        //   and assign it into a variable called "adder"
        // - Use "adder" object to perform adding two numbers

        // Example of passing lambda's as method arguments
        myMethod(((x, y) -> x * y), (x, y) -> x / y);
        myMethod(multiplier, divider);

        // TODO-02:
        // - Create "myMethod3" method that takes the following
        //   3 arguments and performs the calculation with x and y
        //   - Calculator object
        //   - int x
        //   - int y
        // - Call "myMethod3" method with Calculator object
        //   that performs addition and display the result
        // - Call "myMethod3" method with Calculator object
        //   that performs multiplication and display the result

        // Example of returning lambda
        Calculator calculator = myMethod2();
        int result3 = calculator.calculate(10, 20);
        System.out.println("result3 = " + result3);

    }

    public static void myMethod(Calculator calculator1, Calculator calculator2) {
        int result1 = calculator1.calculate(30, 10);
        int result2 = calculator2.calculate(200, 50);
        System.out.println("result1 = " + result1 + ", result2 = " + result2);
    }

    public static Calculator myMethod2() {
        return (x, y) -> x * y;
    }

}
