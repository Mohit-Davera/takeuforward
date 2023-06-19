package array.old.easy;

public class Testing {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =2;
        int length = nums.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            int index = (length - k + i) % length;
            temp[index] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, length);
        for (int i :
                nums) {
            System.out.print(i+" ");
        }
    }
}
