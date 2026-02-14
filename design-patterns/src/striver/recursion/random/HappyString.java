package striver.recursion.random;

import java.util.ArrayList;
import java.util.List;

public class HappyString {

    public static void main(String[] args) {
        new HappyString().getHappyString(3,9);
    }

    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        recursion(ans,n,"");
        System.out.println(ans);
        if(ans.size() < k) return "";
        return ans.get(k-1);
    }

    public void recursion(List<String> ans,int n,String curr){
        if(curr.length() == n){
            ans.add(curr);
            return;
        }

        for(char i = 'a';i<='c';i++){
            if(curr.length() != 0 && curr.charAt(curr.length() - 1) == i) continue;
            recursion(ans,n,curr+i);
        }
    }
}
