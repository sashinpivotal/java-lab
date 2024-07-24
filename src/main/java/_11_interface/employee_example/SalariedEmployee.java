package _11_interface.employee_example;

import java.time.LocalDate;

// TODO-interface-06
// - Implement TaxPayer interface
// - Use Tax rate defined for SalariedEmployee
//   in the TaxPayer interface
public class SalariedEmployee extends Employee
                            implements TaxPayer{

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeCompensation() * SALARIED_TAX_RATE;
    }
}
