package _03_looping_and_branching._1_looping;

public class _3_Nested {
    public static void main(String[] args) {

        // TODO-looping-07
        // - Print a multiplication table like below
        //   using numbers 1 to 5 and nested for loops.
        //
        // 1 2 3 4 5
        // 2 4 6 8 10
        // 3 6 9 12 15
        // 4 8 12 16 20
        // 5 10 15 20 25

        // TODO-looping-08
        // - Use nested for loops to print all the
        //   elements of a two-dimensional array
        //   as following:
        // - Hint: matrix.length is number of rows
        //         matrix[i].length is number of elements in a row of i
        //
        // 1 2 3
        // 4 5 6
        // 7 8 9
        int[][] matrix = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9} };
    }
}





































/*
            for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
 */

/*
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

 */