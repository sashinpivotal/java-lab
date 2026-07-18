package _17_junit5._2_advanced.irs;

import java.util.ArrayList;
import java.util.List;

public class IRSNonSingleton {

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
