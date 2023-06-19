package binary.two;

import java.util.Arrays;

public class KokoBananas {
    public static void main(String[] args) {
        int logic = logic(new int[]{805306368,805306368,805306368}, 1000000000);
        System.out.println(logic);
    }

    public static int logic(int[] piles,int H){
        Arrays.sort(piles);
        int low = 1;
        int high = maxFinder(piles);
        int lowest = high;
        while (low<=high){
            int mid = (low + high)/2;
            if(canEatAll(piles,mid,H)){
                lowest = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return lowest;
    }

    public static boolean canEatAll(int[] piles, int k,int h){
        int hourCount = 0;
        for (int pile :
                piles) {
            hourCount += pile/k;
            if(pile % k != 0)
                hourCount++;
        }
        return hourCount<=h;
    }

    public static int maxFinder(int[] piles){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max,piles[i]);
        }
        return max;
    }
}

