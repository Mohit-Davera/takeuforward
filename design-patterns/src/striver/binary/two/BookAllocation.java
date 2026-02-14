package striver.binary.two;

import java.util.ArrayList;

public class BookAllocation {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m>n) return -1;
        int low = arr.get(0);
        int high = 0;
        for(int i : arr){
            low = Math.max(low,i);
            high += i;
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPossible(arr,m,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isPossible(ArrayList<Integer> a, int m, int mid){
        int stud = 1;
        int lastPages = 0;
        for(int i : a){
            if(lastPages + i <= mid){
                lastPages += i;
            }
            else{
                stud++;
                lastPages = i;
            }
        }
        return stud<=m;
    }
}
