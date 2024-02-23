package bitmani;

public class Testing {
    public static void main(String[] args) {
        int divide = divide(1, 1);
        System.out.println(divide);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isNeg = ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0 ));
        int temp = dividend;
        int copyOfDivisor = divisor;
        if(dividend < 0) temp = -dividend;
        if(divisor < 0) copyOfDivisor = -divisor;
        int ans = 0;
        while(temp - copyOfDivisor >= 0){
            int count = 0;
            while(temp - (copyOfDivisor << count << 1) >= 0){
                count++;
            }
            temp = temp - (copyOfDivisor<<count);
            ans += (1<<count);
        }

        if(isNeg) return -ans;
        return ans;
    }
}
