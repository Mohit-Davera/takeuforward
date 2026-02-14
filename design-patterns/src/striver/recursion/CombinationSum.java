package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5};
        int target = 8;

        List<List<Integer>> ans = new ArrayList<>();
        combinationSumOne(nums, target, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void combinationSumOne(int[] nums, int target, int index, List<Integer> curr, List<List<Integer>> ans) {
        if (index == nums.length) {
            if (target == 0)
                ans.add(new ArrayList<>(curr));
            return;
        }

        if (nums[index] <= target) {
            curr.add(nums[index]);
            combinationSumOne(nums, target - nums[index], index, curr, ans);
            curr.remove(curr.size() - 1);
        }
        combinationSumOne(nums, target, index + 1, curr, ans);

    }
}
