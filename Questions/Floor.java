package Questions;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 13, 14, 16, 17, 19};
        int target = 15;
        System.out.println(bSearch(arr, target));
    }

    static int bSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];

    }
}
