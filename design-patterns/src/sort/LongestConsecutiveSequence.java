package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longest(new int[]{3, 8, 5, 7, 6}));
    }

    public static int longest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxLength = 1;
        int count = 0;
        int currentSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == currentSmallest) {
                count++;
                currentSmallest = arr[i];
            } else if (arr[i] - 1 != currentSmallest) {
                count = 1;
                currentSmallest = arr[i];
            }
            maxLength = Math.max(maxLength, count);
        }
        return maxLength;
    }

    public static int bruteForce(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i :
                arr) {
            integerSet.add(i);
        }
        int count = 0;
        int maxLen = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!integerSet.contains(arr[i] - 1)) {
                int element = arr[i];
                while (integerSet.contains(element + 1)) {
                    element++;
                    count++;
                }
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
