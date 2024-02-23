package randomLeetcodes;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int[][] grid = new int[m][n];
        int[][] dp = new int[m][n];
        for (int[] row :
                dp) {
            Arrays.fill(row, -1);
        }

//        int ans = recursiveSolution(grid, 0, 0, m, n);
//        int ans = recursiveBetterSolution(grid, 0, 0, m, n, dp);

        int ans = optimalSolution(m,n);
        System.out.println(ans);
    }

    static int recursiveSolution(int[][] grid, int i, int j, int m, int n) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        int left = recursiveSolution(grid, i, j + 1, m, n);
        int right = recursiveSolution(grid, i + 1, j, m, n);

        return left + right;

    }

    static int recursiveBetterSolution(int[][] grid, int i, int j, int m, int n, int[][] dp) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int left = recursiveBetterSolution(grid, i, j + 1, m, n,dp);
        int right = recursiveBetterSolution(grid, i + 1, j, m, n,dp);
        dp[i][j] = left + right;
        return dp[i][j];
    }

    static int optimalSolution(int m,int n){
        int count = m + n -2;
        int r = m -1;
        double res = 1;

        for(int i = 1;i<=r;i++){
            res = res * (count-r+i)/i;
        }
        return (int)res;
    }

}
