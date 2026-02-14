package striver.binary.two;

import java.util.PriorityQueue;

public class GasStationBetter {
    public static void main(String[] args) {
        int[] arr = {1,13,17,23};
        double v = minimiseMaxDistance(arr, 5);
        System.out.println(v);
    }

    public static double minimiseMaxDistance(int []arr, int k){
        int n = arr.length;
        int[] howMany = new int[n - 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        for (int i = 0; i < n - 1; i++) {
            pq.add(new Pair(arr[i + 1] - arr[i], i));
        }

        for (int gasStations = 1; gasStations <= k; gasStations++) {
            Pair tp = pq.poll();
            int secInd = tp.second;

            howMany[secInd]++;

            double inidiff = arr[secInd + 1] - arr[secInd];
            double newSecLen = inidiff / (double) (howMany[secInd] + 1);
            pq.add(new Pair(newSecLen, secInd));
        }

        return pq.peek().first;
    }


    private static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }


}
