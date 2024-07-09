package _12_junit_examples.advanced.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {

    private static IRS singleTonInstance;

    private IRS() {
    }

    // If singleton instance has not been created yet,
    // create one.  Otherwise, return the same instance.
    public static IRS getSingleTonInstance() {
        if (singleTonInstance == null) {
            singleTonInstance = new IRS();
        }
        return singleTonInstance;
    }

    private List<TaxPayer> taxPayers = new ArrayList<>();

    public void register(TaxPayer taxPayer) {
        taxPayers.add(taxPayer);
    }

    public double computeTotalMonthlyTaxToCollect() {

        return taxPayers.stream()
                .map(taxPayer -> taxPayer.computeMonthlyTaxToPay())
                .mapToDouble(d -> d)
                .sum();

    }

}
