package shit;

public class FuncOverloading {
    public static void main(String[] args) {
        // Method overloading is a concept in which u can use multiple functions with same name by either using different type of attributes or
        // different no. of attributes
        hello(2);
        hello(4, 6);
        hello("Hello");
    }

    static void hello(int a){
        int x = 12;
        int y = 45;
        System.out.println("func 1");
    }

    static void hello(String a){
        int x = 1;
        int y = 3;
        System.out.println("func 2");
    }

    static void hello(int a , int b){
        int x = 4;
        int y = 5;
        System.out.println("func 3");
    }
}
