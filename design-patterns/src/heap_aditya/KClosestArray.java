package heap_aditya;


import java.util.*;

public class KClosestArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        solution(nums, k, x);
    }

    public static void solution(int[] nums, int k, int x) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((p1, p2) -> Objects.equals(p2.getKey(), p1.getKey()) ? p2.getValue() - p1.getValue() : p2.getKey() - p1.getKey());
        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums[i] - x);
            pq.add(new Pair<>(abs, nums[i]));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<Integer> list = new LinkedList<>();
        while (!pq.isEmpty()) {
            Pair<Integer, Integer> poll = pq.poll();
            list.add(poll.getValue());
            System.out.print(poll.getValue() + " ");
        }

        System.out.println(list);
    }
}

