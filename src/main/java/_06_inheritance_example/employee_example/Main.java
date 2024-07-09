package _06_inheritance_example.employee_example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[100];
        Department marketingDepartment
                = new Department("marketing", employees);

        Employee sang = new Employee("sang",
                LocalDate.of(2020, 03, 04));
        Employee nancy = new Employee("nancy",
                LocalDate.of(2010, 02, 04));

        Employee david = new SalariedEmployee("david",
                LocalDate.of(1999, 12, 04),
                1000.0);
        Employee bryce = new HourlyEmployee("bryce",
                LocalDate.of(1998, 3, 3),
                200,
                10.0);

        marketingDepartment.addEmployee(sang);
        marketingDepartment.addEmployee(nancy);
        marketingDepartment.addEmployee(david);
        marketingDepartment.addEmployee(bryce);

        marketingDepartment.listAllEmployees();
        marketingDepartment.payEmployees();

    }
}
