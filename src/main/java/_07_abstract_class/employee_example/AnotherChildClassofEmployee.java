package _07_abstract_class.employee_example;

import java.time.LocalDate;

public class AnotherChildClassofEmployee extends Employee{
    public AnotherChildClassofEmployee(String name,
                                       LocalDate hireDate) {
        super(name, hireDate);
    }

    @Override
    public void pay() {

    }

    @Override
    public void someMethod() {

    }
}
