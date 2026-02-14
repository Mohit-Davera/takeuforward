package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetTwo {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2};

        List<List<Integer>> ans = new ArrayList<>();
        subSetSum(nums, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void subSetSum(int[] nums, int index, List<Integer> curr, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(curr));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            subSetSum(nums, i + 1, curr, ans);
            curr.remove(curr.size()-1);
        }
    }
}
