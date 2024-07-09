package _12_junit_examples.advanced.irs;

import _12_junit_examples.advanced.hr.corp.Corporation;
import _12_junit_examples.advanced.hr.personnel.HourlyEmployee;
import _12_junit_examples.advanced.hr.personnel.SalariedEmployee;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IRSTest {

    @Test
    public void computeTotalMonthlyTaxToCollect() {
        IRS irs = IRS.getSingleTonInstance();
        irs.register(new SalariedEmployee("sang",
                LocalDate.of(2020, 1, 23), 2000.0));
        irs.register(new HourlyEmployee("joe",
                LocalDate.of(2019, 04, 23),
                10.0, 100));
        irs.register(new Corporation("acme", 10_000));
        double totalMonthlyTaxToCollect = irs.computeTotalMonthlyTaxToCollect();
        assertEquals(1350.0, totalMonthlyTaxToCollect, 0.01);
    }
}