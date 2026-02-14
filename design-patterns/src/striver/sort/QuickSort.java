package striver.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4,6,2,5,7,9,1,3));
        partition(list,0,list.size()-1);
        System.out.println(list);
    }

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
