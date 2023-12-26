package array.easy;

import java.util.Arrays;

public class SecondLargest {

    int print2largest(int[] arr, int n) {
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]> secondMax && arr[i] != max)
                secondMax = arr[i];
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {
                28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40, 58, 38, 64, 47,
                44, 49, 46, 25, 57, 39, 55, 45, 29, 32, 61, 53, 31, 36, 56, 63, 30, 52, 27, 34, 50, 41, 37, 66, 62, 59
        };
        int is = new SecondLargest().print2largest(arr, arr.length);
        System.out.println(is);
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}