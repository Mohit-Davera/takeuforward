package greedy;

import java.util.Arrays;

public class FractionKnapsack {
    public static void main(String[] args) {
//        int[] w = {50, 40, 90, 120, 10, 200};
//        int[] v = {40, 50, 25, 100, 30, 45};

        int[] w = {10,20,30};
        int[] v = {60,100,120};

        int n = w.length;
        Pair[] items = new Pair[n];
        for(int i = 0; i< n; i++){
            items[i] = new Pair(w[i],v[i]);
        }

        maximumValue(items, n,50);
    }

    public static double maximumValue(Pair[] items, int n, int w) {

        Arrays.sort(items, (i1, i2) -> i2.value * i1.weight - i2.weight * i1.value);
        double ans = 0;
        for(int i =0;i<n;i++) {
            if(w>=items[i].weight) {
                ans += items[i].value;
                w -= items[i].weight;
            } else {
                ans += (double)items[i].value*w/(double)items[i].weight;
                break;
            }
        }
        return ans;
    }

    private static class Pair {
        int weight;
        int value;

        public Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
