package shit;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.print("Enter a symbol : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.print("Enter number 1 : ");
                int a = input.nextInt();
                System.out.print("Enter number 2 : ");
                int b = input.nextInt();

                if (op == '+'){
                    ans = a + b;
                }
                if (op == '-'){
                    ans = a - b;
                }
                if (op == '*'){
                    ans = a * b;
                }
                if (op == '/'){
                    ans = a / b;
                }
                System.out.println(ans);
            }
            else if (op == 'x' || op == 'X'){
                System.out.println("Terminating....");
                break;
            }
            else {
                System.out.println("Invalid Input!");
            }
        }
        input.close();
    }
}
