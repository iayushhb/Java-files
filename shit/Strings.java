package shit;

import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {  // this String[] args shit is called command line arguments
        // all string objects are stored in string pool inside of heap
        // and strings are immutable
        String name = "Ayush";
        String name2 = "Ayush";
        System.out.println(name == name2);  // == checks for both values and reference of objects

        System.out.println(name.equals(name2));  // .equals() only checks for values

        // to create a new string object use new keyword

        String a = new String("Ash");

        // string concatenation
        System.out.println("Ayush" + "Bansal");
        System.out.println("a" + new ArrayList<>());  // this will convert the arraylist to string too
        System.out.println(new ArrayList<>() + "" + new ArrayList<>());   // + operator can only be applied on primitives
        // or either of the values is a string
    }
}
