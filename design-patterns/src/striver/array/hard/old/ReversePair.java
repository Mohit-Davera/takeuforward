package striver.array.hard.old;

import java.util.ArrayList;
import java.util.List;

public class ReversePair {
    public static void main(String[] args) {
        int[] ints = {2,4,3,5,1};
        int i = countReversePair(ints, 0, ints.length - 1);
        System.out.println(i);
    }

    public static int countReversePair(int[] arr,int left,int right){
        return mergeSort(arr,left,right);
    }

    public static int mergeSort(int[] arr,int left,int right){
        int reversePairs = 0;
        if(left<right){
            int mid = left +(right-left)/2;
            reversePairs+=mergeSort(arr,left,mid);
            reversePairs+=mergeSort(arr,mid+1,right);
            reversePairs+=merge(arr,left,mid,right);

        }
        return reversePairs;
    }

    public static int merge(int[] arr,int left,int mid,int right){
        int i = left;
        int j = mid + 1;
        int reversePairs = 0;
        for (int k = i; k <= mid; k++) {
            while (j<=right && arr[k]>2*arr[j]){
                j++;
            }
            reversePairs = reversePairs +  (j-(mid+1));
        }
        List<Integer> list = new ArrayList<>();
        j = mid +1;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                list.add(arr[i++]);
            }else {
                list.add(arr[j++]);
            }
        }
        while (i<=mid)
            list.add(arr[i++]);
        while(j<=right)
            list.add(arr[j++]);
        for (int k = left; k <= right; k++) {
            arr[k] = list.get(k - left);
        }
        return reversePairs;
    }
}
