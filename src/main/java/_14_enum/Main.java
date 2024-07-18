package _14_enum;

public class Main {

    // The following is what used to be done
    // before enum type was introduced
    public static final String PC = "PC";
    public static final String TABLET = "TABLET";
    public static final String PHONE = "PHONE";
    public static final String TV = "TV";

    public static void main(String[] args) {

        // This method does not use enum instead uses public static
        // final values
        buyComputerMethodUsingPublicStaticFinalConstants(PC, 4);

        // TODO-enum-01
        // - Write an enum class called "ComputerType"
        //   with the following values
        //   - "PC", "TABLET", "PHONE"

        // TODO-enum-02
        // - Uncomment and finish the code below - it is a refactored
        //   version of the method used above now using enum type
        // buyComputerMethodUsingEnum(..);
    }

    // use public static final
    public static void buyComputerMethodUsingPublicStaticFinalConstants(String computerType, int quantity) {
        System.out.println(computerType);
    }

    // TODO-enum-03
    // - Uncomment and finish the code below
    //public static void buyComputerMethodUsingEnum(.., int quantity) {
    //    System.out.println(..);
    //}

}




