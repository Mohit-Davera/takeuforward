package striver.bitmani;

import java.util.ArrayList;
import java.util.List;

public class GrayCodeBit {

    public static void main(String[] args) {
        List<String> ans = recursion(3);
        System.out.println(ans);
    }

    public static List<String> recursion(int n){
        if(n == 1){
            List<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        List<String> previousLevel = recursion(n-1);
        List<String> ans = new ArrayList<>();
        for(String i : previousLevel){
            ans.add("0" + i);
        }
        for(int i = previousLevel.size()-1;i>=0;i--){
            ans.add("1" + previousLevel.get(i));
        }
        return ans;
    }
}
