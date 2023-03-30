package shit;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int a = input.nextInt();
        System.out.print("Enter another Integer : ");
        int b = input.nextInt();

        System.out.println("Sum is : " + (a + b));
    }
}
