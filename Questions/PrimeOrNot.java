package Questions;

public class PrimeOrNot {
    public static void main(String[] args) {
//        for (int i = 1; )
    }

//    static boolean primeOrNot(int n){
//        if (n <= 1){
//            return false;
//        }
//        for (int start = 2; start < n; start++){
//            if (n % start == 0){
//                return false;
//            }
//        }
//        return true;
//    }
    static boolean isPrime(int n) {  // faster than mine
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
