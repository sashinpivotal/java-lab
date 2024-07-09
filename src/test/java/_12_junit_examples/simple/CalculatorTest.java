package _12_junit_examples.simple;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void beforeClass() throws Exception {
        System.out.println("before class");
    }

    @AfterAll
    public static void afterClass() throws Exception {
        System.out.println("after class");
    }

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add_should_add_two_numbers() {
        int addedValue = calculator.add(2, 3);

        // Using JUnit Assertions package
        assertEquals(5, addedValue);

        // Using AssertJ Assertions package
        org.assertj.core.api.Assertions.assertThat(addedValue).isEqualTo(5);
    }

    @Test
    public void subtract_should_subtract_a_number_from_the_other() {
        int subtractedValue = calculator.subtract(2, 3);
        assertEquals(-1, subtractedValue);
    }

    // TODO-01 - write "positive" test first and then target code
    //        for the multiply() method in TDD style

    // TODO-02 - write "positive" test first and target code
    //        for the divide() method in TDD style

    // TODO-03 - write "negative" test for the divide() method
    //        so that when the divisor is 0, the divide() method
    //        should throw IllegalArgumentException


    @Test
    public void squareRoot_should_return_square_value_given_valid_argument() {
        double squareRoot = calculator.squareRoot(4.0);
        assertEquals(2.0, squareRoot, 0.001);
    }

    @Test
    public void _squareRoot_should_throw_IllegalArgumentException_given_invalid_argument() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.squareRoot(-3.0);
                });
    }

    @Test
    public void _squareRoot_should_throw_IllegalArgumentException_with_correct_message_given_invalid_argument() {

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.squareRoot(-4.0);
                });
        assertEquals("no negative value allowed -4.0",
                exception.getMessage());
    }

    @Test
    public void _multiplyBy2_should_throw_IllegalArgumentException_given_invalid_argument() throws Exception {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.multiplyBy2(-3.0);
                });
    }

    @Test
    public void _multiplyBy2_should_throw_IllegalArgumentException_with_correct_exception_message_given_invalid_argument() throws Exception {

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.multiplyBy2(-5.0);
                });
        assertEquals("no negative value allowed -5.0",
                exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"})
    void addTest_with_parameters(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(first, second);
        assertEquals(expectedResult, actualResult);
    }

    // TODO-04 - write parameterized test for
    //           multiply() method

}