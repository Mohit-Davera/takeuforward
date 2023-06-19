package array.hard;

import java.util.ArrayList;
import java.util.List;

public class CountInversion {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
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
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
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
                count += mid - left + 1;
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
        return count;
    }
}
