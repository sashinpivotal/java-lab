package _11_interface.employee_example;

import java.time.LocalDate;

// TODO-interface-05
// - Add "implements TaxPayer" the class definition
// - Note that the actual implementation of the
//   computeMonthlyTaxToPay() method of the interface
//   needs to be done in the HourlyEmployee and
//   SalariedEmployee classes
public abstract class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // abstract methods
    public abstract double computeCompensation();

}
