package shit;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a range : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);

        int count = 1;
        while (count <= n){
//            System.out.println(b);
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(b);

        // same thing in for loop
//        for ( int i = 1 ; i <= n; i++){
//            int temp = b;
//            b = a + b;
//            a = temp;
//        }
        input.close();
    }
}
