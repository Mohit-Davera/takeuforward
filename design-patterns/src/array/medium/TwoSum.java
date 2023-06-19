package array.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ans = twoSumUsingHashmap(new int[]{2,6,5,8,11},14);
        int[] ans2 = twoSumUsingSort(new int[]{2,6,5,8,11},14);

        for (int i :
                ans) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i :
                ans2) {
            System.out.print(i+" ");
        }
    }

    public static int[] twoSumUsingHashmap(int[] arr, int target) {
        HashMap<Integer,Integer> valueIndexHashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(valueIndexHashmap.containsKey(target - arr[i])){
                return new int[]{valueIndexHashmap.get(target-arr[i]),i};
            }
            else{
                valueIndexHashmap.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumUsingSort(int[] arr,int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] > target){
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            }
            else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
