package array.slidingwindow.hard;

public class MinimumWindowSubsequence {
    public static void main(String[] args) {
        System.out.println(minWindow("abcdebdde", "bde"));
    }

    public static String minWindow(String str1, String str2) {

        int windowIndex = 0;
        int right = 0;
        int len = Integer.MAX_VALUE;
        int ansL = 0;
        int ansR = 0;
        while (right < str1.length()) {
            if (str1.charAt(right) == str2.charAt(windowIndex)) {
                windowIndex++;
                if (windowIndex == str2.length()) {
                    int end = right + 1;
                    windowIndex--;
                    while (windowIndex >= 0) {
                        if (str1.charAt(right) == str2.charAt(windowIndex)) windowIndex--;
                        right--;
                    }
                    windowIndex++;
                    right++;
                    if (end - right < len) {
                        len = end - right;
                        ansL = right;
                        ansR = end;
                    }
                }
            }
            right++;
        }

        if(len == Integer.MAX_VALUE ) return "";
        return str1.substring(ansL,ansR);
    }
}
