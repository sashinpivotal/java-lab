package _11_interface.employee_example;

import java.time.LocalDate;

// TODO-interface-06
// - Implement computeMonthlyTaxToPay() method
// - Use Tax rate defined for HourlyEmployee
//   in the TaxPayer interface
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
    public double computeCompensation() {
        return numberOfHoursWorkedPerMonth * hourlyRate;
    }

}
