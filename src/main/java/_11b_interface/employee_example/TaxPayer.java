package _11_interface.employee_example;

// TODO-interface-04
// - Study how TaxPayer interface is defined with
//   one abstract method and two constant values
public interface TaxPayer {

    public static final double HOURLY_TAX_RATE = 0.25;
    public static final double SALARIED_TAX_RATE = 0.30;

    double computeMonthlyTaxToPay();
}
