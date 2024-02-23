package greedy;

public class JumpGameTwo {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int steps = countSteps(nums);
        System.out.println(steps);
    }

    public static int countSteps(int[] nums){
        int left = 0;
        int right = 0;
        int steps = 0;

        while (right < nums.length - 1){
            int maxReach = 0;
            for(int i = left;i<=right;i++){
                maxReach = Math.max(maxReach,i + nums[i]);
            }
            left = right+1;
            right = Math.min(maxReach,nums.length-1);
            steps++;
        }
        return steps;
    }


}
