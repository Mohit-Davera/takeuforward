package striver.bitmani;

import java.util.ArrayList;
import java.util.List;

public class GreyCodeDecimal {
    public List<Integer> grayCode(int n) {
        return recursion(n);
    }

    public static List<Integer> recursion(int n){
        if(n == 0){
            List<Integer> base = new ArrayList<>();
            base.add(0);
            return base;
        }

        List<Integer> previousLevel = recursion(n-1);
        List<Integer> ans = new ArrayList<>(previousLevel);
        int pow = (int)Math.pow(2,(n-1));
        for(int i = previousLevel.size()-1;i>=0;i--){
            ans.add(pow + previousLevel.get(i));
        }
        return ans;
    }
}
