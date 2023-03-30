package shit;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // syntax for arrays :
        // datatype[] variable_name = new datatype[size];
        int[] a = new int[5];  // example
        //  |       |--------> this happens at runtime
        //  |-----> this happens at compile time

        // dynamic memory allocation -- allocation of memory at runtime
        // heap objects are not continuous that's why array memory allocation may not be continuous , it totally depends on JVM

        // u can also create arrays like this
        int[] n = {2, 4, 2, 6, 1};

        int[] b;  // here the array is only being declared
        b = new int[4];  // initialization : here the object is being created in the memory (heap)

        /*
        so what really happens when u create an array is that it creates an empty array in heap memory with null as default value which will be pointing to
        the values stored in heap memory with no guarantee of continuous memory allocation that u will assign -- [null, null, null, mull, null]
        that why if the place is not initialized then it will return us null
         */

        // manual input of array
        a[0] = 9;
        a[1] = 8;
        a[2] = 5;
        a[3] = 4;
        a[4] = 6;

        System.out.println(a[3]);  // printing element at index 3

        // input using loops
        for (int i = 0;i < b.length; i++){
            System.out.print("Enter element no. " + (i+1) + " : ");
            b[i] = input.nextInt();
        }

        for (int num : b){  // enhance for loop or for each loop
            System.out.print(num + " ");
        }

        // most elegant way to print array elements
        System.out.println(Arrays.toString(a));

        // taking input of strings in array
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
