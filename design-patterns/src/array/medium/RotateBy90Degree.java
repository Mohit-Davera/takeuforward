package array.medium;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int[][] mat = {{1, 2},
            {3,4}};
        bruteLogic(mat);
    }

    //90 degree anti clock wise meaning rightmost column will be topmost row same for other column
    public static void bruteLogic(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];


        int column = 0;
        for (int[] ints : matrix) {
            int row = matrix.length - 1;
            for (int j = 0; j < matrix[0].length; j++) {
                temp[row--][column] = ints[j];
            }
            column++;
        }


        for (int[] arr : temp) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
