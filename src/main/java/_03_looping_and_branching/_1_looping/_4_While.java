package _03_looping_and_branching._1_looping;

public class _4_While {

    public static void main(String[] args) {
        // TODO-looping-09
        // - Use a while loop to print numbers
        //   from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // TODO-looping-10
        // - Use a do-while loop to print numbers
        //   from 1 to 10
        int i2 = 1;
        do {
            System.out.print(i2 + " ");
            i2++;
        }
        while (i2 <= 10);
        System.out.println();

        // TODO-looping-11
        // - Use a while loop to find the first number
        //   larger than 100 that's divisible by 7.
        int i3 = 0;
        boolean found = false;
        while (!found) {
            i3++;
            if (i3 > 100 && i3 % 7 == 0) {
                found = true;
            }
        }
        System.out.println(i3);
    }
}





































/*

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
 */

/*

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
 */


/*
        int i = 101;
        while (i % 7 != 0) {
            i++;
        }
        System.out.println(i);
 */