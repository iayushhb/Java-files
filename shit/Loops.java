package shit;

public class Loops {
    public static void main(String[] args) {
        /*
        for loop syntax :

        for (initialization ; condition ; increment/decrement) {
            // body
        }
         */

        for (int num = 1; num <= 5; num++ /* or num += 1*/ ) {
            System.out.println("Hello World");
        }

        /*
        while loop syntax :

        initialization
        while (condition) {
            //body
            increment/decrement
        }
         */

        int a = 1;
        while (a <= 5){
            System.out.println("Hello");
            a++;
        }

        /*
        -- in do while loop the loop will run at least 1 time
        do while loop syntax :

        initialization
        do {
            body
            increment/decrement
        } while(condition);
         */

        int n = 1;
        do {
            System.out.println("Hello2");
            n++;
        } while (n <= 10);

        for (int i = 0; i < 5; ++i){
            System.out.println("Hello");
        }
    }
}
