package array.medium;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int[][] mat = {{1, 2},
            {3,4}};
        bruteLogic(mat);
    }

    public void rotate(int[][] mat) {

        int rows = mat.length;
        int columns = rows;

        //Transpose
        for(int i =0; i<rows;i++){
            for(int j=i;j<columns;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //reverse
        for(int i =0; i<rows;i++){
            for(int j=0;j<columns/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][columns - j -1];
                mat[i][columns - j -1] = temp;
            }
        }
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
