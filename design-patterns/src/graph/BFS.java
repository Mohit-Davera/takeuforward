package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVis = new boolean[V+1];
        queue.add(0);
        isVis[0] = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i< size;i++){
                Integer poll = queue.poll();
                for (int j : adj.get(poll)) {
                    if(!isVis[j]){
                        queue.add(j);
                        isVis[j] = true;
                    }
                }
                bfs.add(i);
            }
        }
        return bfs;
    }
}
