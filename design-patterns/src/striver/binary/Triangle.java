package striver.binary;

import java.util.Arrays;

public class Triangle {
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i< nums.length-2;i++){
            for(int j=i+1;j<nums.length - 1;j++){
                count += upper(nums,nums[i]+nums[j],j+1) - (j+1);
            }
        }
    return count;
    }

    public static int upper(int[] arr, int x,int low) {
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[]{2,2,3,4}));
    }
}
