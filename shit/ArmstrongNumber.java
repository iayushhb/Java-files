package shit;

public class ArmstrongNumber {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (theFinder(i)){
                System.out.print(i + " ");
            }
        }

    }

    static boolean theFinder(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
}
