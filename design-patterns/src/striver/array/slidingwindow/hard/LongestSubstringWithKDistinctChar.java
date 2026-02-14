package striver.array.slidingwindow.hard;

import java.util.HashMap;

public class LongestSubstringWithKDistinctChar {
    public static void main(String[] args) {

    }

    public static int kDistinctChars(int k, String s) {
        int left = 0;
        int right = 0;
        int n = s.length();

        int len = -1;
        HashMap<Character,Integer> map = new HashMap<>();

        while(right < n){
            Character c = s.charAt(right);
            map.merge(c,1,Integer::sum);
            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.merge(leftChar,-1,Integer::sum);
                if(map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }
            if(map.size() == k){
                len = Math.max(len,right - left + 1);
            }
            right++;
        }
        if(len == -1) return n;
        return len;
    }
}
