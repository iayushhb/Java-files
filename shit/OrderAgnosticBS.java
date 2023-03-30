package shit;

public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end){

            int mid = start + ((end - start) / 2);

            if (arr[mid] == arr[target]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
