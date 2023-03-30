package shit;

import java.util.Arrays;

public class LinearSearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        int[] ans = SearchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] SearchIn2DArray(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[] {i, j};  // creating a new object and initializing it
                }
            }
        }
        return new int[] {-1, -1};
    }
}
