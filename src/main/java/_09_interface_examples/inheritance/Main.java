package _09_interface_examples.inheritance;

class Main {

    public static void main(String[] args) {
        MyImplementationOfChildInterface anInterface
                = new MyImplementationOfChildInterface();
        anInterface.dMethod1();
        anInterface.dMethod2();
        IFatherInterface.myStaticMethod();
    }

}
