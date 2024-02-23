package greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        boolean[] dp = new boolean[nums.length];
        System.out.println(jump(nums, 0, dp));
    }

    public static boolean jump(int[] nums, int curr, boolean[] dp) {

        if (nums[curr] == 0) return false;
        if (curr == nums.length - 1) return true;

        if (!dp[curr]) return false;
        int len = curr + nums[curr];

        for (int i = curr + 1; i <= len; i++) {
            if (i < nums.length - 1 && jump(nums, i, dp)) {
                dp[i] = true;
                return true;
            }
        }
        return false;
    }

    //front
    public static boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reach < i)
                return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }

    public static boolean canJumpReverse(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1;i>=0;i--) {
            if(i + nums[i] >= goal) goal = i;
        }
        return goal == 0;
    }
}
