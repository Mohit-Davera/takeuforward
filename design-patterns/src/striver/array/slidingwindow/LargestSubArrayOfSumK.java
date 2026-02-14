package striver.array.slidingwindow;

import java.util.HashMap;

public class LargestSubArrayOfSumK {

    //Works for non negative values
    static int logicNonNegative(int[] arr, int givenSum) {
        int start = 0;
        int end = 0;
        int maximumSize = 0;
        int localSum = 0;
        while (end < arr.length) {
            localSum += arr[end];
            if (localSum < givenSum) {
                end++;
            } else if (localSum == givenSum) {
                maximumSize = Math.max(end - start + 1, maximumSize);
                end++;
            } else {
                while (localSum > givenSum && start < arr.length) {
                    localSum -= arr[start];
                    start++;
                }
                if (localSum == givenSum)
                    maximumSize = Math.max(end - start + 1, maximumSize);
                end++;
            }
        }
        return maximumSize;
    }

    static int negativeValuesLogicWithHashmap(int arr[],int givenSum){
        HashMap<Integer,Integer> sumIndexMap = new HashMap<>();

        int length = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum == givenSum){
                length = i + 1;
            }

            if(sumIndexMap.containsKey(sum-givenSum)){
                length = Math.max(length,i - sumIndexMap.get(sum-givenSum));
            }
            if(!sumIndexMap.containsKey(sum)){
                sumIndexMap.put(sum,i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        int length = negativeValuesLogicWithHashmap(arr, k);
        System.out.println(length);

    }
}
