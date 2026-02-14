package striver.graph.short_path;

import java.util.*;

public class WordLadder2 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"));
        List<List<String>> ladders = findLadders("hit", "cog", wordList);
        System.out.println(ladders);
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ans = new ArrayList<>();

        Queue<List<String>> q = new LinkedList<>();
        List<String> temp = new ArrayList<>();
        temp.add(beginWord);
        q.add(temp);
        Set<String> set = new HashSet<>(wordList);
        List<String> del = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            for(String dWord : del){
                set.remove(dWord);
            }
            del.clear();
            for(int i = 0;i<size;i++){
                List<String> list = q.poll();
                String word = list.get(list.size() - 1);
                if(word.equals(endWord)){
                    ans.add(list);
                    continue;
                }
                char[] charArr = word.toCharArray();
                for(int l = 0;l<word.length();l++){
                    char og = charArr[l];
                    for(char c = 'a';c<='z';c++){
                        charArr[l] = c;
                        String newWord = new String(charArr);
                        if(set.contains(newWord)){
                            List<String> newList = new ArrayList<>(list);
                            newList.add(newWord);
                            q.add(newList);
                            del.add(newWord);
                        }
                    }
                    charArr[l] = og;
                }
            }
        }
        return ans;
    }

}
