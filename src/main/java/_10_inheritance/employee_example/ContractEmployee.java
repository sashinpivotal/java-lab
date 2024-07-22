package _10_inheritance.employee_example;

import java.time.LocalDate;

public class ContractEmployee extends Employee{

    private double[] contractPayments;

    public ContractEmployee(String name, LocalDate hireDate, double[] contractPayments) {
        super(name, hireDate);
        this.contractPayments = contractPayments;
    }

    @Override
    public double computeMonthlyCompensation() {
        double totalContractPayment = 0;
        for (int i = 0; i < contractPayments.length; i++) {
            totalContractPayment += contractPayments[i];
        }
        return totalContractPayment;
    }
}
