package Questions;

import java.util.Scanner;

public class Primebtw2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int a = input.nextInt();
        System.out.print("Enter ending number : ");
        int b = input.nextInt();

        for(int i = a; i <= b; i++){
            if (isPrime(i)){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        input.close();
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
