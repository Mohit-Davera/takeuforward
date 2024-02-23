package array.slidingwindow.hard;

import java.util.HashMap;

public class CountSubArrayWithKUniqueIntegers {


    /*
    at most means first
    there are lets say some total children and we know at most 12 children are of age 5 or low
    and 8 children are of age 4 or low
    so 4 will be children of age 5.

    same way we will find count of subarray of at most k and at most k-1


     */
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        int count = atMostK(nums,k) - atMostK(nums,k-1);
        System.out.println(count);
    }

    public static int atMostK(int[] nums,int k){
        int left = 0;
        int count = 0;
        int right = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(right < nums.length){
            map.merge(nums[right],1,Integer::sum);
            while (map.size() > k){
                map.merge(nums[left],-1,Integer::sum);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}
