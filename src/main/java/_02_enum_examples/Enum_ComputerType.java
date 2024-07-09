package _02_enum_examples;

public class Enum_ComputerType {

    // Alternative to Enum
    public static final String PC = "PC";
    public static final String TABLET = "TABLET";
    public static final String PHONE = "PHONE";
    public static final String TV = "TV";

    public static void main(String[] args) {

        // - Write an enum class called "ComputerType"
        //   with the following values
        //   - "PC", "TABLET", "PHONE"
        // - Create an array of these enum values
        // - Display the array

        // - Create a static method called
        //   "buyComputer(..)", which takes "ComputerType"
        //   enum type and quantity
        buyComputerMethodUsingPublicStaticFinalConstants(PC, 4);
        buyComputerMethodUsingEnum(ComputerType.TABLET, 3);
    }

    // use public static final
    public static void buyComputerMethodUsingPublicStaticFinalConstants(String computerType, int quantity) {
        System.out.println(computerType);
    }

    // use enum
    public static void buyComputerMethodUsingEnum(ComputerType computerType, int quantity) {
        System.out.println(computerType);
    }

}

enum ComputerType {
    PC,
    TABLET,
    PHONE,
    TV
}


