package array.medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
/*        int[] prices = new int[]{7,1,5,3,6,4};
        int logic = logic(prices);
        System.out.println(logic);*/

        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        maximaMinima(arr);
    }

    //leetcode
    public static int logic(int[] price) {
        int lowestPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int j : price) {
            if (lowestPrice > j) {
                lowestPrice = j;
                continue;
            }
            profit = Math.max(profit, j - lowestPrice);
        }
        return profit;
    }

    public static void maximaMinima(int[] price) {

        int n = price.length;
        if (n == 1)
            return;
        int buyPriceIndex = -1;
        int sellPriceIndex = -1;

        int i = 0;
        while (i < n - 1) {
            while ((i < n - 1)
                    && (price[i + 1] <= price[i]))
                i++;

            if (i == n - 1) 
                break;

            buyPriceIndex = i;
            i++;

            while ((i < n) && (price[i] >= price[i - 1]))
                i++;

            sellPriceIndex = i - 1;
            System.out.print("(" + buyPriceIndex + " " + sellPriceIndex + ") ");
        }
    }
}
