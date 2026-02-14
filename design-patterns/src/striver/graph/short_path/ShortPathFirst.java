package striver.graph.short_path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ShortPathFirst {

    public static void main(String[] args) {
        ShortPathFirst shortPathFirst = new ShortPathFirst();
        /*
        6 7
        0 1 2
        0 4 1
        4 5 4
        4 2 2
        1 2 3
        2 3 6
        5 3 1
         */
        int[][] edges = {
                {0,1,2},{0,4,1},{4,5,4},{4,2,2},
                {1,2,3},{2,3,6},{5,3,1}
        };
        shortPathFirst.shortestPath(6,7,edges);
    }
    public int[] shortestPath(int N, int M, int[][] edges) {
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!vis[i]) {
                tofoDfs(i, adj, vis, stack);
            }
        }

        System.out.println("STACK" + stack);

        int[] dis = new int[N];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0] = 0;

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            for (Pair neigh : adj.get(pop)) {
                dis[neigh.first] = Math.min(dis[neigh.first], dis[pop] + neigh.second);
            }
        }

        for (int i = 0; i < N; i++) {
            if (dis[i] == Integer.MAX_VALUE) dis[i] = -1;
        }
        return dis;


    }

    private void tofoDfs(int curr, List<List<Pair>> adj, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;
        for (Pair neigh : adj.get(curr)) {
            if (!vis[neigh.first]) {
                tofoDfs(neigh.first, adj, vis, stack);
            }
        }
        stack.add(curr);
    }

    public class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
