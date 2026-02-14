package striver.array.easy;

public class RotateArray {
    public static void main(String[] args) {
//        rotateRight(new int[]{1,2,3,4,5,6,7},3);
        rotateLeft(new int[]{1,2,3,4,5,6,7},3);
    }

    public static void rotateRight(int[] arr, int k) {

        int n = arr.length;
        k = k%n;
        int[] temp = new int[k];

        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void rotateLeft(int[] arr, int k) {

        int n = arr.length;
        k = k%n;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n-k)];
        }
    }
}
