package _10a_abstract_class.employee_example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[100];
        Department marketing = new Department(
                "marketing", employees);

        Employee david = new SalariedEmployee("david",
                LocalDate.of(1999, 12, 04),
                1000.0);
        Employee bryce = new HourlyEmployee("bryce",
                LocalDate.of(1998, 3, 3),
                200,
                10.0);

        marketing.addEmployee(david);
        marketing.addEmployee(bryce);

        double departmentTotalMonthlyCompensation
                = marketing.computeDepartmentTotalMonthlyCompensation();
        System.out.println("department total monthly compensation = "
                            + departmentTotalMonthlyCompensation);

        // TODO-abstract-class-05
        // - Write ContractEmployee class which extends
        //   Employee abstract class
        // - ContractEmployee class the following fields
        //   - double[] contractPayments;
        //   - the monthly compensation of a ContractEmployee
        //     is the sum of contractPayments array
        // - Create a ContractEmployee object
        //   with some test values to the contractPayments array
        //   and add him/her to the department
        // - Run this code and verify that total monthly
        //   compensation includes the compensation of
        //   the contract employee
        double[] contractPayments = {100.0, 100.0};
        Employee paul = new ContractEmployee("paul",
                LocalDate.of(1999, 2, 13),
                contractPayments
        );
        marketing.addEmployee(paul);
        departmentTotalMonthlyCompensation
                = marketing.computeDepartmentTotalMonthlyCompensation();
        System.out.println("department total monthly compensation = "
                + departmentTotalMonthlyCompensation);
    }
}
