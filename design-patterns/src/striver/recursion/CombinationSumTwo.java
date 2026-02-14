package striver.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {
    public static void main(String[] args) {
        int[] nums = new int[]{10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        combinationSumTwo(nums, target, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void combinationSumTwo(int[] nums, int target, int index, List<Integer> curr, List<List<Integer>> ans) {
        if (target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i-1] == nums[i]) continue;
            if(nums[i] > target) break;// sorted so avoid useless
            curr.add(nums[i]);
            combinationSumTwo(nums, target - nums[i], i + 1, curr, ans);
            curr.remove(curr.size() - 1);
        }

    }
}
