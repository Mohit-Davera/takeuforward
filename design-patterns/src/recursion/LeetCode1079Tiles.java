package recursion;

import java.util.Arrays;

public class LeetCode1079Tiles {
    static int count;

    public static void main(String[] args) {
        int aab = numTilePossibilities("AAB");
        System.out.println(aab);
    }

    public static int numTilePossibilities(String tiles) {
        count = 0;
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];
        recursive(chars, 0, visited);
        return count;
    }

    private static void recursive(char[] chars, int length, boolean[] visited) {
        if (length == chars.length) return;
        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) continue;
            if (i - 1 >= 0 && chars[i] == chars[i - 1] && !visited[i - 1]) continue;
            count++;
            visited[i] = true;
            recursive(chars, length + 1, visited);
            visited[i] = false;
        }
    }
}
