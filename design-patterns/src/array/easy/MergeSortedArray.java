package array.easy;

import java.util.ArrayList;
import java.util.TreeMap;

public class MergeSortedArray {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int prevInserted = -1;
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (prevInserted != arr1[i]) {
                    prevInserted = arr1[i];
                    list.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                if (prevInserted != arr2[j]) {
                    prevInserted = arr2[j];
                    list.add(arr2[j]);
                }
                j++;
            } else {
                if (prevInserted != arr1[i]) {
                    prevInserted = arr1[i];
                    list.add(arr1[i]);
                }
                i++;
            }
        }
        while (i < n) {
            if (prevInserted != arr1[i]) {
                list.add(arr1[i]);
                prevInserted = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (prevInserted != arr2[j]) {
                list.add(arr2[j]);
                prevInserted = arr2[j];
            }
            j++;
        }
        return list;
    }

    public static ArrayList<Integer> hashMap(int arr1[], int arr2[], int n, int m) {
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        for (int i :
                arr1) {
            hashMap.put(i, 1);
        }
        for (int i :
                arr2) {
            hashMap.put(i, 1);
        }
        return new ArrayList<>(hashMap.keySet());
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};

        ArrayList<Integer> union = hashMap(arr1, arr2, arr1.length, arr2.length);
        System.out.println(union);
    }
}
