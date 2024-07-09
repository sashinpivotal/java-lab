package _21_lambda._02_lambda_basics;

@FunctionalInterface
public interface MyFunctionalInterfaceUpper {
    String makeUpperCase(String string);
}

class Main2 {
    public static void main(String[] args) {

        // Use anonymous inner class
        MyFunctionalInterfaceUpper myObject1
                = new MyFunctionalInterfaceUpper() {
            @Override
            public String makeUpperCase(String string) {
                return string.toUpperCase();
            }
        };
        System.out.println(myObject1.makeUpperCase("Boston"));

        // Use Lambda
        MyFunctionalInterfaceUpper myObject2
                = string -> string.toUpperCase();
        System.out.println(myObject2.makeUpperCase("Boston"));

    }
}