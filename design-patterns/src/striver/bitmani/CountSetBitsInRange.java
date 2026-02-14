package striver.bitmani;

public class CountSetBitsInRange {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(countSetBits(n));
    }
    public static int countSetBits(int n) {
        if(n == 0) return 0;
        int x = maximumPowerOf2LessThanN(n);
        int firstPart = x * (1 << x - 1);
        int secondPart = (n - (1 << x)) + 1;
        return firstPart + secondPart + countSetBits(n-(1<<x));
    }

    //find maximum power of 2, smaller than n
    public static int maximumPowerOf2LessThanN(int n) {

        int x = 0;

        while( (1<<x) <= n){
            x++;
        }

        return x - 1;
    }
}
