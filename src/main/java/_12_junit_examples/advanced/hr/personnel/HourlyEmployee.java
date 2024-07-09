package _12_junit_examples.advanced.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    public static final double FEDERAL_MINIMUM_HOURLY_WAGE = 7.0;

    private double hourlyRate;
    private int hoursWorkedPerMonth;

    public HourlyEmployee(String name,
                          LocalDate hireDate,
                          double hourlyRate,
                          int hoursWorkedPerMonth) {
        super(name, hireDate);
        if (hourlyRate < FEDERAL_MINIMUM_HOURLY_WAGE) {
            throw new IllegalArgumentException();
        }
        setHourlyRate(hourlyRate); ;
        setHoursWorkedPerMonth(hoursWorkedPerMonth);
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        double monthlyTaxToPay
                = computeMonthlyCompensation() * HOURLY_TAX_RATE
                - computeStandardEmployeeMonthlyDeduction();
        if (monthlyTaxToPay < 0.0) {
            return 0.0;
        }
        return monthlyTaxToPay;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < FEDERAL_MINIMUM_HOURLY_WAGE) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " + getName() + ", "
                + "hireDate = " + getHireDate() + ", "
                + "hourlyRate = " + getHourlyRate() + ", "
                + "hoursWorkedPerMonth = " + getHoursWorkedPerMonth();
    }
}
