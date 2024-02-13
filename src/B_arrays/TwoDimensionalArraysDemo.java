package B_arrays;

import java.util.Arrays;

public class TwoDimensionalArraysDemo {
    public static void main(String[] args) {
        int[][] triangle = {
                {1, 2, 3}, // row 0
                {4, 5},    // row 1
                {6}        // row 2
        };

        // triangle.length = 3 (the number of rows)
        // triangle[0].length = 3 (length of first row)
        // triangle[1].length = 2 (length of second row)
        // triangle[2].length = 1 (length of third row)

        // prints triangle row by row
        for (int row = 0; row < triangle.length; row++) { // for each row in triangle...
            // go through all columns for the current row
            for (int col = 0; col < triangle[row].length; col++) {
                System.out.print(triangle[row][col]);
            }

            System.out.println(); // terminate line at end of current row
        }

        System.out.println(Arrays.deepToString(triangle));
    }
}
