package striver.array.slidingwindow.med;

public class MaximumPointsCards {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
    }

    public int maxScoreApp1(int[] cards, int k) {
        int total = 0;
        for (int i = 0; i < k; i++) total += cards[i];
        int best = total;
        int j = cards.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            total += cards[j] - cards[i];
            best = Math.max(best, total);
            j--;
        }
        return best;
    }

    public int maxScoreApp2(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int window = n - k;
        int total = 0;
        for (int i : cardPoints) total += i;
        if (k >= n) return total;
        return total - findMinimumSumOfWindow(cardPoints, window);
    }

    public int findMinimumSumOfWindow(int[] cp, int window) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        while (right < cp.length) {
            sum += cp[right];
            if (right - left + 1 == window) {
                minSum = Math.min(minSum, sum);
                sum -= cp[left];
                left++;
            }
            right++;
        }
        return minSum;
    }
}
