package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Oranges {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        orangesRotting(grid);
    }
    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];


        int fresh = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                    vis[i][j] = true;
                }
                else if(grid[i][j] == 1) fresh++;
            }
        }

        if(fresh == 0) return 0;
        int time = 0;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        int rotted = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int row = q.peek()[0];
                int col = q.peek()[1];
                q.poll();

                for(int d = 0;d<4;d++){
                    int nrow = row + drow[d];
                    int ncol = col + dcol[d];
                    if(nrow >= 0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol] == 1 && !vis[nrow][ncol] ){
                        vis[nrow][ncol] = true;
                        q.add(new int[]{nrow,ncol});
                        rotted++;
                    }
                }
            }
            if(!q.isEmpty()) time++;
        }

        if(rotted != fresh) return -1;
        return time;
    }
}
