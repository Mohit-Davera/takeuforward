package striver.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3};

        List<Integer> ans = new ArrayList<>();
        subSetSum(nums, 0, 0, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }

    static void subSetSum(int[] nums, int index, int currSum, List<Integer> ans) {

        if (index == nums.length) {
            ans.add(currSum);
            return;
        }
        subSetSum(nums, index + 1, currSum + nums[index], ans);
        subSetSum(nums, index + 1, currSum, ans);

    }
}
