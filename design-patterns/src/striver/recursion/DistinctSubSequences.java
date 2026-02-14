package striver.recursion;

import java.util.HashMap;

public class DistinctSubSequences {
    public static void main(String[] args) {
        int n = 9;
        int m = 9;

//        String a = "cbfbdhcac";
//        String b = "bcbcfbeag";

        String a = "cbf";
        String b = "cbfb";

        String s = moreSubsequence(3, 4, a, b);
        System.out.println(s);
    }

    public static int func(String s, int n) {
        // Initializing 'count' with 1.
        int count = 1;

        // Creating a HashMap of [char, int] 'm1'.
        HashMap<Character, Integer> m1 = new HashMap<>();

        // Calculating number of distinct subsequences.
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (!m1.containsKey(curr)) {
                m1.put(curr, count);
                count *= 2;
            } else {
                int temp = m1.get(curr);
                m1.put(curr, count);
                count *= 2;
                count -= temp;
            }
        }
        return count;
    }

    public static String moreSubsequence(int n, int m, String a, String b) {
        int countOne = func(a, n);
        int countTwo = func(b, m);
        if (countOne >= countTwo) {
            return a;
        } else {
            return b;
        }
    }
}
