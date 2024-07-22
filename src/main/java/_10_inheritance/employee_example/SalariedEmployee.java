package _10_inheritance.employee_example;

import java.time.LocalDate;

// TODO-inheritance-05
// - Observe that the SalariedEmployee class is a subclass
//   overriding the computeMonthlyCompensation() method
//   using its own logic
public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

}
