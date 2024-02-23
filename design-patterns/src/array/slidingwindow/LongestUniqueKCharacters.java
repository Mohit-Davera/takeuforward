package array.slidingwindow;

import java.util.HashMap;

public class LongestUniqueKCharacters {
    public static void main(String[] args) {
        int count = longestkSubstr("ababc", 2);
        System.out.println(count);
    }
    public static int longestkSubstr(String s, int k) {
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
        return len;
    }
}
