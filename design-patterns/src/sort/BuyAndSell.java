package sort;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};

        int profit = 0;
        int maxProfit = 0;
        int currentMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            profit = arr[i] - currentMin;
            maxProfit = Math.max(profit,maxProfit);
            currentMin = Math.min(currentMin,arr[i]);
        }
        System.out.println(maxProfit);
    }
}
