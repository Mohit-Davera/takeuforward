package array.slidingwindow.med;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {
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

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('c',100);
        map.put('d',10);
        System.out.println(map);
        map.remove('d',10);
        System.out.println(map);
    }
}
