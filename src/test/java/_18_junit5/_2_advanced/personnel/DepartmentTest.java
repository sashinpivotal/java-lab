package _17_junit5._2_advanced.personnel;


import _17_junit5._2_advanced.hr.personnel.Department;
import _17_junit5._2_advanced.hr.personnel.SalariedEmployee;
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

    // TODO-16: Write appropriate test code by reading the test method name
    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_total_monthly_compensation() {

    }
}