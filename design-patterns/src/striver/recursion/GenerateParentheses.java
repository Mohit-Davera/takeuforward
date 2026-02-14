package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, 3, "");
        return ans;
    }

        public static void solve(List<String> ans, int n, String curr) {
            if (curr.length() == n * 2) {
                if(isValid(curr))
                    ans.add(new String(curr));
                return;
            }

            curr += '(';
            solve(ans, n, curr);
            curr = curr.substring(0, curr.length() - 1);

            curr += ')';
            solve(ans, n, curr);
        }

        public static boolean isValid(String curr){
            int open = 0;
            int closed = 0;
            for (int i = 0; i < curr.length(); i++) {
                char c = curr.charAt(i);
                if(c == '('){
                    open++;
                } else if (open <= 0) {
                    return false;
                }else{
                    open--;
                }
            }
            return open == 0;
        }
}
