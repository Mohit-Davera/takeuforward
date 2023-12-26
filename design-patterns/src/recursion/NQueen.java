package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueen {
    private static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<>();
        int[] leftRow = new int[n];
        int[] upper = new int[2 * n - 1];
        int[] lower = new int[2 * n - 1];
        backTrack(0, board, res, leftRow, upper, lower);
        return res;
    }

    private static void backTrack(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] upper, int[] lower) {

        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 &&
                    lower[row + col] == 0 &&
                    upper[(board.length - 1) + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lower[row + col] = 1;
                upper[board.length - 1 + col - row] = 1;
                backTrack(col + 1, board, res, leftRow, upper, lower);
                board[row][col] = '.';
                leftRow[row] = 0;
                lower[row + col] = 0;
                upper[board.length - 1 + col - row] = 0;
            }
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> lists = solveNQueens(4);
        for (List<String> i : lists)
        {
            for (String s : i) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
