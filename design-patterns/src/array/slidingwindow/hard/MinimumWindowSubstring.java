package array.slidingwindow.hard;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String smallestWindow(String s, String p) {
        int m = s.length();
        int n = p.length();
        if (n > m) return "";

        int ansL = 0;
        int ansR = 0;
        int len = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) map.merge(c, 1, Integer::sum);
        int count = map.size();

        while (right < m) {
            char c = s.charAt(right);
            map.merge(c, -1, Integer::sum);
            if (map.get(c) == 0) count--;

            while(count == 0){
                if(len > right - left + 1){
                    len = right - left + 1;
                    ansL = left;
                    ansR = right;
                }
                char leftC = s.charAt(left);
                map.merge(leftC,1,Integer::sum);
                if(map.get(leftC) == 1) count++;
                left++;
            }
            right++;
        }
        if(len == Integer.MAX_VALUE) return "";
        return s.substring(ansL, ansR + 1);
    }

    public static void main(String[] args) {
        String s = smallestWindow("timetopractice", "toc");
        System.out.println(s + " " + s.length());
    }
}
