package _07_more_on_classes._01_singleton_class;

public class IRS {

    private static IRS irs;

    private IRS() {
    }

    public static IRS getIRSInstance() {
        if (irs == null) {
            IRS irs = new IRS();
        }
        return irs;
    }
}
