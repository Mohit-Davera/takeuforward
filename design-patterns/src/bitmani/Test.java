package bitmani;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String s = "bcca";
        int k = 2;
        List<String> ans = new ArrayList<>();
        allSubSequnceOfLengthK(s, k, 0, ans, "");
        System.out.println(ans);
    }


    public static void allSubSequnceOfLengthK(String s, int k, int index, List<String> ans, String curr) {
        if (index == s.length()) {
            if(curr.length() == k) ans.add(curr);
            return;
        }

        char c = s.charAt(index);
        allSubSequnceOfLengthK(s, k, index + 1, ans, curr + c);
        allSubSequnceOfLengthK(s, k, index + 1, ans, curr);
    }

}
