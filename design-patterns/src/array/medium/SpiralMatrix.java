package array.medium;

public class SpiralMatrix {
    public static void main(String[] args) {

        int N = 3;
        int M = 3;
        int K = 4;
        int[][] A = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        System.out.println(findK(A,N,M,K));
    }

    public static int findK(int a[][], int n, int m, int k) {
        int top = 0, down = n - 1, left = 0, right = m - 1;
        int size = n * m;
        int cnt = 0;
        int ans = 0;
        while (top <= down && left <= right) {
            // toprow
            for (int i = left; i <= right && cnt < size; i++) {
                cnt++;
                if (cnt == k) {
                    ans = a[top][i];
                }
            }
            top++;

            //lastcol
            for (int i = top; i <= down && cnt < size; i++) {
                cnt++;
                if (cnt == k) {
                    ans = a[i][right];
                }
            }
            right--;

            //lastrow
            for (int i = right; i >= left && cnt < size; i--) {
                cnt++;
                if (cnt == k) {
                    ans = a[down][i];
                }
            }
            down--;

            //firstcol
            for (int i = down; i >= top && cnt < size; i--) {
                cnt++;
                if (cnt == k) {
                    ans = a[i][left];
                }
            }
            left++;
        }
        return ans;
    }
}
