package array.old.hard;

public class CountInversion {
    public static void main(String[] args) {
        System.out.println(inversionCount(new long[]{2,4,1,3,5},5));
    }

    public static long inversionCount(long[] arr,long N){
        long[] temp = new long[arr.length];
        return mergeSort(arr,temp,0, arr.length-1);
    }

    public static long mergeSort(long[] arr,long[] temp,int low, int high){
        long inversionCount = 0;
        if(low<high){
            int mid = low + (high-low)/2;
            inversionCount += mergeSort(arr,temp,low,mid);
            inversionCount += mergeSort(arr,temp,mid+1,high);
            inversionCount += merge(arr,temp,low,mid,high);
        }
        return inversionCount;
    }

    public static long merge(long[] arr,long[] temp,int low,int mid,int high){
        int i = low;
        int j = mid + 1;
        int k = low;
        long inversionCount = 0;

        while (i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                inversionCount = inversionCount + (mid - i + 1);
            }
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=high){
            temp[k++] = arr[j++];
        }
        for (int l = low; l <= high; l++) {
            arr[l] = temp[l];
        }
        return inversionCount;
    }
}
