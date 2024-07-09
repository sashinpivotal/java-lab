package _12_junit_examples.advanced.personnel;


import _12_junit_examples.advanced.hr.personnel.Department;
import _12_junit_examples.advanced.hr.personnel.HourlyEmployee;
import _12_junit_examples.advanced.hr.personnel.SalariedEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {

    private Department department;

    @BeforeEach
    public void setUp() throws Exception {
        department = new Department("marketing", "boston");

        department.addEmployee(new SalariedEmployee("sang",
                LocalDate.of(2020, 01,03), 2000.0));

        department.addEmployee(new SalariedEmployee("dave",
                LocalDate.of(2025, 01,03), 3000.0));
    }

    // TODO-15: Write appropriate test code by reading the test method name
    @Test
    public void addEmployee_should_add_an_employee_correctly() {


    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_correct_value() {

        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        assertEquals(2, numberOfEmployeesWhoWorked);

    }

    // TODO-16: Write appropriate test code by reading the test method name
    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_total_monthly_compensation() {

    }
}