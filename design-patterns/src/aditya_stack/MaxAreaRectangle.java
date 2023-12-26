package aditya_stack;

public class MaxAreaRectangle {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {0, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 0}
        };

        System.out.println('0'-'0');
//        solution(mat);
    }

    static int solution(int[][] mat) {
        int max = 0;
        int[] prev = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] += prev[j];
                }
            }
            max = Math.max(max, HistogramTUF.largestRectangleArea(mat[i]));
            prev = mat[i];
        }

        return max;
    }
}
