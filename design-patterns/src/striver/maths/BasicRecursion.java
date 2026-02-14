package striver.maths;

import java.util.HashMap;
import java.util.Map;

public class BasicRecursion {

    int count = 0;

    static int[] arr = {1, 2, 3, 4, 5};

    void printSomethingFiveTimes() {
        System.out.print("GFG ");
        count++;
        if (count == 5)
            return;
        printSomethingFiveTimes();
    }

    void printNToOne(int n) {
        System.out.print(n);
        if (n == 1)
            return;
        printNToOne(n - 1);
    }

    void printOneToN(int n) {
        if (n != 0) {
            printOneToN(n - 1);
            System.out.print(n);
        }
    }

    int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }

    int factorialOfN(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialOfN(n - 1);
    }

    void swap(int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    void reverseAnArray(int i, int n) {
        if (i >= n / 2) {
            return;
        }
        swap(i, n - i - 1);
        reverseAnArray(i + 1, n);
    }

    boolean palindrome(int i, String text) {
        if (i >= text.length() / 2)
            return true;
        if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
            return palindrome(i + 1, text);
        } else
            return false;
    }

    int countFrequencyDigit(int digit, int[] arr) {
        //assuming max value of digit is 12
        int[] hash = new int[13];
        for (int i : arr) {
            hash[i]++;
        }

        return hash[digit];
    }

    int countLowerAlphabetsOnlyFrequency(char character, String s) {
        //only 26 alphabets possible
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        return hash[character - 'a'];
    }

    int countCharacterFrequency(char character, String s) {
        //only 26 alphabets possible
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        return hash[character];
    }

    int hashMapFrequency(int digit, int[] intArray) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i : intArray) {
            hashMap.merge(i, 1, Integer::sum);
        }
        System.out.println(hashMap.toString());
        return hashMap.getOrDefault(digit, 0);
    }

    public static void main(String[] args) {
        BasicRecursion basicRecursion = new BasicRecursion();
        int frequency = basicRecursion.hashMapFrequency(
                33, new int[]{1, 2, 3, 4, 5, 1, 2, 4, 8, 5});
        System.out.println(frequency);
    }
}
