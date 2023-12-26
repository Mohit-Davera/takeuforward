package testing;

public class Main {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        int j = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '*') {
                j--;
            } else {
                chars[j++] = chars[i];
            }
        }

        return new String(chars, 0, j);
    }



}