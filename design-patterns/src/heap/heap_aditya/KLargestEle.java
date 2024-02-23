package heap.heap_aditya;

import java.util.PriorityQueue;

public class KLargestEle {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 7, 1, 2, 3, 6, 4};
        kLargest(nums, 3);
    }

    public static void kLargest(int nums[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i :
                nums) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq);
    }
}
