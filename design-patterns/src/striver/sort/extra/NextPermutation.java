package striver.sort.extra;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        nextPermutation(arr);
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
    }

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;
        while (i>=0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        int j = n - 1;
        while (j > 0 && arr[i] > arr[j]) {
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

