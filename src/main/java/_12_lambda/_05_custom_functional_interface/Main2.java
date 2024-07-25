package _12_lambda._05_custom_functional_interface;

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
