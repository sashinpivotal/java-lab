package _12_lambda._05_custom_functional_interface;

class Main {
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

        // TODO-custom-fi-01:
        // - Use anonymous inner class to create an
        //   object of MyFunctionalInterfaceLower type
        // - Invoke the method of the functional
        //   interface and display the result
        MyFunctionalInterfaceLower myObject3
                = new MyFunctionalInterfaceLower() {
            @Override
            public String makeLowerCase(String string) {
                return string.toLowerCase();
            }
        };
        String boston = myObject3.makeLowerCase("Boston");
        System.out.println(boston);

        // TODO-custom-fi-02:
        // - Use Lambda to create an object of
        //   MyFunctionalInterfaceLower type
        // - Invoke the method of the functional
        //   interface and display the result
        MyFunctionalInterfaceLower myObject4
                = string -> string.toLowerCase();
        String boston1 = myObject4.makeLowerCase("Boston");
        System.out.println(boston1);

    }
}
