package array.slidingwindow.med;

public class MaxCountOneThree {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int len = 0;

        int zeroCount = 0;
        int n = nums.length;

        while(right < n){
            if(nums[right] == 0) zeroCount++;
            while(zeroCount > k && left <=right){
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            len = Math.max(right - left+1,len);
            right++;
        }
        return len;
    }
}
