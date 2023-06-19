package array.medium;

public class MakeZeros {

    public void leetcodeZeros(int[][] matrix) {
        int colZero = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0)
                colZero = 0;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 1; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (colZero == 0)
                matrix[i][0] = 0;
        }
    }

    public static void gfgLogic(int[][] mat) {
        int[][] temp = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, temp[i], 0, mat[0].length);
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if (temp[i][j] == 0) {
                    System.out.println("ZERO");
                    gfgMakeZeros(mat, temp, i, j);
                }
            }
        }
    }

    public static void gfgMakeZeros(int[][] mat, int[][] temp, int row, int column) {
        int sum = 0;
        //Check for top Side
        if (row >= 1) {
            sum += temp[row - 1][column];
            mat[row - 1][column] = 0;
        }
        //Check for right side
        if (column < mat[0].length - 1) {
            sum += temp[row][column + 1];
            mat[row][column + 1] = 0;

        }
        //Check for bottom side
        if (row < mat.length - 1) {
            sum += temp[row + 1][column];
            mat[row + 1][column] = 0;
        }
        //Check for left side
        if (column >= 1) {
            sum += temp[row][column - 1];
            mat[row][column - 1] = 0;
        }
        mat[row][column] = sum;
        System.out.println("SUM " + sum);
    }

    public static void main(String[] args) {
        int[][] mat2 = {
                {0, 16, 0, 9, 6, 18},
                {4, 4, 7, 8, 8, 0},
                {11, 4, 17, 12, 0, 18},
                {6, 14, 12, 12, 4, 3}
        };
        gfgLogic(mat2);
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
