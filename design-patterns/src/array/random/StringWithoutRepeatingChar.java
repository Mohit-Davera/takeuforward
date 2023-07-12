package array.random;

import java.util.HashMap;

public class StringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 1;
        int low = 0;
        int high = 1;
        map.put(s.charAt(0), 0);
        while (high < s.length()) {
            while (map.containsKey(s.charAt(high))) {
                map.remove(s.charAt(low));
                low++;
            }
            maxLen = Math.max(maxLen, high - low +1);
            map.put(s.charAt(high),high);
            high++;
        }
        return maxLen;
    }
}
