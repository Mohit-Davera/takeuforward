package heap_aditya;

import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectRopes {
    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 4});
        System.out.println(solution);
    }

    public static int solution(int[] nums) {
        int cost = 0;
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i : nums) {
            pq.add(i);
        }

        while (pq.size() >= 2){
            int connectCost = pq.poll() + pq.poll();
            pq.add(connectCost);
            cost+=connectCost;
        }

            return cost;
    }
}
