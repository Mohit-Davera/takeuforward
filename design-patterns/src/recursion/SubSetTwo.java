package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSumTwo {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3};

        List<List<Integer>> ans = new ArrayList<>();
        subSetSum(nums, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void subSetSum(int[] nums, int index, List<Integer> curr, List<List<Integer>> ans) {

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            subSetSum(nums, i, curr, ans);
            curr.remove(curr.size()-1);
        }

    }
}
