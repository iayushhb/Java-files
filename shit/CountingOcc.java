package shit;

import java.util.Scanner;

public class CountingOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int target = 3;

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == target){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        input.close();
    }
}
