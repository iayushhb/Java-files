package shit;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // System.out.print("Please enter some input : "); // print takes input on the same line 
        // int rollno = input.nextInt();
        // System.out.println("Your rollno is : " + rollno);
        // // way to make a long number readable 
        // int a = 23_499_000;
        // System.out.println(a);

//        // inputting strings
//        System.out.println("Enter a line : ");  // it takes input on the next line
//        String name = input.nextLine();  // it takes whole line as input
//        String mane = input.next();  // it takes only one word for input

        // float input
        float marks = input.nextFloat();
        System.out.println(marks);
        input.close();
    }
}
