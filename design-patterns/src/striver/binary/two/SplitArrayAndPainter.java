package striver.binary.two;

public class SplitArrayAndPainter {
    public static int largestSubarraySumMinimized(int []arr, int k) {
        int low = 0;
        int high = 0;

        for(int i:arr){
            low = Math.max(low,i);
            high +=i;
        }

        while(low<=high){
            int mid = low + (high - low )/2;
            if(isPossible(arr,k,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }

    static boolean isPossible(int[] boards, int k, int mid){
        int localP = 1;
        int unit = 0;

        for(int i : boards){
            if(unit + i<=mid){
                unit+=i;
            }
            else{
                localP++;
                unit = i;
            }
        }
        return localP<=k;
    }
}
