package shit;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(12, 45, "Ash", "Robin", "Steve");
    }

    static void fun(int a, int b, String ...v) {  // u can use any name but I am using v and the type doesn't have to be string
        // this is called VarArgs(Variable arguments) and u can input any number of arguments with this
        System.out.println(Arrays.toString(v));
    }
}
