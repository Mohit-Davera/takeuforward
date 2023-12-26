package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumThree {
    public static void main(String[] args) {
        int k = 3;
        int n = 9;
        List<List<Integer>> ans = new ArrayList<>();
        combinationSumThree(n, k, 1, 0, new ArrayList<>(), ans);
        System.out.println(ans);

    }

    static void combinationSumThree(int n, int k, int index, int sum, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == k) {
            if(sum == n)
                ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = index; i <= n; i++) {
            if ((sum + i) > n)
                break;
            curr.add(i);
            sum += i;
            combinationSumThree(n, k, i + 1, sum, curr, ans);
            sum -= i;
            curr.remove(curr.size() - 1);
        }

    }
}
