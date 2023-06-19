package binary.one;

import java.util.ArrayList;

public class CountNumberOfOccurrence {
    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        int floor = lowerBound(arr, x);
        int ceil = upperbound(arr, x);
        ArrayList<Long> list = new ArrayList<>();
        if(floor == arr.length || arr[floor] != x) {
            System.out.println(-1);
        }
        else{
            System.out.println(ceil - floor);
        }
        System.out.println(list);
    }


    static int lowerBound(long arr[], int x) {
        int n = arr.length;
        int lo = 0, hi = n - 1, res = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }

    static int upperbound(long arr[], int x) {
        int n = arr.length;
        int lo = 0, hi = n - 1, res = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > x) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }
}
