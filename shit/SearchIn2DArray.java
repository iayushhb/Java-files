package shit;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,   2,  3,  4},
                {5,   6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 10;
        System.out.println(Arrays.toString(Search2D(arr, target)));
    }

    static int[] Search2D(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length && end >= 0) {
            if (arr[start][end] == target) {
                return new int[] {start, end};
            } else if (arr[start][end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }
}
