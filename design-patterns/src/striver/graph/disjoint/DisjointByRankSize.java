package striver.graph.disjoint;

import java.util.ArrayList;
import java.util.List;

public class DisjointByRankSize {
    List<Integer> ranks;
    List<Integer> parents;
    List<Integer> sizes;

    public DisjointByRankSize(int n) {
        this.ranks = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.sizes = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ranks.add(0);
            parents.add(i);
            sizes.add(1);
        }
    }

    private int findUPar(int node) {
        if (node == parents.get(node)) {
            return node;
        }
        int ulp = findUPar(parents.get(node));
        parents.set(node, ulp);
        return ulp;
    }

    private void unionByRank(int u, int v) {
        int u_up = parents.get(v);
        int v_up = parents.get(u);
        if(v_up == u_up)
        if (v_up != u_up) {
            if (ranks.get(u_up) < ranks.get(v_up)) {
                parents.set(u_up, v_up);
            } else if (ranks.get(v_up) < ranks.get(u_up)) {
                parents.set(v_up, u_up);
            } else {
                parents.set(v_up, u_up);
                ranks.set(u_up, ranks.get(u_up) + 1);
            }
        }
    }

    private void unionBySize(int u, int v) {
        int u_up = parents.get(v);
        int v_up = parents.get(u);
        if (v_up != u_up) {
            if (sizes.get(u_up) < sizes.get(v_up)) {
                parents.set(u_up, v_up);
                sizes.set(v_up,sizes.get(v_up) + sizes.get(u_up));
            } else {
                parents.set(v_up, u_up);
                sizes.set(u_up,sizes.get(u_up) + sizes.get(v_up));
            }
        }
    }

//    public static void main(String[] args) {
//        DisjointByRankSize ds = new DisjointByRankSize(7);
//        ds.unionByRank(1, 2);
//        ds.unionByRank(2, 3);
//        ds.unionByRank(4, 5);
//        ds.unionByRank(6, 7);
//        ds.unionByRank(5, 6);
//
//        // if 3 and 7 same or not
//        if (ds.findUPar(3) == ds.findUPar(7)) {
//            System.out.println("Same");
//        } else
//            System.out.println("Not Same");
//
//        ds.unionByRank(3, 7);
//
//        if (ds.findUPar(3) == ds.findUPar(7)) {
//            System.out.println("Same");
//        } else
//            System.out.println("Not Same");
//    }

    public static void main(String[] args) {
        DisjointByRankSize ds = new DisjointByRankSize(7);
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);

        // if 3 and 7 same or not
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionBySize(3, 7);

        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
