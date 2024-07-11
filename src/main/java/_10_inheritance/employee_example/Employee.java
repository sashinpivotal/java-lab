package _10_inheritance.employee_example;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public double computeCompensation(){
        return 0.0;
    }

}
