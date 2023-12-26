package recursion;

public class WordSearch {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        long l = power(5, 1924 / 2) % mod;
        long l1 = power(4, 1924 / 2) % mod;
        System.out.println(l * l1 % mod);


    }

    public static long power(long n, long power) {

        if (power == 0) {
            return 1;
        }
        return (power % 2 == 0) ?
                power((n * n) % mod, power / 2) % mod :
                (n * (power((n * n) % mod, power / 2)) % mod) % mod;
    }

    public static long powerSecond(long n, long power) {
        long temp;
        int mod = (int) 1e9 + 7;
        if (power == 0) {
            return 1;
        }
        temp = powerSecond(n, power / 2);
        return (power % 2 == 0) ? (temp * temp) % mod : (n * temp * temp) % mod;
    }
}
