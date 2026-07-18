package _11_interface.employee_example;

import java.time.LocalDate;

// TODO-interface-07
// - Implement computeMonthlyTaxToPay() method
// - Use Tax rate defined for SalariedEmployee
//   in the TaxPayer interface
public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeCompensation() {
        return monthlySalary;
    }

}
