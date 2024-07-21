package _03_looping_and_branching._2_conditionals.i_ifelse;

public class IfElseIf_2 {
    public static void main(String[] args) {

        // TODO-conditionals-02
        // - Declare an integer variable`a` and
        //   set its value to 30.
        // - Use an if/else if/else statement to
        //   check whether `a` is
        //        - multiple of both 2 and 3,
        //        - multiple of 2 only,
        //        - multiple of 3 only,
        //        - not a multiple of 2 or 3.
        // - Print the result.
        // - Run the program a few times,
        //   each time changing the int value.
        int a = 30;
        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("mutiple of both 2 and 3");
        } else if (a % 2 == 0 && a % 3 != 0) {
            System.out.println("multiple of 2 only");
        } else if (a % 2 != 0 && a % 3 == 0) {
            System.out.println("multiple of 3 only");
        } else {
            System.out.println("not a multiple of 2 or 3");
        }
    }
}






























/*
        int a = 5;

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("a is a multiple of both 2 and 3");
        } else if (a % 2 == 0) {
            System.out.println("a is a multiple of 2");
        } else if (a % 3 == 0) {
            System.out.println("a is a multiple of 3");
        } else {
            System.out.println("a is not a multiple of 2 or 3");
        }
 */