package heap_aditya;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] solution = solution(nums, k);
        for (int i :
                solution) {
            System.out.print(i+" ");
        }
    }

    static int[] solution(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (int i : nums)
            mp.merge(i, 1, Integer::sum);

        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            pq.add(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.stream().map(Map.Entry::getKey).mapToInt(Integer::intValue).toArray();
    }
}
