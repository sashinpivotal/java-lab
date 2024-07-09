package _21_lambda._01_functional_interface;

public interface MyNonFunctionalInterface {

    String makeUpperCase(String string);
    String makeLowerCase(String string);
}

class Main {

    public static void main(String[] args) {
        MyNonFunctionalInterface myObject = new MyNonFunctionalInterface(){

            @Override
            public String makeUpperCase(String string) {
                return string.toUpperCase();
            }

            @Override
            public String makeLowerCase(String string) {
                return string.toLowerCase();
            }
        };

        String boston = myObject.makeLowerCase("Boston");
        System.out.println(boston);
        String new_york = myObject.makeUpperCase("New York");
        System.out.println(new_york);
    }
}
