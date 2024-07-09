package _07_abstract_examples.employee_example;

import _07_abstract_examples.employee_example.Department;
import _07_abstract_examples.employee_example.Employee;
import _07_abstract_examples.employee_example.HourlyEmployee;
import _07_abstract_examples.employee_example.SalariedEmployee;

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

        marketing.listAllEmployees();
        marketing.payEmployees();
    }
}
