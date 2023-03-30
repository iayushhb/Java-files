package shit;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a : ");
        int a = input.nextInt();
        System.out.print("Enter value for b : ");
        int b = input.nextInt();
        System.out.print("Enter value for c : ");
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        }
    }
}
