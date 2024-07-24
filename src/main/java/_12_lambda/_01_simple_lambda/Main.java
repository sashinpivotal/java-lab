package _12_lambda._01_simple_lambda;

public class Main {

    public static void main(String[] args) {

        // TODO-lambda-02a:
        // - Study the example of assigning lambda objects
        //   into the variables
        Calculator multiplier = (x, y) -> x * y;
        Calculator divider = (x, y) -> x / y;

        // - Study how lambda objects are now used
        int result1 = multiplier.calculate(20, 30);
        System.out.println("multiply result = " + result1);
        int result2 = divider.calculate(30, 10);
        System.out.println("divide result = " + result2);

        // TODO-lambda-02b:
        // - Create Calculator object that adds two numbers
        //   and assign it into a variable called "adder"
        // - Use "adder" object to perform adding two numbers
        Calculator adder = (x, y) -> x + y;
        int resultOfAdding = adder.calculate(10, 20);
        System.out.println("add result = " + resultOfAdding);

        // TODO-lambda-03a:
        // - Study how myMethod(..) defined after this method
        //   receives lambda objects as arguments
        // - Study how you invoke the method passing two
        //   lambda objects
        myMethod(((x, y) -> x * y), (x, y) -> x / y);
        myMethod(multiplier, divider);

        // TODO-lambda-03b:
        // - Create "myMethod3" method that takes the following
        //   3 arguments and performs the calculation with x and y
        //   - Calculator object
        //   - int x
        //   - int y
        // - Call "myMethod3" method with Calculator object
        //   that performs addition and display the result
        // - Call "myMethod3" method with Calculator object
        //   that performs multiplication and display the result
        myMethod3((x,y)-> x+y, 20, 30);
        myMethod3((x,y)-> x*y, 20, 30);

        // TODO-lambda-04a:
        // - Study how the myMethod2() defined after this method
        //   returns an lambda object as a return value
        Calculator calculator = myMethod2();
        int result3 = calculator.calculate(10, 20);
        System.out.println("result3 = " + result3);

        // TODO-lambda-04b:
        // - Write myMethod4 that returns a lambda object
        //   that adds two numbers
        // - Invoke myMethod4 and call the calculate method
        Calculator calculator1 = myMethod4();
        int result4 = calculator1.calculate(5, 7);
        System.out.println("result4 = " + result4);

    }

    public static void myMethod(Calculator calculator1, Calculator calculator2) {
        int result1 = calculator1.calculate(30, 10);
        int result2 = calculator2.calculate(200, 50);
        System.out.println("result1 = " + result1 + ", result2 = " + result2);
    }

    public static Calculator myMethod2() {
        return (x, y) -> x * y;
    }

    public static void myMethod3(Calculator calculator, int x, int y) {
        int result = calculator.calculate(x, y);
        System.out.println("result within myMethod3 = " + result);
    }

    public static Calculator myMethod4() {
        return (x, y) -> x + y;
    }

}

