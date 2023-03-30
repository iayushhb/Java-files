package Questions;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 4, 1};
        int target = 4;
        int peak = peakElement(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            System.out.println(firstTry);
        } else {
            System.out.println(orderAgnosticBS(arr, target, peak+1, arr.length - 1));
        }

    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
