package Questions;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 234452;
        int reverse = 0;

        while (num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println(reverse);
        if (num == reverse){System.out.println("Palindrome");} else {System.out.println("Not Palindrome");}
    }
}