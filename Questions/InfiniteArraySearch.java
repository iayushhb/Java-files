package Questions;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 13, 23, 56};
        int target = 13;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return BSearch(arr, target, start, end);
    }

    static int BSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
