package array.old.easy;

import java.util.HashMap;

public class CountOccurrenceOfAnagrams {

    static int search(String pat, String txt) {
        int ans = 0;
        HashMap<Character,Integer> characterMap = new HashMap<>();
        int k = pat.length();
        for (int i = 0; i < k; i++) {
            characterMap.merge(pat.charAt(i),1,Integer::sum);
        }
        int count = characterMap.size();
        int start = 0;
        int end = 0;
        while (end<txt.length()){
            char currentNewCharacter = txt.charAt(end);
            if(characterMap.containsKey(currentNewCharacter)){
                characterMap.merge(currentNewCharacter,-1,Integer::sum);
                if(characterMap.get(currentNewCharacter) == 0){
                    count--;
                }
            }

            if(end - start + 1 < k){
                end++;
            }
            else{
                if(count == 0){
                    ans++;
                }
                char startChar = txt.charAt(start);
                if(characterMap.containsKey(startChar)){
                    characterMap.merge(startChar,1,Integer::sum);
                    if(characterMap.get(startChar) == 1){
                        count++;
                    }
                }
                start++;
                end++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String txt= "aabaabaa";
        String ptr = "aaba";
        int search = search(ptr, txt);
        System.out.println(search);
    }
}

