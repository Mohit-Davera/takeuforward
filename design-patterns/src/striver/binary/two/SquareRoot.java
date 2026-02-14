package striver.binary.two;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(4));
    }

    static long root(long N) {
        long low = 1;
        long high = N;
        long ans = -1;
        while (low <= high) {
            long mid = (high + low) / 2;
            if (mid * mid == N)
                return mid;
            else if (mid * mid > N)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
