package _11_interface.employee_example;

public class Department {

    private String departmentName;
    private Employee[] employees;
    private int currentIndex = 0;

    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public double computeDepartmentTotalMonthlyCompensation() {
        double departmentTotalMonthlyCompensation = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            departmentTotalMonthlyCompensation
                    += employees[i].computeCompensation();
        }
        return departmentTotalMonthlyCompensation;
    }

    // TODO-interface-08
    // - Write a method that computes total amount of
    //   monthly tax that needs to be paid by all
    //   employees
    public double computeDepartmentTotalTaxToBePaid() {
        double departmentTotalTaxToBePaid = 0.0;
        for (int i = 0; i < currentIndex; i++) {
//            departmentTotalTaxToBePaid
//                    += employees[i].();
        }
        return departmentTotalTaxToBePaid;
    }

}
