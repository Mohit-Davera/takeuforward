package striver.maths;

import java.math.BigInteger;

public class Armstrong {

    // The large number as a String for BigInteger
    private static final String LARGE_ARMSTRONG = "11513221901876399003";

    public static void main(String[] args) {
        BigInteger original = new BigInteger(LARGE_ARMSTRONG);
        int count = LARGE_ARMSTRONG.length(); // Count digits from the string
        BigInteger sum = BigInteger.ZERO;
        BigInteger n = original; // Start with the original number

        // Define constants for BigInteger operations
        BigInteger TEN = BigInteger.TEN;
        BigInteger ZERO = BigInteger.ZERO;

        while (n.compareTo(ZERO) > 0) {
            // 1. Get the last digit: n % 10
            BigInteger digitBig = n.remainder(TEN);

            // Convert BigInteger digit back to a standard int for power calculation
            int digit = digitBig.intValue();

            // 2. Calculate the power of the digit: digit^count
            // The result must be stored in BigInteger
            BigInteger term = efficientPower(digit, count);

            // 3. Add to the total sum
            sum = sum.add(term);

            // 4. Remove the last digit: n / 10
            n = n.divide(TEN);
        }

        System.out.println("Original: " + original);
        System.out.println("Sum of Powers: " + sum);
        // Check if the sum is equal to the original number
        boolean isArmstrong = sum.equals(original);
        System.out.println("Is Armstrong? " + isArmstrong);
        // The check should output: Is Armstrong? true
    }

    // This method now returns BigInteger to prevent overflow
    public static BigInteger efficientPower(int base, int exponent) {
        // Start with BigInteger version of the base
        BigInteger x = BigInteger.valueOf(base);
        BigInteger result = BigInteger.ONE;

        // Same efficient logic, but using BigInteger methods
        while (exponent > 0) {
            if (exponent % 2 != 0) { // If exponent is odd
                result = result.multiply(x);
            }
            x = x.multiply(x); // Square the base (x = x * x)
            exponent /= 2; // Halve the exponent
        }
        return result;
    }
}