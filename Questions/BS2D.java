package Questions;

public class BS2D {
    public static void main(String[] args) {

    }

    static int[] bSearch2D(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0){
            if ( arr[r][c] == target){
                return new int[]{r, c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}