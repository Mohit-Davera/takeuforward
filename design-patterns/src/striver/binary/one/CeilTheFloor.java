package striver.binary.one;

import striver.binary.Pair;

public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
//        System.out.println(logicBasic(arr, 10));
        Pair pair = new Pair(floor(arr,8),ceil(arr,8));
        System.out.println(pair);
    }

    public static Pair logicBasic(int[] arr, int x) {
        int ansFloor = -1;
        int ansCeil = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x && arr[i] >= ansFloor) {
                ansFloor = arr[i];
            }
            if (arr[i] >= x && arr[i] <= ansCeil) {
                ansCeil = arr[i];
            }
        }
        if (ansCeil == Integer.MAX_VALUE)
            ansCeil = -1;
        return new Pair(ansFloor, ansCeil);
    }

    public static int floor(int[] arr, int x) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    public static int ceil(int[] arr, int x) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;

    }
}
