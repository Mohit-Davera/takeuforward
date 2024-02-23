package array.slidingwindow.med;


//simmilar to binary substring with sum odd become 1 and even become 0
public class CountNumberOfNiceSubarrays {
    public static void main(String[] args) {

    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public static int atMost(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;
        while (right < n) {
            sum += (nums[right] & 1);
            while (sum > goal && left <= right) {
                sum -= (nums[left] & 1);
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}
