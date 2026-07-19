package _14_enum;

public class Main {

    // The following is what used to be done
    // before enum type was introduced
    public static final String PC = "PC";

    public static void main(String[] args) {

        // This method does not use enum instead uses public static
        // final values
        buyComputerMethodUsingPublicStaticFinalConstants(PC, 4);

        // TODO-enum-01
        // enum class ComputerType is defined in ComputerType.java

        // TODO-enum-02
        // - Refactored version of the method used above now using enum type
        buyComputerMethodUsingEnum(ComputerType.PC, 4);
    }

    // use public static final
    public static void buyComputerMethodUsingPublicStaticFinalConstants(String computerType, int quantity) {
        System.out.println(computerType);
    }

    // TODO-enum-03
    public static void buyComputerMethodUsingEnum(ComputerType computerType, int quantity) {
        System.out.println(computerType);
    }

}




