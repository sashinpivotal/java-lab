package _10_inheritance.employee_example;

import java.time.LocalDate;

// TODO-inheritance-03
// - Observe that the Employee class is a concrete class
//   that has a concrete computeMonthlyCompensation() method
public class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public double computeMonthlyCompensation(){
        return 0.0;
    }

}
