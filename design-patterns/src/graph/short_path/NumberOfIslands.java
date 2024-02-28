package graph.short_path;

import graph.disjoint.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {0, 3}, {0, 1}, {1, 1}, {1, 0}, {1, 2}, {0, 3}, {1, 2}};
        List<Integer> integers = new NumberOfIslands().numOfIslands(2, 4, arr);
        System.out.println(integers);
    }

    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        DisjointSet ds = new DisjointSet(rows * cols);

        List<Integer> ans = new ArrayList<>();
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        boolean[][] vis = new boolean[rows][cols];
        int count = 0;
        for (int[] op : operators) {
            int row = op[0];
            int col = op[1];

            if (vis[row][col]) {
                ans.add(count);
            } else {
                vis[row][col] = true;
                count++;
                for (int d = 0; d < drow.length; d++) {
                    int neighRow = row + drow[d];
                    int neighCol = col + dcol[d];
                    if (isValid(neighRow, neighCol, rows, cols)) {
                        if (vis[neighRow][neighCol]) {
                            int nodeNo = row * rows + col;
                            int neighNo = neighRow * rows + neighCol;
                            if (ds.findUPar(nodeNo) != ds.findUPar(neighNo)) {
                                count--;
                                ds.unionBySize(nodeNo, neighNo);
                            }
                        }
                    }
                }
                ans.add(count);
            }
        }
        return ans;
    }

    public boolean isValid(int row, int col, int rows, int cols) {
        return row < rows && row >= 0 && col < cols && col >= 0;
    }
}
