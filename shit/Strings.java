package shit;

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
    }
}
