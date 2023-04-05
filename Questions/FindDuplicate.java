package Questions;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 2};  // there is only one duplicate number in the array
        System.out.println(findingDuplicates(arr));
    }

    static int findingDuplicates(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                if (arr[correct] == arr[i]) {
                    return arr[i];
                } else {
                    swap(arr, i, correct);
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
