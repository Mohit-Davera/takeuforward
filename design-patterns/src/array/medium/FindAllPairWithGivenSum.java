package array.medium;

import java.util.Arrays;

public class FindAllPairWithGivenSum {

    class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int binarySearch(long[] arr, int low, int high, long x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            else {
                if (arr[mid] > x) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public pair[] binarySearchAndTarget(long A[], long B[], long N, long M, long X) {
        Arrays.sort(B);
        pair[] pairs = new pair[(int) (Math.max(N, M))];
        int pairCount = 0;
        for (long l : A) {
            long find = X - l;
            int index = binarySearch(B, 0, B.length - 1, find);
            if (index != -1) {
                pairs[pairCount] = new pair(l, B[index]);
                pairCount++;
            }
        }
        return Arrays.copyOf(pairs,pairCount);
    }

    public static void main(String[] args) {
        long[] A = {1,2,4,5,7};
        long[] B = {5,6,3,4,8};
        int X = 9;
        pair[] pairs = new FindAllPairWithGivenSum().binarySearchAndTarget(A, B, A.length, B.length, X);
        for (pair p :
                pairs) {
            System.out.println(p.first + " " + p.second);
        }
    }
}
