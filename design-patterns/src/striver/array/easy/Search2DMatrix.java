package striver.array.easy;

import java.util.Arrays;

public class Search2DMatrix {
    private static int binarySearch(int[] arr, int low, int high, int x) {
        int mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[][] gfgArray = {{10, 20, 30, 40}, {11, 21, 36, 43}, {25, 29, 39, 50}, {50, 60, 70, 80}};
        //int[] i = travelMatrixCrossWise(gfgArray, 4, 4, 80);

        int[][] mat = {{3, 30, 38}, {44, 52, 54}, {57, 60, 69}};
        int[] i = leetCodeOptimal(mat, 3, 3, 555);

        System.out.println("Row " + (i[0] + 1) + " Column " + (i[1] + 1));
    }

    //O(n*m);
    public static int[] bruteForce(int[][] mat, int N, int M, int X) {
        int[] index = new int[2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] == X) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        index[0] = -1;
        index[1] = -1;
        return index;
    }

    //O(n*log(m))
    public static int[] binarySearchForEveryRow(int[][] mat, int N, int M, int X) {
        int[] index = new int[2];
        Arrays.fill(index, -1);
        for (int i = 0; i < N; i++) {
            int result = binarySearch(mat[i], 0, M - 1, X);
            if (result >= 0) {
                index[0] = i;
                index[1] = result;
                return index;
            }
        }
        return index;
    }

    //GFG Optimal When row wise and column wise sorted
    public static int[] travelMatrixCrossWise(int[][] mat, int N, int M, int X) {
        int[] index = new int[2];
        Arrays.fill(index, -1);
        int i = 0;
        int j = M - 1;
        while (i < N && j >= 0) {
            if (mat[i][j] == X) {
                index[0] = i;
                index[1] = j;
                return index;
            }
            if (mat[i][j] > X) {
                j--;
            } else {
                i++;
            }
        }
        return index;
    }

    public static int[] leetCodeOptimal(int[][] mat, int N, int M, int X) {
        int[] index = new int[2];
        Arrays.fill(index, -1);
        int low = 0;
        int high = N * M - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mat[mid / M][mid % M] == X) {
                index[0] = mid / M;
                index[1] = mid % M;
                return index;
            } else if (mat[mid / M][mid % M] > X) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

}
