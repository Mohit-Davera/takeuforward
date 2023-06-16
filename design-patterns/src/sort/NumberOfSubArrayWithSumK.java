package sort;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(logic(arr, 6));
    }

    public static int logic(int[] arr, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (preSumMap.containsKey(sum - k)) {
                count += preSumMap.get(sum - k);
            }
            preSumMap.merge(sum, 1, Integer::sum);
        }
        return count;
    }

}
