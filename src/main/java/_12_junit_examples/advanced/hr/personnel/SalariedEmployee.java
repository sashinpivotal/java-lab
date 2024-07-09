package _12_junit_examples.advanced.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private double monthlySalary;

    public SalariedEmployee(String name,
                            LocalDate hireDate,
                            double monthlySalary) {
        super(name, hireDate);
        if (monthlySalary > 1_000_000) {
            throw new TooMuchSalaryException("too much salary");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " +  getName() + ", "
                + "hireDate = " + getHireDate() + ", "
                + "monthlySalary = " + getMonthlySalary();
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        double monthlyTaxToPay = computeMonthlyCompensation() * SALARIED_TAX_RATE
                - computeStandardEmployeeMonthlyDeduction();
        if (monthlyTaxToPay < 0.0) {
            return 0.0;
        }
        return monthlyTaxToPay;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 1_000_1000) {
            throw new TooMuchSalaryException("too much salary");
        }
        this.monthlySalary = monthlySalary;
    }
}
