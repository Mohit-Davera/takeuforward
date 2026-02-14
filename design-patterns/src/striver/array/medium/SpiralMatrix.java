package striver.array.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        spiral(mat);
    }

    public static void spiral(int[][] matrix) {
        List<Integer> integers = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                integers.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                integers.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    integers.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right) {
                for (int i = bottom; i >= top; i--) {
                    integers.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(integers);
    }
}
