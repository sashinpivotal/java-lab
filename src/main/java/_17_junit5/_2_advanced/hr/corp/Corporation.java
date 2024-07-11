package _17_junit5._2_advanced.hr.corp;

import _17_junit5._2_advanced.irs.TaxPayer;

public class Corporation implements TaxPayer {

    private String name;
    private double monthlyIncome;

    public Corporation(String name, double monthlyIncome) {
        setName(name);
        setMonthlyIncome(monthlyIncome);
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return getMonthlyIncome() * CORP_TAX_RATE;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
