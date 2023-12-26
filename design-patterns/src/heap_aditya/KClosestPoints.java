package heap_aditya;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPoints {
    public static void main(String[] args) {
        kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
    }

    public static int[][] kClosest(int[][] points, int k) {
        Queue<Pair<Integer, int[]>> heap = new PriorityQueue<>((p1, p2) -> p2.getKey() - p1.getKey());
        int[][] ans = new int[k][2];

        for (int[] p : points) {
            int x = p[0] * p[0];
            int y = p[1] * p[1];
            heap.add(new Pair<>(Math.abs(x) + Math.abs(y), p));
            if (heap.size() > k) {
                heap.poll();
            }
        }


        int index = 0;
        while (heap.size() != 0) {
            Pair<Integer, int[]> poll = heap.poll();
            ans[index++] = poll.getValue();
        }

        return ans;
    }
}
