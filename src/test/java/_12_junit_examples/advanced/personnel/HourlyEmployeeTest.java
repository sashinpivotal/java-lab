package _12_junit_examples.advanced.personnel;

import _12_junit_examples.advanced.hr.personnel.HourlyEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HourlyEmployeeTest {

    private HourlyEmployee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new HourlyEmployee("sang",
                LocalDate.of(2020, 03, 23),
                10.0,
                200);
    }

    @Test
    public void computeMonthlyCompensation_should_return_valid_result() {
        assertEquals(employee.computeMonthlyCompensation(), 2000.0, 0.01);
    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

        assertEquals("name = sang, hireDate = 2020-03-23, hourlyRate = 10.0, hoursWorkedPerMonth = 200",
                employee.getEmployeeInfo());
    }

    @Test
    public void computeMonthlyTaxToPay_should_compute_tax_correctly() {
        double monthlyTaxToPay = employee.computeMonthlyTaxToPay();
        assertEquals(250.0, monthlyTaxToPay, 0.01);
    }

    @Test
    public void computeMonthlyTaxToPay_should_return_0_tax_value_when_tax_to_pay_is_less_than_default_deduction() {
        employee = new HourlyEmployee("sang",
                LocalDate.of(2020, 03, 23),
                10.0,
                20);
        double monthlyTaxToPay = employee.computeMonthlyTaxToPay();
        assertEquals(0.0, monthlyTaxToPay, 0.01);
    }

    @Test
    public void _constructor_should_throw_IllegalArgumentException_when_hourlyRate_is_less_than_federal_minimum_wage() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    employee = new HourlyEmployee("sang",
                            LocalDate.of(2020, 03, 23),
                            5.0,
                            20);
                });
    }

}