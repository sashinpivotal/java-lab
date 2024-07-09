package _09_interface_examples.inheritance;

class MyImplementationOfChildInterface
        implements IChildInterface {

    @Override
    public void fatherMethod() {

    }

    @Override
    public void childMethod() {

    }

    @Override
    public void dMethod2() {
        System.out.println("dMethod2 in the implementation class ");
    }
}
