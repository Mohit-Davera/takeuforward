package array.old.easy;

public class BinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else {
                if (arr[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int key) {
        if (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                binarySearch(arr, left, mid - 1, key);
            } else {
                binarySearch(arr, mid + 1, right, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int i = binarySearch(arr, 0, arr.length - 1, 6);
        System.out.println(i);
    }
}
