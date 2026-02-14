package striver.graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isVis = new boolean[V];
        depth(0,adj,isVis,ans);
        return ans;
    }

    public void depth(int curr,ArrayList<ArrayList<Integer>> adj, boolean[] isVis,ArrayList<Integer> ans){
        ans.add(curr);
        isVis[curr] = true;
        for(int i : adj.get(curr)){
            if(!isVis[i]){
                depth(i,adj,isVis,ans);
            }
        }
    }
}
