package shit;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // multidimensional arrays are just an array of multiple
        // syntax
        // datatype[][] variable_name = new datatype[rows][columns]
        int[][] arr = new int[3][3];  // giving no. of rows is necessary

        // manually inputting multidimensional array :
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // taking input in a multidimensional array
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }

//        for (int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();  // by this u can print the array in a matrix format
//        }

//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));  // same shit as above but with brain
//        }

        for (int[] num : arr){
            System.out.println(Arrays.toString(num)); // this shit's insane
        }

        /*
        syntax for enhanced for loop

        for (datatype num : arr){
            body
        }

         */


    }
}
