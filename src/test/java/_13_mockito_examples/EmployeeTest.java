package _13_mockito_examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeTest {

    @Mock
    private Address address;

    // This test could fail due to a logic error
    // in the Address dependency
    // (In that respect, it is an integration testing
    // involving two classes not a unit test.)
    @Test
    public void getPersonInfo_should_return_upperCased_info_not_using_mock() {

        // arrange
        Address address = new Address("boston", "usa");
        Employee sang1 = new Employee("sang", address);
        String upperCasedPersonInfo = sang1.getUpperCasedPersonInfo();

        // assert
        assertEquals("SANG LIVES IN BOSTON USA", upperCasedPersonInfo);

    }

    // This unit test will succeed given that we
    // mock the behavior of Address dependency
    @Test
    public void getPersonInfo_should_return_upperCased_info_using_mock() {

        // arrange
        BDDMockito.given(address.getInfo()).willReturn("boston USA");

        // act
        Employee employee = new Employee("sang", address);
        String upperCasedPersonInfo = employee.getUpperCasedPersonInfo();

        // assert
        assertEquals("SANG LIVES IN BOSTON USA", upperCasedPersonInfo);

        // verify
        BDDMockito.verify(address).getInfo();

    }

}
