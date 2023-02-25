package Binary_Search_2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RowCol_Matrix {
    static int[] findAns(int[][] arr, int target)
    {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }

            // Target lies in further row
            if (arr[row][col] < target) {
                row++;
            }
            // Target lies in previous column
            else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

    // Driver Code
    public static void main(String[] args)
    {

        // Binary search in sorted matrix
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7,8},{9,10,11,12},{13,14,15,16} };
        int[] ans = findAns(arr, 9);
        System.out.println("Element found at index: "
                + Arrays.toString(ans));
    }

}
