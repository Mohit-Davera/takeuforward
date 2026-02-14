package striver.array.hard.old;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] ints = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(logic(ints,-294967296));
    }

    public static ArrayList<ArrayList<Integer>> logic(int[] arr, int x) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int low = j + 1;
                int high = arr.length - 1;
                while (low < high) {
                    long secondTarget = (long) x - (long) arr[i] - (long) arr[j];
                    int twoSum = arr[low] + arr[high];
                    if (twoSum > secondTarget)
                        high--;
                    else if (twoSum < secondTarget) {
                        low++;
                    } else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[low]);
                        list.add(arr[high]);
                        res.add(list);

                        while (low < high && arr[low] == list.get(2)) low++;
                        while (low < high && arr[high] == list.get(3)) high--;
                    }
                }
                while (j+1< arr.length && arr[j+1] == arr[j] ) j++;
            }
            while (i+1< arr.length && arr[i+1] == arr[i] ) i++;
        }
        return res;
    }
}
