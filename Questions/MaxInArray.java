package Questions;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 76, 23, 89, 122};
        System.out.println(max(arr));

    }

    static int max(int[] arr){
        int maxItem = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxItem < arr[i]){
                maxItem = arr[i];
            }
        }
        return maxItem;
    }
}

