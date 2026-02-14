package striver.bitmani;

public class SetTheRightmostUnsetBit {
    public static void main(String[] args) {
        String s = decimalToBinary(91);
        System.out.println(s);
        int i = setBits(91);
        System.out.println(i);
    }

    public static int setBits(int n) {
        int count = 0;

        int flip = n;
        while (flip != 0) {
            if ((flip & (1 << count)) != 1) break;
            count++;
        }


        return n | (1 << count);
    }

    public static String decimalToBinary(int decimalNumber) {
        // Check if the number is negative
        if (decimalNumber < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        // Special case for 0
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        // Convert decimal to striver.binary
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.toString();
    }

}
