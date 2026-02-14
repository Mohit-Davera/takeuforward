package striver.binary.two;

import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{44, 22, 33, 11, 1}, 5));
    }

    public static int logic(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length - 1];
        while (low <= high) {
            int mid = (low + high) / 2;

            if (isValidMid(arr, mid, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isValidMid(int[] arr, int mid, int k) {
        int countDiv = 0;
        for (int i :
                arr) {
            double ceil = Math.ceil((double) i / mid);
            countDiv += ceil;
        }
        return countDiv <= k;
    }


    public static boolean isCapEnoughToShip(int[] weights, int days, int cap) {
        int totalWeight = 0;
        int noOfDays = 1;
        for (int weight :
                weights) {
            totalWeight+= weight;
            if(totalWeight>cap){
                ++noOfDays;
                totalWeight = weight;
            }
        }
        return noOfDays<=days;
    }

}
