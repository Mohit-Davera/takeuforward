package heap.intro;

import java.util.*;

public class RankElement {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(4, 7, 2, 90));
        replaceWithRank(integers, integers.size());
    }

    public static List<Integer> replaceWithRank(List<Integer> arr, int n) {
        if (n == 0) return new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> e1[0] - e2[0]);

        for (int i = 0; i < arr.size(); i++) {
            pq.add(new int[]{arr.get(i), i});
        }


        int rank = 1;
        int[] poll = pq.poll();
        int prev = poll[0];
        arr.set(poll[1], rank);

        for (int i = 1; i < n; i++) {
            poll = pq.poll();
            if (poll[0] != prev) rank++;
            arr.set(poll[1], rank);
            prev = poll[0];
        }
        return arr;
    }

    public static List<Integer> optimised(List<Integer> arr, int n) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr.get(i);
        }

        Arrays.sort(temp);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int rank = 1;
        for (int i : temp) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, rank);
                rank++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i : arr) {
            ans.add(hashMap.get(i));
        }

        return ans;
    }
}
