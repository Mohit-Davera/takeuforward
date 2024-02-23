package heap.intro;

import java.util.*;

public class MaximumSumCombination {
    public static void main(String[] args) {
        int[] a = {371, 349, 552, 343, 331, 721, 46, 572, 512, 469, 890, 608, 917, 719, 830, 104, 159};
        int[] b = {681, 150, 595, 597, 209, 778, 666, 965, 203, 658, 273, 404, 389, 898, 847, 253, 959};
        int[] ints = kMaxSumCombination(a, b, 17, 6);
        for (int i :
                ints) {
            System.out.print(i+" ");
        }
    }

    public static int[] kMaxSumCombination(int[] a, int[] b, int n, int k) {

        Arrays.sort(a);
        Arrays.sort(b);

        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> p2[0] - p1[0]);
        int[] ans = new int[k];
        int index = 0;
        Set<Pair> set = new HashSet<>();
        int first = n - 1;
        int second = n - 1;
        pq.add(new int[]{a[first] + b[second], first, second});
        set.add(new Pair(first, second));
        for (int i = 0; i < k; i++) {
            int[] total = pq.poll();
            ans[index++] = total[0];

            if (index == ans.length) break;
            first = total[1] - 1;
            second = total[2];

            if (first >= 0 && second >= 0 && !set.contains(new Pair(first, second))) {
                pq.add(new int[]{a[first] + b[second], first, second});
                set.add(new Pair(first, second));
            }

            first = total[1];
            second = total[2] - 1;

            if (first >= 0 && second >= 0 && !set.contains(new Pair(first, second))) {
                pq.add(new int[]{a[first] + b[second], first, second});
                set.add(new Pair(first, second));
            }

        }
        return ans;


    }

    private static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair obj = (Pair) o;
            return (i == obj.i && j == obj.j);
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
