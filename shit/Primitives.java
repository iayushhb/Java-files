package shit;

public class Primitives{
    public static void main(String[] args){
        int rollno = 64;  // --- literal(the number after equals to )
        //    | 
        //  identifier 

        byte a = 45;
        short c = 456;
        char letter = 'r';
        float marks  = 98.67f; // gotta put f here cuz all decimal type values are double by default
        double largeDecimalNumber = 45788998.4583;
        long largeInteger = 87645674398777L; // L : cuz all number are of int type by default
        boolean check = false;
//                                                                                        ^
//                                                                                        |
        // everything in java that starts with capital letter is a class and that's why these are called Primitives.

        // Printing Primitives
        System.out.println(a);
        System.out.println(c);
        System.out.println(rollno);
        System.out.println(letter);
        System.out.println(marks);
        System.out.println(largeDecimalNumber);
        System.out.println(largeInteger);
        System.out.println(check);

//        byte	  -- 1 byte	 -- Stores whole numbers from -128 to 127
//        short	  -- 2 bytes --	Stores whole numbers from -32,768 to 32,767
//        int	  -- 4 bytes --	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	  -- 8 bytes --	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	  -- 4 bytes --	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double  -- 8 bytes --	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean -- 1 bit	 -- Stores true or false values
//        char	  -- 2 bytes --	Stores a single character/letter or ASCII values
    }
}
