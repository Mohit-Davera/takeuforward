package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};

        List<List<Integer>> ans = new ArrayList<>();
//        permutation(nums, new boolean[nums.length], new ArrayList<>(), ans);
        permutationOptimised(nums, 0, ans);
        System.out.println(ans);
    }

    static void permutation(int[] nums, boolean[] flags, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flags[i]) continue;
            flags[i] = true;
            curr.add(nums[i]);
            permutation(nums, flags, curr, ans);
            flags[i] = false;
            curr.remove(curr.size() - 1);
        }
    }

    static void permutationOptimised(int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> curr = new ArrayList<>();
            for (int num : nums) {
                curr.add(num);
            }
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permutationOptimised(nums, index + 1, ans);
            swap(nums, i, index);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
