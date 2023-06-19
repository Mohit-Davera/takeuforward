package array.hard;

import java.util.HashMap;

public class LargestSubArraySumZero {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{1, 3, -5, 6, -2}));
    }

    public static int logic(int[] arr){
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum == 0)
                maxLength =Math.max(maxLength,i+1);
            else{
                if(preSumMap.containsKey(sum)){
                    maxLength = Math.max(maxLength,i-preSumMap.get(sum));
                }else{
                    preSumMap.put(sum,i);
                }
            }
        }
        return maxLength;
    }
}
