package Questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            Swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void Swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

}
