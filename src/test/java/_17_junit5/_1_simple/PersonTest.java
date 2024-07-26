package _17_junit5._1_simple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person sang;

    @BeforeEach
    void setUp() {
        sang = new Person("sang", 20);
    }

    @Test
    void getUpperCasedPersonInfo_should_return_uppercased_info() {
        String upperCasedPersonInfo = sang.getUpperCasedPersonInfo();
        assertEquals("SANG IS 20 YEARS OLD.", upperCasedPersonInfo);
    }

    @Test
    void getLowerCasedPersonInfo() {
        String lowerCasedPersonInfo = sang.getLowerCasedPersonInfo();
        assertEquals("sang is 20 years old.", lowerCasedPersonInfo);
    }
}