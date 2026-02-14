package striver.greedy;

import java.util.PriorityQueue;

public class SingleThreadedCpu {
    public static void main(String[] args) {
        int[][] tasks = {{1, 2}, {2, 4}, {3, 2}, {4, 1}};
        int[] order = getOrder(tasks);
    }

    public static int[] getOrder(int[][] tasks) {

        int index = 0;
        int n = tasks.length;
        int[] ans = new int[n];
        int time = 0;

        PriorityQueue<int[]> jobs = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[2] == b[2]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[2], b[2]);
        });

        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{i, tasks[i][0], tasks[i][1]});
        }

        while (index != n) {
            while (!jobs.isEmpty() && jobs.peek()[1] <= time) {
                pq.add(jobs.poll());
            }

            if (!pq.isEmpty()) {
                int[] p = pq.poll();
                time += p[2];
                ans[index++] = p[0];
            } else {
                time++;
            }
        }

        return ans;

    }

}
