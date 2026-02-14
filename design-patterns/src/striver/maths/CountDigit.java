package striver.maths;

public class CountDigit {
    public static void main(String[] args) {
        int n = 135;
        int count = 0;
        while (n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);

        System.out.println(reverseNumber(123));
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
