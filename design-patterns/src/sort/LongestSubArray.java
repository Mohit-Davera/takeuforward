package sort;

import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {

    }

    public static int forNegatives(int[] arr, int k) {
        int maxLen = 0;
        int n = arr.length;
        int sum = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k)
                maxLen = Math.max(maxLen, i + 1);
            if (preSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - preSumMap.get(sum - k));
            }
            if (!preSumMap.containsKey(sum))
                preSumMap.put(sum, i);
        }
        return maxLen;
    }

    public static int forPositives(int[] arr, int k) {
        int maxLen = 0;
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k)
                maxLen = Math.max(maxLen, right - left + 1);
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLen;
    }
}
