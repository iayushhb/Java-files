package shit;

import java.util.Scanner;

public class LargestNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a : ");
        int a = input.nextInt();
        System.out.print("Enter value for b : ");
        int b = input.nextInt();
        System.out.print("Enter value for c : ");
        int c = input.nextInt();

        int max = a;
        if (c > max){
            max = c;
        }
        if (b > max){
            max = a;
        }

        // Cheat Code for this question
        int largest = Math.max(c, Math.max(a, b));

        System.out.println("Largest Number is : " + max);
        System.out.println("Largest Number is : " + largest);
    }
}
