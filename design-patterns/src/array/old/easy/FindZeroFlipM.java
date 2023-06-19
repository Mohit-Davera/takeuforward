package array.old.easy;

public class FindZeroFlipM {
    static int findZeroesTrial(int arr[], int n, int m) {
        int zeroCount = 0;
        int startIndex = 0;
        int max = 0;
        int zeroIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (zeroCount >= m) {
                    zeroIndex++;
                    startIndex = zeroIndex;
                } else {
                    if (zeroIndex == -1)
                        zeroIndex = i;
                    zeroCount++;
                }
            }
            max = Math.max(max, i - startIndex + 1);
        }
        return max;
    }

    static int findZeroes(int arr[], int n, int m) {
        int zeroCount = 0;
        int max = 0;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
            while (zeroCount > m) {
                j++;
                if (arr[j] == 0)
                    zeroCount--;
            }
            max = Math.max(max, i - j);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0};
        System.out.println(findZeroes(arr, arr.length, 0));
    }
}
