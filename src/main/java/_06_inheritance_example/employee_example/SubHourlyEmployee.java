package _06_inheritance_example.employee_example;

import java.time.LocalDate;

public class SubHourlyEmployee extends HourlyEmployee {

    public SubHourlyEmployee(String name,
                             LocalDate hireDate,
                             int numberOfHoursWorkedPerMonth,
                             double hourlyRate) {
        super(name, hireDate, numberOfHoursWorkedPerMonth, hourlyRate);
    }

    @Override
    public void someMethod() {

    }
}
