package array.slidingwindow;

public class CountSubArrayWithZeroOne {
    public static void main(String[] args) {
        mine(new int[]{1,0,1,0,1},2);
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0, j = 0, count = 0, sum = 0, temp = 0;
        while (j<nums.length) {
            sum += nums[j];
            if (nums[j] == 1) temp = 0;
            if (sum > goal) {
                sum -= nums[i];
                i++;
            }
            while (sum == goal && i <= j) {
                temp++;
                sum -= nums[i];
                i++;
            }
            j++;
            count += temp;
        }
        return count;
    }

    public static int mine(int[] nums,int goal){
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;

        while(right < nums.length){
            sum+=nums[right];
            if(sum == goal) count++;
            while(sum > goal){
                sum-=nums[left];
                left++;
            }
            while(sum == goal && left<=right){
                sum-=nums[left];
                left++;
                count++;
            }
            right++;
        }
        return count;
    }
}
