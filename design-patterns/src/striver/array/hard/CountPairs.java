package striver.array.hard;

public class CountPairs {
    public static void main(String[] args) {
        int[] a = {3,2,1,4};
        int n = 4;
        System.out.println(numberOfInversions(a, n));
    }

    public static int numberOfInversions(int[] a, int n) {
        // Count the number of pairs:
        return mergeSort(a, 0, n - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return count;
    }

    private static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right])
                right++;
            count = count + (right - (mid + 1));
        }

        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[arr.length + 1];
        int index = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }
        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }
}
