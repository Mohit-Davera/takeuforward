package graph.short_path;

import java.util.*;

public class WordLadder2Leetcode {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(List.of("hot", "dot", "dog", "lot", "log", "cog"));
        List<List<String>> ladders = new WordLadder2Leetcode().findLadders("hit", "cog", wordList);
        System.out.println(ladders);
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Map<String, Integer> map = new HashMap<>();
        map.put(beginWord, 0);
        wordLadderOne(beginWord, endWord, wordList, map);
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add(endWord);
        dfs(list, beginWord, map, ans);
        return ans;
    }

    public void dfs(List<String> list, String beginWord, Map<String, Integer> map, List<List<String>> ans) {
        String curr = list.get(0);
        if (curr.equals(beginWord)) {
            ans.add(new ArrayList<>(list));
            return;
        }
        char[] arr = curr.toCharArray();
        for (int l = 0; l < arr.length; l++) {
            char og = arr[l];
            for (char c = 'a'; c <= 'z'; c++) {
                arr[l] = c;
                String newWord = new String(arr);
                if (map.containsKey(newWord) && map.containsKey(curr) && map.get(newWord) == map.get(curr) - 1) {
                    list.add(0, newWord);
                    dfs(list, beginWord, map, ans);
                    list.remove(0);
                }
            }
            arr[l] = og;
        }
    }

    public int wordLadderOne(String beginWord, String endWord, List<String> wordList, Map<String, Integer> map) {
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);

        q.add(beginWord);
        set.remove(beginWord);

        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String word = q.poll();
                if (word.equals(endWord)) {
                    return level + 1;
                }
                char[] charArr = word.toCharArray();
                for (int l = 0; l < word.length(); l++) {
                    char og = charArr[l];
                    for (char c = 'a'; c <= 'z'; c++) {
                        charArr[l] = c;
                        String newWord = new String(charArr);
                        if (set.contains(newWord)) {
                            set.remove(newWord);
                            q.add(newWord);
                            map.put(newWord, level);
                        }
                    }
                    charArr[l] = og;
                }
            }
            level++;
        }
        return level;
    }
}
