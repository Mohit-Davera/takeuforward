package striver.array.slidingwindow.med;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        int longestSubString = findLongestSubString("AABC", 1, 'B');
        System.out.println(longestSubString);
    }

    public static int findLongestSubString(String str, int k, int c) {
        int left = 0;
        int right = 0;
        int n = str.length();
        int len = 0;
        int operation = 0;

        while (right < n) {
            if (str.charAt(right) != c) operation++;
            while (operation > k) {
                if (str.charAt(left) != c) operation--;
                left++;
            }
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;

    }

    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            freq[curr - 'A']++;
            mostFreqLetter = Math.max(mostFreqLetter, freq[curr - 'A']);

            int lettersToChange = (right - left + 1) - mostFreqLetter;
            if (lettersToChange > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
