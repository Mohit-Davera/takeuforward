package array.old.easy;

public class Rotate {

    //Not Working
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int n = length / 2;
        int temp = nums[length - 1];
        for (int i = 0; i < n; i++) {
            int index = (i + k) % length;
            int secondIndex = (index + k) % length;
            nums[secondIndex] = nums[index];
            nums[index] = nums[i];
            System.out.println("LOOP");
        }
        nums[n - 1] = temp;
    }

    public void rotateBrute(int[] nums, int k) {
        int length = nums.length;
        int n = length / 2;
        for (int i = 0; i < k; i++) {
            int temp = nums[length - 1];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    public void additionalSpaceSol(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            int index = (i + k) % length;
            temp[index] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }

    public void spaceOptimized(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, length-1);

    }

    public static void reverse(int[] nums, int left, int right) {
        int length = (right + left)/2;
        for (int i = left; i <= length; i++) {
            int temp = nums[i];
            nums[i] = nums[right - (i - left)];
            nums[right - (i - left)] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,5,6};
//        int[] nums = {-1,-100,3,99};
        new Rotate().spaceOptimized(nums,2);
        //reverse(nums, 0, nums.length - 1);
        for (int i :
                nums) {
            System.out.print(i + " ");
        }
    }
}
