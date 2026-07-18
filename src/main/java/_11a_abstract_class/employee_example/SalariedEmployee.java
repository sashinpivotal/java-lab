package _10a_abstract_class.employee_example;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

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
