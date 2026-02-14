package striver.array.medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderOfRight {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> leader = leader(arr, arr.length);
        System.out.println(leader);

    }

    public static ArrayList<Integer> leader(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n - 1];
        int count = 1;
        list.add(0, max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(count++, max);
            }
        }

        list.sort(Collections.reverseOrder());
        return list;
    }

}
