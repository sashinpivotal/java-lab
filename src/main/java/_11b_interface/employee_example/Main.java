package _11_interface.employee_example;

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

        // TODO-interface-09
        // - Call a newly added method that computes total
        //   monthly tax to be paid by all employees
        //   and display the result

    }
}
