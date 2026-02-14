package striver.heap.heap_aditya;

import java.util.PriorityQueue;

public class KSortedArray {

    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        solution(nums,k);
    }

    public static void solution(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        for (int i: nums) {
            pq.add(i);
            if(pq.size() > k +1){
                nums[index++] = pq.poll();
            }
        }

        while (pq.size() != 0){
            nums[index++] = pq.poll();
        }
        print( nums);
    }

    public static void print(int[] nums) {
        for (int i :
                nums) {
            System.out.print(i + " ");
        }
    }
}
