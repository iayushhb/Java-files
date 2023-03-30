package shit;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit name : ");
        String fruit = input.nextLine();

        switch (fruit) {  // enhanced switch case i.e. better way
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit name!");
        }

        // nested switch cases works same as nested if else

//        switch (fruit){
//            case "Mango" :
//                System.out.println("King of fruits");
//                break;
//
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//
//            case "Orange":
//                System.out.println("A round fruit");
//                break;
//
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//
//            default :
//                System.out.println("Please enter a valid fruit name!");
//        }
        input.close();
    }
}