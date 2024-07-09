package _07_abstract_examples.employee_example;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private int numberOfHoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name,
                          LocalDate hireDate,
                          int numberOfHoursWorkedPerMonth,
                          double hourlyRate) {
        super(name, hireDate);
        setHourlyRate(hourlyRate);
        setNumberOfHoursWorkedPerMonth(numberOfHoursWorkedPerMonth);
    }

    public void setNumberOfHoursWorkedPerMonth(int numberOfHoursWorkedPerMonth) {
        // validation
        this.numberOfHoursWorkedPerMonth = numberOfHoursWorkedPerMonth;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        String nameAndOtherInfoFromParentClass = super.toString();
        return nameAndOtherInfoFromParentClass + " " +
                "HourlyEmployee{" +
                "numberOfHoursWorkedPerMonth=" + numberOfHoursWorkedPerMonth +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    @Override
    public String someMethod(String xx, int yy) {
        return null;
    }

    @Override
    public void pay() {
        System.out.println("pay from Hourly employee "
                + numberOfHoursWorkedPerMonth * hourlyRate);
    }

    @Override
    public void someMethod() {

    }

}
