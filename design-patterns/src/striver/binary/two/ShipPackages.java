package striver.binary.two;

public class ShipPackages {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{1,2,3,1,1},4));

        System.out.println(feasible(new int[]{1,2,3,1,1},2  ,4));
    }

    public static int logic(int[] weights, int days){
        if(weights == null || weights.length == 0 || days<=0)
            return -1;

        int totalCap = 0;
        int maxWeight = 0;

        for (int i :
                weights) {

            maxWeight = Math.max(maxWeight,i);
            totalCap += i;
        }

        int left = maxWeight;
        int right = totalCap;
        int lowest = 0;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(feasible(weights,mid,days)){
                right = mid - 1;
                lowest = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return lowest;
    }

    private static boolean feasible(int[] weights, int capacity, int days) {
        int totalWeight = 0;
        int noOfDays = 1;
        for (int weight :
                weights) {
            totalWeight+= weight;
            if(totalWeight>capacity){
                ++noOfDays;
                totalWeight = weight;
            }
        }
        return noOfDays<=days;
    }
}
