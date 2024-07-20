package _12_lambda._01_simple_lambda;

// TODO-lambda-01:
// - Observe that the Calculator class is a
//   functional interface
@FunctionalInterface
public interface Calculator {
    int calculate(int x, int y);
}
