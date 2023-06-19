package array.hard;

import java.util.Arrays;

public class MergeSortedArrayNoSpace {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10};
        int[] arr1 = {2, 3, 9};
        gapMethod(arr, arr1);
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i :
                arr1) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void mergeNormal(int[] arr1, int[] arr2) {
        int left = arr1.length - 1;
        int right = 0;
        while (left >= 0 && right < arr2.length) {

            if (arr1[left] > arr2[right]) {
                swap(arr1, arr2, left, right);
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void gapMethod(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int len = n + m;
        //ceil value
        int gap = len / 2 + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            //left in arr1 and right in arr2
            while (right < len) {
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                //both on arr2
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                //both on arr1
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                right++;
                left++;
            }
            if (gap == 1)
                break;
            gap = gap / 2 + (gap % 2);
        }
    }

    public static void swapIfGreater(int[] arr1, int[] arr2, int left, int right) {
        if (arr1[left] > arr2[right]) {
            swap(arr1, arr2, left, right);
        }
    }
}
