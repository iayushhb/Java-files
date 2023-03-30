package Questions;

public class Factorial {
    public static void main(String[] args) {
        fact(5);
    }

    static int fact(int n){
        int all = 1;
        if (n == 1){
            return 1;
        } else {
            int i = 2;
            while (i <= n){
                all = all * i;
                i++;
            }
        }
        return all;
    }
}
