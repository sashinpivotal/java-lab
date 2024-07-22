package _10_inheritance.employee_example;

import java.time.LocalDate;

// TODO-inheritance-04
// - Observe that the HourlyEmployee class is a subclass
//   overriding the computeMonthlyCompensation() method
//   using its own logic
public class HourlyEmployee extends Employee {

    private int numberOfHoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name,
                          LocalDate hireDate,
                          int numberOfHoursWorkedPerMonth,
                          double hourlyRate) {
        super(name, hireDate);
        setHourlyRate(hourlyRate);
        setNumberOfHoursWorkedPerMonth(numberOfHoursWorkedPerMonth);
    }

    public void setNumberOfHoursWorkedPerMonth(int numberOfHoursWorkedPerMonth) {
        this.numberOfHoursWorkedPerMonth = numberOfHoursWorkedPerMonth;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeMonthlyCompensation() {
        return numberOfHoursWorkedPerMonth * hourlyRate;
    }

}
