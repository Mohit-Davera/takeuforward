package striver.array.medium;

public class MaxSumInSubArrays {
    public static int logic(int arr[], int N) {

        if (N < 2)
            return -1;

        int sum = arr[0] + arr[1];
        for (int i = 1; i < N - 1; i++) {
            sum = Math.max(sum,arr[i] + arr[i+1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(logic(new int[]{4,3,1,5,6},5));
    }
}
