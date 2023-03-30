package shit;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int ans = Sum();
        System.out.println(ans);
        int a;  // this is called declaring
        a = 12; // this is called initializing
    }
// values which are initialized in a higher scope can be accessed and modified in any block of program but vice versa is not true
    // and if the value is initialized outside of psmv then it will be available everywhere even inside functions but if the same value
    // is initialized inside of psvm then the previous value will be shadowed but will still be available in other scopes outside of psvm
    static int Sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();

        int sum = a + b;
        return sum;  // nothing will be executed after return if it executed
    }
}
