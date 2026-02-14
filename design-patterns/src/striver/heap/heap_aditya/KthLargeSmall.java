package striver.heap.heap_aditya;

import java.util.PriorityQueue;

public class KthLargeSmall {
    public static void main(String[] args) {
        int nums[] = {1, 5, 4, 2, 8, 3, 9, 7, 6};

        System.out.println("kLargest " + kLargest(nums, 1));
        System.out.println("kSmallest " + kSmallest(nums, 4));
    }

    public static int kLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static int kSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
