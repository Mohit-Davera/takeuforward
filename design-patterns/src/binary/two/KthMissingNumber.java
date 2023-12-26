package binary.two;

public class KthMissingNumber {
    public static void main(String[] args) {
        int brute = brute(new int[]{1, 2, 4}, 5);
        System.out.println(brute);
        brute = optimal(new int[]{1, 2, 4}, 5);
        System.out.println(brute);
    }

    public static int brute(int[] arr, int k) {
        for (int j : arr) {
            if (k >= j)
                k++;
            else
                break;
        }
        return k;
    }

    public static int optimal(int[] arr, int k) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;
        if (arr[low] > k)
            return k;
        if (k > arr[high] - n)
            return k + n;

        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
}
