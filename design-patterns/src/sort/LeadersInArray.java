package sort;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,0};
        leader(arr);
    }

    public static void leader(int arr[]) {
        int maxIndex;
        int currentMax = arr[arr.length - 1];
        List<Integer> integers = new ArrayList<>();
        integers.add(currentMax);
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] > currentMax){
                currentMax = arr[i];
                integers.add(currentMax);
            }
        }
        for (int i = integers.size() - 1; i>=0 ; i--) {
            System.out.print(" " + integers.get(i));
        }
    }
}
