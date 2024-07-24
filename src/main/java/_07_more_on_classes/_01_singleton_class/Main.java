package _07_more_on_classes._01_singleton_class;

public class Main {

    public static void main(String[] args) {
        // TODO-singleton-01
        // - Create a singleton class called IRS
        //   (In other words, there should be only
        //    a single instance of IRS class)
        // - Add a method called getIRSInstance(),
        //   which does
        //   - if IRS object was not created before,
        //     it will create one and return
        //   - otherwise, it will return the
        //     previously created IRS object
        // - In this main method, call getIRSInstance()
        //   twice and write code to verify that
        //   the returned objects are the same object
        //   instance
        // - Think about if the default constructor
        //   of the IRS should be private or not
        IRS irsInstance1 = IRS.getIRSInstance();
        IRS irsInstance2 = IRS.getIRSInstance();
        boolean sameInstanceOrNot
                = (irsInstance1 == irsInstance2) ? true : false;
        System.out.println(sameInstanceOrNot);

    }

}
