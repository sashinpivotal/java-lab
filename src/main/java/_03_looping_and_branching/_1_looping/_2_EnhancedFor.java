package _03_looping_and_branching._1_looping;

public class _2_EnhancedFor {

    public static void main(String[] args) {
        // TODO-looping-04
        // - Use an enhanced for loop to iterate
        //   over an array below and print each element.
        int[] ints = {3, 7, 2, 6, 9, 1, 5};
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        // TODO-looping-05
        // - Calculate the sum of all elements
        //   in the ints array above using an enhanced for loop
        // - Print the result
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // TODO-looping-06
        // - Calculate the average of the elements
        //   in the ints array above using an enhanced for loop
        // - Print the result
        sum = 0;
        for (int i : ints) {
            sum += i;
        }
        int average = sum / ints.length;
        System.out.println("average = " + average);

    }
}









































/*

        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.println(num);
        }
 */

/*

    int[] array = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int num : array) {
       sum += num;
    }
    System.out.println(sum);

 */

/*

        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

 */