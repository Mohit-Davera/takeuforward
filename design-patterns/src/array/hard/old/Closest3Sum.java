package array.hard.old;

import java.util.Arrays;

public class Closest3Sum {
    public static void main(String[] args) {
        int[] nums = {6,-2,-5,7,-9};
        System.out.println(best(nums,3));
    }

    //Two pointer and loop
    public static int best(int[] arr,int x) {
        int n = arr.length;
        Arrays.sort(arr);
        int closest = arr[0] + arr[1] + arr[n - 1];
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;
            if (i == 0 || arr[i-1] != arr[i]) {
                while (low < high) {
                    int currentSum = arr[i] + arr[low] + arr[high];
                    if(currentSum==x)
                        return currentSum;
                    else if (currentSum > x) {
                        high--;
                    }
                    else{
                        low++;
                    }
                    if(Math.abs(closest - x) > Math.abs(currentSum - x)){
                        closest = currentSum;
                    }
                }
            }
        }
        return closest;
    }
}
