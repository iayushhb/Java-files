package shit;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0); // this is used to take input of a char
        // trim removes whitespaces only by default
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z'){  // && -- and . || -- or .
            System.out.println("Works");
        } else{
            System.out.println("It don't");
        }
        input.close();
    }
}