package striver.binary.two;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int low = 1;
        int max = stalls[0];
        int min = stalls[0];
        for(int i : stalls){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        int high = max - min;

        while(low<=high){
            int mid = low + (high - low )/2;
            if(isPossible(stalls,k,mid)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;

    }

    static boolean isPossible(int[] stalls,int k, int dist){
        int cows = 1;
        int last = stalls[0];

        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - last >= dist){
                cows++;
                last = stalls[i];
            }
        }

        return cows>=k;
    }
}
