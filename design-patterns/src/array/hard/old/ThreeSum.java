package array.hard.old;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(best(nums));
    }

    public static Set<List<Integer>> optimised(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> listSet = new HashSet<>();
        List<Integer> list;

        for (int i :
                arr) {
            map.merge(i, 1, Integer::sum);
        }


        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], -1, Integer::sum);
            for (int j = i + 1; j < arr.length; j++) {
                map.merge(arr[j], -1, Integer::sum);
                if (map.get(-(arr[i] + arr[j])) != null && map.get(-(arr[i] + arr[j])) != 0) {
                    list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(-(arr[i] + arr[j]));
                    Collections.sort(list);
                    listSet.add(list);
                }
                map.merge(arr[j], 1, Integer::sum);
            }
            map.merge(arr[i], 1, Integer::sum);
        }
        return listSet;
    }

    //Two pointer and loop
    public static List<List<Integer>> best(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = -nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return list;
    }
}
