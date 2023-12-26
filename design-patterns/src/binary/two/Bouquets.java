package binary.two;

public class Striver {
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 1));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (((long)m * k) > bloomDay.length)
            return -1;
        int low = bloomDay[0];
        int high = bloomDay[0];
        for (int i :
                bloomDay) {
            low = Math.min(low, i);
            high = Math.max(high, i);
        }
        while(low<=high){
            int mid = (low + high) / 2;
            if (isBookiesPossible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isBookiesPossible(int[] bloomDay,int day,int m, int k){
        long flowersCollected = 0;
        long boquetCount = 0;
        for(int b:bloomDay){
            if(b<=day){
                flowersCollected++;
            }
            else{
                boquetCount += flowersCollected/k;
                flowersCollected = 0;
            }
        }
        boquetCount += flowersCollected/k;
        return boquetCount>=m;
    }
}
