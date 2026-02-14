package striver.maths;

public class Palindrome {

    public static void main(String[] args) {
        int n = 12321;
        System.out.println(n == reverseNumber(n));
    }

    public static int reverseNumber(int n){
        int reverse = 0;
        while(n!=0){
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }

        return reverse;
    }
}
