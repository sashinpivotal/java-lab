package _12_junit_examples.advanced.personnel;

import _12_junit_examples.advanced.hr.personnel.SalariedEmployee;
import _12_junit_examples.advanced.hr.personnel.TooMuchSalaryException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalariedEmployeeTest {

    private SalariedEmployee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new SalariedEmployee("sang",
                LocalDate.of(2020, 05, 23),
                1000.0);
    }

    // TODO-11: Write appropriate test code by reading the test method name
    @Test
    public void computeMonthlyCompensation_returns_monthly_salary() {

    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

        assertEquals("name = sang, hireDate = 2020-05-23, monthlySalary = 1000.0",
                employee.getEmployeeInfo());
    }

    // TODO-12: Write appropriate test code by reading the test method name
    @Test
    public void computeMonthlyTaxToPay_should_return_positive_tax_value_when_tax_to_pay_is_greater_than_default_deduction() {

    }

    // TODO-13: Write appropriate test code by reading the test method name
    @Test
    public void computeMonthlyTaxToPay_should_return_0_tax_value_when_tax_to_pay_is_less_than_default_deduction() {

    }

    @Test
    public void _throw_TooMuchSalaryException_when_salary_is_set_with_more_than_million() {
        assertThrows(
                TooMuchSalaryException.class, () -> {
                    employee = new SalariedEmployee("sang",
                            LocalDate.of(2020, 05, 23),
                            2000000.0);
                });

    }

}