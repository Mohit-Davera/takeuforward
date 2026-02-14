package striver.sort.extra;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 1};
        System.out.println(printingSubArray(arr, arr.length));
    }

    public static int giveSum(int[] arr, int n) {
        int sum = 0;
        int maxiSum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxiSum) {
                maxiSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxiSum;
    }

    public static int printingSubArray(int[] arr, int n) {
        int sum = 0;
        int maxiSum = 0;
        int start = -1;
        int answerStart = -1;
        int answerEnd = -1;
        for (int i = 0; i < n; i++) {
            if (sum == 0)
                start = i;
            sum += arr[i];
            if (sum > maxiSum) {
                maxiSum = sum;
                answerStart = start;
                answerEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(answerStart + " " + answerEnd);
        return maxiSum;
    }
}
