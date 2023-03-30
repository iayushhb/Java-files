package shit;

import java.util.SplittableRandom;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 2, 6, 1, 8, 3 ,1, 3};
    }

    static int lSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;  // this returns the index, arr[i] to display element
            }
        }
        return -1;
    }

    static int lSearch2(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;  // this returns the index, arr[i] to display element
            }
        }
        return -1;
    }

    static boolean searchInString(String str, char target){  // searching in strings
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean searchInString2(String str, char target){  // searching in strings using enhanced loop
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

}