package striver.heap.intro;

import java.util.PriorityQueue;
import java.util.TreeMap;


//SAME AS Hands of Straights
public class DivideArrayInSetsOfKConsecutive {
    public static void main(String[] args) {
        isPossible(new int[]{3,2,1,2,3,4,3,4,5,9,10,11},3);
    }

    public static boolean isPossible(int[] nums,int k){
        if (nums.length % k != 0) return false;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int h : nums) heap.offer(h);

        while (!heap.isEmpty()) {
            int val = heap.peek();
            for (int i = val; i < val + k; i++) {
                if (!heap.remove(i)) return false;
            }
        }
        return true;
    }

    public boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;
        if (n % k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            map.merge(i, 1, Integer::sum);
        }

        while (!map.isEmpty()) {
            int first = map.firstKey();
            for (int i = 1; i < k; i++) {
                int next = first + i;
                if (map.containsKey(next)) {
                    map.merge(next, -1, Integer::sum);
                    if (map.get(next) == 0) map.remove(next);
                } else {
                    return false;
                }
            }
            map.merge(first, -1, Integer::sum);
            if (map.get(first) == 0) map.remove(first);
        }

        return true;
    }
}
